package entidades;

public class TipodeProyecto {

    private int idTipoProyecto;
    private int idMetodologia;
    private String NombreTipoProyecto;

    public int getIdTipoProyecto() {
        return idTipoProyecto;
    }

    public void setIdTipoProyecto(int idTipoProyecto) {
        this.idTipoProyecto = idTipoProyecto;
    }

    public int getIdMetodologia() {
        return idMetodologia;
    }

    public void setIdMetodologia(int idMetodologia) {
        this.idMetodologia = idMetodologia;
    }

    public String getNombreTipoProyecto() {
        return NombreTipoProyecto;
    }

    public void setNombreTipoProyecto(String nombreTipoProyecto) {
        NombreTipoProyecto = nombreTipoProyecto;
    }
}
