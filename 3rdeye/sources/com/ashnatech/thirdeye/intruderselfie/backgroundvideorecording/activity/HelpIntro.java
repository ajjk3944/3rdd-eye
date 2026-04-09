package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import I2.a;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC1759l;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.AppIntroPageTransformerType;

/* loaded from: classes.dex */
public class HelpIntro extends AppIntro {
    @Override // com.github.appintro.AppIntroBase, androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.c(this);
        addSlide(AppIntroFragment.newInstance(getString(R.string.info_2), getString(R.string.info_1), R.drawable.one, getResources().getColor(R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance(getString(R.string.info_4), getString(R.string.info_3), R.drawable.two, getResources().getColor(R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance(getString(R.string.info_6), getString(R.string.info_5), R.drawable.three, getResources().getColor(R.color.colorPrimaryDark)));
        setTransformer(AppIntroPageTransformerType.Depth.INSTANCE);
        showStatusBar(true);
        setScrollDurationFactor(2);
        setColorTransitionsEnabled(true);
        setSystemBackButtonLocked(true);
        setWizardMode(true);
        setImmersiveMode();
        setIndicatorEnabled(true);
        setButtonsEnabled(true);
        setVibrate(true);
    }

    @Override // com.github.appintro.AppIntroBase
    public final void onDonePressed(ComponentCallbacksC1759l componentCallbacksC1759l) {
        super.onDonePressed(componentCallbacksC1759l);
        finish();
    }

    @Override // com.github.appintro.AppIntroBase
    public final void onSkipPressed(ComponentCallbacksC1759l componentCallbacksC1759l) {
        super.onSkipPressed(componentCallbacksC1759l);
        finish();
    }
}
