/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class AllergyList {
    private ArrayList<Allergy> allergyList;

    public AllergyList() {
    allergyList= new ArrayList<>();
    }

    public ArrayList<Allergy> getAllergyList() {
        return allergyList;
    }

    public void setAllergyList(ArrayList<Allergy> allergyList) {
        this.allergyList = allergyList;
    }
    
    
    public Allergy addAllergy(Allergy allergy)
    {
    allergyList.add(allergy);
    return allergy;
    }
}
