package com.applovin.impl;

import android.app.Activity;
import android.webkit.WebView;
import com.applovin.impl.b2;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinPostbackListener;
import java.lang.ref.WeakReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18794d;

    public /* synthetic */ D(int i, Object obj, Object obj2) {
        this.f18792b = i;
        this.f18793c = obj;
        this.f18794d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18792b) {
            case 0:
                ((b2.b) this.f18793c).a((AppLovinAd) this.f18794d);
                break;
            case 1:
                ((WebView) this.f18793c).evaluateJavascript((String) this.f18794d, null);
                break;
            case 2:
                l2.b((AppLovinPostbackListener) this.f18793c, (String) this.f18794d);
                break;
            case 3:
                l2.a((AppLovinNativeAdEventListener) this.f18793c, (AppLovinNativeAd) this.f18794d);
                break;
            case 4:
                ((C2139p0) this.f18793c).a((Activity) this.f18794d);
                break;
            case 5:
                ((t7) this.f18793c).a((WeakReference) this.f18794d);
                break;
            default:
                ((y4) this.f18793c).a((a3) this.f18794d);
                break;
        }
    }
}
