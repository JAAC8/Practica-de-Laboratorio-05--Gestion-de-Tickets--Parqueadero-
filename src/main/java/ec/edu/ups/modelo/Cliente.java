/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author José Andrés Abad
 */
public class Cliente {

    private int cedula;
    private String nombre;
    private String direccion;
    private String telefono;

    private List<Vehiculo> v;

    public Cliente() {

    }

    public Cliente(int cedula, String nombre, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

        this.v = new ArrayList<>();
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void addVehiculo(String placa, String marca, String modelo){//RELACIÓN POR COMPOSICIÓN
        Vehiculo ve = new Vehiculo(placa, marca, modelo);
        this.v.add(ve);
    }

    public Vehiculo getVehiculo(String placa) {
        if (this.v != null) {
            for (Vehiculo v : this.v) {
                if (v.getPlaca().equals(placa)) {
                    return v;
                }
            }
        }
        return null;
    }
    
    public List<Vehiculo> getVehiculos(){
        return this.v;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.cedula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

}
