package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class E2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f39324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f39325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F2 f39326c;

    public E2(F2 f22, Context context, Intent intent) {
        this.f39326c = f22;
        this.f39324a = context;
        this.f39325b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39326c.f39398a.consume(this.f39324a, this.f39325b);
    }
}
