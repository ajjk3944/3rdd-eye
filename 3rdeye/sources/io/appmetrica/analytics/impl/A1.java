package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class A1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f39075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f39077c;

    public A1(I1 i12, Intent intent, int i) {
        this.f39077c = i12;
        this.f39075a = intent;
        this.f39076b = i;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f39077c.f39601b.a(this.f39075a, this.f39076b);
    }
}
