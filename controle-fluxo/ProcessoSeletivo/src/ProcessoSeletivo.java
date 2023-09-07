public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCanditado(1900.00);
    }

    static void analisarCanditado(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
            else if(salarioBase == salarioPretendido)

                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

                else {

                    System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

                }

            
    }

}
