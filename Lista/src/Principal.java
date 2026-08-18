import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Lista objLista = new Lista();
        ArrayList Lista = new ArrayList();
        int opcao = 0;

        while (opcao != 5){
            System.out.println("+===========+");
            System.out.println("Menu de Opções");
            System.out.println("+===========+");
            System.out.println("1 - Inserir");
            System.out.println("2 - Excluir");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Cem Milhões");
            System.out.println("5 - Sair");
            System.out.println("+===========+");
        }
        leitor.close();
    }
}
