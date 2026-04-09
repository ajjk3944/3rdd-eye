package com.yandex.mobile.ads.appopenad;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.el2;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.rs;
import com.yandex.mobile.ads.impl.yk2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class AppOpenAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final rs f23942a;

    /* renamed from: b, reason: collision with root package name */
    private final yk2 f23943b;

    public AppOpenAdLoader(Context context) {
        l.f(context, "context");
        this.f23942a = new rs(context, new rm2(context));
        this.f23943b = new yk2();
    }

    public final void cancelLoading() {
        this.f23942a.a();
    }

    public final void loadAd(AdRequestConfiguration adRequestConfiguration) {
        l.f(adRequestConfiguration, "adRequestConfiguration");
        this.f23942a.a(this.f23943b.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f23942a.a(appOpenAdLoadListener != null ? new el2(appOpenAdLoadListener) : null);
    }
}
