/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

/**
 *
 * @author user
 */
public class TaskJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Biodata biodata = new Biodata();
        
        biodata.getFullName("Sayyid Nabil Rifki");
        biodata.getPlaceBirth("Tangerang Selatan");
        biodata.getDateBirth(25," November ",2002);
        biodata.getHobby("Basket, Game");
        biodata.getZodiac("Sagitarius");
        biodata.getFavFood("Iga Bakar");
        biodata.getDreams("Membahagiakan orang tua");
    }
    
}
