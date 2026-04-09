package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class I4 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f35933a;

    I4(C4945r4 c4945r4) {
        this.f35933a = c4945r4;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f35933a.zzl().z(runnable);
    }
}
