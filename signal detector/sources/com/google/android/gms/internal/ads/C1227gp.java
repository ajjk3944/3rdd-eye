package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.gp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1227gp extends AbstractC1441kp {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14378g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f14379h;
    public final Executor i;

    public C1227gp(Context context, C0623Mf c0623Mf, int i) {
        this.f14378g = i;
        switch (i) {
            case 1:
                this.f14379h = context;
                this.i = c0623Mf;
                this.f15284f = new C1838s8(context, p2.j.f22785C.f22806t.a(), this, this, 2);
                break;
            default:
                this.f14379h = context;
                this.i = c0623Mf;
                this.f15284f = new C1838s8(context, p2.j.f22785C.f22806t.a(), this, this, 2);
                break;
        }
    }

    private final void c() {
        synchronized (this.f15280b) {
            try {
                if (!this.f15282d) {
                    this.f15282d = true;
                    try {
                        ((InterfaceC1430ke) this.f15284f.t()).D0(this.f15283e, ((Boolean) C2841s.f23267e.f23270c.a(H9.ie)).booleanValue() ? new BinderC1387jp(this.f15279a, this.f15283e) : new BinderC1334ip(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f15279a.c(new C1765qp(1));
                    } catch (Throwable th) {
                        p2.j.f22785C.f22795h.f("RemoteAdRequestClientTask.onConnected", th);
                        this.f15279a.c(new C1765qp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public InterfaceFutureC2326a d(C1807re c1807re) {
        synchronized (this.f15280b) {
            try {
                if (this.f15281c) {
                    return this.f15279a;
                }
                this.f15281c = true;
                this.f15283e = c1807re;
                this.f15284f.n();
                C0657Of c0657Of = this.f15279a;
                c0657Of.f10212a.a(new RunnableC0558Ii(14, this), AbstractC0640Nf.f10011g);
                AbstractC1441kp.b(this.f14379h, c0657Of, this.i);
                return c0657Of;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M2.InterfaceC0162b
    public final void h0() {
        switch (this.f14378g) {
            case 0:
                c();
                return;
            default:
                synchronized (this.f15280b) {
                    try {
                        if (!this.f15282d) {
                            this.f15282d = true;
                            try {
                                ((InterfaceC1430ke) this.f15284f.t()).M1(this.f15283e, ((Boolean) C2841s.f23267e.f23270c.a(H9.ie)).booleanValue() ? new BinderC1387jp(this.f15279a, this.f15283e) : new BinderC1334ip(this));
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f15279a.c(new C1765qp(1));
                            } catch (Throwable th) {
                                p2.j.f22785C.f22795h.f("RemoteSignalsClientTask.onConnected", th);
                                this.f15279a.c(new C1765qp(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441kp, M2.InterfaceC0163c
    public void k0(J2.b bVar) {
        switch (this.f14378g) {
            case 0:
                u2.k.c("Cannot connect to remote service, fallback to local instance.");
                this.f15279a.c(new C1765qp(1));
                break;
            default:
                super.k0(bVar);
                break;
        }
    }
}
