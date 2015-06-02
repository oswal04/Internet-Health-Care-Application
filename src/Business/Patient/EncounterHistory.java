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
public class EncounterHistory {
    
    ArrayList<Encounter> encounterList;
    
    public EncounterHistory()
    {
    
    encounterList= new ArrayList<>();
    
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public Encounter addEncounter(Encounter e)
    {
    encounterList.add(e);
    return e;
    
    }
    
    
}
