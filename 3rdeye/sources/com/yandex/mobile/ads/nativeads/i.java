package com.yandex.mobile.ads.nativeads;

import c9.C2092m;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.pz1;
import com.yandex.mobile.ads.impl.v51;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class i extends e implements SliderAd {

    /* renamed from: d, reason: collision with root package name */
    private final pz1 f36867d;

    /* renamed from: e, reason: collision with root package name */
    private final g f36868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(pz1 sliderAdPrivate, g nativeAdViewBinderAdapter) {
        super(sliderAdPrivate);
        l.f(sliderAdPrivate, "sliderAdPrivate");
        l.f(nativeAdViewBinderAdapter, "nativeAdViewBinderAdapter");
        this.f36867d = sliderAdPrivate;
        this.f36868e = nativeAdViewBinderAdapter;
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    public final void bindSliderAd(NativeAdViewBinder viewBinder) throws v51 {
        l.f(viewBinder, "viewBinder");
        this.f36868e.getClass();
        this.f36867d.a(g.a(viewBinder));
    }

    @Override // com.yandex.mobile.ads.nativeads.e
    public final boolean equals(Object obj) {
        return (obj instanceof i) && l.b(((i) obj).f36867d, this.f36867d);
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    public final List<NativeAd> getNativeAds() {
        ArrayList arrayListD = this.f36867d.d();
        ArrayList arrayList = new ArrayList(C2092m.T(arrayListD, 10));
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            arrayList.add(new e((h61) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.nativeads.e
    public final int hashCode() {
        return this.f36867d.hashCode();
    }
}
