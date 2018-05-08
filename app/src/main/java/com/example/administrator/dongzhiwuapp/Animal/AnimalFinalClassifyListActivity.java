package com.example.administrator.dongzhiwuapp.Animal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.dongzhiwuapp.R;
import java.util.ArrayList;
/**
 * Created by Administrator on 2016/7/10.
 */
public class AnimalFinalClassifyListActivity extends Activity {


    private String[] fish = {"虎刺梅", "雷神", "3333", "4444", "55555", "66666"};//鱼
    private String[] amphibian = {"1", "56562", "3", "4", "5", "7"};//两栖动物
    private String[] reptile={"1", "2", "3", "4", "5656565", "7"};//爬行动物
    private String[] bird={"1", "2", "35656", "4", "5", "7"};//鸟

    private String[] Protozoa={"1", "2", "3", "5", "5", "7"};//原生动物
    private String[] coelenterate={"1", "2", "63", "4", "5", "7"};//腔肠动物
    private String[] Platyhelminthes={"1", "2565", "3", "4", "5", "7"};//扁形动物
    private String[] Nematomorpha={"1", "2", "356", "4", "5", "7"};//线形动物
    private String[] Molluscs={"1", "2", "3", "45656", "5", "7"};//软体动物
    private String[] arthropod={"1", "56562", "56563", "4", "5", "7"};//节肢动物

    private String temp[]=null;
    private ListView listView;
    private String finalClassify = null;
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.final_animal_list);

        getDataFromParentActivity();
        importFromDataBase();
        FindViewByIdAndSetOnclickListener();
    }

    public void getDataFromParentActivity() {
        Intent intent = getIntent();
        finalClassify = intent.getStringExtra("final_classify");

        if(finalClassify.equals("鱼")) {
            temp=fish;
        }
        if(finalClassify.equals("两栖动物")){
            temp=amphibian;
        }
        if(finalClassify.equals("爬行动物")){
            temp=reptile;
        }
        if(finalClassify.equals("鸟")){
            temp=bird;
        }
        if(finalClassify.equals("原生动物")){
            temp=Protozoa;
        }
        if(finalClassify.equals("腔肠动物")){
            temp=coelenterate;
        }
        if(finalClassify.equals("扁形动物")){
            temp=Platyhelminthes;
        }
        if(finalClassify.equals("线形动物")){
            temp=Nematomorpha;
        }
        if(finalClassify.equals("软体动物")){
            temp=Molluscs;
        }
        if(finalClassify.equals("节肢动物")){
            temp=arthropod;
        }

        for (int i = 0; i < temp.length; i++) {
            list.add(temp[i]);
        }
    }

    public void importFromDataBase(){

    }

    public void FindViewByIdAndSetOnclickListener() {
        listView = (ListView) findViewById(R.id.final_animal_list_view);
        ArrayAdapter<String> animalArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(animalArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (int i = 0; i < temp.length; i++) {
                    if (list.get(position).equals(temp[i])) {
                        Intent intent = new Intent("android.intent.action.DisplayAnimalInfoActivity");
                        intent.putExtra("display", temp[i]);
                        startActivity(intent);
                        break;
                    }
                }
            }
        });
    }

    public String getDataFromDatabase(String info) {
        return info;
    }
}