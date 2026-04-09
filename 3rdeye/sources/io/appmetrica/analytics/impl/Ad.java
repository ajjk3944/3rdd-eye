package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class Ad extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bd f39100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f39102c;

    public Ad(Bd bd, String str, byte[] bArr) {
        this.f39100a = bd;
        this.f39101b = str;
        this.f39102c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Bd.a(this.f39100a).setSessionExtra(this.f39101b, this.f39102c);
    }
}
