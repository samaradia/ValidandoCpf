import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o CPF: ");
        String cpf = leitura.nextLine();

        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        if(matcher.matches()){
            System.out.println("O CPF " + cpf + " está no formato certo.");
        } else {
            System.out.println("Está no formato errado.");
        }
        leitura.close();
    }
}