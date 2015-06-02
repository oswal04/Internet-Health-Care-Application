/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Drug.Drug;

/**
 *
 * @author Chirag
 */
public class FDA_PatWorkRequest extends WorkRequest {
    Drug drug;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    
}
