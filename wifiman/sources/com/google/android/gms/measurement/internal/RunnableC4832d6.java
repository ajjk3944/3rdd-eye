package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.d6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4832d6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f36377a = true;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t7 f36378b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f36379c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C4877j f36380d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4877j f36381e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C5 f36382f;

    RunnableC4832d6(C5 c52, boolean z10, t7 t7Var, boolean z11, C4877j c4877j, C4877j c4877j2) {
        this.f36378b = t7Var;
        this.f36379c = z11;
        this.f36380d = c4877j;
        this.f36381e = c4877j2;
        this.f36382f = c52;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InterfaceC4951s2 interfaceC4951s2 = this.f36382f.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36382f.zzj().C().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f36377a) {
            AbstractC7901p.l(this.f36378b);
            this.f36382f.I(interfaceC4951s2, this.f36379c ? null : this.f36380d, this.f36378b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f36381e.f36543a)) {
                    AbstractC7901p.l(this.f36378b);
                    interfaceC4951s2.i(this.f36380d, this.f36378b);
                } else {
                    interfaceC4951s2.g(this.f36380d);
                }
            } catch (RemoteException e10) {
                this.f36382f.zzj().C().b("Failed to send conditional user property to the service", e10);
            }
        }
        this.f36382f.m0();
    }
}
