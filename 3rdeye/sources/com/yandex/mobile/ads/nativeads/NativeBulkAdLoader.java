package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.lm2;
import com.yandex.mobile.ads.impl.pt;
import com.yandex.mobile.ads.impl.rm2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class NativeBulkAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final pt f36856a;

    /* renamed from: b, reason: collision with root package name */
    private final f f36857b;

    public NativeBulkAdLoader(Context context) {
        l.f(context, "context");
        this.f36856a = new pt(context, new rm2(context));
        this.f36857b = new f();
    }

    public final void cancelLoading() {
        this.f36856a.a();
    }

    public final void loadAds(NativeAdRequestConfiguration nativeAdRequestConfiguration, int i) {
        l.f(nativeAdRequestConfiguration, "nativeAdRequestConfiguration");
        this.f36856a.a(this.f36857b.a(nativeAdRequestConfiguration), i);
    }

    public final void setNativeBulkAdLoadListener(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f36856a.a(nativeBulkAdLoadListener != null ? new lm2(nativeBulkAdLoadListener) : null);
    }
}
