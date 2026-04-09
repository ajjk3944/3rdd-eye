package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2092m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class ng {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f30863a;

    public ng(List<? extends ag<?>> assets) {
        kotlin.jvm.internal.l.f(assets, "assets");
        int iL = C2077A.l(C2092m.T(assets, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL < 16 ? 16 : iL);
        Iterator<T> it = assets.iterator();
        while (it.hasNext()) {
            ag agVar = (ag) it.next();
            linkedHashMap.put(agVar.b(), agVar.d());
        }
        this.f30863a = linkedHashMap;
    }

    public final sw0 a() {
        Object obj = this.f30863a.get("media");
        if (obj instanceof sw0) {
            return (sw0) obj;
        }
        return null;
    }
}
