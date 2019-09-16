package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private TextView textViewHOM;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        textViewHOM = findViewById(R.id.hit_or_miss);
        final MediaPlayer sounds = MediaPlayer.create(this, R.raw.drumroll);
        
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sounds.start();

                new Handler().postDelayed(new Runnable(){
                    @Override
                            public void run() {
                        rollDice();
                    }
                }, 2000);
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        
        final MediaPlayer first = MediaPlayer.create(this, R.raw.zimslies);
        final MediaPlayer second = MediaPlayer.create(this, R.raw.noo);
        final MediaPlayer third = MediaPlayer.create(this, R.raw.biggerboat);
        final MediaPlayer fourth = MediaPlayer.create(this, R.raw.rachelfantastic);
        final MediaPlayer fifth = MediaPlayer.create(this, R.raw.thinkmcfly);
        final MediaPlayer sixth = MediaPlayer.create(this, R.raw.houston);
        final MediaPlayer seventh = MediaPlayer.create(this, R.raw.cantsit);
        final MediaPlayer eighth = MediaPlayer.create(this, R.raw.asif);
        final MediaPlayer ninth = MediaPlayer.create(this, R.raw.idiotbutnotstupid);
        final MediaPlayer tenth = MediaPlayer.create(this, R.raw.heresyoukid);
        final MediaPlayer eleventh = MediaPlayer.create(this, R.raw.rejectreality);
        final MediaPlayer twelfth = MediaPlayer.create(this, R.raw.lifebox);
        final MediaPlayer thirtieth = MediaPlayer.create(this, R.raw.aragorn);
        final MediaPlayer fourteenth = MediaPlayer.create(this, R.raw.youtellthem);
        final MediaPlayer fifteenth = MediaPlayer.create(this, R.raw.ihavenoidea);
        final MediaPlayer sixteenth = MediaPlayer.create(this, R.raw.thatlldopig);
        final MediaPlayer seventeenth = MediaPlayer.create(this, R.raw.ftandpd);
        final MediaPlayer eighteenth = MediaPlayer.create(this, R.raw.loveyou3000);
        final MediaPlayer nineteenth = MediaPlayer.create(this, R.raw.goodintheworld);
        final MediaPlayer twentieth = MediaPlayer.create(this, R.raw.practicallyperfect);

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                textViewHOM.setText(R.string.miss);

                first.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textViewHOM.setText(" ");

                second.start();
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textViewHOM.setText(" ");

                third.start();
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textViewHOM.setText(" ");

                fourth.start();
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textViewHOM.setText(" ");

                fifth.start();
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textViewHOM.setText(" ");

                sixth.start();
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                textViewHOM.setText(" ");

                seventh.start();
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                textViewHOM.setText(" ");

                eighth.start();
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                textViewHOM.setText(" ");

                ninth.start();
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                textViewHOM.setText(" ");

                tenth.start();
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                textViewHOM.setText(" ");

                eleventh.start();
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                textViewHOM.setText(" ");

                twelfth.start();
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                textViewHOM.setText(" ");

                thirtieth.start();
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                textViewHOM.setText(" ");

                fourteenth.start();
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                textViewHOM.setText(" ");

                fifteenth.start();
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                textViewHOM.setText(" ");

                sixteenth.start();
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                textViewHOM.setText(" ");

                seventeenth.start();
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                textViewHOM.setText(" ");

                eighteenth.start();
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                textViewHOM.setText(" ");

                nineteenth.start();
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                textViewHOM.setText(R.string.hit);

                twentieth.start();
                break;
            }
    }
}
