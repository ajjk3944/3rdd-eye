package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.xt1;

/* loaded from: classes3.dex */
public final class ws0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f35048a = new Handler(Looper.getMainLooper());

    public final void a() {
        this.f35048a.removeCallbacksAndMessages(null);
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.l.f(runnable, "runnable");
        this.f35048a.post(runnable);
    }

    public final void a(xt1.a runnable) {
        kotlin.jvm.internal.l.f(runnable, "runnable");
        this.f35048a.postDelayed(runnable, 50L);
    }
}
