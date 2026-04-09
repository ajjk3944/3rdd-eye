package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.mobile.ads.impl.al2;
import com.yandex.mobile.ads.impl.bl2;
import com.yandex.mobile.ads.impl.j61;
import com.yandex.mobile.ads.impl.st;
import com.yandex.mobile.ads.impl.wm2;
import com.yandex.mobile.ads.impl.yt;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class NativeBannerView extends st {

    /* renamed from: K, reason: collision with root package name */
    private final al2 f36871K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeBannerView(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    public final void applyAppearance(NativeTemplateAppearance templateAppearance) {
        l.f(templateAppearance, "templateAppearance");
        applyAppearance((yt) templateAppearance);
    }

    public final void setAd(NativeAd nativeAd) {
        l.f(nativeAd, "nativeAd");
        this.f36871K.getClass();
        if (!(nativeAd instanceof j61)) {
            throw new IllegalArgumentException("You should pass NativeAd received from native ad loader API.");
        }
        setAd(((j61) nativeAd).a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, new NativeTemplateAppearance.Builder().build(), wm2.f35021a, new bl2(), null, null, null, 448, null);
        l.f(context, "context");
        this.f36871K = new al2();
    }
}
