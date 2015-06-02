/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Start.Ecosystem;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
 
     public EnterpriseDirectory() {
        this.enterpriseList =new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    //add enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type)
    {
    Enterprise enterprise= null;
    //new hospital
    if(type==Enterprise.EnterpriseType.Hospital)
    {
    enterprise= new HospitalEnterprise(name);
    enterpriseList.add(enterprise);
    }
    //new clinic
    else if(type==Enterprise.EnterpriseType.Clinic)
    {
    enterprise= new ClinicEnterprise(name);
    enterpriseList.add(enterprise);
    }
    //new pharmacy
     else if(type==Enterprise.EnterpriseType.Pharmacy)
    {
    enterprise= new PharmacyEnterprise(name);
    enterpriseList.add(enterprise);
    }
    // new pharma co
     else if(type==Enterprise.EnterpriseType.PharmaceuticalCompany)
    {
    enterprise= new PharmaceuticalCompanyEnterprise(name);
    enterpriseList.add(enterprise);
    }
     // new FDA Office
     else if(type==Enterprise.EnterpriseType.FDA)
    {
    enterprise= new FDA(name);
    enterpriseList.add(enterprise);
    }
    return enterprise;
    
}
    //remove enterprise
    
    public void removeEnterprise(Enterprise e)
    {
       enterpriseList.remove(e);
       
    
    }
    
}
 