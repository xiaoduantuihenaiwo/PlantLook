package com.example.administrator.dongzhiwuapp.Plant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.dongzhiwuapp.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/14.
 */
public class PlantFinalClassifyListActivity extends Activity {


    private String[] succulentPlant = {"虎刺梅", "雷神", "金手指", "仙人掌", "昙花", "仙人球", "生石花", "宝石花", "蟹爪兰", "虹之玉"
            ,"碰碰香","燕子掌","熊童子","星美人","令箭荷花","黑法师"};//多肉植物
    private String[] floweringPlants = {"风信子", "紫罗兰", "梅花", "茉莉花", "栀子花", "桃花","桔梗", "桂花", "杜鹃", "月季", "曼陀罗"};//观花植物
    private String[] foliagePlant={"一品红", "绿萝", "吊兰", "发财树", "芦荟", "常春藤"};//观叶植物
    private String[] herbaceousPlant={"风信子", "紫罗兰", "长寿花", "牡丹", "向日葵", "郁金香"};//草本植物
    private String[] woodyPlant={"梅花", "茉莉花", "栀子花", "桃花", "桂花", "月季"};//木本植物
    private String[] aquaticPlant={"风信子", "马蹄莲", "睡莲", "水仙", "荷花", "鱼腥草","芡实","鸢尾","满江红","碗莲","香蒲"};//水生植物
    private String[] housePlant={"风信子", "紫罗兰", "长寿花", "一品红", "白雪公主", "发财树","绿萝","绿巨人","吊兰","勿忘我",
            "薰衣草","滴水观音","君子兰","薄荷","文竹","杜鹃"};//室内植物
    private String[] hydroponicPlants={"风信子", "栀子花", "马蹄莲", "长寿花", "米兰花", "紫花凤梨","鹤望兰","发财树","绿萝","吊兰",
            "滴水观音","君子兰"};//水培植物
    private String[] carnivorousPlant={"食虫草", "眼镜蛇瓶子草", "捕人藤", "好望角茅膏菜", "二齿猪笼草", "锦地罗","苹果猪笼草","小太阳瓶子草"};//食肉植物
    private String[] temp=null;
    private ListView listView;
    private String finalClassify = null;
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.final_plant_list);

        getDataFromParentActivity();
        importFromDataBase();
        FindViewByIdAndSetOnclickListener();
    }

    public void getDataFromParentActivity() {
        Intent intent = getIntent();
        finalClassify = intent.getStringExtra("final_classify");
        //    Toast.makeText(getApplicationContext(),finalClassify,Toast.LENGTH_SHORT).show();

        if(finalClassify.equals("多肉植物")) {
            temp=succulentPlant;
//            for (int i = 0; i < succulentPlant.length; i++) {
//                list.add(succulentPlant[i]);
//            }
        }
        if(finalClassify.equals("观花植物")){
            temp=floweringPlants;
//            for (int i = 0; i < floweringPlants.length; i++) {
//                list.add(floweringPlants[i]);
//            }
        }
        if(finalClassify.equals("观叶植物")){
//            for (int i = 0; i < foliagePlant.length; i++) {
//                list.add(foliagePlant[i]);
//            }
            temp=foliagePlant;
        }
        if(finalClassify.equals("草本植物")){
//            for (int i = 0; i < herbaceousPlant.length; i++) {
//                list.add(herbaceousPlant[i]);
//            }
            temp=herbaceousPlant;
        }
        if(finalClassify.equals("木本植物")){
//            for (int i = 0; i < woodyPlant.length; i++) {
//                list.add(woodyPlant[i]);
//            }
            temp=woodyPlant;
        }
        if(finalClassify.equals("水生植物")){
//            for (int i = 0; i < aquaticPlant.length; i++) {
//                list.add(aquaticPlant[i]);
//            }
            temp=aquaticPlant;
        }
        if(finalClassify.equals("室内植物")){
//            for (int i = 0; i < housePlant.length; i++) {
//                list.add(housePlant[i]);
//            }
            temp=housePlant;
        }
        if(finalClassify.equals("水培植物")){
//            for (int i = 0; i < hydroponicPlants.length; i++) {
//                list.add(hydroponicPlants[i]);
//            }
            temp=hydroponicPlants;
        }

        if(finalClassify.equals("食肉植物")){
//            for (int i = 0; i < carnivorousPlant.length; i++) {
//                list.add(carnivorousPlant[i]);
//            }
            temp=carnivorousPlant;
        }

        for (int i = 0; i < temp.length; i++) {
                list.add(temp[i]);
            }
    }

    public void importFromDataBase(){

    }

    public void FindViewByIdAndSetOnclickListener() {


        listView = (ListView) findViewById(R.id.final_plant_list_view);
        ArrayAdapter<String> animalArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(animalArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(position).equals(temp[i])) {
                        Intent intent = new Intent("android.intent.action.DisplayPlantInfoActivity");
                        intent.putExtra("display", temp[i]);
                       // intent.putExtra("display", list.get(position));
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