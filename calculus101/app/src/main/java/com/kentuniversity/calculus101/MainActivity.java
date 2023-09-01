package com.kentuniversity.calculus101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText EditTextNum1;
    EditText EditTextNum2;
    TextView TextViewResult;
    String EditTextNum1String, EditTextNum2String, TextViewResultString;
    Integer Num1, Num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Define layout component @kentuniversity
        EditTextNum1 = findViewById(R.id.editTextNum1);
        EditTextNum2 = findViewById(R.id.editTextNum2);
        TextViewResult=findViewById(R.id.textViewResult);
    }
    public void calculateSum (View view)
    {

        //2. All components convert to  String @kentuniversity
        EditTextNum1String=EditTextNum1.getText().toString();
        EditTextNum2String=EditTextNum2.getText().toString();
        TextViewResultString=TextViewResult.getText().toString();

        //3. All Strings convert to Integer @kentuniversity
        Num1=Integer.parseInt(EditTextNum1String);
        Num2=Integer.parseInt(EditTextNum2String);

        //4. Create Sum Function and Write End Point as a String.
        int Result=Num1+Num2;
        TextViewResult.setText("Result: "+Result);
    }

    public void calculateMinus (View view)
    {
        //2. All components convert to  String @kentuniversity
        EditTextNum1String=EditTextNum1.getText().toString();
        EditTextNum2String=EditTextNum2.getText().toString();
        TextViewResultString=TextViewResult.getText().toString();

        //3. All Strings convert to Integer @kentuniversity
        Num1=Integer.parseInt(EditTextNum1String);
        Num2=Integer.parseInt(EditTextNum2String);

        //5. Create Minus Function and Write End Point as a String.
       int  Result=Num1-Num2;
       TextViewResult.setText("Result: "+Result);
    }
    public void calculateMultiple (View view)
    {
        //2. All components convert to  String @kentuniversity
        EditTextNum1String=EditTextNum1.getText().toString();
        EditTextNum2String=EditTextNum2.getText().toString();
        TextViewResultString=TextViewResult.getText().toString();

        //3. All Strings convert to Integer @kentuniversity
        Num1=Integer.parseInt(EditTextNum1String);
        Num2=Integer.parseInt(EditTextNum2String);

        //6. Create Multiple Function and Write End Point as a String.
       int Result =Num1*Num2;
       TextViewResult.setText("Result: "+Result);
    }

    public void calculateDivide (View view)
    {
        //2. All components convert to  String @kentuniversity
        EditTextNum1String=EditTextNum1.getText().toString();
        EditTextNum2String=EditTextNum2.getText().toString();
        TextViewResultString=TextViewResult.getText().toString();

        //3. All Strings convert to Integer @kentuniversity
        Num1=Integer.parseInt(EditTextNum1String);
        Num2=Integer.parseInt(EditTextNum2String);
        //6. Create Divide Function and Write End Point as a String.
        int Result=Num1/Num2;
        TextViewResult.setText("Result: "+Result);
    }
}