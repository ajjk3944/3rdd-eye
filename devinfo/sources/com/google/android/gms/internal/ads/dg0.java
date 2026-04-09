package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dg0 extends hg0 {
    public final /* synthetic */ int g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f10471h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f10472i;

    public dg0(Context context, ex exVar, int i4) {
        this.g = i4;
        switch (i4) {
            case 1:
                this.f10471h = context;
                this.f10472i = exVar;
                this.f11863f = new di(context, ua.j.C.f35276t.f(), this, this, 2);
                break;
            default:
                this.f10471h = context;
                this.f10472i = exVar;
                this.f11863f = new di(context, ua.j.C.f35276t.f(), this, this, 2);
                break;
        }
    }

    private final void c() {
        synchronized (this.f11859b) {
            try {
                if (!this.f11861d) {
                    this.f11861d = true;
                    try {
                        ((bu) this.f11863f.t()).j0(this.f11862e, ((Boolean) va.s.f36163e.f36166c.a(sk.f16201ke)).booleanValue() ? new gg0(this.f11858a, this.f11862e) : new fg0(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f11858a.d(new og0(1));
                    } catch (Throwable th2) {
                        ua.j.C.f35265h.f("RemoteAdRequestClientTask.onConnected", th2);
                        this.f11858a.d(new og0(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hg0, pb.c
    public void O(nb.b bVar) {
        switch (this.g) {
            case 0:
                za.i.c("Cannot connect to remote service, fallback to local instance.");
                this.f11858a.d(new og0(1));
                break;
            default:
                super.O(bVar);
                break;
        }
    }

    @Override // pb.b
    public final void T() {
        switch (this.g) {
            case 0:
                c();
                return;
            default:
                synchronized (this.f11859b) {
                    try {
                        if (!this.f11861d) {
                            this.f11861d = true;
                            try {
                                ((bu) this.f11863f.t()).c2(this.f11862e, ((Boolean) va.s.f36163e.f36166c.a(sk.f16201ke)).booleanValue() ? new gg0(this.f11858a, this.f11862e) : new fg0(this));
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f11858a.d(new og0(1));
                            } catch (Throwable th2) {
                                ua.j.C.f35265h.f("RemoteSignalsClientTask.onConnected", th2);
                                this.f11858a.d(new og0(1));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    public vd.b d(iu iuVar) {
        synchronized (this.f11859b) {
            try {
                if (this.f11860c) {
                    return this.f11858a;
                }
                this.f11860c = true;
                this.f11862e = iuVar;
                this.f11863f.n();
                gx gxVar = this.f11858a;
                gxVar.f11625a.a(new s30(13, this), fx.g);
                hg0.b(this.f10471h, gxVar, this.f10472i);
                return gxVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
