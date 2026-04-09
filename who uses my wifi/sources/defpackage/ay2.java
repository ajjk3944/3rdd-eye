package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ay2 extends fy2 {
    public final /* synthetic */ int l;
    public final Context m;
    public final Executor n;

    public ay2(Context context, ld2 ld2Var, int i) {
        this.l = i;
        switch (i) {
            case 1:
                this.m = context;
                this.n = ld2Var;
                this.k = new vw1(context, hg4.C.t.a(), this, this, 2);
                break;
            default:
                this.m = context;
                this.n = ld2Var;
                this.k = new vw1(context, hg4.C.t.a(), this, this, 2);
                break;
        }
    }

    @Override // defpackage.fy2, defpackage.u9
    public void U(rh rhVar) {
        switch (this.l) {
            case 0:
                gi2.U("Cannot connect to remote service, fallback to local instance.");
                this.f.b(new my2(1));
                break;
            default:
                super.U(rhVar);
                break;
        }
    }

    @Override // defpackage.t9
    public final void Y() {
        switch (this.l) {
            case 0:
                synchronized (this.g) {
                    try {
                        if (!this.i) {
                            this.i = true;
                            try {
                                try {
                                    ((y92) this.k.t()).k1(this.j, ((Boolean) tw1.e.c.a(mz1.Ld)).booleanValue() ? new ey2(this.f, this.j) : new dy2(this));
                                } catch (Throwable th) {
                                    hg4.C.h.d("RemoteAdRequestClientTask.onConnected", th);
                                    this.f.b(new my2(1));
                                }
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f.b(new my2(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (this.g) {
                    try {
                        if (!this.i) {
                            this.i = true;
                            try {
                                ((y92) this.k.t()).x0(this.j, ((Boolean) tw1.e.c.a(mz1.Ld)).booleanValue() ? new ey2(this.f, this.j) : new dy2(this));
                            } catch (RemoteException | IllegalArgumentException unused2) {
                                this.f.b(new my2(1));
                            } catch (Throwable th3) {
                                hg4.C.h.d("RemoteSignalsClientTask.onConnected", th3);
                                this.f.b(new my2(1));
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }

    public n70 c(fa2 fa2Var) {
        synchronized (this.g) {
            try {
                if (this.h) {
                    return this.f;
                }
                this.h = true;
                this.j = fa2Var;
                this.k.n();
                pd2 pd2Var = this.f;
                pd2Var.f.c(new bs2(7, this), md2.g);
                fy2.b(this.m, pd2Var, this.n);
                return pd2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
