package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,restart;
    String v1,v2,v3,v4,v5,v6,v7,v8,v9; // value of button respectively
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        restart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                newGame();
            }
        });

        /*b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
//        The above method is same as 43 number check method
        */

    }


    private void init(){
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        restart = findViewById(R.id.restart);
    }

    public  void check(View view){
        Button btncurrent = (Button) view;

        if (btncurrent.getText().toString().equals("")) {
            count++;

            if (flag == 0) {
                btncurrent.setText("x");
                flag = 1;
            } else {
                btncurrent.setText("O");
                flag = 0;
            }

            if (count > 4) {
                v1 = b1.getText().toString();
                v2 = b2.getText().toString();
                v3 = b3.getText().toString();
                v4 = b4.getText().toString();
                v5 = b5.getText().toString();
                v6 = b6.getText().toString();
                v7 = b7.getText().toString();
                v8 = b8.getText().toString();
                v9 = b9.getText().toString();

//            toast is pop-up

                // Condition
                if (v1.equals(v2) && v2.equals(v3) && !v1.equals("")) {
                    //1
                    Toast.makeText(this, "Winner is: " + v1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (v4.equals(v5) && v5.equals(v6) && !v4.equals("")) {
                    //2
                    Toast.makeText(this, "Winner is: " + v4, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (v7.equals(v8) && v8.equals(v9) && !v7.equals("")) {
                    //3
                    Toast.makeText(this, "Winner is: " + v7, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (v1.equals(v4) && v4.equals(v7) && !v1.equals("")) {
                    //4
                    Toast.makeText(this, "Winner is: " + v1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (v2.equals(v5) && v5.equals(v8) && !v2.equals("")) {
                    //5
                    Toast.makeText(this, "Winner is: " + v2, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (v3.equals(v6) && v6.equals(v9) && !v3.equals("")) {
                    //6
                    Toast.makeText(this, "Winner is: " + v3, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (v1.equals(v5) && v5.equals(v9) && !v1.equals("")) {
                    //7
                    Toast.makeText(this, "Winner is: " + v1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (v3.equals(v5) && v5.equals(v7) && !v3.equals("")) {
                    //8
                    Toast.makeText(this, "Winner is: " + v3, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (count == 9) {
                    Toast.makeText(this,"Game is Drawn!!!",Toast.LENGTH_SHORT).show();
                    newGame();
                }
            }
        }

    }

    private void newGame() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        count = 0;
        flag = (flag == 0) ? 1:0;
    }

}