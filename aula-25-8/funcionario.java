class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularPagamento() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() * 1.2; // 20% de bônus
    }
}

class Vendedor extends Funcionario {
    private double comissaoFixa;

    public Vendedor(String nome, double salarioBase, double comissaoFixa) {
        super(nome, salarioBase);
        this.comissaoFixa = comissaoFixa;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() + comissaoFixa; // Salário base + comissão
    }
}
