package com.example.camilo.notaspromedio;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2, n3 , n4, n5, n6, n7, n8, n9;
    private TextView df1, df2, df3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);
        n4 = (EditText) findViewById(R.id.n4);
        n5 = (EditText) findViewById(R.id.n5);
        n6 = (EditText) findViewById(R.id.n6);
        n7 = (EditText) findViewById(R.id.n7);
        n8 = (EditText) findViewById(R.id.n8);
        n9 = (EditText) findViewById(R.id.n9);
        df1 = (TextView) findViewById(R.id.def1);
        df2 = (TextView) findViewById(R.id.def2);
        df3 = (TextView) findViewById(R.id.def3);
        SharedPreferences pre = getSharedPreferences("datos", Context.MODE_PRIVATE);
        n1.setText(pre.getString("cnt1", "0"));
        n2.setText(pre.getString("cnt2", "0"));
        n3.setText(pre.getString("cnt3", "0"));
        n4.setText(pre.getString("cnt4", "0"));
        n5.setText(pre.getString("cnt5", "0"));
        n6.setText(pre.getString("cnt6", "0"));
        n7.setText(pre.getString("cnt7", "0"));
        n8.setText(pre.getString("cnt8", "0"));
        n9.setText(pre.getString("cnt9", "0"));
        df1.setText(pre.getString("rs1", df1.getText().toString()));
        df2.setText(pre.getString("rs2", df2.getText().toString()));
        df3.setText(pre.getString("rs3", df3.getText().toString()));




        n1.addTextChangedListener(new TextWatcher() {
            @Override

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                try {
                    String nt1 = n1.getText().toString();
                    String nt2 = n2.getText().toString();
                    String nt3 = n3.getText().toString();
                    int c1 = Integer.parseInt(nt1);
                    int c2 = Integer.parseInt(nt2);
                    int c3 = Integer.parseInt(nt3);
                    double total = ((c1*0.3)+(c2*0.3)+ (c3*0.4));
                    String res1 = String.valueOf(total);
                    df1.setText(res1);
                    SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString("cnt1", n1.getText().toString());
                    editor.putString("res1", df1.getText().toString());
                    editor.commit();
                } catch (Exception e) {


                }}

        });

        n2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    String nt1 = n1.getText().toString();
                    String nt2 = n2.getText().toString();
                    String nt3 = n3.getText().toString();
                    int c1 = Integer.parseInt(nt1);
                    int c2 = Integer.parseInt(nt2);
                    int c3 = Integer.parseInt(nt3);
                    double total = ((c1*0.3)+(c2*0.3)+ (c3*0.4));
                    String res1 = String.valueOf(total);
                    df1.setText(res1);
                    SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString("cnt2", n2.getText().toString());
                    editor.putString("res1", df1.getText().toString());
                    editor.commit();
                } catch (Exception e) {


                }}

        });

        n3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    String nt1 = n1.getText().toString();
                    String nt2 = n2.getText().toString();
                    String nt3 = n3.getText().toString();
                    int c1 = Integer.parseInt(nt1);
                    int c2 = Integer.parseInt(nt2);
                    int c3 = Integer.parseInt(nt3);
                    double total = ((c1*0.3)+(c2*0.3)+ (c3*0.4));
                    String res1 = String.valueOf(total);
                    df1.setText(res1);
                    SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString("cnt3", n3.getText().toString());
                    editor.putString("res1", df1.getText().toString());
                    editor.commit();
                } catch (Exception e) {


                }}

        });


        n4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    String nt1 = n4.getText().toString();
                    String nt2 = n5.getText().toString();
                    String nt3 = n6.getText().toString();
                    int c1 = Integer.parseInt(nt1);
                    int c2 = Integer.parseInt(nt2);
                    int c3 = Integer.parseInt(nt3);
                    double total = ((c1*0.3)+(c2*0.3)+ (c3*0.4));
                    String res2 = String.valueOf(total);
                    df2.setText(res2);
                    SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString("cnt4", n4.getText().toString());
                    editor.putString("res2", df2.getText().toString());
                    editor.commit();
                } catch (Exception e) {


                }}

        });

        n5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    String nt1 = n4.getText().toString();
                    String nt2 = n5.getText().toString();
                    String nt3 = n6.getText().toString();
                    int c1 = Integer.parseInt(nt1);
                    int c2 = Integer.parseInt(nt2);
                    int c3 = Integer.parseInt(nt3);
                    double total = ((c1*0.3)+(c2*0.3)+ (c3*0.4));
                    String res2 = String.valueOf(total);
                    df2.setText(res2);
                    SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString("cnt5", n5.getText().toString());
                    editor.putString("res2", df2.getText().toString());
                    editor.commit();
                } catch (Exception e) {


                }}

        });

        n6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    String nt1 = n4.getText().toString();
                    String nt2 = n5.getText().toString();
                    String nt3 = n6.getText().toString();
                    int c1 = Integer.parseInt(nt1);
                    int c2 = Integer.parseInt(nt2);
                    int c3 = Integer.parseInt(nt3);
                    double total = ((c1*0.3)+(c2*0.3)+ (c3*0.4));
                    String res2 = String.valueOf(total);
                    df2.setText(res2);
                    SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString("cnt6", n6.getText().toString());
                    editor.putString("res2", df2.getText().toString());
                    editor.commit();
                } catch (Exception e) {

                }}
        });

        n7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    String nt1 = n7.getText().toString();
                    String nt2 = n8.getText().toString();
                    String nt3 = n9.getText().toString();
                    int c1 = Integer.parseInt(nt1);
                    int c2 = Integer.parseInt(nt2);
                    int c3 = Integer.parseInt(nt3);
                    double total = ((c1*0.3)+(c2*0.3)+ (c3*0.4));
                    String res3 = String.valueOf(total);
                    df3.setText(res3);
                    SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString("cnt7", n7.getText().toString());
                    editor.putString("res3", df3.getText().toString());
                    editor.commit();
                } catch (Exception e) {


                }}
        });

        n8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    String nt1 = n7.getText().toString();
                    String nt2 = n8.getText().toString();
                    String nt3 = n9.getText().toString();
                    int c1 = Integer.parseInt(nt1);
                    int c2 = Integer.parseInt(nt2);
                    int c3 = Integer.parseInt(nt3);
                    double total = ((c1*0.3)+(c2*0.3)+ (c3*0.4));
                    String res3 = String.valueOf(total);
                    df3.setText(res3);
                    SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString("cnt8", n8.getText().toString());
                    editor.putString("res3", df3.getText().toString());
                    editor.commit();
                } catch (Exception e) {


                }}
        });

        n9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    String nt1 = n7.getText().toString();
                    String nt2 = n8.getText().toString();
                    String nt3 = n9.getText().toString();
                    int c1 = Integer.parseInt(nt1);
                    int c2 = Integer.parseInt(nt2);
                    int c3 = Integer.parseInt(nt3);
                    double total = ((c1*0.3)+(c2*0.3)+ (c3*0.4));
                    String res3 = String.valueOf(total);
                    df3.setText(String.format("%.1f",res3));
                    SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString("cnt9", n9.getText().toString());
                    editor.putString("res3", df3.getText().toString());
                    editor.commit();
                } catch (Exception e) {

                }

            }
        });

    }



    public void calcular(View view) {

        String rs1 = "";
        String rs2 = "";
        String rs3 = "";
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double total=0;

        try {

            rs1 = df1.getText().toString();
            rs2 = df2.getText().toString();
            rs3 = df3.getText().toString();


            n1 = Double.parseDouble(rs1);
            n2 = Double.parseDouble(rs2);
            n3 = Double.parseDouble(rs3);
            total = ((n1 + n2 + n3) /3);
            Toast notificacion = Toast.makeText(this, ""+" "+ String.format("%.1f", total), Toast.LENGTH_LONG);
            notificacion.show();

        }


        catch (Exception e){
            if(rs1.equalsIgnoreCase("0.00") || rs2.equalsIgnoreCase("0.00") || rs3.equalsIgnoreCase("0.00")  ){
                Toast notificacion= Toast.makeText(this,"no se permiten campos vacios",Toast.LENGTH_LONG);
                notificacion.show();
            }

        }

    }


    public void acerca(View view) {
        Intent i = new Intent(this, AcercaDe.class );
        startActivity(i);
    }
}
