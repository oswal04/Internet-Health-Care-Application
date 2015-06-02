/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Start;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class Ecosystem extends Organization {

    private static Ecosystem ecosystem;
    private OrganizationDirectory organizationDirectory;
    private ArrayList<Network> countrynetworkList;

    //constructor
    public Ecosystem() {
        super(null);
        organizationDirectory = new OrganizationDirectory();
        countrynetworkList = new ArrayList<>();

    }
//getters and setters

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public ArrayList<Network> getcountryNetworkList() {
        return countrynetworkList;
    }

    public void setNetworkList(ArrayList<Network> countrynetworkList) {
        this.countrynetworkList = countrynetworkList;
    }

// getInstance method
    public static Ecosystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new Ecosystem();
        }
        
        return ecosystem;
    }

    public Network createCountryNetwork(String countryName) {
        Network network = null;
        boolean flag = false;
        if (ecosystem.getcountryNetworkList().isEmpty()) {
            Network n = new Network();
            n.setCountryname(countryName);
            countrynetworkList.add(n);
            network = n;
         }
        
        for (Network net : ecosystem.getcountryNetworkList()) {
            if (net.getCountryname().equals(countryName)) {
                network = net;
//            } 
//            else {
                flag = true;
            }

        }
        if (flag == false) {
            Network n = new Network();
            n.setCountryname(countryName);
            countrynetworkList.add(n);
            network = n;
        }
        return network;
    }

    public void removeCountryNetwork(Network n) {
        countrynetworkList.remove(n);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;

    }
}
