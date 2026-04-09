package com.google.android.gms.measurement.internal;

import r3.C7564b;

/* renamed from: com.google.android.gms.measurement.internal.k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4892k6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C7564b f36572a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC4868h6 f36573b;

    RunnableC4892k6(ServiceConnectionC4868h6 serviceConnectionC4868h6, C7564b c7564b) {
        this.f36572a = c7564b;
        this.f36573b = serviceConnectionC4868h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36573b.f36523c.f35813d = null;
        if (this.f36573b.f36523c.a().p(N.f36108p1) && this.f36572a.b() == 7777) {
            return;
        }
        this.f36573b.f36523c.l0();
    }
}
