/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.IClienteDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import java.util.Date;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.ITicketDAO;
import ec.edu.ups.dao.IVehiculoDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.modelo.Vehiculo;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorTicket {
    
    private ITicketDAO tDAO;
    private IClienteDAO cDAO;
    private IVehiculoDAO vDAO;
    
    private Ticket t;
    private Cliente c;
    private Vehiculo v;
    
    
    public ControladorTicket(TicketDAO tDAO, ClienteDAO cDAO, VehiculoDAO vDAO){
        this.tDAO = new TicketDAO();
        this.cDAO = new ClienteDAO();
        this.vDAO = new VehiculoDAO();
        
        this.tDAO = tDAO;
        this.cDAO = cDAO;
        this.vDAO = vDAO;
    }
    
    public void crear(int numero, Date fechaHoraIngreso){
        Ticket t = new Ticket(numero, fechaHoraIngreso);
        this.tDAO.create(t);
    }
}
