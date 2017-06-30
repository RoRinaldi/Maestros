/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maestros;

/**
 *
 * @author PC19
 */
public class Receta
{
    private Insumo insumo;
    private Articulo articulo;
    private Integer cantidad;
    private Envase envase;

    public Insumo getInsumo()
    {
        return insumo;
    }

    public Articulo getArticulo()
    {
        return articulo;
    }

    public Integer getCantidad()
    {
        return cantidad;
    }

    public Envase getEnvase()
    {
        return envase;
    }
    
}
