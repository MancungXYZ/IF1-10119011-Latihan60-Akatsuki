/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan60.akatsuki;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda    
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Anggota Akatsuki");
        AnggotaAkatsuki AA = new AnggotaAkatsuki("Tobi", "Hitam", "Laki-laki", "Konoha");
        AA.getNama();
        AA.getWarnaRambut();
        AA.getGender();
        AA.getDesa();
        AA.siapaSaya();
        AA.tempatAsal();
        
        System.out.println();
        
        AnggotaAkatsuki AA1 = new AnggotaAkatsuki("Konan", "Ungu", "Perempuan", "Kirigakure");
        AA1.getNama();
        AA1.getWarnaRambut();
        AA1.getGender();
        AA1.getDesa();
        AA1.siapaSaya();
        AA1.tempatAsal();
    }
    
}
