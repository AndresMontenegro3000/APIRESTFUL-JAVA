/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apirestful;

import MODELO.Conexion;
import VISTA.FrmActivos;
import VISTA.FrmMenuPrincipal;

/**
 *
 * @author Usuario
 */
public class APIRESTFul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FrmMenuPrincipal Formulario = new FrmMenuPrincipal();
        Formulario.setVisible(true);
        Formulario.show();
        
        /*
        Conexion c = new Conexion();
        if(c.conectar()!=null)
        {
            System.out.println("Conexión Correcta");
        }
        else
        {
            System.out.println("Conexión Incorrecta");
        }
        */
    }
    
}
