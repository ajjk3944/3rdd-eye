package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class E1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f39322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f39323b;

    public E1(I1 i12, Intent intent) {
        this.f39323b = i12;
        this.f39322a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f39323b.f39601b.b(this.f39322a);
    }
}
