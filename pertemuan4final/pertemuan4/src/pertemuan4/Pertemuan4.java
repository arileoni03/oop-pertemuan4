/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author arile
 * TGL 12 APRIL 2025
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array 1 dimensi
        String[] teman= new String[5];
        
        teman[0] = "Joko";
        teman[1] = "Widodo";
        teman[2] = "Prabowo";
        teman[3] = "Subianto";
        teman[4] = "Teddy";
    
//        Scanner inp = new Scanner(System.in);
//       
//        for(int idx=0; idx<5; idx++){
//            System.out.print("Data Teman ke-"+String.valueOf(idx)+": "); //bisa menggunakan Integer.toString()
//            teman[idx] = inp.nextLine();
//        }
        
        //memanggil data teman di posisi ke 3 (prabowo)
        String NamaTeman = teman[3];
           System.out.printf("Data Teman: %s\n", teman[3]);
        
        //menampilkan data dengan perulangan
//        for(int idx=0; idx<5; idx++){
//            System.out.println("Data Teman ke-"+String.valueOf(idx+1)+": "+teman[idx]); //bisa menggunakan Integer.toString()
//        }
        
        //foreach
        for(String nm : teman){
            System.out.println(nm);
        }
         
        
        
        //cara print data teman paling atas
//        for(int i=0;i<teman.length;i++){
//           System.out.println("Indeks ke- "+i+":"+teman[i]);
//       }

        
        
    }
    
}
