package com.example.practical_20; 
import android.os.Bundle;
import android.webkit.WebSettings; 
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
private WebView webView; @Override
protected void onCreate(Bundle savedInstanceState) { 
  super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main); webView = findViewById(R.id.webView);
WebSettings webSettings = webView.getSettings(); webSettings.setJavaScriptEnabled(true);
webView.setWebViewClient(new WebViewClient()); webView.loadUrl("https://www.google.com");
}
@Override
public void onBackPressed() { if (webView.canGoBack()) {
webView.goBack();
} else {
super.onBackPressed();
}
}
}
