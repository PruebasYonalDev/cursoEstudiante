package modelo;

import java.util.Scanner;

public class Estudiante {

    private int codigo;
    private String nombre;
    private String apellido;

    String[] estu1 = new String[3];

    Curso cursos;

    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }


    public Estudiante(String nombre, String apellido, int codigo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;

        estu1[0] = nombre;
        estu1[1] = apellido;
        estu1[2] = Integer.toString(codigo);

        for (String e :
                estu1) {
            System.out.println(e);
        }

    }

    public boolean pensumIncluyeCurso(String codigoCurso) {

        boolean resp = false;

        return resp;
    }

    public Curso buscarCurso(String codigo) {

        return cursos;
    }

    public boolean asignarCurso(Curso curso) {

        return true;
    }

    public double cacularPromedio() {

        return 0;
    }

    public boolean estudianteEstaAprueba() {
        boolean resp = false;

        return resp;
    }

    public Curso getCurso1() {

        return cursos;
    }

    public Curso getCurso2() {

        return cursos;
    }

    public Curso getCurso3() {

        return cursos;
    }

    public Curso getCurso4() {

        return cursos;
    }

    public Curso getCurso5() {

        return cursos;
    }


}
