package com.example.apparel;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegisterActivity extends AppCompatActivity {

    private EditText mName,mPasswd,mEmail;
    private Button mRegisterBtn;
    private TextView mLogin;
    private String Name,Password,Email;
    public static final String PREFERENCE= "preference";
    public static final String PREF_NAME = "register_usernameText";
    public static final String PREF_PASSWD = "register_passwordText";
    public static final String PREF_EMAIL = "register_emailText";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mName = (EditText)findViewById(R.id.register_usernameText);
        mPasswd = (EditText)findViewById(R.id.register_passwordText);
        mEmail = (EditText)findViewById(R.id.register_emailText);
        mRegisterBtn = (Button)findViewById(R.id.register_button);
        mLogin = (TextView)findViewById(R.id.register_toLogin);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validUserData()){
                    SharedPreferences mSharedPreference = getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE);
                    SharedPreferences.Editor mEditor = mSharedPreference.edit();
                    mEditor.putString(PREF_NAME,Name);
                    mEditor.putString(PREF_PASSWD,Password);
                    mEditor.putString(PREF_EMAIL,Email);
                    mEditor.apply();
                    finish();
                }
            }
        });
    }



    private boolean validUserData() {
        Name = mName.getText().toString().trim();
        Password = mPasswd.getText().toString().trim();
        return !(Name.isEmpty() || Password.isEmpty());
    }
}
