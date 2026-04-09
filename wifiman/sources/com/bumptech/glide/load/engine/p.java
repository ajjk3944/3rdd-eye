package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Map f34466a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f34467b = new HashMap();

    p() {
    }

    private Map b(boolean z10) {
        return z10 ? this.f34467b : this.f34466a;
    }

    k a(C2.e eVar, boolean z10) {
        return (k) b(z10).get(eVar);
    }

    void c(C2.e eVar, k kVar) {
        b(kVar.p()).put(eVar, kVar);
    }

    void d(C2.e eVar, k kVar) {
        Map mapB = b(kVar.p());
        if (kVar.equals(mapB.get(eVar))) {
            mapB.remove(eVar);
        }
    }
}
