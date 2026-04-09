package com.applovin.impl;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.webkit.WebView;
import com.applovin.impl.q3;
import com.applovin.impl.r5;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class H0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18808c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18809d;

    public /* synthetic */ H0(int i, Object obj, Object obj2) {
        this.f18807b = i;
        this.f18808c = obj;
        this.f18809d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18807b) {
            case 0:
                q3.b.a((q3.c) this.f18808c, (q3.d) this.f18809d);
                break;
            case 1:
                ((ScheduledThreadPoolExecutor) this.f18808c).execute((r5.d) this.f18809d);
                break;
            case 2:
                ((C2109b0) this.f18808c).a((SensorEventListener) this.f18809d);
                break;
            case 3:
                ((c3) this.f18808c).a((Context) this.f18809d);
                break;
            case 4:
                l2.c((AppLovinBidTokenCollectionListener) this.f18808c, (String) this.f18809d);
                break;
            case 5:
                l2.b((AppLovinAdClickListener) this.f18808c, (AppLovinAd) this.f18809d);
                break;
            case 6:
                l2.b((f2) this.f18808c, (String) this.f18809d);
                break;
            case 7:
                ((s3) this.f18808c).b((WebView) this.f18809d);
                break;
            default:
                ((y7) this.f18808c).c((String) this.f18809d);
                break;
        }
    }
}
