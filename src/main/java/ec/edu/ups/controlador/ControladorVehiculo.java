/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.dao.IVehiculoDAO;
import ec.edu.ups.modelo.Vehiculo;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorVehiculo {
    
    private IVehiculoDAO vDAO;
    private Vehiculo v;
    
    public ControladorVehiculo(VehiculoDAO vDAO){
        this.vDAO = new VehiculoDAO();
        
        this.vDAO = vDAO;
    }
    
    public void crear(String placa, String marca, String modelo){
        this.v = new Vehiculo(placa, marca, modelo);
        this.vDAO.create(v);
    }
}
