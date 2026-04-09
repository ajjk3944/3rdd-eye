package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.hm2;
import com.yandex.mobile.ads.impl.mm2;
import com.yandex.mobile.ads.impl.pt;
import com.yandex.mobile.ads.impl.rm2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public class NativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final pt f36829a;

    /* renamed from: b, reason: collision with root package name */
    private final f f36830b;

    public NativeAdLoader(Context context) {
        l.f(context, "context");
        this.f36829a = new pt(context, new rm2(context));
        this.f36830b = new f();
    }

    public final void cancelLoading() {
        this.f36829a.a();
    }

    public final void loadAd(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        l.f(nativeAdRequestConfiguration, "nativeAdRequestConfiguration");
        this.f36829a.a(this.f36830b.a(nativeAdRequestConfiguration));
    }

    public final void setNativeAdLoadListener(NativeAdLoadListener nativeAdLoadListener) {
        this.f36829a.a(nativeAdLoadListener instanceof a ? new mm2((a) nativeAdLoadListener) : nativeAdLoadListener != null ? new hm2(nativeAdLoadListener) : null);
    }
}
