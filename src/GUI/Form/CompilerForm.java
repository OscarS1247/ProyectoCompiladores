package GUI.Form;

import GeneratedGrammar.GramaticaLexer;
import GeneratedGrammar.GramaticaParser;
import PersonalizedGrammar.CustomErrorListener;
import PersonalizedGrammar.CustomParser;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CompilerForm extends JFrame {
    private JPanel panel_principal;
    private JButton importButtom;
    private JTextArea outputArea;
    private JTextArea codeArea;
    private JLabel tittleLabel;
    private JLabel outputLabel;
    private JButton testButtom;
    private int lineNumber = 1;
    private String text = "";

    CompilerForm() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        ImageIcon icon_pascal = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\ProyectoCompiladores_Oscar\\src\\GUI\\Icons\\pascal_logo.png");

        setTitle("PASCAL - COMPILER");
        setSize((int) ((screenSize.width - (screenSize.width * 0.10))), (int) ((screenSize.height - (screenSize.height * 0.20))));
        setLocation((int) ((screenSize.width - (screenSize.width * 0.95))), (int) ((0 + (screenSize.height * 0.05))));
        setContentPane(panel_principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(icon_pascal.getImage());
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);

        codeArea.setText(lineNumber + "\t");
        lineNumber++;

        codeArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                SwingUtilities.invokeLater(() -> insertLineNumber(e));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });


        importButtom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JFileChooser fileChooser = new JFileChooser();

                    fileChooser.showOpenDialog(fileChooser);
                    String ruta = fileChooser.getSelectedFile().getAbsolutePath();

                    int lastIndex = ruta.lastIndexOf(".");
                    if (lastIndex != -1) {
                        String extension = ruta.substring(lastIndex + 1);

                        if (extension.equalsIgnoreCase("txt")) {
                            File fileM = new File(ruta);
                            BufferedReader reader = new BufferedReader(new FileReader(fileM));

                            String linea;
                            int line_num = 1;
                            while ((linea = reader.readLine()) != null) {
                                text = text + line_num + "\t" + linea + "\n";
                                line_num++;
                                lineNumber++;
                            }
                            codeArea.setText(text);
                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        testButtom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code_to_test = extractCode();
                System.out.println(code_to_test);

                // Crear un CharStream a partir del código de entrada
                CharStream input = CharStreams.fromString(code_to_test);

                // Crear el analizador léxico
                GramaticaLexer lexer = new GramaticaLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                // Crear el analizador sintáctico personalizado
                GramaticaParser parser = new GramaticaParser(tokens);


                // Asociar el manejador de errores personalizado
                CustomErrorListener errorListener = new CustomErrorListener();
                parser.removeErrorListeners();
                parser.addErrorListener(errorListener);

                // Probar el codigo partiendo desde la funcion pricipal
                GramaticaParser.ProgramaContext contexto = parser.programa();
                System.out.println("Imprimiendo un arbol??? creo");
                System.out.println(contexto.toStringTree(parser));

                // Obtener la lista de errores después del análisis
                List<String> errores = errorListener.getErrorMessages();

                showErrors(errores);

            }
        });
    }

    private void insertLineNumber(DocumentEvent e) {
        try {
            Document doc = e.getDocument();
            int start = e.getOffset();
            String text = doc.getText(start, e.getLength());
            if ("\n".equals(text)) {
                doc.insertString(start + 1, lineNumber + "\t", null);
                lineNumber++;
            } else if ("".equals(text)) {
                decreaseLineNumber(start);
            }
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }

    private void decreaseLineNumber(int offset) {
        try {
            Document doc = codeArea.getDocument();
            int line = codeArea.getLineOfOffset(offset);
            int lineStart = codeArea.getLineStartOffset(line);
            int lineEnd = codeArea.getLineEndOffset(line);

            String lineText = doc.getText(lineStart, lineEnd - lineStart);
            if (lineText.trim().isEmpty()) {
                doc.remove(lineStart, lineEnd - lineStart);
                lineNumber--;
                updateLineNumbers();
            }
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }

    private void updateLineNumbers() {
        String[] lines = codeArea.getText().split("\n");
        StringBuilder numberedText = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            numberedText.append(i + 1).append("\t").append(lines[i]).append("\n");
        }
        codeArea.setText(numberedText.toString());
    }

    private void showErrors(List<String> errors){
        StringBuilder message = new StringBuilder();

        if (!errors.isEmpty()) {
            for (String error : errors) {
                message.append("\n").append(error);
            }
        } else {
            message = new StringBuilder("No errors found.");
        }

        outputArea.setText(message.toString());
    }

    private String extractCode() {
        String code = codeArea.getText();
        StringBuilder extractedCode = new StringBuilder();
        String[] lines = code.split("\n");
        for (String line : lines) {
            extractedCode.append(line.replaceFirst("\\d+\\t", "")).append("\n");
        }
        return extractedCode.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CompilerForm();
            }
        });
    }
}
