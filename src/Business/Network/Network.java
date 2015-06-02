/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Start.Ecosystem;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class Network {

    private String countryname;
    private ArrayList<StateNetwork> stateNetworkList;
   // private EnterpriseDirectory enterpriseDirectory;

    public Network() {
        stateNetworkList = new ArrayList<>();
        //   enterpriseDirectory=new EnterpriseDirectory();
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public ArrayList<StateNetwork> getStateNetworkList() {
        return stateNetworkList;
    }

    public void setStateNetworkList(ArrayList<StateNetwork> stateNetworkList) {
        this.stateNetworkList = stateNetworkList;
    }

    public StateNetwork addState(String statename) {
        StateNetwork stateNetwork = null;
        boolean flag = false;
        if (stateNetworkList.isEmpty()) {
            StateNetwork state = new StateNetwork();
            state.setStatename(statename);
            stateNetworkList.add(state);
            // added
            stateNetwork = state;
            return state;

        } else {
            for (StateNetwork sn : stateNetworkList) {
                if (sn.getStatename().equals(statename)) {
                    stateNetwork = sn;
               // } else {
                    // say statenetwork found
                    flag = true;
                }

            }
            if (flag == false) {
                StateNetwork state = new StateNetwork();
                state.setStatename(statename);
                stateNetworkList.add(state);
                return state;
            }
        }
        return stateNetwork;

    }


    /*  public EnterpriseDirectory getEnterpriseDirectory() {
     return enterpriseDirectory;
     }

     public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
     this.enterpriseDirectory = enterpriseDirectory;
     }
     */
    @Override
    public String toString() {
        return countryname;
    }

}
