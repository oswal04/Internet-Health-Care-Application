/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Chirag
 */
public abstract class Enterprise extends Organization{
    
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    
    public enum EnterpriseType{
    
    Hospital("Hospital"),
    Clinic("Clinic"),
    Pharmacy("Pharmacy"),
    PharmaceuticalCompany("Pharmaceutical Company"),
    FDA("FDA");
    
    private String value;
    private EnterpriseType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
              
    
    }//end of EnterpriceType
    
    
    public Enterprise(String name,EnterpriseType enterpriseType)
    {
    super(name);
    this.enterpriseType=enterpriseType;
    this.organizationDirectory=new OrganizationDirectory();
    
    }
    
    //getter and setter
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
}
