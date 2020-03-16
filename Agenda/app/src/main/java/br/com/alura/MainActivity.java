package br.com.alura;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this, "Mensagem toast no android", Toast.LENGTH_LONG).show();

        /*TextView aluno = new TextView(this);
        aluno.setText("Nome do aluno");*/
        setContentView(R.layout.activity_main2);
        List<String> alunos = new ArrayList<>(Arrays.asList("Aluno 01", "Aluno 02", "Aluno 03"));
        /*TextView PrimeiroAluno = findViewById(R.id.textView);
        TextView SegundoAluno = findViewById(R.id.textView3);
        TextView TerceiroAluno = findViewById(R.id.textView4);
        PrimeiroAluno.setText(alunos.get(0));
        SegundoAluno.setText(alunos.get(1));
        TerceiroAluno.setText(alunos.get(2));
        */

        ListView listaAlunos = findViewById(R.id.activity_main2_lista_alunos);
        listaAlunos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos));
    }
}
