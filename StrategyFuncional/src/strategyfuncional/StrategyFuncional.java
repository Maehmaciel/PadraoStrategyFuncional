
package strategyfuncional;


public class StrategyFuncional {

    public static void main(String[] args) {
        ProcessarBoleto processador = new ProcessarBoleto(LeituraRetorno::lerBancoBrasil);
        
        processador.processar("banco.csv");
        processador.setLerArquivo(LeituraRetorno::lerBradesco);
        processador.processar("oto");
    }
    
}
