/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.nomina;

/**
 *
 * @author ADMIN
 */
public class Calculos {
    public double Comision(){
        double comision = 100000;
        return comision;
    }
    
    public double AuxT(double sueldo){
        double aux = 0;
        if(sueldo < 1200000) {
            aux = 72000;
        }
        return aux;
    }
    
    public double SaPe(double sueldo) {
        double sape = 0;
        sape = sueldo * 0.04;
        return sape;
    }
}
