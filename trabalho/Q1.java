package trabalho;
import javax.swing.JOptionPane;
public class Q1 {
    public static void main(String[] args) {
        String aux = "", op = "";
        float porc_A = 0,porc_B = 0, porc_C = 0,porc_D = 0,porc_E=0,m_id = 0;
        int id = 0, p = 0;
        //onde river esse nomes pode mudar
        do{
            aux = JOptionPane.showInputDialog(null,"qual sua idade?");
            id = Integer.parseInt(aux);
            if (id<0) {
                break;
            }
            m_id = m_id + id;
            op = JOptionPane.showInputDialog(null,"qual sua opinao sobre esse filme:\n A(otima)\n B(Bom)\n C(Regular)\n D(Ruim)\n E(Pessima)");
            switch (op) {
                case "a":
                    porc_A++;break;
                case "b":
                    porc_B++;break;
                case "c":
                    porc_C++;break;
                case "d":
                    porc_D++;break;
                case "e":
                    porc_E++;break;
                default:
                    JOptionPane.showMessageDialog(null, "insira uma opinao valida");continue;
            }
            p++;
        }while(true);
        m_id = (int)m_id/p;
        porc_A = (porc_A*100)/p;
        porc_B = (porc_B*100)/p;
        porc_C = (porc_C*100)/p;
        porc_D = (porc_D*100)/p;
        porc_E = (porc_E*100)/p;
        JOptionPane.showMessageDialog(null, "Respoderam "+ p+" p essa pesquisa");
        JOptionPane.showMessageDialog(null, "A media de id e igual a: " + m_id);
        JOptionPane.showMessageDialog(null, "A porcentagem de A: "+porc_A+"%\nA porcentagem de B: "+porc_B+"%\nA porcentagem de C: "+porc_C+"%\nA porcentagem de D: "+porc_D+"%\nA porcentagem de E: "+porc_E+"%");
    }    
}