package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class W5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f36251a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t7 f36252b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f36253c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ K f36254d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f36255e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C5 f36256f;

    W5(C5 c52, boolean z10, t7 t7Var, boolean z11, K k10, Bundle bundle) {
        this.f36251a = z10;
        this.f36252b = t7Var;
        this.f36253c = z11;
        this.f36254d = k10;
        this.f36255e = bundle;
        this.f36256f = c52;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InterfaceC4951s2 interfaceC4951s2 = this.f36256f.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36256f.zzj().C().a("Failed to send default event parameters to service");
            return;
        }
        if (this.f36256f.a().p(N.f36102n1) && this.f36251a) {
            AbstractC7901p.l(this.f36252b);
            this.f36256f.I(interfaceC4951s2, this.f36253c ? null : this.f36254d, this.f36252b);
            return;
        }
        try {
            AbstractC7901p.l(this.f36252b);
            interfaceC4951s2.J(this.f36255e, this.f36252b);
            this.f36256f.m0();
        } catch (RemoteException e10) {
            this.f36256f.zzj().C().b("Failed to send default event parameters to service", e10);
        }
    }
}
