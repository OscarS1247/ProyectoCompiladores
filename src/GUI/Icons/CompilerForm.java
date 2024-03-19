package GUI.Icons;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.*;
import java.awt.*;
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

        ImageIcon icon_pascal = new ImageIcon("C:\\Users\\bernardo08\\IdeaProjects\\ProyectoCompiladores_Oscar\\src\\GUI\\Icons\\pascal_logo.png");

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
                            }
                            codeArea.setText(text);
                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
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
            }
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }

    private void showErrors(List<String> errorsSyntactics, List<String> errorsLexicons){
        java.util.List<String> errors = new ArrayList<>();
        errors.addAll(errorsLexicons);
        errors.addAll(errorsSyntactics);
        String message = "";

        if (!errors.isEmpty()) {
            for (String error : errors) {

            }
        } else {
            message = "No errors found.";
        }
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
