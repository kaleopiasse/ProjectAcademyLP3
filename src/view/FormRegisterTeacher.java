/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import modelBeans.ModalityModel;
import modelBeans.PersonModel;
import modelConnection.ConnectionDB;
import modelDao.ModalityDao;
import modelDao.MonthlyDao;
import modelDao.PersonDao;

/**
 *
 * @author Kaleo
 */
public class FormRegisterTeacher extends javax.swing.JFrame{

    ConnectionDB cntn = new ConnectionDB();
    PersonModel personMod = new PersonModel();
    ModalityModel modalityMod = new ModalityModel();
    PersonDao personCon = new PersonDao();
    ModalityDao modalityDao = new ModalityDao();
    Date data = new Date (System.currentTimeMillis());
    SimpleDateFormat dateFormat =  new SimpleDateFormat("ddMMyyyy");
    private int flagButton = 0;
    private int flagButton2 = 0;
    private double price1, price2;
    
    public FormRegisterTeacher() {
        initComponents();
        setLocationRelativeTo(null);//centralizar tela
        disableText();
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        setCbxmodality();
        setCbxmodality2();
        //fillTableStudent();
        //tbdPnlStudent.setEnabledAt(1, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormTeacher = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        cbxSex = new javax.swing.JComboBox();
        pnlButtons = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        txtPhone = new javax.swing.JFormattedTextField();
        lblStreet = new javax.swing.JLabel();
        lblDistrict = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblComplement = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtDistrict = new javax.swing.JTextField();
        txtComplement = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        cbxState = new javax.swing.JComboBox<>();
        txtCity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeachers = new javax.swing.JTable();
        cbxModality1 = new javax.swing.JComboBox<>();
        lblModality1 = new javax.swing.JLabel();
        lblModality2 = new javax.swing.JLabel();
        cbxModality2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFormTeacher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFormTeacher.setPreferredSize(new java.awt.Dimension(700, 500));
        pnlFormTeacher.setLayout(null);

        lblName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblName.setText("Nome:");
        pnlFormTeacher.add(lblName);
        lblName.setBounds(10, 50, 60, 30);

        lblSex.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSex.setText("Sexo:");
        pnlFormTeacher.add(lblSex);
        lblSex.setBounds(470, 50, 50, 30);

        lblEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEmail.setText("E-mail:");
        pnlFormTeacher.add(lblEmail);
        lblEmail.setBounds(10, 90, 60, 30);

        txtName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(txtName);
        txtName.setBounds(70, 50, 390, 30);

        txtEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(txtEmail);
        txtEmail.setBounds(70, 90, 390, 30);

        lblCpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCpf.setText("CPF:");
        pnlFormTeacher.add(lblCpf);
        lblCpf.setBounds(10, 10, 60, 30);

        lblTelephone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTelephone.setText("Telefone:");
        pnlFormTeacher.add(lblTelephone);
        lblTelephone.setBounds(310, 10, 100, 30);

        cbxSex.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbxSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outro" }));
        cbxSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexActionPerformed(evt);
            }
        });
        pnlFormTeacher.add(cbxSex);
        cbxSex.setBounds(520, 50, 140, 30);

        pnlButtons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Adicionar usuário masculino-104.png"))); // NOI18N
        btnCreate.setToolTipText("Adicionar novo Aluno");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        pnlButtons.add(btnCreate);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Salvar Filled-50.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlButtons.add(btnSave);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Editar-104.png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlButtons.add(btnUpdate);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Cancelar-104.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlButtons.add(btnCancel);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Lixo-104.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlButtons.add(btnDelete);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Pesquisa propriedade-50.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        pnlButtons.add(btnSearch);

        pnlFormTeacher.add(pnlButtons);
        pnlButtons.setBounds(670, 10, 100, 540);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCpf.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCpf.setMinimumSize(new java.awt.Dimension(5, 16));
        pnlFormTeacher.add(txtCpf);
        txtCpf.setBounds(70, 10, 220, 30);

        try {
            txtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPhone.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(txtPhone);
        txtPhone.setBounds(390, 10, 270, 30);

        lblStreet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblStreet.setText("Rua:");
        pnlFormTeacher.add(lblStreet);
        lblStreet.setBounds(10, 130, 60, 30);

        lblDistrict.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDistrict.setText("Bairro:");
        pnlFormTeacher.add(lblDistrict);
        lblDistrict.setBounds(10, 170, 53, 30);

        lblNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNumber.setText("Nro:");
        pnlFormTeacher.add(lblNumber);
        lblNumber.setBounds(470, 130, 34, 30);

        lblCep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCep.setText("Cep:");
        pnlFormTeacher.add(lblCep);
        lblCep.setBounds(10, 210, 38, 30);

        lblState.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblState.setText("Estado:");
        pnlFormTeacher.add(lblState);
        lblState.setBounds(150, 210, 70, 30);

        lblCity.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCity.setText("Cidade:");
        pnlFormTeacher.add(lblCity);
        lblCity.setBounds(380, 210, 70, 30);

        lblComplement.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblComplement.setText("Complemento:");
        pnlFormTeacher.add(lblComplement);
        lblComplement.setBounds(380, 170, 120, 30);

        txtStreet.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(txtStreet);
        txtStreet.setBounds(70, 130, 390, 25);

        txtNumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(txtNumber);
        txtNumber.setBounds(510, 130, 150, 25);

        txtDistrict.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(txtDistrict);
        txtDistrict.setBounds(70, 170, 300, 25);

        txtComplement.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(txtComplement);
        txtComplement.setBounds(500, 170, 160, 25);

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(txtCep);
        txtCep.setBounds(50, 210, 90, 25);

        cbxState.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbxState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ" }));
        pnlFormTeacher.add(cbxState);
        cbxState.setBounds(220, 210, 150, 25);

        txtCity.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(txtCity);
        txtCity.setBounds(450, 210, 210, 25);

        tblTeachers.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tblTeachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTeachers);

        pnlFormTeacher.add(jScrollPane1);
        jScrollPane1.setBounds(10, 290, 650, 260);

        cbxModality1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(cbxModality1);
        cbxModality1.setBounds(110, 250, 150, 30);

        lblModality1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblModality1.setText("Modalidade:");
        pnlFormTeacher.add(lblModality1);
        lblModality1.setBounds(10, 250, 100, 30);

        lblModality2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblModality2.setText("Modalidade:");
        pnlFormTeacher.add(lblModality2);
        lblModality2.setBounds(270, 250, 100, 30);

        cbxModality2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pnlFormTeacher.add(cbxModality2);
        cbxModality2.setBounds(370, 250, 150, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlFormTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlFormTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        flagButton=1;
        enabledText();
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnSearch.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (flagButton==1){
            personMod.setCpf(txtCpf.getText().replace(".","").replace("-",""));
            //personMod.setPhone(txtPhone.getText());
            personMod.setName(txtName.getText());
            personMod.setSex((String)cbxSex.getSelectedItem());
            //personMod.setEmail(txtEmail.getText());
            personMod.setStreet(txtStreet.getText());
            personMod.setDistrict(txtDistrict.getText());
            personMod.setNum(Integer.parseInt(txtNumber.getText()));
            personMod.setCep(txtCep.getText().replace("-",""));
            personMod.setCity(txtCity.getText());
            personMod.setState((String)cbxState.getSelectedItem());
            personMod.setComplement(txtComplement.getText());
            studentMod.setSituation((String)cbxSituation.getSelectedItem());
            studentCon.saveStudent(personMod, studentMod);
            clearText();
            btnCancel.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
            tbdPnlStudent.setEnabledAt(1, true);
            fillTableMonthly();
        }
        else {
            personMod.setCpf(txtCpf.getText().replace(".","").replace("-",""));
            //personMod.setPhone(txtPhone.getText());
            personMod.setName(txtName.getText());
            personMod.setSex((String)cbxSex.getSelectedItem());
            //personMod.setEmail(txtEmail.getText());
            personMod.setStreet(txtStreet.getText());
            personMod.setDistrict(txtDistrict.getText());
            personMod.setNum(Integer.parseInt(txtNumber.getText()));
            personMod.setCep(txtCep.getText().replace("-",""));
            personMod.setCity(txtCity.getText());
            personMod.setState((String)cbxState.getSelectedItem());
            personMod.setComplement(txtComplement.getText());
            studentMod.setCpf(txtCpf.getText().replace(".","").replace("-",""));
            studentMod.setSituation((String)cbxSituation.getSelectedItem());
            personCon.updatePerson(personMod);
            studentCon.updateStudent(studentMod);
            disableText();
            btnCreate.setEnabled(false);
            btnSave.setEnabled(false);
            btnCancel.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
            tbdPnlStudent.setEnabledAt(1, true);
            fillTableMonthly();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        flagButton = 2;
        enabledText();
        btnSave.setEnabled(true);
        btnDelete.setEnabled(false);
        btnSearch.setEnabled(false);
        //tbdPnlStudent.setEnabledAt(1, true);
        //fillTableMonthly();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        /*clearText();
        disableText();
        btnCreate.setEnabled(true);
        btnDelete.setEnabled(false);
        btnSearch.setEnabled(true);
        tbdPnlStudent.setEnabledAt(1, false);*/
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        /*int question = 0;
        question = JOptionPane.showConfirmDialog(rootPane, "Deseja relamente excluir os dados ?");
        if (question==JOptionPane.YES_OPTION){
            personMod.setCpf(txtCpf.getText().replace(".","").replace("-",""));
            studentCon.deleteStudent(personMod, studentMod);
            clearText();
            disableText();
            btnDelete.setEnabled(false);
            tbdPnlStudent.setEnabledAt(1, false);
        }*/
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        /*personMod.setSearch(txtCpf.getText());
        studentMod.setSearch(txtCpf.getText());
        PersonModel model = personCon.searchPerson(personMod);
        StudentModel stmodel = studentCon.searchStudent(studentMod);
        txtCpf.setText(model.getCpf());
        //personMod.setPhone(txtPhone.getText());
        txtName.setText(model.getName());
        cbxSex.setSelectedItem(model.getSex());
        //personMod.setEmail(txtEmail.getText());
        txtStreet.setText(model.getStreet());
        txtDistrict.setText(model.getDistrict());
        txtNumber.setText(Integer.toString(model.getNum()));
        txtCep.setText(model.getCep());
        txtCity.setText(model.getCity());
        cbxState.setSelectedItem(model.getState());
        txtComplement.setText(model.getComplement());
        cbxSituation.setSelectedItem(stmodel.getSituation());
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnCreate.setEnabled(false);
        tbdPnlStudent.setEnabledAt(1, true);
        fillTableMonthly(); */
    }//GEN-LAST:event_btnSearchActionPerformed

    private void setCbxmodality (){
        MonthlyDao monthlyDao = new MonthlyDao();
        cbxModality1.removeAllItems();
        ArrayList produtos = monthlyDao.findAll(); //'monthlyDAO' é meu objeto que retorna os produtos do banco.
        Iterator i = produtos.iterator();
        while(i.hasNext()) {
            cbxModality1.addItem(String.valueOf(i.next()));
        }
        cbxModality1.setSelectedIndex(0);
    }
    
    private void setCbxmodality2 (){
        MonthlyDao monthlyDao = new MonthlyDao();
        cbxModality2.removeAllItems();//remove os itens atuais do comboBox.
        ArrayList produtos = monthlyDao.findAll(); //'monthlyDAO' é meu objeto que retorna os produtos do banco.
        Iterator j = produtos.iterator();
        while(j.hasNext()) {
            cbxModality2.addItem(String.valueOf(j.next()));
        }
        cbxModality2.setSelectedIndex(1);
    }
    
    private void clearText (){
        txtCpf.setText("");
        txtName.setText("");
        //cbxSex.set("");
        txtEmail.setText("");
        //cbxSituation.set("");
        txtStreet.setText("");
        txtDistrict.setText("");
        txtComplement.setText("");
        txtNumber.setText("");
        txtCep.setText("");
        txtCity.setText("");
        //cbxState.setText("");
    }
    
    private void enabledText (){
        txtCpf.setEnabled(true);
        txtPhone.setEnabled(true);
        txtName.setEnabled(true);
        cbxSex.setEnabled(true);
        txtEmail.setEnabled(true);
        txtStreet.setEnabled(true);
        txtDistrict.setEnabled(true);
        txtComplement.setEnabled(true);
        txtNumber.setEnabled(true);
        txtCep.setEnabled(true);
        txtCity.setEnabled(true);
        cbxState.setEnabled(true);
        cbxModality1.setEnabled(true);
        cbxModality2.setEnabled(true);
    }
    
    private void disableText (){
        txtCpf.setEnabled(true);
        txtPhone.setEnabled(false);
        txtName.setEnabled(false);
        cbxSex.setEnabled(false);
        txtEmail.setEnabled(false);
        txtStreet.setEnabled(false);
        txtDistrict.setEnabled(false);
        txtComplement.setEnabled(false);
        txtNumber.setEnabled(false);
        txtCep.setEnabled(false);
        txtCity.setEnabled(false);
        cbxState.setEnabled(false);
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        cbxModality1.setEnabled(false);
        cbxModality2.setEnabled(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormRegisterTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegisterTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegisterTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegisterTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegisterTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxModality1;
    private javax.swing.JComboBox<String> cbxModality2;
    private javax.swing.JComboBox cbxSex;
    private javax.swing.JComboBox<String> cbxState;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblComplement;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDistrict;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblModality1;
    private javax.swing.JLabel lblModality2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlFormTeacher;
    private javax.swing.JTable tblTeachers;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtComplement;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
