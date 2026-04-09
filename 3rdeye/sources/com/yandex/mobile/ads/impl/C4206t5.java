package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.t5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4206t5 implements InterfaceC4216v1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f33440a;

    public C4206t5(List<y5> adPodItems) {
        kotlin.jvm.internal.l.f(adPodItems, "adPodItems");
        Iterator<T> it = adPodItems.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((y5) it.next()).a();
        }
        this.f33440a = jA;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4216v1
    public final long a() {
        return this.f33440a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4216v1
    public final long a(long j4) {
        return this.f33440a;
    }
}
