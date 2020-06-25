/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author José Andrés Abad
 */
public class Ticket {
    
    private int numero;
    private Date fechaHoraIngreso;//DEBO INICIALIZAR LA VARIABLE PARA OBTENER LA FECHA Y HORA
    private Date fechaHoraSalida;//DEBO INICIALIZAR LA VARIABLE PARA OBTENER LA FECHA Y HORA
    //INICIALIZAR FECHA Y HORA EN EL MÉTODO MAIN <<--
    private double total;
    
    private Vehiculo v;
    
    public Ticket(int numero, Date fechaHoraIngreso){
        this.numero = numero;
        this.fechaHoraIngreso = fechaHoraIngreso;
    }
    
   
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public void setFechaHoraIngreso(Date fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }
    
    public double getToltal(){
        return this.total;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
    
    public void setVehiculo(String placa, String marca, String modelo){//RELACIÓN POR COMPOSICIÓN
        this.v = new Vehiculo(placa, marca, modelo);
    }

    @Override
    public String toString() {
        return "Ticket[" + "numero=" + numero + ", fechaHoraIngreso=" + fechaHoraIngreso + ", fechaHoraSalida=" + fechaHoraSalida + ", total=" + total + "]:\n ->vehiculo=" + v;
    }
    
    
}
