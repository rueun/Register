package com.example.travel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        try {
            Thread.sleep(4000); // 대기 초 설정
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
