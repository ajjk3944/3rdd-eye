package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class V implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f18877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f18878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f18879e;

    public /* synthetic */ V(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i) {
        this.f18876b = i;
        this.f18877c = appLovinAdViewEventListener;
        this.f18878d = appLovinAd;
        this.f18879e = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18876b) {
            case 0:
                l2.e(this.f18877c, this.f18878d, this.f18879e);
                break;
            default:
                l2.d(this.f18877c, this.f18878d, this.f18879e);
                break;
        }
    }
}
