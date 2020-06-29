/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Vehiculo;

/**
 *
 * @author José Andrés Abad
 */
public interface IVehiculoDAO {
    
    public void create(Vehiculo v);
    public Vehiculo read(String placa);
    public void update(Vehiculo v);
    public void delete(Vehiculo v);
    
    public void findAll();
}
