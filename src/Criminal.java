// Saya Muhamad Firdaus [2101995] mengerjakan
// soal TP 2 dalam mata kuliah DPBO
// untuk keberkahanNya maka saya tidak melakukan kecurangan 
// seperti yang telah dispesifikasikan. Aamiin.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Firdaus
 */
public class Criminal {
    // Attributes
    private int id_criminal;
    private String name;
    private String reward;
    private byte[] picture;
    
    // Constructor
    public Criminal(int id_picture, String name, String reward, byte[] image){
        this.id_criminal = id_picture;
        this.name = name;
        this.reward = reward;
        this.picture = image;
    }
    
    // Setter and getter
    public void setId_picture(int id_picture) {
        this.id_criminal = id_picture;
    }
    
    public int getId_picture() {
        return this.id_criminal;
    }
    
    public void setName(String name) {
        this.name = name;
    }
  
    public String getName() {
        return this.name;
    }
    
    public void setReward(String reward) {
        this.reward = reward;
    }
  
    public String getReward() {
        return this.reward;
    }
    
    public void setImage(byte[] picture){
        this.picture = picture;
    }
    
    public byte[] getImage(){
        return picture;
    }
   
}
