package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.hardware.SensorEventListener;
import android.webkit.WebView;
import com.applovin.impl.b4;
import com.applovin.impl.d6;
import com.applovin.impl.i2;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class w8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5963c;

    public /* synthetic */ w8(int i4, Object obj, Object obj2) {
        this.f5961a = i4;
        this.f5962b = obj;
        this.f5963c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5961a) {
            case 0:
                b4.b.a((b4.c) this.f5962b, (b4.d) this.f5963c);
                break;
            case 1:
                ((ScheduledThreadPoolExecutor) this.f5962b).execute((d6.e) this.f5963c);
                break;
            case 2:
                ((i2.b) this.f5962b).a((AppLovinAd) this.f5963c);
                break;
            case 3:
                ((a2) this.f5962b).h((String) this.f5963c);
                break;
            case 4:
                ((f0) this.f5962b).a((SensorEventListener) this.f5963c);
                break;
            case 5:
                ((f4) this.f5962b).a((String) this.f5963c);
                break;
            case 6:
                ((f4) this.f5962b).b((WebView) this.f5963c);
                break;
            case 7:
                ((f6) this.f5962b).b((MaxErrorImpl) this.f5963c);
                break;
            case 8:
                ((g8) this.f5962b).a((WeakReference) this.f5963c);
                break;
            case 9:
                ((k5) this.f5962b).a((k3) this.f5963c);
                break;
            case 10:
                ((l8) this.f5962b).b((WebView) this.f5963c);
                break;
            case 11:
                ((l8) this.f5962b).c((String) this.f5963c);
                break;
            case 12:
                ((m3) this.f5962b).a((Context) this.f5963c);
                break;
            case 13:
                ((n2) this.f5962b).a((Context) this.f5963c);
                break;
            case 14:
                ((n2) this.f5962b).a((AppLovinAd) this.f5963c);
                break;
            case 15:
                ((n2) this.f5962b).b((com.applovin.impl.sdk.ad.b) this.f5963c);
                break;
            case 16:
                n7.a((Context) this.f5962b, (String) this.f5963c);
                break;
            case 17:
                ((s4) this.f5962b).a((s4.b) this.f5963c);
                break;
            case 18:
                t2.b((AppLovinPostbackListener) this.f5962b, (String) this.f5963c);
                break;
            case 19:
                t2.a((AppLovinNativeAdLoadListener) this.f5962b, (AppLovinError) this.f5963c);
                break;
            case 20:
                t2.a((AppLovinNativeAdEventListener) this.f5962b, (AppLovinNativeAd) this.f5963c);
                break;
            case 21:
                t2.b((l2) this.f5962b, (String) this.f5963c);
                break;
            case 22:
                t2.b((AppLovinAdClickListener) this.f5962b, (AppLovinAd) this.f5963c);
                break;
            case 23:
                t2.b((AppLovinAdVideoPlaybackListener) this.f5962b, (AppLovinAd) this.f5963c);
                break;
            default:
                ((u0) this.f5962b).a((Activity) this.f5963c);
                break;
        }
    }
}
