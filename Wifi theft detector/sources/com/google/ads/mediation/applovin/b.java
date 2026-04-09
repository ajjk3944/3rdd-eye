package com.google.ads.mediation.applovin;

import android.content.Context;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdSize;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final AppLovinAdView f9468a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f9469b;

    public b(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, FrameLayout frameLayout, Context context) {
        AppLovinAdView appLovinAdView = new AppLovinAdView(appLovinSdk, appLovinAdSize, context);
        this.f9468a = appLovinAdView;
        this.f9469b = frameLayout;
        frameLayout.addView(appLovinAdView);
    }

    public static b b(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, AdSize adSize, Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        return new b(appLovinSdk, appLovinAdSize, frameLayout, context);
    }

    public FrameLayout a() {
        return this.f9469b;
    }

    public void c(AppLovinAd appLovinAd) {
        this.f9468a.renderAd(appLovinAd);
    }

    public void d(AppLovinAdClickListener appLovinAdClickListener) {
        this.f9468a.setAdClickListener(appLovinAdClickListener);
    }

    public void e(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f9468a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void f(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f9468a.setAdViewEventListener(appLovinAdViewEventListener);
    }
}
