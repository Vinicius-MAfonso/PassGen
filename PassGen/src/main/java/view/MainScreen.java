package view;

import controller.PasswordController;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Password;

public class MainScreen extends javax.swing.JFrame {
    
    PasswordController controller;
    DefaultListModel<String> model;
    
    public MainScreen() {
        initComponents();
        loadData();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldPasswordGenerated = new javax.swing.JTextField();
        jLabelSubTitle = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonGenerate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSliderLength = new javax.swing.JSlider();
        jLabelLength = new javax.swing.JLabel();
        jLabelLengthConf = new javax.swing.JLabel();
        jRadioButtonSymbols = new javax.swing.JRadioButton();
        jRadioButtonUpper = new javax.swing.JRadioButton();
        jRadioButtonLower = new javax.swing.JRadioButton();
        jRadioButtonNumbers = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPreviousPasswords = new javax.swing.JList<>();
        jLabelCustomYourPass = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GenPassword");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldPasswordGenerated.setEditable(false);
        jTextFieldPasswordGenerated.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPasswordGenerated.setColumns(60);
        jTextFieldPasswordGenerated.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldPasswordGenerated.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPasswordGenerated.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSubTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSubTitle.setText("Senhas anteriores");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Senha gerada");

        jButtonGenerate.setBackground(new java.awt.Color(221, 34, 34));
        jButtonGenerate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonGenerate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGenerate.setText("Gerar");
        jButtonGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerateMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jSliderLength.setBackground(new java.awt.Color(255, 255, 255));
        jSliderLength.setForeground(new java.awt.Color(0, 0, 0));
        jSliderLength.setMaximum(55);
        jSliderLength.setMinimum(4);
        jSliderLength.setValue(30);
        jSliderLength.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSliderLengthMouseReleased(evt);
            }
        });

        jLabelLength.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLength.setText("Tamanho");

        jLabelLengthConf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelLengthConf.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLengthConf.setText("30");

        jRadioButtonSymbols.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonSymbols.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonSymbols.setText("Símbolos");
        jRadioButtonSymbols.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jRadioButtonUpper.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonUpper.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonUpper.setSelected(true);
        jRadioButtonUpper.setText("Letra maiúscula");
        jRadioButtonUpper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jRadioButtonLower.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonLower.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonLower.setSelected(true);
        jRadioButtonLower.setText("Letra minúscula");
        jRadioButtonLower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jRadioButtonNumbers.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonNumbers.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonNumbers.setSelected(true);
        jRadioButtonNumbers.setText("Números");
        jRadioButtonNumbers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLengthConf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSliderLength, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonUpper)
                    .addComponent(jRadioButtonLower)
                    .addComponent(jRadioButtonNumbers)
                    .addComponent(jRadioButtonSymbols)
                    .addComponent(jLabelLength))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLength)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelLengthConf)
                    .addComponent(jSliderLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonUpper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonLower)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNumbers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonSymbols))
        );

        jListPreviousPasswords.setBackground(new java.awt.Color(255, 255, 255));
        jListPreviousPasswords.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListPreviousPasswords.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListPreviousPasswords.setForeground(new java.awt.Color(0, 0, 0));
        jListPreviousPasswords.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListPreviousPasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPreviousPasswordsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListPreviousPasswords);

        jLabelCustomYourPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCustomYourPass.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCustomYourPass.setText("Personalize sua senha");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Limpar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCustomYourPass, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(jLabelSubTitle))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPasswordGenerated, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPasswordGenerated, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCustomYourPass)
                    .addComponent(jLabelSubTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGenerate))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jSliderLengthMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderLengthMouseReleased
        jLabelLengthConf.setText(Integer.toString(jSliderLength.getValue()));
    }//GEN-LAST:event_jSliderLengthMouseReleased

    private void jButtonGenerateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerateMouseClicked
        Password password = new Password();
        
        password.setLength(jSliderLength.getValue());
        password.setUseUpper(jRadioButtonUpper.isSelected());
        password.setUseLower(jRadioButtonLower.isSelected());
        password.setUseNumbers(jRadioButtonNumbers.isSelected());
        password.setUseSymbols(jRadioButtonSymbols.isSelected());
        password.build();
        while(model.contains(password.getPassword())){
            password.build();
        }
        controller = new PasswordController();
        controller.save(password);
        loadData();
        jTextFieldPasswordGenerated.setText(password.getPassword().toString());
    }//GEN-LAST:event_jButtonGenerateMouseClicked

    private void jListPreviousPasswordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPreviousPasswordsMouseClicked
        jTextFieldPasswordGenerated.setText(jListPreviousPasswords.getSelectedValue());
    }//GEN-LAST:event_jListPreviousPasswordsMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        controller = new PasswordController();
        controller.clear();
        jTextFieldPasswordGenerated.setText("");
        loadData();
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JLabel jLabelCustomYourPass;
    private javax.swing.JLabel jLabelLength;
    private javax.swing.JLabel jLabelLengthConf;
    private javax.swing.JLabel jLabelSubTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JList<String> jListPreviousPasswords;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonLower;
    private javax.swing.JRadioButton jRadioButtonNumbers;
    private javax.swing.JRadioButton jRadioButtonSymbols;
    private javax.swing.JRadioButton jRadioButtonUpper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderLength;
    private javax.swing.JTextField jTextFieldPasswordGenerated;
    // End of variables declaration//GEN-END:variables
    private void loadData(){
        controller = new PasswordController();
        List<Password> list = controller.getAll();
        model = new DefaultListModel<>();
        for(Password currentPass : list){
            model.addElement(currentPass.getPassword().toString());
        }
        jListPreviousPasswords.setModel(model);
    }
}
