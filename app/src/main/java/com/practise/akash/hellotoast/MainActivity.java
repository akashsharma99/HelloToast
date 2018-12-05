package com.practise.akash.hellotoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int mCount=0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView)findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }
    public String getColour()
    {
        switch(mCount%10)
        {
            case 0:return "#ff0000";
            case 1:return "#ffee00";
            case 2:return "#ff0099";
            case 3:return "#000db0";
            case 4:return "#00a000";
            case 5:return "#ffc666";
            case 6:return "#ffc0cb";
            case 7:return "#008000";
            case 8:return "#ffff00";
            case 9:return "#0000ff";
        }
        return "#000000";
    }
    public void changeColor(View view){
        if (mShowCount != null)
            mShowCount.setBackgroundColor(Color.parseColor(getColour()));
    }
}
