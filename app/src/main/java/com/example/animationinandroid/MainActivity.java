package com.example.animationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private TextView txtAndroid;
    private ImageView imgTiger;
    private ImageView imgLeopard;
    private Button btnUI;
    private boolean isHelloWorldShowing=false;
    private boolean isTigerShowing=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld=findViewById(R.id.txtHelloWorld);
        txtHiWorld=findViewById(R.id.txtHiWorld);
        imgTiger=findViewById(R.id.imgTiger);
        imgLeopard=findViewById(R.id.imgLeopard);
        txtAndroid=findViewById(R.id.txtAndroid);
        btnUI=findViewById(R.id.btnUI);

        txtHelloWorld.setX(3000);
        txtHiWorld.setX(-3000);
        txtAndroid.setY(-3000);
        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("myTag","text view tapped");
                //rotation animation
                 //txtHelloWorld.animate().rotation(360f).setDuration(1000);
                //fading the text view after clicking for 2 sec
                //txtHelloWorld.animate().alpha(0.5f).setDuration(2000);
                //FADING ONE TEXTVIEW AND SHOWING ANOTHER AFTER CLICKING
                //txtHelloWorld.animate().alpha(0f).setDuration(3000);
                //txtHiWorld.animate().alpha(1f).setDuration(3000);
                if(isHelloWorldShowing==true){
                    txtHelloWorld.animate().alpha(0f).setDuration(3000);
                    txtHiWorld.animate().alpha(1f).setDuration(3000);
                    //imgLeopard.animate().alpha(0f).setDuration(3000);
                    //imgTiger.animate().alpha(1f).setDuration(3000);
                    isHelloWorldShowing=false;

                }else{
                    txtHelloWorld.animate().alpha(1f).setDuration(3000);
                    txtHiWorld.animate().alpha(0f).setDuration(3000);
                    //imgLeopard.animate().alpha(0f).setDuration(3000);
                    //imgTiger.animate().alpha(1f).setDuration(3000);
                    isHelloWorldShowing=true;

                }



            }
        });
        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sliding the text view towards the right
                //txtAndroid.animate().translationX(3000).setDuration(3000);
                //sliding the text view towards the left
                //txtAndroid.animate().translationX(-3000).setDuration(3000);
                //sliding the text view towards the bottom
                //txtAndroid.animate().translationY(3000).setDuration(3000);
                //sliding the text view towards the bottom with some rotation
                //txtAndroid.animate().translationY(200).rotation(360f).setDuration(3000);
                txtAndroid.animate().rotationX(720).translationY(100).setDuration(4000);
                //txtAndroid.animate().rotation(360f).setDuration(3000);
            }
        });
        //animation for alpha or transparency

        imgTiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isTigerShowing==true){
                    imgTiger.animate().alpha(0f).setDuration(3000);
                    imgLeopard.animate().alpha(1f).setDuration(3000);
                    isTigerShowing=false;
                }else {
                    imgTiger.animate().alpha(1f).setDuration(3000);
                    imgLeopard.animate().alpha(0f).setDuration(3000);
                    isTigerShowing=true;

                }
            }
        });



        btnUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHelloWorld.animate().translationXBy(-3000).rotation(45).setDuration(3000);
                txtHiWorld.animate().translationXBy(3000).rotation(135).setDuration(2000);
                txtAndroid.animate().translationYBy(3000).alpha(0.7f).setDuration(4000);
            }
        });


    }
}
