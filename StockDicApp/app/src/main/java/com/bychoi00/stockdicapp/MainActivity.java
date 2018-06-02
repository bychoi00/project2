package com.bychoi00.stockdicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String InterstitialAdID = "ca-app-pub-4797194667324944/2506822651";

    private AdView mAdView;
    private AdView mAdView2;
    private InterstitialAd mInterstitialAd;

    Spinner spinner;
    ImageView imageView;

    int[] images = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6
    ,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13
    ,R.drawable.a14,R.drawable.a15,R.drawable.a16,R.drawable.a17,R.drawable.a18,R.drawable.a19,R.drawable.a20
    ,R.drawable.a21,R.drawable.a22,R.drawable.a23,R.drawable.a24,R.drawable.a25,R.drawable.a26,R.drawable.a27
    ,R.drawable.a28,R.drawable.a29,R.drawable.a30,R.drawable.a31,R.drawable.a32,R.drawable.a33,R.drawable.a34
    ,R.drawable.a35,R.drawable.a36,R.drawable.a37,R.drawable.a38,R.drawable.a39,R.drawable.a40,R.drawable.a41
    ,R.drawable.a42,R.drawable.a43,R.drawable.a44,R.drawable.a45,R.drawable.a46,R.drawable.a47,R.drawable.a48};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define
        mAdView = findViewById(R.id.adView);
        mAdView2 = findViewById(R.id.adView2);
        spinner = (Spinner) findViewById(R.id.spinner1);
        imageView = (ImageView) findViewById(R.id.imageView);

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest);


        //interstitial Ads
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(InterstitialAdID);
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                finish();
            }
        });

        //spinner
        try {
            Field popup = Spinner.class.getDeclaredField("mPopup");
            popup.setAccessible(true);

            ListPopupWindow window = (ListPopupWindow) popup.get(spinner);
            window.setHeight(600); //pixel
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_item, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), "Selected: " + position, Toast.LENGTH_SHORT).show();
                switch (position+1) {
                    case 1:
                        imageView.setImageResource(R.drawable.a1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.a2);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.a3);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.a4);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.a5);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.a6);
                        break;
                    case 7:
                        imageView.setImageResource(R.drawable.a7);
                        break;
                    case 8:
                        imageView.setImageResource(R.drawable.a8);
                        break;
                    case 9:
                        imageView.setImageResource(R.drawable.a9);
                        break;
                    case 10:
                        imageView.setImageResource(R.drawable.a10);
                        break;
                    case 11:
                        imageView.setImageResource(R.drawable.a11);
                        break;
                    case 12:
                        imageView.setImageResource(R.drawable.a12);
                        break;
                    case 13:
                        imageView.setImageResource(R.drawable.a13);
                        break;
                    case 14:
                        imageView.setImageResource(R.drawable.a14);
                        break;
                    case 15:
                        imageView.setImageResource(R.drawable.a15);
                        break;
                    case 16:
                        imageView.setImageResource(R.drawable.a16);
                        break;
                    case 17:
                        imageView.setImageResource(R.drawable.a17);
                        break;
                    case 18:
                        imageView.setImageResource(R.drawable.a18);
                        break;
                    case 19:
                        imageView.setImageResource(R.drawable.a19);
                        break;
                    case 20:
                        imageView.setImageResource(R.drawable.a20);
                        break;
                    case 21:
                        imageView.setImageResource(R.drawable.a21);
                        break;
                    case 22:
                        imageView.setImageResource(R.drawable.a22);
                        break;
                    case 23:
                        imageView.setImageResource(R.drawable.a23);
                        break;
                    case 24:
                        imageView.setImageResource(R.drawable.a24);
                        break;
                    case 25:
                        imageView.setImageResource(R.drawable.a25);
                        break;
                    case 26:
                        imageView.setImageResource(R.drawable.a26);
                        break;
                    case 27:
                        imageView.setImageResource(R.drawable.a27);
                        break;
                    case 28:
                        imageView.setImageResource(R.drawable.a28);
                        break;
                    case 29:
                        imageView.setImageResource(R.drawable.a29);
                        break;
                    case 30:
                        imageView.setImageResource(R.drawable.a30);
                        break;
                    case 31:
                        imageView.setImageResource(R.drawable.a31);
                        break;
                    case 32:
                        imageView.setImageResource(R.drawable.a32);
                        break;
                    case 33:
                        imageView.setImageResource(R.drawable.a33);
                        break;
                    case 34:
                        imageView.setImageResource(R.drawable.a34);
                        break;
                    case 35:
                        imageView.setImageResource(R.drawable.a35);
                        break;
                    case 36:
                        imageView.setImageResource(R.drawable.a36);
                        break;
                    case 37:
                        imageView.setImageResource(R.drawable.a37);
                        break;
                    case 38:
                        imageView.setImageResource(R.drawable.a38);
                        break;
                    case 39:
                        imageView.setImageResource(R.drawable.a39);
                        break;
                    case 40:
                        imageView.setImageResource(R.drawable.a40);
                        break;
                    case 41:
                        imageView.setImageResource(R.drawable.a41);
                        break;
                    case 42:
                        imageView.setImageResource(R.drawable.a42);
                        break;
                    case 43:
                        imageView.setImageResource(R.drawable.a43);
                        break;
                    case 44:
                        imageView.setImageResource(R.drawable.a44);
                        break;
                    case 45:
                        imageView.setImageResource(R.drawable.a45);
                        break;
                    case 46:
                        imageView.setImageResource(R.drawable.a46);
                        break;
                    case 47:
                        imageView.setImageResource(R.drawable.a47);
                        break;
                    case 48:
                        imageView.setImageResource(R.drawable.a48);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                imageView.setImageResource(R.drawable.a1);
            }
        });

    }

    public void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        showInterstitial();
    }
}

