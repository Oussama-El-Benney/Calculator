package isetcom.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

import isetcom.calculator.MainActivity;
import isetcom.calculator.R;

public class LoginActivity extends AppCompatActivity {
    EditText log, pass;
    ImageView img;
    TextView txtdef, txtnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        log = this.findViewById(R.id.log);
        pass = this.findViewById(R.id.pass);
        txtdef = this.findViewById(R.id.def);

        txtdef.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String adr = "https://fr.wiktionary.org/wiki/calculateur";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(adr));
                startActivity(i);
            }
        });
    }

    public void connecter(View view) {
        String l,p;
        l = log.getText().toString();
        p = pass.getText().toString();
        if(l.equals("admin") && p.equals("admin")){
            Intent i = new Intent(LoginActivity.this, activity_calculate.class);
            i.putExtra("login", l);
            //i.putExtra("log", Integer.valueOf(l));
            startActivity(i);
        }else{
            Toast.makeText(this,"Login ou mot de passe erronnés!", Toast.LENGTH_LONG).show();
        }
    }
}

//package isetcom.calculator;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
//
//    EditText mail;
//    EditText password;
//    Button btnlog;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        mail = this.findViewById(R.id.editTextTextEmailAddress);
//        password = this.findViewById(R.id.editTextTextPassword);
//
//
//
//        btnlog = this.findViewById(R.id.btnlog);
//        btnlog.setOnClickListener(this);
//
//
//    }
//    public void onClick(View v) {
//        String l = mail.getText().toString();
//        String p = password.getText().toString();
//
//        Log.i("Mail",l );
//        Log.i("Pasword",p );
//        if (l.equals("admin")&&(p.equals("admin"))){
//            Intent i =new Intent(LoginActivity.this, MainActivity.class);
//            startActivity(i);
//
//        } else {
//            Toast.makeText(this, "Falsy Login or password", Toast.LENGTH_LONG).show();
//        }
//
//    }
//
//}