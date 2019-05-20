/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author enrto
 */
public  enum Consulta {
    ENTRADA("create table ROLEMPLEADO(IdRol SMALLINT not null,NombreRol VARCHAR(20) not null,PRIMARY KEY(IdRol))");
    private final String strConsulta;
    
    private Consulta(String strConsulta) {
        this.strConsulta = strConsulta;
    }

    @Override
    public String toString() {
        return strConsulta;
    }
}
