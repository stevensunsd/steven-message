package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "7payYpQ3MCpvvsPtxNpsO7HQDTQ065Am5Im9Q6d6", "r3ctntIubU1m6wm112Ml4K1lzPjRa30CpSwm28im");
    }
}
