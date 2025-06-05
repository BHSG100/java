package trabalho;
import javax.swing.JOptionPane;
public class Q1 {
    public static void main(String[] args) {
        String aux = "", opiniao = "";
        float proc_A = 0,proc_B = 0, proc_C = 0,proc_D = 0,proc_E=0,med_idade = 0;
        int idade = 0, pessoas = 0;
        do{
            aux = JOptionPane.showInputDialog(null,"qual sua idade?");
            idade = Integer.parseInt(aux);
            if (idade<0) {
                break;
            }
            med_idade = med_idade + idade;
            opiniao = JOptionPane.showInputDialog(null,"qual sua opinao sobre esse filme:\n A(otima)\n B(Bom)\n C(Regular)\n D(Ruim)\n E(Pessima)");
            switch (opiniao) {
                case "a":
                    proc_A++;break;
                case "b":
                    proc_B++;break;
                case "c":
                    proc_C++;break;
                case "d":
                    proc_D++;break;
                case "e":
                    proc_E++;break;
                default:
                    JOptionPane.showMessageDialog(null, "insira uma opinao valida");continue;
            }
            pessoas++;
        }while(true);
        med_idade = (int)med_idade/pessoas;
        proc_A = (proc_A*100)/pessoas;
        proc_B = (proc_B*100)/pessoas;
        proc_C = (proc_C*100)/pessoas;
        proc_D = (proc_D*100)/pessoas;
        proc_E = (proc_E*100)/pessoas;
        JOptionPane.showMessageDialog(null, "Respoderam "+ pessoas+" pessoas essa pesquisa");
        JOptionPane.showMessageDialog(null, "A media de idade e igual a: " + med_idade);
        JOptionPane.showMessageDialog(null, "A porcentagem de A: "+proc_A+"%\nA porcentagem de B: "+proc_B+"%\nA porcentagem de C: "+proc_C+"%\nA porcentagem de D: "+proc_D+"%\nA porcentagem de E: "+proc_E+"%");
    }    
}