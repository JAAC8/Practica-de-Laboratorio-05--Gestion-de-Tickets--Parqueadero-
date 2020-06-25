/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.IClienteDAO;
import ec.edu.ups.modelo.Cliente;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorCliente {
    
    private IClienteDAO cDAO;
    
    public ControladorCliente(){
        cDAO = new ClienteDAO();
    }
    
    public void crear(int cedula, String nombre, String direccion, String telefono){        
        Cliente c = new Cliente(cedula, nombre, direccion, telefono);
        cDAO.create(c);        
    }
}
