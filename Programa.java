import java.util.Date;
import java.util.Scanner;

    public class Programa {

        public static void main (String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.println("Aluno");

            Aluno aluno1 = new Aluno();

            aluno1.ra = "";
            aluno1.nome = "";
            aluno1.endereco =  "";
            aluno1.sexo = "";
            aluno1.contato = "";
            aluno1.filiacao = "";
            aluno1.endereco = "";
            aluno1.cpf = "";

            aluno1.dataNascimento = new Date(2000, 4, 12);






            sc.close();
        }
}        
