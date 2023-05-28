package entidades;

public class Hora {
    private int idHoras;
    private int idRequerimiento;
    private int HorasEstimadas;
    private String FechaInicio;
    private String FechaFin;

    public int getIdHoras() {
        return idHoras;
    }

    public void setIdHoras(int idHoras) {
        this.idHoras = idHoras;
    }

    public int getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(int idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public int getHorasEstimadas() {
        return HorasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        HorasEstimadas = horasEstimadas;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String fechaFin) {
        FechaFin = fechaFin;
    }
}
