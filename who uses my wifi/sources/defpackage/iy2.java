package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iy2 extends fy2 {
    public String l;
    public int m;

    @Override // defpackage.fy2, defpackage.u9
    public final void U(rh rhVar) {
        gi2.U("Cannot connect to remote service, fallback to local instance.");
        this.f.b(new my2(1));
    }

    @Override // defpackage.t9
    public final void Y() {
        synchronized (this.g) {
            try {
                if (!this.i) {
                    this.i = true;
                    try {
                        try {
                            int i = this.m;
                            if (i == 2) {
                                ((y92) this.k.t()).Q2(this.j, ((Boolean) tw1.e.c.a(mz1.Ld)).booleanValue() ? new ey2(this.f, this.j) : new dy2(this));
                            } else if (i == 3) {
                                ((y92) this.k.t()).n3(this.l, ((Boolean) tw1.e.c.a(mz1.Ld)).booleanValue() ? new ey2(this.f, this.j) : new dy2(this));
                            } else {
                                this.f.b(new my2(1));
                            }
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f.b(new my2(1));
                        }
                    } catch (Throwable th) {
                        hg4.C.h.d("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                        this.f.b(new my2(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
