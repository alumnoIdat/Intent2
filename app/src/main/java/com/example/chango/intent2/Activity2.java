package com.example.chango.intent2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.AlarmClock;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void boton1Accion(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.xvideos.com/"));
        startActivity(intent);
    }

    public void boton2Accion(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }

    public void boton3Accion(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + getResources().getString(R.string.tfno)));
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
        intent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.subject));
        startActivity(Intent.createChooser(intent, getResources().getString(R.string.envio)));
    }
    public void boton7Accion(View view){
        Intent intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }
    public void boton8Accion(View view){
        Intent intent= new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
        startActivity(intent);
    }
    public void boton9Accion(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(getResources().getString(R.string.coord)));
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        startActivity(intent);
    }
    public void boton10Accion(View view){
        Intent intent= new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, getResources().getString(R.string.text));
        intent.setType("text/plain");
        startActivity(intent);

    }
}
