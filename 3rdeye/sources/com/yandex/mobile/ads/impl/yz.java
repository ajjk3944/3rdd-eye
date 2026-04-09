package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qr0;
import com.yandex.mobile.ads.impl.ur0;
import java.io.FileNotFoundException;

/* loaded from: classes3.dex */
public final class yz implements qr0 {
    public yz() {
        this(0);
    }

    @Override // com.yandex.mobile.ads.impl.qr0
    public final int a(int i) {
        return i == 7 ? 6 : 3;
    }

    public yz(int i) {
    }

    @Override // com.yandex.mobile.ads.impl.qr0
    public final long a(qr0.a aVar) {
        Throwable cause = aVar.f32327a;
        if ((cause instanceof yf1) || (cause instanceof FileNotFoundException) || (cause instanceof bh0) || (cause instanceof ur0.g)) {
            return -9223372036854775807L;
        }
        int i = pv.f31922c;
        while (cause != null) {
            if ((cause instanceof pv) && ((pv) cause).f31923b == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((aVar.f32328b - 1) * 1000, 5000);
    }
}
