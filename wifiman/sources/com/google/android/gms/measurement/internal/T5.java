package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class T5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36217a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f36218b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C5 f36219c;

    T5(C5 c52, t7 t7Var, com.google.android.gms.internal.measurement.U0 u02) {
        this.f36217a = t7Var;
        this.f36218b = u02;
        this.f36219c = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.f36219c.e().J().x()) {
                this.f36219c.zzj().I().a("Analytics storage consent denied; will not get app instance id");
                this.f36219c.n().U0(null);
                this.f36219c.e().f36269i.b(null);
                return;
            }
            InterfaceC4951s2 interfaceC4951s2 = this.f36219c.f35813d;
            if (interfaceC4951s2 == null) {
                this.f36219c.zzj().C().a("Failed to get app instance id");
                return;
            }
            AbstractC7901p.l(this.f36217a);
            String strE = interfaceC4951s2.e(this.f36217a);
            if (strE != null) {
                this.f36219c.n().U0(strE);
                this.f36219c.e().f36269i.b(strE);
            }
            this.f36219c.m0();
            this.f36219c.g().O(this.f36218b, strE);
        } catch (RemoteException e10) {
            this.f36219c.zzj().C().b("Failed to get app instance id", e10);
        } finally {
            this.f36219c.g().O(this.f36218b, null);
        }
    }
}
