/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Andrés Abad
 */
public class VehiculoDAO implements IVehiculoDAO{
    
    List<Vehiculo> v;
    
    public VehiculoDAO(){
        this.v = new ArrayList<>();
    }

    @Override
    public void create(Vehiculo v) {
        this.v.add(v);
    }

    @Override
    public Vehiculo read(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
