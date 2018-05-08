package com.example.administrator.dongzhiwuapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    //private Button AnimalButton;
    private Button PlantButton;

    private Button WikiButtton;
    private Button ChinaBaikeButtton;


    //private String[] animalClassify={"无脊椎动物","有脊椎动物"};
    private String[] plantClassify = {"多肉植物", "观花植物", "观叶植物", "草本植物", "木本植物", "水生植物", "室内植物",
            "水培植物", "食肉植物"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindViewByIdAndSetOnclickListener();
    }

    public void FindViewByIdAndSetOnclickListener(){
        //AnimalButton=(Button)findViewById(R.id.animal_button);
       // AnimalButton.setOnClickListener(this);

        PlantButton=(Button)findViewById(R.id.plant_button);
        PlantButton.setOnClickListener(this);

        WikiButtton=(Button)findViewById(R.id.wiki_bai_ke);
        WikiButtton.setOnClickListener(this);

        ChinaBaikeButtton=(Button)findViewById(R.id.china_bai_ke);
        ChinaBaikeButtton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            //case R.id.animal_button:
            //    StartNextActivity("classify","android.intent.action.ShowAnimalClassifyListActivity",animalClassify);
            //    break;
            case R.id.plant_button:
                StartNextActivity("classify","android.intent.action.ShowPlantClassifyListActivity",plantClassify);
                break;

            case R.id.wiki_bai_ke:
                StartWebServer("https://en.wikipedia.org/wiki/Main_Page");
                break;

            case R.id.china_bai_ke:
                StartWebServer("http://www.chinabaike.com/");
                break;
        }
    }
    public void StartNextActivity(String classifyTag,String action,String[] classify){
        Intent intent=new Intent(action);
        intent.putExtra(classifyTag,classify);
        startActivity(intent);
    }

    public void StartWebServer(String URL){
        //Uri uri = Uri.parse(URL);
        Intent intent = new Intent("android.intent.action.StartWebActivity");
        intent.putExtra("URL",URL);
        startActivity(intent);

    }
}
