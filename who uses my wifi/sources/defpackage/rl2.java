package defpackage;

import android.os.SystemClock;
import java.util.LinkedList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rl2 implements rn2, fd1, jo2, dn2, um2, ap2 {
    public final ym f;
    public final dd2 g;

    public rl2(ym ymVar, dd2 dd2Var) {
        this.f = ymVar;
        this.g = dd2Var;
    }

    @Override // defpackage.ap2
    public final void A0(gy1 gy1Var) {
        dd2 dd2Var = this.g;
        synchronized (dd2Var.d) {
            id2 id2Var = dd2Var.b;
            synchronized (id2Var.f) {
                id2Var.i.b();
            }
        }
    }

    @Override // defpackage.jo2
    public final void B(h83 h83Var) {
        ym ymVar = this.f;
        dd2 dd2Var = this.g;
        ymVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (dd2Var.d) {
            try {
                dd2Var.k = jElapsedRealtime;
                if (jElapsedRealtime != -1) {
                    dd2Var.b.a(dd2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fd1
    public final void C() {
        dd2 dd2Var = this.g;
        synchronized (dd2Var.d) {
            if (dd2Var.k != -1) {
                cd2 cd2Var = new cd2(dd2Var);
                cd2Var.c.a.getClass();
                cd2Var.a = SystemClock.elapsedRealtime();
                dd2Var.c.add(cd2Var);
                dd2Var.i++;
                id2 id2Var = dd2Var.b;
                synchronized (id2Var.f) {
                    hd2 hd2Var = id2Var.i;
                    synchronized (hd2Var.f) {
                        hd2Var.i++;
                    }
                }
                id2Var.a(dd2Var);
            }
        }
    }

    @Override // defpackage.dn2
    public final void D0() {
        dd2 dd2Var = this.g;
        synchronized (dd2Var.d) {
            try {
                if (dd2Var.k != -1 && dd2Var.g == -1) {
                    dd2Var.a.getClass();
                    dd2Var.g = SystemClock.elapsedRealtime();
                    dd2Var.b.a(dd2Var);
                }
                id2 id2Var = dd2Var.b;
                synchronized (id2Var.f) {
                    hd2 hd2Var = id2Var.i;
                    synchronized (hd2Var.f) {
                        hd2Var.j++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ap2
    public final void H(gy1 gy1Var) {
        dd2 dd2Var = this.g;
        synchronized (dd2Var.d) {
            id2 id2Var = dd2Var.b;
            synchronized (id2Var.f) {
                id2Var.i.b();
            }
        }
    }

    @Override // defpackage.um2
    public final void T() {
        dd2 dd2Var = this.g;
        synchronized (dd2Var.d) {
            try {
                if (dd2Var.k != -1) {
                    LinkedList linkedList = dd2Var.c;
                    if (!linkedList.isEmpty()) {
                        cd2 cd2Var = (cd2) linkedList.getLast();
                        if (cd2Var.b == -1) {
                            cd2Var.c.a.getClass();
                            cd2Var.b = SystemClock.elapsedRealtime();
                            dd2Var.b.a(dd2Var);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rn2
    public final void e() {
        dd2 dd2Var = this.g;
        synchronized (dd2Var.d) {
            try {
                if (dd2Var.k != -1) {
                    dd2Var.a.getClass();
                    dd2Var.h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.um2
    public final void a() {
    }

    @Override // defpackage.um2
    public final void b() {
    }

    @Override // defpackage.um2
    public final void c() {
    }

    @Override // defpackage.ap2
    public final void p() {
    }

    @Override // defpackage.um2
    public final void r() {
    }

    @Override // defpackage.jo2
    public final void G0(fa2 fa2Var) {
    }

    @Override // defpackage.ap2
    public final void S(boolean z) {
    }

    @Override // defpackage.ap2
    public final void g0(gy1 gy1Var) {
    }

    @Override // defpackage.ap2
    public final void r0(boolean z) {
    }

    @Override // defpackage.um2
    public final void J(ka2 ka2Var, String str, String str2) {
    }
}
