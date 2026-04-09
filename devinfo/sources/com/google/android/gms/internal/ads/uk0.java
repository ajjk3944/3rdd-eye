package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uk0 implements qa.d, n70, w60, i60, p60, va.a, g60, e70, n60, t80 {

    /* renamed from: i, reason: collision with root package name */
    public final qd0 f17234i;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f17227a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f17228b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f17229c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f17230d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f17231e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f17232f = new AtomicBoolean(true);
    public final AtomicBoolean g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f17233h = new AtomicBoolean(false);
    public final ArrayBlockingQueue j = new ArrayBlockingQueue(((Integer) va.s.f36163e.f36166c.a(sk.f16109ea)).intValue());

    public uk0(qd0 qd0Var) {
        this.f17234i = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void D() {
        yo0.l(this.f17227a, h80.f11766x);
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void E() {
        yo0.l(this.f17227a, h80.f11765w);
        tk0 tk0Var = tk0.f16838b;
        AtomicReference atomicReference = this.f17231e;
        yo0.l(atomicReference, tk0Var);
        yo0.l(atomicReference, tk0.f16839c);
    }

    @Override // com.google.android.gms.internal.ads.e70
    public final void a(va.d3 d3Var) {
        Object obj = this.f17229c.get();
        if (obj == null) {
            return;
        }
        try {
            ((va.r1) obj).x1(d3Var);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final void b(va.w1 w1Var) {
        Object obj = this.f17231e.get();
        if (obj == null) {
            return;
        }
        try {
            ((va.a1) obj).r1(w1Var);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:6:0x000a, B:14:0x001f, B:17:0x0028, B:25:0x003d, B:23:0x0032, B:24:0x0038, B:12:0x0014, B:13:0x001a), top: B:31:0x0001, inners: #5, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.w60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference r0 = r2.f17227a     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto La
            goto L1f
        La:
            va.y r0 = (va.y) r0     // Catch: java.lang.NullPointerException -> L10 android.os.RemoteException -> L12 java.lang.Throwable -> L48
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
            za.i.i(r1, r0)     // Catch: java.lang.Throwable -> L48
            goto L1f
        L1a:
            java.lang.String r1 = "#007 Could not call remote method."
            za.i.k(r1, r0)     // Catch: java.lang.Throwable -> L48
        L1f:
            java.util.concurrent.atomic.AtomicReference r0 = r2.f17230d     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L28
            goto L3d
        L28:
            va.b0 r0 = (va.b0) r0     // Catch: java.lang.NullPointerException -> L2e android.os.RemoteException -> L30 java.lang.Throwable -> L48
            r0.m()     // Catch: java.lang.NullPointerException -> L2e android.os.RemoteException -> L30 java.lang.Throwable -> L48
            goto L3d
        L2e:
            r0 = move-exception
            goto L32
        L30:
            r0 = move-exception
            goto L38
        L32:
            java.lang.String r1 = "NullPointerException occurs when invoking a method from a delegating listener."
            za.i.i(r1, r0)     // Catch: java.lang.Throwable -> L48
            goto L3d
        L38:
            java.lang.String r1 = "#007 Could not call remote method."
            za.i.k(r1, r0)     // Catch: java.lang.Throwable -> L48
        L3d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f17233h     // Catch: java.lang.Throwable -> L48
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Throwable -> L48
            r2.k()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r2)
            return
        L48:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uk0.e():void");
    }

    public final synchronized va.y f() {
        return (va.y) this.f17227a.get();
    }

    @Override // qa.d
    public final synchronized void g(String str, String str2) {
        if (!this.f17232f.get()) {
            Object obj = this.f17228b.get();
            if (obj != null) {
                try {
                    ((va.v0) obj).Y(str, str2);
                } catch (RemoteException e2) {
                    za.i.k("#007 Could not call remote method.", e2);
                } catch (NullPointerException e10) {
                    za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
                }
            }
            return;
        }
        if (!this.j.offer(new Pair(str, str2))) {
            za.i.c("The queue for app events is full, dropping the new event.");
            qd0 qd0Var = this.f17234i;
            if (qd0Var != null) {
                rt rtVarA = qd0Var.a();
                rtVarA.u("action", "dae_action");
                rtVarA.u("dae_name", str);
                rtVarA.u("dae_data", str2);
                rtVarA.v();
            }
        }
    }

    public final void h(va.v0 v0Var) {
        this.f17228b.set(v0Var);
        this.g.set(true);
        k();
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void j() {
        Object obj = this.f17227a.get();
        if (obj == null) {
            return;
        }
        try {
            ((va.y) obj).c();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    public final void k() {
        if (this.g.get() && this.f17233h.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.j;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f17228b.get();
                if (obj != null) {
                    try {
                        ((va.v0) obj).Y((String) pair.first, (String) pair.second);
                    } catch (RemoteException e2) {
                        za.i.k("#007 Could not call remote method.", e2);
                    } catch (NullPointerException e10) {
                        za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f17232f.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void l(dq0 dq0Var) {
        this.f17232f.set(true);
        this.f17233h.set(false);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void n() {
        yo0.l(this.f17227a, h80.f11767y);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void o(va.w1 w1Var) {
        AtomicReference atomicReference = this.f17227a;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((va.y) obj).W(w1Var);
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((va.y) obj2).p(w1Var.f36177a);
            } catch (RemoteException e11) {
                za.i.k("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f17230d.get();
        if (obj3 != null) {
            try {
                ((va.b0) obj3).J(w1Var);
            } catch (RemoteException e13) {
                za.i.k("#007 Could not call remote method.", e13);
            } catch (NullPointerException e14) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e14);
            }
        }
        this.f17232f.set(false);
        this.j.clear();
    }

    @Override // va.a
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Zb)).booleanValue() || (obj = this.f17227a.get()) == null) {
            return;
        }
        try {
            ((va.y) obj).z1();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void v() {
        yo0.l(this.f17227a, h80.f11768z);
        yo0.l(this.f17231e, tk0.f16840d);
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void x() {
        Object obj;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Zb)).booleanValue() && (obj = this.f17227a.get()) != null) {
            try {
                ((va.y) obj).z1();
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f17231e.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((va.a1) obj2).d();
        } catch (RemoteException e11) {
            za.i.k("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void q(pu puVar, String str, String str2) {
    }
}
