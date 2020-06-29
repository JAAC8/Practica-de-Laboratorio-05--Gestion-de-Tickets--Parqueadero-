/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.modelo.Vehiculo;

/**
 *
 * @author José Andrés Abad
 */
public class ClienteDAO implements IClienteDAO{
    
    List<Cliente> c;
    
    public ClienteDAO(){
        this.c = new ArrayList<>();
    }

    @Override
    public void create(Cliente c) {
        this.c.add(c);
    }

    @Override
    public Cliente read(int cedula) {
        for(Cliente cliente:this.c){
            if(cliente.equals(cedula)){
                return  cliente;
            }
        }
        return null;
    }

    @Override
    public void update(Cliente c) {
        for(int i=0;i<this.c.size();i++){
            if(this.c.get(i).equals(c)){
                this.c.set(i, c);
                break;
            }
        }
    }

    @Override
    public void delete(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void agregarVehiculo(Vehiculo V, int cedula){
        
        for(int i=0; i<c.size();i++){
            if(c.get(i).equals(cedula)){
                
            }
        }
    }
}
