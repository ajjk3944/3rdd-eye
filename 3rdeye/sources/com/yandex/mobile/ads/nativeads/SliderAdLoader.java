package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.pt;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.um2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class SliderAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final pt f36858a;

    /* renamed from: b, reason: collision with root package name */
    private final f f36859b;

    public SliderAdLoader(Context context) {
        l.f(context, "context");
        this.f36858a = new pt(context, new rm2(context));
        this.f36859b = new f();
    }

    public final void cancelLoading() {
        this.f36858a.a();
    }

    public final void loadSlider(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        l.f(nativeAdRequestConfiguration, "nativeAdRequestConfiguration");
        this.f36858a.b(this.f36859b.a(nativeAdRequestConfiguration));
    }

    public final void setSliderAdLoadListener(SliderAdLoadListener sliderAdLoadListener) {
        this.f36858a.a(sliderAdLoadListener != null ? new um2(sliderAdLoadListener) : null);
    }
}
