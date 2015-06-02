/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class WorkQueue {
    
    ArrayList<WorkRequest> workList;

    public WorkQueue() {
        
        workList= new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkList() {
        return workList;
    }

    public void setWorkList(ArrayList<WorkRequest> workList) {
        this.workList = workList;
    }
    
    
    
}
