package com.yandex.mobile.ads.impl;

import android.app.Application;
import android.os.Build;

/* loaded from: classes3.dex */
public final class fl1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4194s0 f27373a = new C4194s0();

    public final String a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        this.f27373a.getClass();
        return C4194s0.b();
    }
}
