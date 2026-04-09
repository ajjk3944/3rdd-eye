package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class nl2 implements InstreamAd {

    /* renamed from: a, reason: collision with root package name */
    private final xs f30928a;

    public nl2(xs coreInstreamAd) {
        kotlin.jvm.internal.l.f(coreInstreamAd, "coreInstreamAd");
        this.f30928a = coreInstreamAd;
    }

    public final xs a() {
        return this.f30928a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl2) && kotlin.jvm.internal.l.b(this.f30928a, ((nl2) obj).f30928a);
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAd
    public final List<InstreamAdBreak> getAdBreaks() {
        List<zs> listA = this.f30928a.a();
        ArrayList arrayList = new ArrayList(C2092m.T(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new ol2((zs) it.next()));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f30928a.hashCode();
    }

    public final String toString() {
        return "YandexInstreamAd(coreInstreamAd=" + this.f30928a + ")";
    }
}
