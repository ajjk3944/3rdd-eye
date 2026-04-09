package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4840e5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Boolean f36436a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36437b;

    RunnableC4840e5(C4945r4 c4945r4, Boolean bool) {
        this.f36436a = bool;
        this.f36437b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36437b.d0(this.f36436a, true);
    }
}
