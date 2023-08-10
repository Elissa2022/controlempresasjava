package controlempresas.entidaesdenegocio;

import java.util.ArrayList;

public class Rol {
    private int id; 
    private String nombre; 
    private int top_aux; 
    private ArrayList<Usuario> usuarios;  

    public Rol() {
    }

    
    public Rol(int id, String nombre, int top_aux, ArrayList<Usuario> usuarios) {
        this.id = id;
        this.nombre = nombre;
        this.top_aux = top_aux;
        this.usuarios = usuarios;
    }
  

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
