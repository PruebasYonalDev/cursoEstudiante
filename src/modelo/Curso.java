package modelo;

public class Curso {

    private int codigoCurso;
    private String nombreCurso;
    private String descripcion;
    private int creditos;
    private double notas;

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public double getNotas() {
        return notas;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public Curso(int cod, String nom, int cred, String des) {

        this.codigoCurso = cod;
        this.nombreCurso = nom;
        this.creditos = cred;
        this.descripcion = des;

    }

    public boolean estaCalificado() {
        boolean resp = false;

        return resp;
    }


}
