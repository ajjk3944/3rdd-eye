package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5124zd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bd f42176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f42177b;

    public C5124zd(Bd bd, boolean z10) {
        this.f42176a = bd;
        this.f42177b = z10;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Bd.a(this.f42176a).b(this.f42177b);
    }
}
