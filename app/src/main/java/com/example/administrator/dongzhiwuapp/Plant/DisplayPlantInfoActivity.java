package com.example.administrator.dongzhiwuapp.Plant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.dongzhiwuapp.R;

/**
 * Created by Administrator on 2016/7/9.
 */
public class DisplayPlantInfoActivity extends Activity implements View.OnClickListener{ //显示动植物的相关信息

    private String name;
    private TextView displayTextView;
    private ImageView imageView;
    public DisplayPlantInfoActivity(){

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
        imageView=(ImageView)findViewById(R.id.image_view);
        imageView.setOnClickListener(this);
    }

    public void showRelatedInfo(String name){
        switch (name){
            /////////////////////////多肉植物//////////////////////////////
            case "虎刺梅":
                displayTextView.setText( R.string.虎刺梅);
                imageView.setImageResource(R.mipmap.hucimei);
                break;
            case "雷神":
                displayTextView.setText(R.string.雷神);
                imageView.setImageResource(R.mipmap.leishen);
                break;
            case "金手指":
                displayTextView.setText(R.string.金手指);
                imageView.setImageResource(R.mipmap.jinshouzhi);
                break;
            case "仙人掌":
                displayTextView.setText(R.string.仙人掌);
                imageView.setImageResource(R.mipmap.xianrenzhang);
                break;
            case "昙花":
                displayTextView.setText(R.string.昙花);
                imageView.setImageResource(R.mipmap.tanhua);
                break;
            case "仙人球":
                displayTextView.setText(R.string.仙人球);
                imageView.setImageResource(R.mipmap.xianrenqiu);
                break;
            case "碰碰香":
                displayTextView.setText(R.string.碰碰香);
                imageView.setImageResource(R.mipmap.pengpengxiang);
                break;
            case "燕子掌":
                displayTextView.setText(R.string.燕子掌);
                imageView.setImageResource(R.mipmap.yanzizhang);
                break;
            case "熊童子":
                displayTextView.setText(R.string.熊童子);
                imageView.setImageResource(R.mipmap.xiongtongzi);
                break;

            case "星美人":
                displayTextView.setText(R.string.星美人);
                imageView.setImageResource(R.mipmap.xingmeiren);
                break;

            case "令箭荷花":
                displayTextView.setText(R.string.令箭荷花);
                imageView.setImageResource(R.mipmap.lingjianhehua);
                break;
            case "黑法师":
                displayTextView.setText(R.string.令箭荷花);
                imageView.setImageResource(R.mipmap.heifashi);
                break;
//////////////////////////////观花植物/////////////////////////////////////////////////////

            case "风信子":
                displayTextView.setText( R.string.风信子);
                imageView.setImageResource(R.mipmap.fengxinzi);
                break;
            case "紫罗兰":
                displayTextView.setText(R.string.紫罗兰);
                imageView.setImageResource(R.mipmap.ziluolan);
                break;
            case "梅花":
                displayTextView.setText(R.string.梅花);
                imageView.setImageResource(R.mipmap.meihua);
                break;
            case "茉莉花":
                displayTextView.setText(R.string.茉莉花);
                imageView.setImageResource(R.mipmap.moli);
                break;
            case "栀子花":
                displayTextView.setText(R.string.栀子花);
                imageView.setImageResource(R.mipmap.zhizihua);
                break;
            case "桃花":
                displayTextView.setText(R.string.桃花);
                imageView.setImageResource(R.mipmap.taohua);
                break;
            case "桔梗":
                displayTextView.setText(R.string.桔梗);
                imageView.setImageResource(R.mipmap.jigeng);
                break;
            case "桂花":
                displayTextView.setText(R.string.桂花);
                imageView.setImageResource(R.mipmap.guihua);
                break;
            case "杜鹃":
                displayTextView.setText(R.string.杜鹃);
                imageView.setImageResource(R.mipmap.dujuan);
                break;

            case "月季":
                displayTextView.setText(R.string.月季);
                imageView.setImageResource(R.mipmap.yueji);
                break;

            case "曼陀罗":
                displayTextView.setText(R.string.曼陀罗);
                imageView.setImageResource(R.mipmap.mantuoluo);
                break;


            ////////////////////观叶植物///////////////////////

            case "一品红":
                displayTextView.setText(R.string.一品红);
                imageView.setImageResource(R.mipmap.yipinghong);
                break;
            case "绿萝":
                displayTextView.setText(R.string.绿萝);
                imageView.setImageResource(R.mipmap.lvluo);
                break;
            case "吊兰":
                displayTextView.setText(R.string.吊兰);
                imageView.setImageResource(R.mipmap.diaolan);
                break;
            case "发财树":
                displayTextView.setText(R.string.发财树);
                imageView.setImageResource(R.mipmap.facaishu);
                break;
            case "芦荟":
                displayTextView.setText(R.string.芦荟);
                imageView.setImageResource(R.mipmap.luhui);
                break;

            case "常春藤":
                displayTextView.setText(R.string.常春藤);
                imageView.setImageResource(R.mipmap.changchunteng);
                break;


            //草本植物

            case "长寿花":
                displayTextView.setText(R.string.长寿花);
                imageView.setImageResource(R.mipmap.changshouhua);
                break;
            case "牡丹":
                displayTextView.setText(R.string.牡丹);
                imageView.setImageResource(R.mipmap.mudan);
                break;
            case "向日葵":
                displayTextView.setText(R.string.向日葵);
                imageView.setImageResource(R.mipmap.xiangrikui);
                break;
            case "郁金香":
                displayTextView.setText(R.string.郁金香);
                imageView.setImageResource(R.mipmap.yujinxiang);
                break;

////////////////////////水生植物//////////////////////////////
            case "马蹄莲":
                displayTextView.setText( R.string.马蹄莲);
                imageView.setImageResource(R.mipmap.matilian);
                break;
            case "睡莲":
                displayTextView.setText(R.string.睡莲);
                imageView.setImageResource(R.mipmap.shuilian);
                break;
            case "水仙":
                displayTextView.setText(R.string.水仙);
                imageView.setImageResource(R.mipmap.shuixian);
                break;
            case "荷花":
                displayTextView.setText(R.string.荷花);
                imageView.setImageResource(R.mipmap.hehua);
                break;
            case "鱼腥草":
                displayTextView.setText(R.string.鱼腥草);
                imageView.setImageResource(R.mipmap.yuxingcao);
                break;
            case "芡实":
                displayTextView.setText(R.string.芡实);
                imageView.setImageResource(R.mipmap.qianshi);
                break;
            case "鸢尾":
                displayTextView.setText(R.string.鸢尾);
                imageView.setImageResource(R.mipmap.yuanwei);
                break;
            case "满江红":
                displayTextView.setText(R.string.满江红);
                imageView.setImageResource(R.mipmap.manjianghonhg);
                break;
            case "碗莲":
                displayTextView.setText(R.string.碗莲);
                imageView.setImageResource(R.mipmap.wanlian);
                break;

            case "香蒲":
                displayTextView.setText(R.string.香蒲);
                imageView.setImageResource(R.mipmap.xiangpu);
                break;



            //////////////////////////////////室内植物/////////////////////////////////////

            case "白雪公主":
                displayTextView.setText( R.string.白雪公主);
                imageView.setImageResource(R.mipmap.baixuegongzhu);
                break;
            case "绿巨人":
                displayTextView.setText(R.string.绿巨人);
                imageView.setImageResource(R.mipmap.lvjuren);
                break;
            case "勿忘我":
                displayTextView.setText(R.string.勿忘我);
                imageView.setImageResource(R.mipmap.wuwangwo);
                break;
            case "薰衣草":
                displayTextView.setText(R.string.薰衣草);
                imageView.setImageResource(R.mipmap.xunyicao);
                break;
            case "滴水观音":
                displayTextView.setText(R.string.滴水观音);
                imageView.setImageResource(R.mipmap.dishuihuanyin);
                break;
            case "薄荷":
                displayTextView.setText(R.string.薄荷);
                imageView.setImageResource(R.mipmap.bohe);
                break;
            case "文竹":
                displayTextView.setText(R.string.文竹);
                imageView.setImageResource(R.mipmap.wenzhu);
                break;
     //////////////////////////////////////////水培植物///////////////////////////////////
            case "米兰花":
                displayTextView.setText( R.string.米兰花);
                imageView.setImageResource(R.mipmap.milanhua);
                break;
            case "紫花凤梨":
                displayTextView.setText(R.string.紫花凤梨);
                imageView.setImageResource(R.mipmap.tielanfengli);
                break;
            case "鹤望兰":
                displayTextView.setText(R.string.鹤望兰);
                imageView.setImageResource(R.mipmap.wanghelan);
                break;

     ////////////////////////////////////////////食肉植物//////////////////////////////////////
            case "食虫草":
                displayTextView.setText( R.string.食虫草);
                imageView.setImageResource(R.mipmap.shichongcao);
                break;
            case "眼镜蛇瓶子草":
                displayTextView.setText(R.string.眼镜蛇瓶子草);
                imageView.setImageResource(R.mipmap.yanjingshepingzicao);
                break;
            case "捕人藤":
                displayTextView.setText(R.string.捕人藤);
                imageView.setImageResource(R.mipmap.burenteng);
                break;
            case "好望角茅膏菜":
                displayTextView.setText(R.string.好望角茅膏菜);
                imageView.setImageResource(R.mipmap.haowangjiaomaogaocai);
                break;
            case "二齿猪笼草":
                displayTextView.setText(R.string.二齿猪笼草);
                imageView.setImageResource(R.mipmap.erchizhulongcao);
                break;
            case "锦地罗":
                displayTextView.setText(R.string.锦地罗);
                imageView.setImageResource(R.mipmap.jindiluo);
                break;
            case "苹果猪笼草":
                displayTextView.setText(R.string.苹果猪笼草);
                imageView.setImageResource(R.mipmap.pingguozhulongcao);
                break;

            case "小太阳瓶子草":
                displayTextView.setText(R.string.小太阳瓶子草);
                imageView.setImageResource(R.mipmap.xiaotaiyangpingzicao);
                break;

            default:
                displayTextView.setText(name);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
    }
}
