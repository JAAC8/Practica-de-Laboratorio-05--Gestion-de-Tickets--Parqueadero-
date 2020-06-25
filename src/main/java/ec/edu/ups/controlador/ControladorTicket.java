/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ticket;
import java.util.Date;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.ITicketDAO;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorTicket {
    
    private ITicketDAO tDAO;
    
    public ControladorTicket(){
        this.tDAO = new TicketDAO();
    }
    
    public void crear(int numero, Date fechaHoraIngreso){
        Ticket t = new Ticket(numero, fechaHoraIngreso);
        this.tDAO.create(t);
    }
}
