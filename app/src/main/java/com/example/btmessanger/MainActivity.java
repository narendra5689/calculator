package com.example.btmessanger;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.util.concurrent.atomic.AtomicBoolean;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button n1;
        Button n2;
        Button n3;
        Button n4;
        Button n5;
        Button n6;
        Button n7;
        Button n8;
        Button n9;
        Button n0;
        Button dot;
        Button mul;
        Button add;
        Button minus;
        Button mod;
        TextView ans;
        Button div;
        Button equal;
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        n3=findViewById(R.id.n3);
        n4=findViewById(R.id.n4);
        n5=findViewById(R.id.n5);
        n6=findViewById(R.id.n6);
        n7=findViewById(R.id.n7);
        n8=findViewById(R.id.n8);
        n9=findViewById(R.id.n9);
        n0=findViewById(R.id.n0);
        dot=findViewById(R.id.dot);
        mul=findViewById(R.id.mul);
        add=findViewById(R.id.add);
        minus=findViewById(R.id.minus);
        div=findViewById(R.id.div);
        equal=findViewById(R.id.equals);
        ans=findViewById(R.id.ans);
        mod=findViewById(R.id.mod);
        AtomicBoolean check= new AtomicBoolean(false);
        equal.setOnClickListener(view -> {
            if((ans.getText().toString()).equals("0")){
                Toast.makeText(MainActivity.this,"Enter numbers",Toast.LENGTH_SHORT).show();
            }
            else{
                try {
                    Expression expression = new ExpressionBuilder(ans.getText().toString()).build();
                    double result = expression.evaluate();
                    String formatted = String.format("%.4f", result);
                    ans.setText(formatted);
                    check.set(true);
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"Enter valid Expression",Toast.LENGTH_SHORT).show();
                }
            }
        });
            n0.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0") || check.get())
                {
                    check.set(false);
                    ans.setText(n0.getText().toString());
                }
                else
                {
                    sb.append("0");
                    ans.setText(sb.toString());
                }
            });
        dot.setOnClickListener(view -> {
            String prev=ans.getText().toString();
            StringBuilder sb=new StringBuilder(prev);
            if(prev.equals("0") || check.get())
            {
                check.set(false);
                ans.setText(dot.getText().toString());
            }
            else
            {
                sb.append(".");
                ans.setText(sb.toString());
            }
        });
            n2.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0")|| check.get())
                {
                    check.set(false);
                    ans.setText(n2.getText().toString());
                }
                else
                {
                    sb.append("2");
                    ans.setText(sb.toString());
                }
            });
            n1.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0")|| check.get())
                {
                    check.set(false);
                    ans.setText(n1.getText().toString());
                }
                else
                {
                    sb.append("1");
                    ans.setText(sb.toString());
                }
            });
            n3.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0")|| check.get())
                {
                    check.set(false);
                    ans.setText(n3.getText().toString());
                }
                else
                {
                    sb.append("3");
                    ans.setText(sb.toString());
                }
            });
            n4.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0")|| check.get())
                {
                    check.set(false);
                    ans.setText(n4.getText().toString());
                }
                else
                {
                    sb.append("4");
                    ans.setText(sb.toString());
                }
            });
            n5.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0")|| check.get())
                {
                    check.set(false);
                    ans.setText(n5.getText().toString());
                }
                else
                {
                    sb.append("5");
                    ans.setText(sb.toString());
                }
            });
            n6.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0")|| check.get())
                {
                    check.set(false);
                    ans.setText(n6.getText().toString());
                }
                else
                {
                    sb.append("6");
                    ans.setText(sb.toString());
                }
            });
            n7.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0")|| check.get())
                {
                    check.set(false);
                    ans.setText(n7.getText().toString());
                }
                else
                {
                    sb.append("7");
                    ans.setText(sb.toString());
                }
            });
            n8.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0")|| check.get())
                {
                    check.set(false);
                    ans.setText(n8.getText().toString());
                }
                else
                {
                    sb.append("8");
                    ans.setText(sb.toString());
                }
            });
            n9.setOnClickListener(view -> {
                String prev=ans.getText().toString();
                StringBuilder sb=new StringBuilder(prev);
                if(prev.equals("0")|| check.get())
                {
                    check.set(false);
                    ans.setText(n9.getText().toString());
                }
                else
                {
                    sb.append("9");
                    ans.setText(sb.toString());
                }
            });
    /***********************************Symbols +,-,/,* operations***********************************/
            add.setOnClickListener(view -> {
                String eval=ans.getText().toString();
                StringBuilder sb=new StringBuilder(eval);
                if(sb.charAt(0)=='0')
                {
                    Toast.makeText(MainActivity.this,"Enter number first!!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    check.set(false);
                    sb.append("+");
                    ans.setText(sb.toString());
                }
            });
            minus.setOnClickListener(view -> {
                String eval=ans.getText().toString();
                StringBuilder sb=new StringBuilder(eval);
                if(sb.charAt(0)=='0')
                {
                    Toast.makeText(MainActivity.this,"Enter number first!!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    check.set(false);
                    sb.append("-");
                    ans.setText(sb.toString());
                }
            });
            div.setOnClickListener(view -> {
                String eval=ans.getText().toString();
                StringBuilder sb=new StringBuilder(eval);
                if(sb.charAt(0)=='0')
                {
                    Toast.makeText(MainActivity.this,"Enter number first!!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    check.set(false);
                    sb.append("/");
                    ans.setText(sb.toString());
                }
            });
            mul.setOnClickListener(view -> {
                String eval=ans.getText().toString();
                StringBuilder sb=new StringBuilder(eval);
                if(sb.charAt(0)=='0')
                {
                    Toast.makeText(MainActivity.this,"Enter number first!!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    check.set(false);
                    sb.append("*");
                    ans.setText(sb.toString());
                }
            });
        mod.setOnClickListener(view -> {
            String eval=ans.getText().toString();
            StringBuilder sb=new StringBuilder(eval);
            if(sb.charAt(0)=='0')
            {
                Toast.makeText(MainActivity.this,"Enter number first!!",Toast.LENGTH_SHORT).show();
            }
            else
            {
                check.set(false);
                sb.append("%");
                ans.setText(sb.toString());
            }
        });
            /******************************************CLEAR******************************************/
            Button clear=findViewById(R.id.clear);
            clear.setOnClickListener(view -> {
                ans.setText("0");
                check.set(false);
            });



    }
}