package com.jhaharsh.android.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    class Number {

                int n;
                int s = 0, t = 0;

                void checkNo() {
                    //Checking for square
                    s = checkSquare(n);
                    //Checking for triangular number
                    int tnum = (8 * n) + 1;
                    t = checkSquare(tnum);
                    if (s == 1 && t == 0) {
                        disp("No. is squared !");
                    } else if (s == 0 && t == 1) {
                        disp("No. is triangular !");
                    } else if (s == 1 && t == 1) {
                        disp("No. is both squared & triangular !");
                    } else {
                        disp("No. is neither tri nor squared");
                    }
                }

                void disp(String str) {
                    Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                }

                int checkSquare(int x) {

                    int currSq = 4, currNo = 2;
                    while (currSq <= x) {
                        if (currSq == x) {
                            return 1;
                        }
                        currNo++;
                        currSq = currNo * currNo;
                    }
                    return 0;
                }

            }

    public void check(View view){

        EditText editText = (EditText)findViewById(R.id.editText);
        Number obj = new Number();
        if(editText.getText().toString().isEmpty()){
            obj.disp("Please enter a number ! ");
        }
        else {
            int val = Integer.parseInt(editText.getText().toString());
            obj.n = val;
            obj.checkNo();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
