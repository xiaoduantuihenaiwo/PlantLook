package com.example.administrator.dongzhiwuapp.Animal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.dongzhiwuapp.R;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/10.
 */
public class AnimalDeepClassifyListActivity extends Activity {

    private ListView listView;
    private String[] deepClassify=null;
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.deep_animal_list);

        getDataFromParentActivity();
        FindViewByIdAndSetOnclickListener();
    }

    public void getDataFromParentActivity(){
        Intent intent=getIntent();
        deepClassify=intent.getStringArrayExtra("deep_classify");
    }

    public void FindViewByIdAndSetOnclickListener(){

        for(int i=0;i<deepClassify.length;i++){
            list.add(deepClassify[i]);
        }

        listView=(ListView)findViewById(R.id.deep_animal_list_view);
        ArrayAdapter<String> animalArrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(animalArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for(int i=0;i<deepClassify.length;i++){
                    if(list.get(position).equals(deepClassify[i])){
                        Intent intent=new Intent("android.intent.action.AnimalFinalClassifyListActivity");
               //         Toast.makeText(getApplicationContext(),deepClassify[i],Toast.LENGTH_SHORT).show();
                        intent.putExtra("final_classify",deepClassify[i]);
                        startActivity(intent);
                        break;
                    }
                }
            }
        });
    }

}
