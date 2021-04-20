
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Nomor1 {
    
   public static void shellSort (int[] arr) {
        int n = arr.length;
        int C,M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        
        while (jarak >=1){
            jarak = jarak/2;
            Sudah = true;
            while (Sudah){
                Sudah = false;
                for (j=0;j<n-jarak;j++){
                    i = j+jarak;
                    C++;
                    if (arr[j]>arr[i]){
                        temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        Sudah=true;
                    }
                }
            }
        }
        
        
    }
    public static void tampil(int data[]) {
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data[]={3,10,4,2,8,13};
        Nomor1.tampil(data);
        Nomor1.shellSort(data);
        int cari=8;
        int IndeksAwal=0;
        int IndeksAkhir=data.length-1;
        int ketemu = 0;
        int point=0;
        
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        
        while((IndeksAwal<=IndeksAkhir)&&(ketemu==0)){
            point = (IndeksAwal + IndeksAkhir)/2;
            System.out.println("Indeks Pointer : "+point);
            if(cari == data[point]){
                ketemu = 1;
                System.out.println("Data "+cari+" Telah Ditemukan di indeks ke : "+point);
                }else if (cari<data[point]){
                    System.out.println("Cari diKiri ");
                    IndeksAkhir = point-1;
                }
                else{
                    IndeksAwal = point+1;
                    System.out.println("Cari diKanan");
                }
        }
        if(ketemu==1){
            System.out.println("Kesimpulan : Data Dapat diTemukan ");
        }else{
            System.out.println("Kesimpulan : Data Tidak Dapat Ditemukan ");
        }
        
    }
}