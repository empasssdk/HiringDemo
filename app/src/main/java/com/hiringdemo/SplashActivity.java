package com.hiringdemo;

import android.content.Context;
import android.os.Build;

import com.daimajia.androidanimations.library.Techniques;
import com.empass.hiring.initialize.Hiring;
import com.empass.hiring.utils.LogUtils;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;


/**
 * Created by Deepak on 07-07-2017.
 */

public class SplashActivity extends AwesomeSplash {
    Context context;

    @Override
    public void initSplash(ConfigSplash configSplash) {
        context = this;
        try {
            context = this;
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setStatusBarColor(getResources().getColor(com.empass.hiring.R.color.ach_dark_gray));
            }
            configSplash.setLogoSplash(com.empass.hiring.R.drawable.ic_splash); //or any other drawable
            configSplash.setBackgroundColor(com.empass.hiring.R.color.ach_dark_gray); //any color you want form colors.xml
            configSplash.setAnimCircularRevealDuration(1000); //int ms
            configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
            configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP
            configSplash.setTitleSplash("Empass Hire");
            configSplash.setTitleTextColor(com.empass.hiring.R.color.orange);
            configSplash.setTitleTextSize(26f);
            configSplash.setAnimTitleDuration(2000);
            configSplash.setAnimTitleTechnique(Techniques.FadeIn);
        } catch (Exception e) {
            LogUtils.errorException(e);
        }
    }

    @Override
    public void animationsFinished() {
        try {
            Hiring.initializeHiring(this, "empkitf9ojasdf09ausdjad", "empass-hiring", "Test", "error.empass@gmail.com");
        } catch (Exception e) {
            LogUtils.errorException(e);
        }
    }
}



