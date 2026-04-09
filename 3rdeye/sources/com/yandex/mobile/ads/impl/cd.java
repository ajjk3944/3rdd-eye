package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zr0;

/* loaded from: classes3.dex */
public final class cd {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ad f25599a;

    public static final ce a() {
        ad adVar;
        ad adVar2 = f25599a;
        if (adVar2 != null) {
            return adVar2;
        }
        synchronized (ad.f24619b) {
            adVar = f25599a;
            if (adVar == null) {
                adVar = new ad(zr0.a.a().c());
                f25599a = adVar;
            }
        }
        return adVar;
    }
}
