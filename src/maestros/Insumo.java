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
public class Insumo
{   private Integer codigo;
    private String unidad_med;
    private String nombre;
    private Integer precio;
    private String envase[];
    private String rubro_insumo;

    public Integer getCodigo()
    {
        return codigo;
    }

    public String getUnidad_med()
    {
        return unidad_med;
    }

    public String getNombre()
    {
        return nombre;
    }

    public Integer getPrecio()
    {
        return precio;
    }

    public String[] getEnvase()
    {
        return envase;
    }

    public String getRubro_insumo()
    {
        return rubro_insumo;
    }

}
