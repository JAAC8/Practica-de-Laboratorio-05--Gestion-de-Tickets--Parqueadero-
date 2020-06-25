/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;

import ec.edu.ups.modelo.Ticket;
import java.util.List;

/**
 *
 * @author José Andrés Abad
 */
public interface ITicketDAO {
 
    public void create(Ticket t);
    public Ticket read(String placa,String cedula);
    public void update(Ticket t);
    public void delete(Ticket t);
    
    //public void createCV(Cliente c,Vehiculo v);
    public List<Ticket> findAll();
}
