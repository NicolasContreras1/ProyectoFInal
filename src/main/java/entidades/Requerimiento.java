package entidades;

public class Requerimiento {

     private int idRequerimiento;
     private int idTipoProyecto;
     private String NombreReque;
     private String Estado;

    public int getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(int idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public int getIdTipoProyecto() {
        return idTipoProyecto;
    }

    public void setIdTipoProyecto(int idTipoProyecto) {
        this.idTipoProyecto = idTipoProyecto;
    }

    public String getNombreReque() {
        return NombreReque;
    }

    public void setNombreReque(String nombreReque) {
        NombreReque = nombreReque;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
