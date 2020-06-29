/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.dao.IVehiculoDAO;
import ec.edu.ups.modelo.Vehiculo;
import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.IClienteDAO;
import ec.edu.ups.modelo.Cliente;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorCliente {
    
    private IClienteDAO cDAO;
    private IVehiculoDAO vDAO;
    
    private Cliente c;
    private Vehiculo v;
    
    public ControladorCliente(ClienteDAO cDAO, VehiculoDAO vDAO){
        this.cDAO = new ClienteDAO();
        this.vDAO = new VehiculoDAO();
        this.cDAO = cDAO;
        this.vDAO = vDAO;
    }
    
    public void crear(int cedula, String nombre, String direccion, String telefono){        
        Cliente c = new Cliente(cedula, nombre, direccion, telefono);
        cDAO.create(c);        
    }
    
    
    
    
    
    public void agregarVehiculo(int cedula, String placa, String marca, String modelo){
        
        Cliente cliente = cDAO.read(cedula);                
        cliente.addVehiculo(placa, marca, modelo);
        
        cDAO.update(cliente);
        
    }
}
