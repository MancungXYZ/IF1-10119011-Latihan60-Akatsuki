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
public class Akatsuki {
    protected String nama, warnaRambut, gender;
    
    public Akatsuki (String nama, String warnaRambut, String gender) {
        this.nama = nama;
        this.warnaRambut = warnaRambut;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public String getWarnaRambut() {
        return warnaRambut;
    }

    public String getGender() {
        return gender;
    }
    
    public void siapaSaya () {
        
        System.out.println("Nama\t\t : " + nama);
        System.out.println("Warna Rambut\t : " + warnaRambut);
        System.out.println("Gender\t\t : " + gender);
        
    }
}
