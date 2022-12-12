package isetcom.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView res;
    Button btn;
    EditText op1;
    EditText op2;
    RadioButton b1, b2, b3, b4;
    Switch sw1;
    Switch sw2;
    TextView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = this.findViewById(R.id.txtres);
        btn = this.findViewById(R.id.btncalc);
        op1 = this.findViewById(R.id.op1);
        op2 = this.findViewById(R.id.op2);
        b1 = this.findViewById(R.id.rbadd);
        b2 = this.findViewById(R.id.rbsous);
        b3 = this.findViewById(R.id.rbmul);
        b4 = this.findViewById(R.id.rbdiv);
        sw1 = this.findViewById(R.id.neg1);
        sw2 = this.findViewById(R.id.neg2);
        //Méthode 1 : Surcharge du Listener
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("Resultat = "+(9-3));
            }
        });*/

        //Méthode 3 : implémentation de l'inerface
        btn.setOnClickListener(this);
    }
//Méthode 2 = méthode propre
   /* public void calculer(View v) {
        res.setText("Resultat = "+(2+5));
    }*/

    //Méthode 3
    public void onClick(View v){
        String s1 = op1.getText().toString();
        String s2 = op2.getText().toString();
        int x1 = Integer.valueOf(s1);
        if(sw1.isChecked()){
            x1 = -x1;
        }
        int x2 = Integer.valueOf(s2);
        if(sw2.isChecked()){
            x2 = -x2;
        }
        float r=0;
        if(b1.isChecked()){
            r = x1 + x2;
        }
        if(b2.isChecked()){
            r = x1 - x2;
        }
        if(b3.isChecked()){
            r = x1 * x2;
        }
        if(b4.isChecked()){
            if(x2 == 0){
                res.setText("Opération impossible");
            }else{
                r = (float)x1 / (float)x2;
            }

        }
        res.setText("Resultat = "+r);
    }
}
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.Switch;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    TextView res;
//    Button  btnc;
//    EditText n1;
//    EditText n2;
//    RadioButton radd;
//    RadioButton rsous;
//    RadioButton rmul;
//    RadioButton rdiv;
//    Switch s1;
//    Switch s2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        res = this.findViewById(R.id.res);
//
//        n1 = this.findViewById(R.id.op1);
//        n2 = this.findViewById(R.id.op2);
//        radd = this.findViewById(R.id.rbadd);
//        rsous = this.findViewById(R.id.rbsous);
//        rmul = this.findViewById(R.id.rbmul);
//        rdiv = this.findViewById(R.id.rbdiv);
//        s1 = this.findViewById(R.id.neg1);
//        s2 = this.findViewById(R.id.neg2);
//        //methode surcharge de listener
////        btnc = this.findViewById(R.id.btncalc);
////        btnc.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                res.setText("**Result=0");
////            }
////        });
//
//        //methode par l'implementation de l'interface
//        btnc = this.findViewById(R.id.btncalc);
//        btnc.setOnClickListener(this);
//    }
//
//    //methode par l'implementation de l'interface
//    public void onClick(View v) {
//        float r=0;
////        res.setText("***Result=0");
//        String x = n1.getText().toString();
//        String y = n2.getText().toString();
//        int xi = Integer.valueOf(x);
//        // int yi = Integer.valueOf(y);
//        if (s1.isChecked()) {
//            xi = -xi;
//        }
//        int yi = Integer.valueOf(y);
//        if (s2.isChecked()) {
//            yi = -yi;
//        }
//
////        System.out.println("x = " + x);
////        System.out.println("y = " + y);
//        if (radd.isChecked())
//            res.setText("***Result = " + (xi + yi));
//        else if (rsous.isChecked())
//            res.setText("***Result = " + (xi - yi));
//        else if (rdiv.isChecked())
//            if (yi != 0)
//                res.setText("***Result = " + ((float) xi / (float) yi));
//            else res.setText("Division Impossible");
//        else if (rmul.isChecked())
//            res.setText("***Result = " + (xi * yi));
//        else res.setText("Choisir Une operation");
//    }
//
////    public void calculer(View view) {
////        res.setText("Result=0");
////    }
//
//}