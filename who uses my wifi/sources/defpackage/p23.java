package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p23 extends p52 {
    public final xb4 f;

    public p23(Context context, th2 th2Var, k83 k83Var, yr2 yr2Var, d32 d32Var) {
        t83 t83Var = new t83(yr2Var, (mv2) th2Var.j.d());
        ((s23) t83Var.h).f.set(d32Var);
        this.f = new xb4(new bu1(th2Var, context, t83Var, k83Var), k83Var.c, 28);
    }

    @Override // defpackage.a62
    public final synchronized void P2(pc4 pc4Var, int i) {
        this.f.F(pc4Var, i);
    }

    @Override // defpackage.a62
    public final void Z(pc4 pc4Var) {
        this.f.F(pc4Var, 1);
    }

    @Override // defpackage.a62
    public final synchronized String c() {
        String str;
        xb4 xb4Var = this.f;
        synchronized (xb4Var) {
            try {
                rm2 rm2Var = (rm2) xb4Var.i;
                str = rm2Var != null ? rm2Var.f : null;
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    @Override // defpackage.a62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean e() {
        /*
            r2 = this;
            monitor-enter(r2)
            xb4 r0 = r2.f     // Catch: java.lang.Throwable -> L1c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r0.g     // Catch: java.lang.Throwable -> L1a
            bu1 r1 = (defpackage.bu1) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.l     // Catch: java.lang.Throwable -> L1a
            kl2 r1 = (defpackage.kl2) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L14
            boolean r1 = r1.c     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            r1 = move-exception
            goto L18
        L1c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p23.e():boolean");
    }

    @Override // defpackage.a62
    public final synchronized String f() {
        String str;
        xb4 xb4Var = this.f;
        synchronized (xb4Var) {
            try {
                rm2 rm2Var = (rm2) xb4Var.i;
                str = rm2Var != null ? rm2Var.f : null;
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
        return str;
    }
}
