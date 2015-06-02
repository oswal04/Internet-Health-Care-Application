/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HPatient;

import Business.Patient.Encounter;
import Business.Patient.Medication;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Chirag
 */
public class ViewRecordsDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEncounterDetailsJPanel
     */
    JPanel userProcessContainer;
    Encounter encounter;

    public ViewRecordsDetailsJPanel(JPanel userProcessContainer, Encounter encounter) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.encounter = encounter;
        jLabel1.setText("Details for visit on: " + encounter.getTimeStamp());
        bpjTextField.setText(String.valueOf(encounter.getVitalSigns().getBloodPressure()));
        hrjTextField2.setText(String.valueOf(encounter.getVitalSigns().getHeartRate()));
        wtjTextField.setText(String.valueOf(encounter.getVitalSigns().getWeight()));
        pulseratejTextField1.setText(String.valueOf(encounter.getVitalSigns().getPulseRate()));
        labreportjTextField.setText(encounter.getLabreport());
        nursename.setText(encounter.getNurse());
        labasst.setText(encounter.getLabasst());
        generateGraph();
        populatePres();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bpjTextField = new javax.swing.JTextField();
        hrjTextField2 = new javax.swing.JTextField();
        pulseratejTextField1 = new javax.swing.JTextField();
        wtjTextField = new javax.swing.JTextField();
        graphjPanel1 = new javax.swing.JPanel();
        backjButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labreportjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nursename = new javax.swing.JTextField();
        labasst = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        prescriptionjTable1 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jLabel2.setText("Blood Pressure:");

        jLabel3.setText("Heart Rate:");

        jLabel4.setText("Pulse Rate:");

        jLabel5.setText("Weight:");

        bpjTextField.setEditable(false);

        hrjTextField2.setEditable(false);

        pulseratejTextField1.setEditable(false);

        wtjTextField.setEditable(false);
        wtjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtjTextFieldActionPerformed(evt);
            }
        });

        graphjPanel1.setBackground(new java.awt.Color(255, 255, 255));
        graphjPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        graphjPanel1.setLayout(new java.awt.BorderLayout());

        backjButton.setText("Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Lab Report:");

        labreportjTextField.setEnabled(false);

        jLabel7.setText("Nurse:");

        jLabel8.setText("Lab Assistant:");

        nursename.setEditable(false);

        labasst.setEditable(false);

        prescriptionjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medicine Name", "Generic Name", "Refills"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(prescriptionjTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nursename)
                            .addComponent(hrjTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(bpjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(graphjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pulseratejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(24, 24, 24)
                                .addComponent(labreportjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labasst, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(wtjTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bpjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(pulseratejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wtjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(hrjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labasst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(nursename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(graphjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labreportjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addComponent(backjButton)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void wtjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wtjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wtjTextFieldActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField bpjTextField;
    private javax.swing.JPanel graphjPanel1;
    private javax.swing.JTextField hrjTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField labasst;
    private javax.swing.JTextField labreportjTextField;
    private javax.swing.JTextField nursename;
    private javax.swing.JTable prescriptionjTable1;
    private javax.swing.JTextField pulseratejTextField1;
    private javax.swing.JTextField wtjTextField;
    // End of variables declaration//GEN-END:variables

    private void generateGraph() {
        /* DefaultCategoryDataset dataset = new DefaultCategoryDataset();

         JFreeChart chart = null;

         dataset.setValue(encounter.getVitalSigns().getBloodPressure(), "Rate", "BloodPressure");
         dataset.setValue(encounter.getVitalSigns().getHeartRate(), "Rate", "HeartRate");
         dataset.setValue(encounter.getVitalSigns().getWeight(), "Rate", "Weight");
         dataset.setValue(encounter.getVitalSigns().getPulseRate(), "Rate", "PulseRate");
         chart = ChartFactory.createBarChart("Patient History", "VitalSign", "Rate", dataset, PlotOrientation.VERTICAL, true, true, true);
         CategoryPlot p = chart.getCategoryPlot();
         p.setRangeGridlinePaint(Color.black);
         ChartPanel barPanel = new ChartPanel(chart);
         graphjPanel1.removeAll();
         graphjPanel1.add(barPanel , BorderLayout.CENTER);
         graphjPanel1.validate();
         */

        DefaultCategoryDataset barchart = new DefaultCategoryDataset();
        barchart.setValue(encounter.getVitalSigns().getBloodPressure(), "Points", "BloodPressure");
        barchart.setValue(encounter.getVitalSigns().getHeartRate(), "Points", "HeartRate");
        barchart.setValue(encounter.getVitalSigns().getWeight(), "Points", "Weight");
        barchart.setValue(encounter.getVitalSigns().getPulseRate(), "Points", "PulseRate");

        JFreeChart chart = ChartFactory.createBarChart("Vital Signs", "Vitals ", "Points", barchart, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot cp = chart.getCategoryPlot();
        cp.setRangeGridlinePaint(Color.white);
        cp.setBackgroundPaint(Color.black);

        ChartPanel chartPanel = new ChartPanel(chart);
        graphjPanel1.removeAll();
        graphjPanel1.add(chartPanel, BorderLayout.CENTER);
        graphjPanel1.repaint();
        graphjPanel1.validate();

    }

    private void populatePres() {
        DefaultTableModel model = (DefaultTableModel) prescriptionjTable1.getModel();
        //set the orgainzation's work queue
        model.setRowCount(0);
        for (Medication m : encounter.getPrescription().getMedicationList()) {
            Object[] row = new Object[4];
            row[0] = m.getDrug().getMedicineName();
            row[1] = m.getDrug().getGenericName();
            row[2] = m.getRefill();
            model.addRow(row);
        }
    }
}

