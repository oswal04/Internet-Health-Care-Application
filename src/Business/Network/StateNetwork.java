/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class StateNetwork {

    String statename;
    ArrayList<CityNetwork> cityNetworkList;

    public StateNetwork() {

        cityNetworkList = new ArrayList<>();

    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public ArrayList<CityNetwork> getCityNetworkList() {
        return cityNetworkList;
    }

    public void setCityNetworkList(ArrayList<CityNetwork> cityNetworkList) {
        this.cityNetworkList = cityNetworkList;
    }

    public CityNetwork addCity(String cityName) {
        CityNetwork cityNetwork = null;
        boolean flag = false;
        if (cityNetworkList.isEmpty()) {
            CityNetwork cn = new CityNetwork();
            cn.setCityname(cityName);
            cityNetworkList.add(cn);
            //added
            cityNetwork=cn;
            return cn;

        }
        for (CityNetwork cn : cityNetworkList) {
            if (cn.getCityname().equals(cityName)) {
                cityNetwork = cn;
//            } else {
                flag = true;
            }

        }
        if (flag == false) {
            CityNetwork cn = new CityNetwork();
            cn.setCityname(cityName);
            cityNetworkList.add(cn);
            return cn;
        }
        return cityNetwork;

    }

    @Override
    public String toString() {
        return statename;
    }

}
