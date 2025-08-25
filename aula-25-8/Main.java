import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Atividade 1 - Funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Alice", 5000));
        funcionarios.add(new Vendedor("Bob", 3000, 500));
        
        System.out.println("Pagamentos dos Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - Pagamento: " + funcionario.calcularPagamento());
        }

        // Atividade 2 - Frota de Veículos
        List<Veiculo> frota = new ArrayList<>();
        frota.add(new Carro("Toyota", "Corolla", 4));
        frota.add(new Caminhao("Volvo", "FH", 18.0));
        
        System.out.println("\nDescrição dos Veículos:");
        for (Veiculo veiculo : frota) {
            System.out.println(veiculo);
        }
    }
}
