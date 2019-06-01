/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Samuli
 */
public class AppLogic {

    int laskuri = 0;

    public void lisaa() {
        laskuri = laskuri + 1;
    }
    
    public int getLaskuri() {
        return laskuri;
    }
    
    public String laskuriToString() {
        return Integer.toString(laskuri);
    }
   
}
