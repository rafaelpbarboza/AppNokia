package com.example.rafael.appnokia.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.rafael.appnokia.Presenter.IMain;
import com.example.rafael.appnokia.Presenter.PresentadorMain;
import com.example.rafael.appnokia.R;
public class MainActivity extends AppCompatActivity implements View.OnClickListener,IMainActivity {
    private IMain presentador;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login=findViewById(R.id.login);
        login.setOnClickListener(this);
        presentador=new PresentadorMain(this);
        presentador.eliminar();
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==login.getId()){
            presentador.Listar();
        }
    }


    @Override
    public void click() {
        Intent i=new Intent(this,Order.class);
        startActivity(i);
        Toast.makeText(this, "click ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void toas() {
        Toast.makeText(this, "hoola", Toast.LENGTH_SHORT).show();
    }
}
