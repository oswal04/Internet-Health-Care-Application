/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Drug.Drug;
import Business.Enterprise.Enterprise;

/**
 *
 * @author Chirag
 */
public class Dr_FDAWorkRequest extends WorkRequest {

    private Drug drug;
    private Enterprise senderCo;

    public Enterprise getSenderCo() {
        return senderCo;
    }

    public void setSenderCo(Enterprise senderCo) {
        this.senderCo = senderCo;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    @Override
    public String toString() {
        return drug.getMedicineName();
    }
}
