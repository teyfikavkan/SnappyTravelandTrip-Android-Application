package com.example.x550.snappytravelandtrip;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private static Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         OnClickButtonListener();
       // EditText.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
       // EditText email=(EditText) findViewById(R.id.textEmail);
        //EditText password=(EditText)findViewById(R.id.textPassword);
       // email.setPaintFlags(0);
       // email.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
       // email.setPaintFlags(email.getPaintFlags() & Paint.STRIKE_THRU_TEXT_FLAG);
       // password.setPaintFlags(email.getPaintFlags()& (~ Paint.UNDERLINE_TEXT_FLAG));
    }

     public  void ButtonSignUp(View v){

         Intent i=new Intent("com.example.x550.snappytravelandtrip.SignUp");
         startActivity(i);

    }
    public  void ButtonSignIn(View v){

        Intent i=new Intent("com.example.x550.snappytravelandtrip.SignIn");
        startActivity(i);

    }

    public void OnClickButtonListener(){
            signin=(Button)findViewById(R.id.signin);
            signin.setOnClickListener(
                    new View.OnClickListener(){

                        @Override
                        public void onClick(View v)
                        {

                            FirebaseDatabase database = FirebaseDatabase.getInstance();
                            DatabaseReference myRef = database.getReference("message");

                            myRef.setValue("asdasdsad, World!,21321");

                            Intent intent=new Intent("com.example.x550.snappytravelandtrip.SignIn");
                            startActivity(intent);
                        }
                    }


            );


    }
}
