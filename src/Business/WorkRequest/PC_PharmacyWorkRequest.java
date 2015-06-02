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
public class PC_PharmacyWorkRequest extends WorkRequest{
    
    Drug d;

    public Drug getD() {
        return d;
    }

    public void setD(Drug d) {
        this.d = d;
    }
    
}
