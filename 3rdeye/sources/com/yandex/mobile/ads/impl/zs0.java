package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zs0 {

    /* renamed from: a, reason: collision with root package name */
    private final l42 f36610a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36611b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f36612c;

    public zs0(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f36610a = new l42();
        this.f36611b = context.getApplicationContext();
        this.f36612c = new AtomicBoolean();
    }

    public final void a() {
        if (ba.a(this.f36611b)) {
            this.f36610a.getClass();
            if (l42.a() || this.f36612c.getAndSet(true)) {
                return;
            }
            uo0.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
