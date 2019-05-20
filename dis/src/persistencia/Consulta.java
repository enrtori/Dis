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
    ENTRADA("CREATE TABLE USER{USUARIO VARCHAR(10) NOT NULL}");
    private final String strConsulta;
    
    private Consulta(String strConsulta) {
        this.strConsulta = strConsulta;
    }

    @Override
    public String toString() {
        return strConsulta;
    }
}
