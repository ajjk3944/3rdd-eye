package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5099yd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bd f42135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42137c;

    public C5099yd(Bd bd, int i, String str) {
        this.f42135a = bd;
        this.f42136b = i;
        this.f42137c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Bd.a(this.f42135a).a(new Y9(this.f42136b, this.f42137c));
    }
}
