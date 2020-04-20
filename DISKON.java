/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskon;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class DISKON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        String nama;
        int harga, jumlah, total, pembayaran;
        int potonganA, potonganB, potonganC;
        
        //Scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //menampilkan output
        System.out.println("TOKO BUKU SEJAHTERA");
        System.out.println("Nama Buku : ");
        
       //Scanner String
        nama = keyboard.nextLine();
        
        //output
        System.out.print("Harga Buku : Rp  ");
        
       //Scanner Int
        harga = keyboard.nextInt();
        
        System.out.print("Jumlah Buku : ");
        jumlah = keyboard.nextInt();
        
        total = harga*jumlah;
        
        System.out.println("Total Pembayaran : RP" + " total");
        
        //untuk potongan harga 5 persen
        potonganA = (total - ((total*5)/100));
        //untuk potongan harga 8 persen
        potonganB = (total - ((total*8)/100));
        //untuk potongan harga 10 persen
        potonganC = (total - ((total*10)/100));
        
        //Branching
        if((total>=10000)&&(total<=20000)){
            pembayaran = total - potonganA;
        }else if ((total>=21000)&&(total<=30000)){
            pembayaran = total - potonganB;
        } else if (total>=31000){
            pembayaran = total - potonganC;
        } else {
            pembayaran = total;
        }
        
        
        //tampilan output
        System.out.println("Nama Buku : "+nama);
        System.out.println("Harga Satuan : Rp."+harga);
        System.out.println("Jumlah Buku : "+jumlah);
        System.out.println("Total Harga : "+total );
        System.out.println("Potongan Harga :Rp "+(pembayaran-total));
        System.out.println("Total Pembayaran : Rp "+pembayaran);
    }
    
}
