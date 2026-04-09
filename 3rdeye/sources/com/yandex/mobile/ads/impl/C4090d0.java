package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4090d0 {
    public static C4097e0 a() {
        C4097e0 c4097e0;
        C4097e0 c4097e02 = C4097e0.f26592g;
        if (c4097e02 != null) {
            return c4097e02;
        }
        synchronized (C4097e0.f26591f) {
            c4097e0 = C4097e0.f26592g;
            if (c4097e0 == null) {
                c4097e0 = new C4097e0();
                C4097e0.f26592g = c4097e0;
            }
        }
        return c4097e0;
    }
}
