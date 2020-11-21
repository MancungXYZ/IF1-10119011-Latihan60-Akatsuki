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
public class AnggotaAkatsuki extends Akatsuki {
    private String desa;
    
    public AnggotaAkatsuki (String nama, String warnaRambut, String gender, String desa) {
        super(nama, warnaRambut, gender);
        this.desa = desa;
    }

    public String getDesa() {
        return desa;
    }
    
    public void tempatAsal () {
        System.out.println("Dia berasal dari desa " + desa);
    }
}
