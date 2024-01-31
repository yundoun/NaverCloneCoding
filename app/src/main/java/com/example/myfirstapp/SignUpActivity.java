package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class SignUpActivity extends IconBaseActivity  {
    EditText etAgency;
    Spinner spinnerOptions;

    EditText id, password, email, userName, birth, agency, phone;
    Drawable idIcon, passwordIcon, emailIcon, userNameIcon, birthIcon, agencyIcon, phoneIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

//        etAgency = findViewById(R.id.et_agency);
//        spinnerOptions = findViewById(R.id.spinnerOptions);
//
//        etAgency.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                spinnerOptions.performClick();
//            }
//        });

        id = (EditText) findViewById(R.id.et_userId);
        password = (EditText) findViewById(R.id.et_password);
        email = (EditText) findViewById(R.id.et_email);
        userName = (EditText) findViewById(R.id.et_userName);
        birth = (EditText) findViewById(R.id.et_userBirth);
        agency = (EditText) findViewById(R.id.et_agency);
        phone = (EditText) findViewById(R.id.et_phone);


        idIcon = ContextCompat.getDrawable(getApplicationContext(), R.drawable.id_icon);
        passwordIcon = ContextCompat.getDrawable(getApplicationContext(), R.drawable.id_icon);
        emailIcon = ContextCompat.getDrawable(getApplicationContext(), R.drawable.id_icon);
        userNameIcon = ContextCompat.getDrawable(getApplicationContext(), R.drawable.id_icon);
        birthIcon = ContextCompat.getDrawable(getApplicationContext(), R.drawable.id_icon);
        agencyIcon = ContextCompat.getDrawable(getApplicationContext(), R.drawable.id_icon);
        phoneIcon = ContextCompat.getDrawable(getApplicationContext(), R.drawable.id_icon);


        setIconSize(id,idIcon,20);
        setIconSize(password,passwordIcon,20);
        setIconSize(email,emailIcon,20);
        setIconSize(userName,userNameIcon,20);
        setIconSize(birth,birthIcon,20);
        setIconSize(agency,agencyIcon,20);
        setIconSize(phone,phoneIcon,20);


    }
}