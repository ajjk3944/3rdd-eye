package defpackage;

import android.os.RemoteException;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s23 implements b8, jo2, rn2, wm2, dn2, fd1, um2, bo2, bn2, xp2 {
    public final mv2 n;
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final AtomicReference j = new AtomicReference();
    public final AtomicBoolean k = new AtomicBoolean(true);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final ArrayBlockingQueue o = new ArrayBlockingQueue(((Integer) tw1.e.c.a(mz1.F9)).intValue());

    public s23(mv2 mv2Var) {
        this.n = mv2Var;
    }

    @Override // defpackage.jo2
    public final void B(h83 h83Var) {
        this.k.set(true);
        this.m.set(false);
    }

    @Override // defpackage.fd1
    public final void C() {
        Object obj;
        if (((Boolean) tw1.e.c.a(mz1.Ab)).booleanValue() || (obj = this.f.get()) == null) {
            return;
        }
        try {
            ((d32) obj).f();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.dn2
    public final void D0() {
        um.G(this.f, su2.i);
    }

    @Override // defpackage.b8
    public final synchronized void O(String str, String str2) {
        if (!this.k.get()) {
            Object obj = this.g.get();
            if (obj != null) {
                try {
                    ((wi2) obj).n0(str, str2);
                } catch (RemoteException e) {
                    gi2.p0("#007 Could not call remote method.", e);
                } catch (NullPointerException unused) {
                    gi2.q0(5);
                }
            }
            return;
        }
        if (!this.o.offer(new Pair(str, str2))) {
            gi2.U("The queue for app events is full, dropping the new event.");
            mv2 mv2Var = this.n;
            if (mv2Var != null) {
                lv2 lv2VarA = mv2Var.a();
                lv2VarA.k("action", "dae_action");
                lv2VarA.k("dae_name", str);
                lv2VarA.k("dae_data", str2);
                lv2VarA.m();
            }
        }
    }

    @Override // defpackage.um2
    public final void T() {
        Object obj = this.f.get();
        if (obj != null) {
            try {
                ((d32) obj).y();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj2 = this.j.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((pl2) obj2).l();
        } catch (RemoteException e2) {
            gi2.p0("#007 Could not call remote method.", e2);
        } catch (NullPointerException unused2) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.xp2
    public final void U0() {
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((d32) obj).j();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.um2
    public final void a() {
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((d32) obj).b();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.wm2
    public final void d0(nx2 nx2Var) {
        AtomicReference atomicReference = this.f;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((d32) obj).W(nx2Var);
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((d32) obj2).I(nx2Var.f);
            } catch (RemoteException e2) {
                gi2.p0("#007 Could not call remote method.", e2);
            } catch (NullPointerException unused2) {
                gi2.q0(5);
            }
        }
        Object obj3 = this.i.get();
        if (obj3 != null) {
            try {
                ((p42) obj3).O(nx2Var);
            } catch (RemoteException e3) {
                gi2.p0("#007 Could not call remote method.", e3);
            } catch (NullPointerException unused3) {
                gi2.q0(5);
            }
        }
        this.k.set(false);
        this.o.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:7:0x000b, B:13:0x001c, B:16:0x0025, B:22:0x0036, B:21:0x0031, B:20:0x002d, B:12:0x0017, B:11:0x0013), top: B:28:0x0001, inners: #5, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.rn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicReference r0 = r3.f     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L41
            r1 = 5
            if (r0 != 0) goto Lb
            goto L1c
        Lb:
            d32 r0 = (defpackage.d32) r0     // Catch: android.os.RemoteException -> L11 java.lang.NullPointerException -> L13 java.lang.Throwable -> L41
            r0.c()     // Catch: android.os.RemoteException -> L11 java.lang.NullPointerException -> L13 java.lang.Throwable -> L41
            goto L1c
        L11:
            r0 = move-exception
            goto L17
        L13:
            defpackage.gi2.q0(r1)     // Catch: java.lang.Throwable -> L41
            goto L1c
        L17:
            java.lang.String r2 = "#007 Could not call remote method."
            defpackage.gi2.p0(r2, r0)     // Catch: java.lang.Throwable -> L41
        L1c:
            java.util.concurrent.atomic.AtomicReference r0 = r3.i     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L25
            goto L36
        L25:
            p42 r0 = (defpackage.p42) r0     // Catch: android.os.RemoteException -> L2b java.lang.NullPointerException -> L2d java.lang.Throwable -> L41
            r0.y()     // Catch: android.os.RemoteException -> L2b java.lang.NullPointerException -> L2d java.lang.Throwable -> L41
            goto L36
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            defpackage.gi2.q0(r1)     // Catch: java.lang.Throwable -> L41
            goto L36
        L31:
            java.lang.String r1 = "#007 Could not call remote method."
            defpackage.gi2.p0(r1, r0)     // Catch: java.lang.Throwable -> L41
        L36:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.m     // Catch: java.lang.Throwable -> L41
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Throwable -> L41
            r3.w()     // Catch: java.lang.Throwable -> L41
            monitor-exit(r3)
            return
        L41:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L41
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s23.e():void");
    }

    @Override // defpackage.bo2
    public final void h(dg4 dg4Var) {
        Object obj = this.h.get();
        if (obj == null) {
            return;
        }
        try {
            ((zu2) obj).R1(dg4Var);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    public final synchronized d32 l() {
        return (d32) this.f.get();
    }

    public final void p(wi2 wi2Var) {
        this.g.set(wi2Var);
        this.l.set(true);
        w();
    }

    @Override // defpackage.um2
    public final void r() {
        Object obj = this.f.get();
        if (obj != null) {
            try {
                ((d32) obj).e();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        AtomicReference atomicReference = this.j;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((pl2) obj2).r();
            } catch (RemoteException e2) {
                gi2.p0("#007 Could not call remote method.", e2);
            } catch (NullPointerException unused2) {
                gi2.q0(5);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((pl2) obj3).b();
        } catch (RemoteException e3) {
            gi2.p0("#007 Could not call remote method.", e3);
        } catch (NullPointerException unused3) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.bn2
    public final void s(nx2 nx2Var) {
        Object obj = this.j.get();
        if (obj == null) {
            return;
        }
        try {
            ((pl2) obj).M2(nx2Var);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.xp2
    public final void s0() {
        Object obj;
        if (((Boolean) tw1.e.c.a(mz1.Ab)).booleanValue() && (obj = this.f.get()) != null) {
            try {
                ((d32) obj).f();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj2 = this.j.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((pl2) obj2).c();
        } catch (RemoteException e2) {
            gi2.p0("#007 Could not call remote method.", e2);
        } catch (NullPointerException unused2) {
            gi2.q0(5);
        }
    }

    public final void w() {
        if (this.l.get() && this.m.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.o;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.g.get();
                if (obj != null) {
                    try {
                        ((wi2) obj).n0((String) pair.first, (String) pair.second);
                    } catch (RemoteException e) {
                        gi2.p0("#007 Could not call remote method.", e);
                    } catch (NullPointerException unused) {
                        gi2.q0(5);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.k.set(false);
        }
    }

    @Override // defpackage.um2
    public final void b() {
    }

    @Override // defpackage.um2
    public final void c() {
    }

    @Override // defpackage.jo2
    public final void G0(fa2 fa2Var) {
    }

    @Override // defpackage.um2
    public final void J(ka2 ka2Var, String str, String str2) {
    }
}
