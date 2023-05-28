package entidades;

public class AnalistaReque {

    private int idAnalistaReque;
    private int idAnalista;
    private int IdRequerimiento;
    private String Estado;

    public int getIdAnalistaReque() {
        return idAnalistaReque;
    }

    public void setIdAnalistaReque(int idAnalistaReque) {
        this.idAnalistaReque = idAnalistaReque;
    }

    public int getIdAnalista() {
        return idAnalista;
    }

    public void setIdAnalista(int idAnalista) {
        this.idAnalista = idAnalista;
    }

    public int getIdRequerimiento() {
        return IdRequerimiento;
    }

    public void setIdRequerimiento(int idRequerimiento) {
        IdRequerimiento = idRequerimiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
