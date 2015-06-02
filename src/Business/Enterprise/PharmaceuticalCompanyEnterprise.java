/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Drug.DrugCatalog;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class PharmaceuticalCompanyEnterprise extends Enterprise {

    DrugCatalog drugCatalog;

    public PharmaceuticalCompanyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.PharmaceuticalCompany);
        drugCatalog = new DrugCatalog();
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

}
