import java.util.Scanner;

public class MediaFinal {

    public static void main(String[] args) {
        //dados para calculo de média;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do Aluno: ");
        String nomeDoAluno = leitor.nextLine();

        System.out.println("Nota do primeiro bimestre: ");
        double primeiroBimestre = leitor.nextDouble();

        System.out.println("Nota do segundo bimestre: ");
        double segundoBimestre = leitor.nextDouble();

        System.out.println("Nota do terceiro bimestre: ");
        double terceiroBimestre = leitor.nextDouble();

        System.out.println("Nota do quarto bimestre: ");
        double quartoBimestre = leitor.nextDouble();

        //calculo dos dados
        double mediaFinal= (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4;

        // impressão dos dados para o aluno;
        System.out.println("*********************************************************");
        System.out.println("                      MÉDIA FINAL                        ");
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Nome do aluno: " + nomeDoAluno);
        System.out.println("Nota do primeiro bimestre: " + primeiroBimestre);
        System.out.println("Nota do segundo bimestre: " + segundoBimestre);
        System.out.println("Nota do terceiro bimestre: " + terceiroBimestre);
        System.out.println("Nota do quarto bimestre: " + quartoBimestre);
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        System.out.println(nomeDoAluno + ", sua média final é de: " + mediaFinal);

        if (mediaFinal >= 7.0) {
            System.out.println(nomeDoAluno + ", PARABÉNS! Você foi aprovado!");
        } else if(mediaFinal > 5.0){
            System.out.println(nomeDoAluno + ", REPROVADO! Estude mais da próxima vez!");
        }else{
            System.out.println(nomeDoAluno + ", QUE PENA! VOCÊ ESTÁ EM RECUPERAÇÃO!");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");
    }
}
