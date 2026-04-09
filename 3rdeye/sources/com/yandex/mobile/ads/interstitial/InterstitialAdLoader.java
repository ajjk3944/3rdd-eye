package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.bm2;
import com.yandex.mobile.ads.impl.jt;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.yk2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class InterstitialAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final yk2 f36827a;

    /* renamed from: b, reason: collision with root package name */
    private final jt f36828b;

    public InterstitialAdLoader(Context context) {
        l.f(context, "context");
        rm2 rm2Var = new rm2(context);
        this.f36827a = new yk2();
        this.f36828b = new jt(context, rm2Var);
    }

    public final void cancelLoading() {
        this.f36828b.a();
    }

    public final void loadAd(AdRequestConfiguration adRequestConfiguration) {
        l.f(adRequestConfiguration, "adRequestConfiguration");
        this.f36828b.a(this.f36827a.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f36828b.a(interstitialAdLoadListener != null ? new bm2(interstitialAdLoadListener) : null);
    }
}
