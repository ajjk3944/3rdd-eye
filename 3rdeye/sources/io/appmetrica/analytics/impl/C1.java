package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class C1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f39221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f39222b;

    public C1(I1 i12, Intent intent) {
        this.f39222b = i12;
        this.f39221a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f39222b.f39601b.a(this.f39221a);
    }
}
