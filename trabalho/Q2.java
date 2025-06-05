package trabalho;
import javax.swing.JOptionPane;
public class Q2 {
   public static void main(String[] args) {
        int horastrabalhadas,valordahora,salariobruto;
        double salariomenosinss,impostoderenda,salarioliquido,inss;
        String aux = "";
        do{
            aux = JOptionPane.showInputDialog(null,"Quantas horas foram trabalhadas no mes?");
            horastrabalhadas = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog(null,"Qual o valor da hora trabalhada?");
            valordahora = Integer.parseInt(aux);

            salariobruto = horastrabalhadas * valordahora;

            inss = (salariobruto * 11)/100;

            salariomenosinss = salariobruto - inss;

            JOptionPane.showMessageDialog(null,"O valor do salario bruto e " + salariobruto);

            if(salariomenosinss < 900){
                impostoderenda = 0;
                JOptionPane.showMessageDialog(null,"voçê foi isento do imposto de renda");
            }
            
            else if(salariomenosinss >= 900 && salariomenosinss < 1800){
                impostoderenda = (salariomenosinss * 15)/100;
                JOptionPane.showMessageDialog(null,"voçê vai pagar 15% de imposto de renda");
            }
            
            else{
                impostoderenda = (salariomenosinss * 275)/1000;
                JOptionPane.showMessageDialog(null,"voçê vai pagar 27,5% de imposto de renda");
            }
            
            salarioliquido = (salariomenosinss - impostoderenda);
            
            JOptionPane.showMessageDialog(null,"O valor do salario liquido e " + salarioliquido);
            
            aux = JOptionPane.showInputDialog(null,"Deseja continuar? (s/n)");
            
            if(aux == null || aux.isEmpty()){
                JOptionPane.showMessageDialog(null, "Opção inválida. O programa será encerrado.");
                break;
            }
            else if (aux.equalsIgnoreCase("n")) {
                break;
            } 
            else if (aux.equalsIgnoreCase("s")) {
                continue;
            }
        }
        while(true);
        JOptionPane.showMessageDialog(null, "O progama foi encerrado");
    } 
}