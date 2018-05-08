package com.example.administrator.dongzhiwuapp.Animal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.dongzhiwuapp.R;

/**
 * Created by Administrator on 2016/7/9.
 */
public class DisplayAnimalInfoActivity extends Activity{ //显示动植物的相关信息

    private String name;
    private TextView displayTextView;
    public DisplayAnimalInfoActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        getDataFromParentActivity();
        FindViewByIdAndSetOnclickListener();
        showRelatedInfo(name);
    }

    public void getDataFromParentActivity(){
        Intent intent=getIntent();
        name=intent.getStringExtra("display");
    }

    public void FindViewByIdAndSetOnclickListener(){
        displayTextView=(TextView)findViewById(R.id.display_text_view);
    }

    public void showRelatedInfo(String name){
        switch (name){
            case "虎刺梅":
                displayTextView.setText(R.string.虎刺梅);
                break;
            case "雷神":
                displayTextView.setText(R.string.雷神);
                 break;
            default:
                displayTextView.setText(name);
        }
    }
}
