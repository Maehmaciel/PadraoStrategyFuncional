
package strategyfuncional;

import java.util.List;
import java.util.function.Function;


public class ProcessarBoleto {
    
    private LeituraRetorno leituraRetorno;
    private Function<String,List<Boleto>> lerArquivo;

    public ProcessarBoleto(Function<String, List<Boleto>> lerArquivo) {
        this.leituraRetorno = leituraRetorno;
        this.lerArquivo = lerArquivo;
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void setLerArquivo(Function<String, List<Boleto>> lerArquivo) {
        this.lerArquivo = lerArquivo;
    }
    
    
      public void processar(String nomeArquivo ){
          List<Boleto> lista = lerArquivo.apply(nomeArquivo);
    }
    
}
