package com.example.administrator.dongzhiwuapp.Web;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.administrator.dongzhiwuapp.R;

/**
 * Created by Administrator on 2016/7/16.
 */
public class StartWebActivity extends Activity {

    private WebView webView;
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        getDataFromParentActivity();
        FindViewByIdAndSetOnclickListener();
    }

    public void getDataFromParentActivity(){
        Intent intent=getIntent();
        url=intent.getStringExtra("URL");
    }

    public void FindViewByIdAndSetOnclickListener(){
        webView=(WebView)findViewById(R.id.web);
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
    }
}