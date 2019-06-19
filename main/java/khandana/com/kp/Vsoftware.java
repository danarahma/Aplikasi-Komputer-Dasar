package khandana.com.kp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Vsoftware extends AppCompatActivity {
    WebView webViewSaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vsoftware);

        // cari id di layout
        webViewSaya = (WebView) findViewById(R.id.webViewSaya);

        // setting
        webViewSaya.setWebViewClient(new WebViewClient());
        webViewSaya.setWebChromeClient(new WebChromeClient());
        webViewSaya.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webViewSaya.getSettings().setJavaScriptEnabled(true);
        webViewSaya.getSettings().setPluginState(WebSettings.PluginState.ON);
        webViewSaya.getSettings().setDefaultFontSize(18);

    }

    private void muatVideo(String kode_youtube) {
        String kodeHTML = "<head></head><body>" +
                "<iframe width=\"350=\" height=\"300\" src=\"https://www.youtube.com/embed/" +
                kode_youtube +
                "\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" fullscreen></iframe>" +
                "</body>";
        webViewSaya.loadData(kodeHTML,"text/html; charset=utf-8",null);
    }

    public void Video1(View view) {
        muatVideo("LTm6ptYwLtI");
    }

}

