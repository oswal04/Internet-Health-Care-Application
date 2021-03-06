/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HPatient;

import Business.Employee.Doctor;
import Business.Enterprise.Enterprise;
import Business.Organization.HospitalDoctorOrganization;
import Business.Organization.Organization;
import Business.Patient.Encounter;
import Business.Patient.Patient;
import Business.Start.Ecosystem;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.Dr_LabWorkRequest;
import Business.WorkRequest.Patient_DrWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chirag
 */
public class ViewPastRecordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPastRecordJPanel
     */
    JPanel userProcessContainer;
    Patient p;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Ecosystem ecosystem;

    public ViewPastRecordJPanel(JPanel userProcesscountainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem, Patient p) {
        initComponents();
        this.userProcessContainer = userProcesscountainer;
        this.p = p;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        jLabel1.setText("Records of: " + p.getFname());
        populateTable();
        populateReqTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        recordsjTable = new javax.swing.JTable();
        backButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        feedbackjButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reqjTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        reactionmsg = new javax.swing.JTextField();

        recordsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Visit Time", "Complaint/Reason", "Symptoms", "Diagnosis", "Treatment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(recordsjTable);
        if (recordsjTable.getColumnModel().getColumnCount() > 0) {
            recordsjTable.getColumnModel().getColumn(0).setResizable(false);
            recordsjTable.getColumnModel().getColumn(1).setResizable(false);
            recordsjTable.getColumnModel().getColumn(2).setResizable(false);
            recordsjTable.getColumnModel().getColumn(3).setResizable(false);
            recordsjTable.getColumnModel().getColumn(4).setResizable(false);
        }

        backButton2.setText("<<Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        feedbackjButton2.setText("Provide Feedback to Doctor");
        feedbackjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackjButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("My Records");

        reqjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date of Visit", "Hospital", "Doctor", "Reaction", "Status", "Dr's Reply"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(reqjTable);

        jLabel3.setText("Reactions:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(reactionmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton2)
                        .addGap(113, 113, 113)
                        .addComponent(feedbackjButton2)))
                .addGap(420, 420, 420)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(263, 263, 263))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reactionmsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton2)
                    .addComponent(feedbackjButton2))
                .addGap(0, 227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton2ActionPerformed

    private void feedbackjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackjButton2ActionPerformed
        // TODO add your handling code here:

        String reaction = reactionmsg.getText();
        Patient_DrWorkRequest pdwr = new Patient_DrWorkRequest();

        int selectedRow = recordsjTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "sePlease select a record");
            return;
        }

        Encounter encounter = (Encounter) recordsjTable.getValueAt(selectedRow, 0);
        //request.setRequestDate(new Date());
        pdwr.setEncounter(encounter);
        pdwr.setSender(userAccount);
        pdwr.setMessage(reaction);
        pdwr.setStatus("Sent");
        pdwr.setPatient(p);

        Doctor doctor = p.getDoctor();
        System.out.println("Doctor is:" + doctor);
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof HospitalDoctorOrganization) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getEmployee() instanceof Doctor) {
                        Doctor d = (Doctor) ua.getEmployee();
                        if (d.equals(doctor)) {
                            ua.getWorkQueue().getWorkList().add(pdwr);
                            userAccount.getWorkQueue().getWorkList().add(pdwr);
                        }

                    }
                }
            }

            populateReqTable();
    }//GEN-LAST:event_feedbackjButton2ActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton2;
    private javax.swing.JButton feedbackjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField reactionmsg;
    private javax.swing.JTable recordsjTable;
    private javax.swing.JTable reqjTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        DefaultTableModel model = (DefaultTableModel) recordsjTable.getModel();
        model.setRowCount(0);
        for (Encounter e : p.getEncounterHistory().getEncounterList()) {
            Object[] row = new Object[7];
            row[0] = e;
            row[1] = e.getTreatedby();
            row[2] = e.getComplaint();
            row[3] = e.getSymptoms();
            //row[4] = e.getDiagnosis();
          
            //row[5] = e.getTreatment();

            model.addRow(row);

        }

    }

    private void populateReqTable() {
        DefaultTableModel model = (DefaultTableModel) reqjTable.getModel();
        //set the orgainzation's work queue
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkList()) {
            //System.out.println(request);
            if (request instanceof Patient_DrWorkRequest) {
                Patient_DrWorkRequest pdwr = (Patient_DrWorkRequest) request;
                {
                    Object[] row = new Object[8];
                    row[0] = pdwr.getEncounter().getTimeStamp();
                    row[1] = pdwr.getEncounter().getHospital();
                    row[2] = pdwr.getEncounter().getTreatedby();
                    row[3] = pdwr.getMessage();
                    row[4] = pdwr.getStatus();
                    row[5] = pdwr.getDrReply();
                    model.addRow(row);

                }
            }
        }
    }
}
