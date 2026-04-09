package com.google.android.gms.measurement.internal;

import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class O5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36158a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f36159b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ r7 f36160c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C5 f36161d;

    O5(C5 c52, t7 t7Var, boolean z10, r7 r7Var) {
        this.f36158a = t7Var;
        this.f36159b = z10;
        this.f36160c = r7Var;
        this.f36161d = c52;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InterfaceC4951s2 interfaceC4951s2 = this.f36161d.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36161d.zzj().C().a("Discarding data. Failed to set user property");
            return;
        }
        AbstractC7901p.l(this.f36158a);
        this.f36161d.I(interfaceC4951s2, this.f36159b ? null : this.f36160c, this.f36158a);
        this.f36161d.m0();
    }
}
