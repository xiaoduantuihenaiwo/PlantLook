package com.example.administrator.dongzhiwuapp.Plant;
/**
 * Created by Administrator on 2016/7/10.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.administrator.dongzhiwuapp.R;
import java.util.ArrayList;

public class ShowPlantClassifyListActivity extends Activity {

    private ListView listView;
    private String[] classify=null;

    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.animal_list);

        getDataFromParentActivity();
        FindViewByIdAndSetOnclickListener();
    }

    public void getDataFromParentActivity(){
        Intent intent=getIntent();
        classify=intent.getStringArrayExtra("classify");
        for(int i=0;i<classify.length;i++){
            list.add(classify[i]);
        }
    }

    public void FindViewByIdAndSetOnclickListener(){

        listView=(ListView)findViewById(R.id.animal_list_view);
        ArrayAdapter<String> animalArrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(animalArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for(int i=0;i<classify.length;i++){
                    if(list.get(position).equals(classify[i])){
                            Intent intent=new Intent("android.intent.action.PlantFinalClassifyListActivity");
                            intent.putExtra("final_classify",classify[i]);//
                            startActivity(intent);
                            break;
                    }
                }
            }
        });
    }
    public String getDataFromDatabase(String info){
        return info;
    }
}
