package modelo;

import java.util.Scanner;

public class Estudiante {

    private int codigo;
    private String nombre;
    private String apellido;

    String[][] estu1 = new String[6][4];

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

        estu1[0][0] = Integer.toString(codigo);
        estu1[0][1] = nombre;
        estu1[0][2] = apellido;

        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j < 4; j++) {
                if (estu1[i][j] != null) {
                    System.out.println(estu1[i][j]);
                }
            }
        }

    }

    public boolean pensumIncluyeCurso(String codigoCurso) {

        boolean resp = false;

        return resp;
    }

    public Curso buscarCurso(String codigo) {

        return cursos;
    }

    int cont = 0;
    public boolean asignarCurso(Curso curso) {


        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (estu1[i][j] == null){
                    break;
                }
                if (estu1[i][j].equals(curso.getNombreCurso())) {
                    System.out.println("El curso " + estu1[i][j] +" ya esta asignado!! ");
                    return false;
                }
            }
        }


        if (curso.getNombreCurso().equals(getCurso1().getNombreCurso())) {
            estu1[1][0] = Integer.toString(getCurso1().getCodigoCurso());
            estu1[1][1] = getCurso1().getNombreCurso();
            estu1[1][2] = Integer.toString(getCurso1().getCreditos());
            estu1[1][3] = getCurso1().getDescripcion();
            System.out.println("El curso " + getCurso1().getNombreCurso() + " fue asignado");
        }
        if (curso.getNombreCurso().equals(getCurso2().getNombreCurso())) {
            estu1[2][0] = Integer.toString(getCurso2().getCodigoCurso());
            estu1[2][1] = getCurso2().getNombreCurso();
            estu1[2][2] = Integer.toString(getCurso2().getCreditos());
            estu1[2][3] = getCurso2().getDescripcion();
            System.out.println("El curso " + getCurso2().getNombreCurso() + " fue asignado");
        }
        if (curso.getNombreCurso().equals(getCurso3().getNombreCurso())) {
            estu1[3][0] = Integer.toString(getCurso3().getCodigoCurso());
            estu1[3][1] = getCurso3().getNombreCurso();
            estu1[3][2] = Integer.toString(getCurso3().getCreditos());
            estu1[3][3] = getCurso3().getDescripcion();
            System.out.println("El curso " + getCurso3().getNombreCurso() + " fue asignado");
        }
        if (curso.getNombreCurso().equals(getCurso4().getNombreCurso())) {
            estu1[4][0] = Integer.toString(getCurso4().getCodigoCurso());
            estu1[4][1] = getCurso4().getNombreCurso();
            estu1[4][2] = Integer.toString(getCurso4().getCreditos());
            estu1[4][3] = getCurso4().getDescripcion();
            System.out.println("El curso " + getCurso4().getNombreCurso() + " fue asignado");
        }
        if (curso.getNombreCurso().equals(getCurso5().getNombreCurso())) {
            estu1[5][0] = Integer.toString(getCurso5().getCodigoCurso());
            estu1[5][1] = getCurso5().getNombreCurso();
            estu1[5][2] = Integer.toString(getCurso5().getCreditos());
            estu1[5][3] = getCurso5().getDescripcion();
            System.out.println("El curso " + getCurso5().getNombreCurso() + " fue asignado");
        }


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

        int cod = 1;
        String nom = "programacion";
        int cred = 2;
        String desp = "POO";

        cursos = new Curso(cod, nom, cred, desp);

        return cursos;
    }

    public Curso getCurso2() {

        int cod = 2;
        String nom = "Bases de datos";
        int cred = 3;
        String desp = "Sql";

        cursos = new Curso(cod, nom, cred, desp);

        return cursos;
    }

    public Curso getCurso3() {

        int cod = 3;
        String nom = "Oracle";
        int cred = 5;
        String desp = "Pl/Sql";

        cursos = new Curso(cod, nom, cred, desp);

        return cursos;
    }

    public Curso getCurso4() {

        int cod = 4;
        String nom = "Angular";
        int cred = 3;
        String desp = "SPA";

        cursos = new Curso(cod, nom, cred, desp);

        return cursos;
    }

    public Curso getCurso5() {

        int cod = 5;
        String nom = "Java";
        int cred = 5;
        String desp = "Maven";

        cursos = new Curso(cod, nom, cred, desp);

        return cursos;
    }


}
