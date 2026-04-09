package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4293w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f34856a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4296z f34857b;

    RunnableC4293w(C4296z c4296z, int i10) {
        this.f34857b = c4296z;
        this.f34856a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34857b.l(this.f34856a);
    }
}
