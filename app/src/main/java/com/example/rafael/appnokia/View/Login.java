package com.example.rafael.appnokia.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rafael.appnokia.R;
public class Login extends AppCompatActivity implements View.OnClickListener {

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login=findViewById(R.id.login_work);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==login.getId()){
            Intent i=new Intent(this,Order.class);
            startActivity(i);
        }
    }


}
