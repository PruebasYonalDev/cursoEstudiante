package main;

import modelo.Estudiante;

public class Principal {

    public static void main(String[] args) {

        Estudiante estu1;

        estu1 = new Estudiante("yonal", "Londoño", 1);

        estu1.asignarCurso(estu1.getCurso1());
        estu1.asignarCurso(estu1.getCurso2());
        estu1.asignarCurso(estu1.getCurso3());
        estu1.asignarCurso(estu1.getCurso4());
        estu1.asignarCurso(estu1.getCurso5());
        
        estu1.asignarCurso(estu1.getCurso3());

    }

}
