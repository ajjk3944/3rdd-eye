package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k2.InterfaceC2625d;
import q2.C2841s;
import q2.C2852x0;
import q2.InterfaceC2803B;
import q2.InterfaceC2806a;
import q2.InterfaceC2809b0;
import q2.InterfaceC2842s0;
import q2.InterfaceC2853y;

/* renamed from: com.google.android.gms.internal.ads.wr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2090wr implements InterfaceC2625d, InterfaceC0730Sk, InterfaceC0441Bk, InterfaceC1544mk, InterfaceC1921tk, InterfaceC2806a, InterfaceC1382jk, InterfaceC0577Jk, InterfaceC1813rk, InterfaceC2084wl {
    public final C0784Vn i;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f17499a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f17500b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f17501c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f17502d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f17503e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f17504f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f17505g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f17506h = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final ArrayBlockingQueue f17507j = new ArrayBlockingQueue(((Integer) C2841s.f23267e.f23270c.a(H9.ca)).intValue());

    public C2090wr(C0784Vn c0784Vn) {
        this.i = c0784Vn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final void D(C2852x0 c2852x0) {
        AtomicReference atomicReference = this.f17499a;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC2853y) obj).j0(c2852x0);
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC2853y) obj2).E(c2852x0.f23273a);
            } catch (RemoteException e8) {
                u2.k.k("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj3 = this.f17502d.get();
        if (obj3 != null) {
            try {
                ((InterfaceC2803B) obj3).V(c2852x0);
            } catch (RemoteException e10) {
                u2.k.k("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        this.f17504f.set(false);
        this.f17507j.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void E(C1807re c1807re) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void I() {
        AbstractC1984ut.m(this.f17499a, C1437kl.M);
        AbstractC1984ut.m(this.f17503e, C1437kl.f15252N);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void L() {
        Object obj;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Xb)).booleanValue() && (obj = this.f17499a.get()) != null) {
            try {
                ((InterfaceC2853y) obj).g();
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f17503e.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((InterfaceC2809b0) obj2).d();
        } catch (RemoteException e8) {
            u2.k.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void M() {
        Object obj = this.f17499a.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC2853y) obj).j();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void N() {
        Object obj = this.f17499a.get();
        if (obj != null) {
            try {
                ((InterfaceC2853y) obj).e();
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        AtomicReference atomicReference = this.f17503e;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC2809b0) obj2).s();
            } catch (RemoteException e8) {
                u2.k.k("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((InterfaceC2809b0) obj3).b();
        } catch (RemoteException e10) {
            u2.k.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0577Jk
    public final void a(q2.e1 e1Var) {
        Object obj = this.f17501c.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC2842s0) obj).u1(e1Var);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void b() {
    }

    public final synchronized InterfaceC2853y c() {
        return (InterfaceC2853y) this.f17499a.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:6:0x000a, B:14:0x001f, B:17:0x0028, B:25:0x003d, B:23:0x0032, B:24:0x0038, B:12:0x0014, B:13:0x001a), top: B:31:0x0001, inners: #5, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference r0 = r2.f17499a     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto La
            goto L1f
        La:
            q2.y r0 = (q2.InterfaceC2853y) r0     // Catch: java.lang.NullPointerException -> L10 android.os.RemoteException -> L12 java.lang.Throwable -> L48
            r0.d()     // Catch: java.lang.NullPointerException -> L10 android.os.RemoteException -> L12 java.lang.Throwable -> L48
            goto L1f
        L10:
            r0 = move-exception
            goto L14
        L12:
            r0 = move-exception
            goto L1a
        L14:
            java.lang.String r1 = "NullPointerException occurs when invoking a method from a delegating listener."
            u2.k.i(r1, r0)     // Catch: java.lang.Throwable -> L48
            goto L1f
        L1a:
            java.lang.String r1 = "#007 Could not call remote method."
            u2.k.k(r1, r0)     // Catch: java.lang.Throwable -> L48
        L1f:
            java.util.concurrent.atomic.AtomicReference r0 = r2.f17502d     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L28
            goto L3d
        L28:
            q2.B r0 = (q2.InterfaceC2803B) r0     // Catch: java.lang.NullPointerException -> L2e android.os.RemoteException -> L30 java.lang.Throwable -> L48
            r0.z()     // Catch: java.lang.NullPointerException -> L2e android.os.RemoteException -> L30 java.lang.Throwable -> L48
            goto L3d
        L2e:
            r0 = move-exception
            goto L32
        L30:
            r0 = move-exception
            goto L38
        L32:
            java.lang.String r1 = "NullPointerException occurs when invoking a method from a delegating listener."
            u2.k.i(r1, r0)     // Catch: java.lang.Throwable -> L48
            goto L3d
        L38:
            java.lang.String r1 = "#007 Could not call remote method."
            u2.k.k(r1, r0)     // Catch: java.lang.Throwable -> L48
        L3d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f17506h     // Catch: java.lang.Throwable -> L48
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Throwable -> L48
            r2.u()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r2)
            return
        L48:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2090wr.e():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1813rk
    public final void f(C2852x0 c2852x0) {
        Object obj = this.f17503e.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC2809b0) obj).L1(c2852x0);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Xb)).booleanValue() || (obj = this.f17499a.get()) == null) {
            return;
        }
        try {
            ((InterfaceC2853y) obj).g();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public final void p(q2.W w6) {
        this.f17500b.set(w6);
        this.f17505g.set(true);
        u();
    }

    @Override // k2.InterfaceC2625d
    public final synchronized void s(String str, String str2) {
        if (!this.f17504f.get()) {
            Object obj = this.f17500b.get();
            if (obj != null) {
                try {
                    ((q2.W) obj).q0(str, str2);
                } catch (RemoteException e6) {
                    u2.k.k("#007 Could not call remote method.", e6);
                } catch (NullPointerException e7) {
                    u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
                }
            }
            return;
        }
        if (!this.f17507j.offer(new Pair(str, str2))) {
            u2.k.c("The queue for app events is full, dropping the new event.");
            C0784Vn c0784Vn = this.i;
            if (c0784Vn != null) {
                C0697Ql c0697QlA = c0784Vn.a();
                c0697QlA.r("action", "dae_action");
                c0697QlA.r("dae_name", str);
                c0697QlA.r("dae_data", str2);
                c0697QlA.s();
            }
        }
    }

    public final void u() {
        if (this.f17505g.get() && this.f17506h.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.f17507j;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f17500b.get();
                if (obj != null) {
                    try {
                        ((q2.W) obj).q0((String) pair.first, (String) pair.second);
                    } catch (RemoteException e6) {
                        u2.k.k("#007 Could not call remote method.", e6);
                    } catch (NullPointerException e7) {
                        u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f17504f.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void v() {
        Object obj = this.f17499a.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC2853y) obj).b();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void w(Xt xt) {
        this.f17504f.set(true);
        this.f17506h.set(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final void z() {
        AbstractC1984ut.m(this.f17499a, C1437kl.f15251L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void F(BinderC2185ye binderC2185ye, String str, String str2) {
    }
}
