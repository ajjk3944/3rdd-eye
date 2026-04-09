package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class B1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f39140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39142c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I1 f39143d;

    public B1(I1 i12, Intent intent, int i, int i10) {
        this.f39143d = i12;
        this.f39140a = intent;
        this.f39141b = i;
        this.f39142c = i10;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f39143d.f39601b.a(this.f39140a, this.f39141b, this.f39142c);
    }
}
