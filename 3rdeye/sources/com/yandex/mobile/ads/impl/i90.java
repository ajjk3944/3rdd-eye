package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class i90 extends da0 {

    /* renamed from: a, reason: collision with root package name */
    private final pz1 f28594a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<String> f28595b;

    /* renamed from: c, reason: collision with root package name */
    private final List<pk1> f28596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i90(pz1 sliderAd, a8 adResponse, ArrayList preloadedDivKitDesigns) {
        super(0);
        kotlin.jvm.internal.l.f(sliderAd, "sliderAd");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        this.f28594a = sliderAd;
        this.f28595b = adResponse;
        this.f28596c = preloadedDivKitDesigns;
    }

    public final a8<String> a() {
        return this.f28595b;
    }

    public final List<pk1> b() {
        return this.f28596c;
    }

    public final pz1 c() {
        return this.f28594a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i90)) {
            return false;
        }
        i90 i90Var = (i90) obj;
        return kotlin.jvm.internal.l.b(this.f28594a, i90Var.f28594a) && kotlin.jvm.internal.l.b(this.f28595b, i90Var.f28595b) && kotlin.jvm.internal.l.b(this.f28596c, i90Var.f28596c);
    }

    public final int hashCode() {
        return this.f28596c.hashCode() + ((this.f28595b.hashCode() + (this.f28594a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        pz1 pz1Var = this.f28594a;
        a8<String> a8Var = this.f28595b;
        List<pk1> list = this.f28596c;
        StringBuilder sb = new StringBuilder("FeedItem(sliderAd=");
        sb.append(pz1Var);
        sb.append(", adResponse=");
        sb.append(a8Var);
        sb.append(", preloadedDivKitDesigns=");
        return C1094a9.h(sb, list, ")");
    }
}
