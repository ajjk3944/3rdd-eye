package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;

/* loaded from: classes3.dex */
public final class jk0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ik0 f29180a = new ik0(ip1.b.f28793S, ip1.b.f28792R, ip1.b.f28794T, ip1.b.f28795U);

    /* renamed from: b, reason: collision with root package name */
    private static final ik0 f29181b = new ik0(ip1.b.f28826y, ip1.b.f28825x, ip1.b.f28827z, ip1.b.f28775A);

    public static ik0 a(e9 adStructureType) {
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        int iOrdinal = adStructureType.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return f29180a;
        }
        if (iOrdinal == 2) {
            return f29181b;
        }
        throw new b9.j();
    }
}
