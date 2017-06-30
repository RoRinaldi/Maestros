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
public class Envase
{   private Insumo insumo;
    private Integer codigo;
    private String nombre;
    private String unidad_med;
    private Integer cantidad;

    public Envase(Insumo insumo, Integer codigo, String nombre, String unidad_med, Integer cantidad)
    {
        this.insumo = insumo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidad_med = unidad_med;
        this.cantidad = cantidad;
    }

    

    public Insumo getInsumo()
    {
        return insumo;
    }

    public Integer getCodigo()
    {
        return codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getUnidad_med()
    {
        return unidad_med;
    }

    public Integer getCantidad()
    {
        return cantidad;
    }


}
