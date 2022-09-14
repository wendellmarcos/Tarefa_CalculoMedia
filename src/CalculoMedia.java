import java.util.Scanner;


public class CalculoMedia {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                double n1,n2,n3,n4, media;
                System.out.println("Informe a primeira nota: ");
                n1 = sc.nextDouble();

                System.out.println("Informe a Segunda nota: ");
                n2 = sc.nextDouble();

                System.out.println("Informe a Terceira nota: ");
                n3 = sc.nextDouble();

                System.out.println("Informe a Quarta nota: ");
                n4 = sc.nextDouble();

                media = (n1+n2+n3+n4)/4;

                System.out.println("A média do aluno é: " + media);
                if (media>= 5) {
                        System.out.println("APROVADO, média do aluno é: " + media);

                } else {
                        System.out.println("REPROVADO, média do aluno é: " + media);

                }

                sc.close();
        }



}
