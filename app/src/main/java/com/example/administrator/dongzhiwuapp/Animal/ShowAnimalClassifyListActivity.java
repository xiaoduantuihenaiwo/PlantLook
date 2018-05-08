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

public class ShowAnimalClassifyListActivity extends Activity {

    private String[] animalClassify={"有脊椎动物","无脊椎动物"};
    private String[] noVertebralColumnAnimal={"原生动物","腔肠动物","扁形动物","线形动物","软体动物","节肢动物"};//无脊椎动物
    private String[] vertebralColumnAnimal={"鱼","两栖动物","爬行动物","鸟"};//有脊椎动物

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
                    if(list.get(position).equals(animalClassify[0])){
                            Intent intent=new Intent("android.intent.action.AnimalDeepClassifyList");
                            intent.putExtra("deep_classify",vertebralColumnAnimal);//还是分类活动
                            startActivity(intent);
                        }
                        else{
                            Intent intent=new Intent("android.intent.action.AnimalDeepClassifyList");
                            intent.putExtra("deep_classify",noVertebralColumnAnimal);//还是分类活动
                            startActivity(intent);
                        }
                    }
                }
        });
    }
}
