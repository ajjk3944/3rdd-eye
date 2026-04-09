package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4294x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4295y f34858a;

    RunnableC4294x(C4295y c4295y) {
        this.f34858a = c4295y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4296z c4296z = this.f34858a.f34859a;
        c4296z.f34861b.b(c4296z.f34861b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
