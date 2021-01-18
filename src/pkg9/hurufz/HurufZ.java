/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.hurufz;
/**
 *
 * @author Intan
 */
public class HurufZ {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j=5; //deklarasi variabel j
        for(int p=1;p<=j;p++){ //perulangan kebawah sebanyak lima kali
            for(int u=5;u>=1;u--){ //perulangan kesamping sebanyak lima kali
                if(p==u){ //jika nilai p sama dengan u 
                    System.out.print("@"); //maka akan menampilkan output @
                }else if(p==1||p==5){ //jika nilai p adalah 1 dan 5 
                    System.out.print("@");//maka akan menampilkan output @
                }else{ //jika selain syarat
                    System.out.print(" "); //maka akan menampilkan output spasi
                }
            }System.out.println(""); //memberi jarak antar baris
        }
    } 
}
