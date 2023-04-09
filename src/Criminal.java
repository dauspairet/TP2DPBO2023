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
    private int id_criminal;
    private String name;
    private byte[] picture;
    
    public Criminal(int id_picture, String name, byte[] image){
        this.id_criminal = id_picture;
        this.name = name;
        this.picture = image;
    }
    
    public void setId_picture(int id_picture) {
        this.id_criminal = id_picture;
    }
    
    public void setDeskripsi(String name) {
        this.name = name;
    }
    
    public int getId_picture() {
        return this.id_criminal;
    }
    
    public String getDeskripsi() {
        return this.name;
    }
    
    public byte[] getImage(){
        return picture;
    }
   
}
