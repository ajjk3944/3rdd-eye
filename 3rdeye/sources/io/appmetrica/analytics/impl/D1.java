package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class D1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f39276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f39277b;

    public D1(I1 i12, Intent intent) {
        this.f39277b = i12;
        this.f39276a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f39277b.f39601b.c(this.f39276a);
    }
}
