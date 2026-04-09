package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes3.dex */
public final class Hb {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f39573a;

    /* renamed from: b, reason: collision with root package name */
    public final V2 f39574b;

    /* renamed from: c, reason: collision with root package name */
    public final Ib f39575c;

    public Hb(Handler handler, V2 v22) {
        this.f39573a = handler;
        this.f39574b = v22;
        this.f39575c = new Ib(handler, v22);
    }

    public static void a(Handler handler, V2 v22, Runnable runnable) {
        handler.removeCallbacks(runnable, v22.f40267b.f40684b.getApiKey());
        handler.postAtTime(runnable, v22.f40267b.f40684b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(v22.f40267b.f40684b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
