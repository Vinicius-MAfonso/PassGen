package view;

public class MainScreen extends javax.swing.JFrame {

    public MainScreen() {
        initComponents();
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldPasswordGenerated = new javax.swing.JTextField();
        jLabelSubTitle = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jRadioButtonUpper = new javax.swing.JRadioButton();
        jRadioButtonLower = new javax.swing.JRadioButton();
        jRadioButtonSimbols = new javax.swing.JRadioButton();
        jRadioButtonNumbers = new javax.swing.JRadioButton();
        jButtonGenerate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSliderLength = new javax.swing.JSlider();
        jLabelLength = new javax.swing.JLabel();
        jLabelLengthConf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GenPassword");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldPasswordGenerated.setEditable(false);
        jTextFieldPasswordGenerated.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPasswordGenerated.setColumns(50);
        jTextFieldPasswordGenerated.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldPasswordGenerated.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPasswordGenerated.setText("TESTE");
        jTextFieldPasswordGenerated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordGeneratedActionPerformed(evt);
            }
        });

        jLabelSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSubTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSubTitle.setText("Senhas anteriores");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitle.setText("Senha gerada");

        jRadioButtonUpper.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonUpper.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonUpper.setSelected(true);
        jRadioButtonUpper.setText("Letra maiúscula");

        jRadioButtonLower.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonLower.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonLower.setSelected(true);
        jRadioButtonLower.setText("Letra minúscula");

        jRadioButtonSimbols.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonSimbols.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonSimbols.setText("Símbolos");

        jRadioButtonNumbers.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonNumbers.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonNumbers.setText("Números");

        jButtonGenerate.setBackground(new java.awt.Color(221, 34, 34));
        jButtonGenerate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonGenerate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGenerate.setText("Gerar");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jSliderLength.setBackground(new java.awt.Color(255, 255, 255));
        jSliderLength.setForeground(new java.awt.Color(0, 0, 0));
        jSliderLength.setMaximum(50);
        jSliderLength.setMinimum(4);
        jSliderLength.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSliderLengthMouseReleased(evt);
            }
        });

        jLabelLength.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelLength.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLength.setText("Tamanho");

        jLabelLengthConf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelLengthConf.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLengthConf.setText("0");

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
                .addGap(6, 6, 6)
                .addComponent(jLabelLength)
                .addGap(159, 159, 159))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextFieldPasswordGenerated, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonNumbers, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonLower, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonUpper, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelSubTitle)
                            .addComponent(jLabelTitle)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 215, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonSimbols, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGenerate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(11, 11, 11)
                .addComponent(jTextFieldPasswordGenerated, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSubTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonUpper)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonLower)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonNumbers)))
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButtonSimbols)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonGenerate))
                    .addComponent(jScrollPane1))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPasswordGeneratedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordGeneratedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordGeneratedActionPerformed

    private void jSliderLengthMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderLengthMouseReleased
        jLabelLengthConf.setText(new Integer(jSliderLength.getValue()).toString());
    }//GEN-LAST:event_jSliderLengthMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JLabel jLabelLength;
    private javax.swing.JLabel jLabelLengthConf;
    private javax.swing.JLabel jLabelSubTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonLower;
    private javax.swing.JRadioButton jRadioButtonNumbers;
    private javax.swing.JRadioButton jRadioButtonSimbols;
    private javax.swing.JRadioButton jRadioButtonUpper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderLength;
    private javax.swing.JTextField jTextFieldPasswordGenerated;
    // End of variables declaration//GEN-END:variables
}
