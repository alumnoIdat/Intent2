package com.example.chango.intent2;

import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void boton1Accion(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.xvideos.com/"));
        startActivity(intent);
    }
    public void boton2Accion(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }
    public void boton3Accion(View view){
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+getResources().getString(R.string.tfno)));
        startActivity(intent);
    }
    public void boton4Accion(View view){
        Intent intent= new Intent(Intent.ACTION_INSERT);
        intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
        startActivity(intent);
    }
    public void boton5Accion(View view){
        Intent intent= new Intent(AlarmClock.ACTION_SET_ALARM);
        startActivity(intent);
    }
    public void boton6Accion(View view){
        Intent intent= new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", getResources().getString(R.string.mail), null));
        intent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(
                R.String.subject));
        startActivity(Intent.createChooser(intent, getResources().getString(
                R.string.envio)));
    }
    public void boton7Accion(View view){

    }
    public void boton8Accion(View view){

    }
    public void boton9Accion(View view){

    }
    public void boton10Accion(View view){

    }
}
