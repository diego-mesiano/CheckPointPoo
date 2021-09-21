import Cadastro.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Cadastrando os cursos
        Curso cursoIngles = new Curso("Ingles",700.00, Modalidade.PRESENCIAL,Turno.MANHA);
        Curso cursoInformatica = new Curso("Informatica",800.00, Modalidade.PRESENCIAL,Turno.MANHA);
        Curso cursoAdministracao = new Curso("Administração",850.00, Modalidade.PRESENCIAL,Turno.MANHA);

        //Cadastrando as Salas
        Sala sala1 = new Sala("Sala 1",cursoInformatica);
        Sala sala2 = new Sala("Sala 2",cursoAdministracao);
        Sala sala3 = new Sala("Sala 3",cursoIngles);


        //Cadastrando os Alunos
        Aluno aluno1 = new Aluno(1,"Diego","123456789","19-99999999","d@d.com.br", Sexo.MASCULINO,
                new Endereco("Rua a",25,"casa","Jd do Sol","13045778",
                        "Campinas","SP"),sala1);

        Aluno aluno2 = new Aluno(2,"João","123456789","19-99999999","d@d.com.br", Sexo.MASCULINO,
                new Endereco("Rua a",25,"casa","Jd do Sol","13045778",
                        "Campinas","SP"),sala1);

        //Cadastrando os Professores
        Professor professor1 = new Professor(1,"Gleyson","123456789","1199998888",
                "gleyson@dh.com.br",Sexo.MASCULINO,new Endereco("Rua A",1,"casa",
                "Jd do Sol","155444555","São Paulo","SP"),500.00,null,null);
    }
}
