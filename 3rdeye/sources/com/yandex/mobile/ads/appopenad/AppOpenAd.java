package com.yandex.mobile.ads.appopenad;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;

/* loaded from: classes3.dex */
public interface AppOpenAd {
    AdInfo getInfo();

    void setAdEventListener(AppOpenAdEventListener appOpenAdEventListener);

    void show(Activity activity);
}
