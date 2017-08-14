package contador.cursoandroid.com.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView contadorTexto;
    private Button botaoConta;
    private Button botaTira;
    int num = 0;
    String numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorTexto  = (TextView) (findViewById(R.id.texto_conta_id));
        botaoConta = (Button) findViewById(R.id.botao_conta);
        botaTira = (Button) findViewById(R.id.botao_tira);

        botaoConta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                num = num + 1;
                numero = String.valueOf(num);
                contadorTexto.setText(numero);
             }
        });

        botaTira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num - 1;
                numero = String.valueOf(num);
                contadorTexto.setText(numero);

            }
        });

    }
}
