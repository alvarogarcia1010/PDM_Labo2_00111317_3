package com.agarcia.colors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private LinearLayout mFirstPanel, mSecondPanel, mThirdPanel;

    private int [] redColor, greenColor, blueColor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redColor = new int[]{R.color.red, R.color.red_1, R.color.red_2, R.color.red_3, R.color.red_4, R.color.red_5};
        greenColor = new int[]{R.color.green, R.color.green_1, R.color.green_2, R.color.green_3, R.color.green_4, R.color.green_5};
        blueColor = new int[]{R.color.blue, R.color.blue_1, R.color.blue_2, R.color.blue_3, R.color.blue_4, R.color.blue_5};


        mFirstPanel = findViewById(R.id.first_panel);
        mSecondPanel = findViewById(R.id.second_panel);
        mThirdPanel = findViewById(R.id.third_panel);

        mFirstPanel.setOnClickListener(this);
        mSecondPanel.setOnClickListener(this);
        mThirdPanel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        int viewId = v.getId();
        Log.i("id", viewId+"" );
        switch(viewId)
        {
            case R.id.first_panel:
                mFirstPanel.setBackgroundColor(getResources().getColor(redColor[new Random().nextInt(6)]));
                break;
            case R.id.second_panel:
                mSecondPanel.setBackgroundColor(getResources().getColor(greenColor[new Random().nextInt(6)]));
                break;
            case R.id.third_panel:
                mThirdPanel.setBackgroundColor(getResources().getColor(blueColor[new Random().nextInt(6)]));
                break;
        }
    }
}
