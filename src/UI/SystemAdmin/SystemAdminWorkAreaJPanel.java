/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdmin;

import Business.Enterprise.Enterprise;
import Business.Network.CityNetwork;
import Business.Network.Network;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Start.Ecosystem;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Chirag
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Ecosystem ecosystem;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, Ecosystem e) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = e;
        populateTree();
    }

    /* public void populateTree() {
        DefaultTreeModel tree = (DefaultTreeModel) systemjTree1.getModel();
        ArrayList<Network> countryList = ecosystem.getcountryNetworkList();

        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        Network network;
        StateNetwork stateNetwork;
        CityNetwork cityNetwork;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree.getRoot();
        root.insert(networks, 0);

        DefaultMutableTreeNode countryNode;
        DefaultMutableTreeNode stateNode;
        DefaultMutableTreeNode cityNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        //populating country networks
        for (int i = 0; i < countryList.size(); i++) {
            network = countryList.get(i);
            countryNode = new DefaultMutableTreeNode(network.getCountryname());
            networks.insert(countryNode, i);
            //populating state net
            ArrayList<StateNetwork> stateList = network.getStateNetworkList();
            for (int c = 0; c < stateList.size(); c++) {
                stateNetwork = stateList.get(c);
                stateNode = new DefaultMutableTreeNode(stateNetwork.getStatename());
                countryNode.insert(stateNode, c);

                //populating city net
                ArrayList<CityNetwork> cityList = stateNetwork.getCityNetworkList();
                for (int b = 0; b < cityList.size(); b++) {
                    cityNetwork = cityList.get(b);
                    cityNode = new DefaultMutableTreeNode(cityNetwork.getCityname());
                    stateNode.insert(cityNode, b);

                    //populating enterprise
                    enterpriseList = cityNetwork.getEnterpriseDirectory().getEnterpriseList();
                    for (int j = 0; j < enterpriseList.size(); j++) {
                        enterprise = enterpriseList.get(j);
                        enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                        cityNode.insert(enterpriseNode, j);

                        //creating organization
                        organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                        for (int k = 0; k < organizationList.size(); k++) {
                            organization = organizationList.get(k);
                            organizationNode = new DefaultMutableTreeNode(organization.getName());
                            enterpriseNode.insert(organizationNode, k);

                        }
                    }
                }
            }
        }*/
    
    
    public void populateTree()
    {
        ArrayList<Network> countryList = ecosystem.getcountryNetworkList();
         ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList = null;
        ArrayList<StateNetwork> stateList = null;
        ArrayList<CityNetwork> cityList = null;
       
        Network network;
        CityNetwork city;
        StateNetwork state;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        DefaultMutableTreeNode cityNode;
        DefaultMutableTreeNode stateNode;
                
                
        DefaultTreeModel model = (DefaultTreeModel) systemjTree1.getModel();
        
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Network");
        root.insert(networks, 0);
        
        DefaultMutableTreeNode states = new DefaultMutableTreeNode("States");
        //root.insert(states, 1);
        DefaultMutableTreeNode citys = new DefaultMutableTreeNode("Cities");
        
        
        
        for(int i=0;i<countryList.size();i++)
        {
            network = countryList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getCountryname());
            networks.insert(networkNode,i);
            
            
            stateList = network.getStateNetworkList();
            for(int l=0;l<stateList.size();l++)
        {
            //networks.insert(states, l+1);
            state = stateList.get(l);
            stateNode = new DefaultMutableTreeNode(state.getStatename());
            networkNode.insert(stateNode,l);
            
            
            
            cityList = state.getCityNetworkList();
            for(int m=0;m<cityList.size();m++)
        {
            //states.insert(citys, m+1);
            city = cityList.get(m);
            cityNode = new DefaultMutableTreeNode(city.getCityname());
            stateNode.insert(cityNode,m);
            
            
            enterpriseList = city.getEnterpriseDirectory().getEnterpriseList();
            
              for(int j=0;j<enterpriseList.size();j++)
        {
            
            enterprise = enterpriseList.get(j);
            enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
            cityNode.insert(enterpriseNode,j);
            
            organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
            
               for(int k=0;k<organizationList.size();k++)
        {
            organization = organizationList.get(k);
            organizationNode = new DefaultMutableTreeNode(organization.getName());
            enterpriseNode.insert(organizationNode,k);
        }
        }
        }
        }
        }
        model.reload();
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
        addnetworkjButton = new javax.swing.JButton();
        addHospjButton1 = new javax.swing.JButton();
        addClinicjButton2 = new javax.swing.JButton();
        addPharmacyjButton3 = new javax.swing.JButton();
        addPhCompjButton = new javax.swing.JButton();
        manageEntjButton1 = new javax.swing.JButton();
        addPhCompjButton1 = new javax.swing.JButton();
        addPhCompjButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        systemjTree1 = new javax.swing.JTree();
        refreshjButton = new javax.swing.JButton();

        jLabel1.setText("System Admin Work Area");
        jLabel1.setToolTipText("");

        addnetworkjButton.setText("Add Network>>");
        addnetworkjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnetworkjButtonActionPerformed(evt);
            }
        });

        addHospjButton1.setText("Add Hospital>>");
        addHospjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHospjButton1ActionPerformed(evt);
            }
        });

        addClinicjButton2.setText("Add Clinic>>");
        addClinicjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClinicjButton2ActionPerformed(evt);
            }
        });

        addPharmacyjButton3.setText("Add Pharmacy>>");
        addPharmacyjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPharmacyjButton3ActionPerformed(evt);
            }
        });

        addPhCompjButton.setText("Add Pharmaceutical Company>>");
        addPhCompjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhCompjButtonActionPerformed(evt);
            }
        });

        manageEntjButton1.setText("Manage Enterprise Administrator>>");
        manageEntjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEntjButton1ActionPerformed(evt);
            }
        });

        addPhCompjButton1.setText("View All Enterprises>>");
        addPhCompjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhCompjButton1ActionPerformed(evt);
            }
        });

        addPhCompjButton2.setText("Add FDA Office>>");
        addPhCompjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhCompjButton2ActionPerformed(evt);
            }
        });

        systemjTree1.setBackground(new java.awt.Color(204, 204, 204));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        systemjTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(systemjTree1);

        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageEntjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPhCompjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPhCompjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPhCompjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPharmacyjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClinicjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addHospjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addnetworkjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(refreshjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addnetworkjButton)
                        .addGap(18, 18, 18)
                        .addComponent(addHospjButton1)
                        .addGap(18, 18, 18)
                        .addComponent(addClinicjButton2)
                        .addGap(18, 18, 18)
                        .addComponent(addPharmacyjButton3)
                        .addGap(18, 18, 18)
                        .addComponent(addPhCompjButton)
                        .addGap(18, 18, 18)
                        .addComponent(addPhCompjButton2)
                        .addGap(18, 18, 18)
                        .addComponent(addPhCompjButton1)
                        .addGap(18, 18, 18)
                        .addComponent(manageEntjButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshjButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addnetworkjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnetworkjButtonActionPerformed
        // TODO add your handling code here:
        AddNetworkJPanel panel = new AddNetworkJPanel(userProcessContainer, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddNetworkJPanel", panel);
        layout.next(userProcessContainer);

    }//GEN-LAST:event_addnetworkjButtonActionPerformed

    private void addHospjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHospjButton1ActionPerformed
        // TODO add your handling code here:
        AddHospitalJPanel panel = new AddHospitalJPanel(userProcessContainer, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddHospitalJPanel", panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addHospjButton1ActionPerformed

    private void addClinicjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClinicjButton2ActionPerformed
        // TODO add your handling code here:
        AddClinicJPanel panel = new AddClinicJPanel(userProcessContainer, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddClinicJPanel", panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addClinicjButton2ActionPerformed

    private void addPharmacyjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPharmacyjButton3ActionPerformed
        // TODO add your handling code here:
        AddPharmacyJPanel panel = new AddPharmacyJPanel(userProcessContainer, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddPharmacyJPanel", panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPharmacyjButton3ActionPerformed

    private void addPhCompjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhCompjButtonActionPerformed
        // TODO add your handling code here:
        AddPharmaCoJPanel panel = new AddPharmaCoJPanel(userProcessContainer, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddPharmaCoJPanel", panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPhCompjButtonActionPerformed

    private void addPhCompjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhCompjButton1ActionPerformed
        // TODO add your handling code here:
        ViewEnterprisesJPanel panel = new ViewEnterprisesJPanel(userProcessContainer, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewEnterprisesJPanel", panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPhCompjButton1ActionPerformed

    private void manageEntjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEntjButton1ActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJpanel panel = new ManageEnterpriseAdminJpanel(userProcessContainer, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageEnterpriseAdminJPanel", panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEntjButton1ActionPerformed

    private void addPhCompjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhCompjButton2ActionPerformed
        // TODO add your handling code here:
        AddFDAOfficeJPanel panel = new AddFDAOfficeJPanel(userProcessContainer, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageEnterpriseAdminJPanel", panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPhCompjButton2ActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
        populateTree();
    }//GEN-LAST:event_refreshjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClinicjButton2;
    private javax.swing.JButton addHospjButton1;
    private javax.swing.JButton addPhCompjButton;
    private javax.swing.JButton addPhCompjButton1;
    private javax.swing.JButton addPhCompjButton2;
    private javax.swing.JButton addPharmacyjButton3;
    private javax.swing.JButton addnetworkjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageEntjButton1;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JTree systemjTree1;
    // End of variables declaration//GEN-END:variables

   
}
