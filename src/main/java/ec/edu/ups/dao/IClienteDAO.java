/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import java.util.List;

/**
 *
 * @author José Andrés Abad
 */
public interface IClienteDAO {
    
    public void create(Cliente c);
    public Cliente read(String cedula);
    public void update(Cliente c);
    public void delete(Cliente c);
    
    public List<Cliente> findAll();
}
