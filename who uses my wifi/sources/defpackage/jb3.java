package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jb3 {
    public final ClientApi a;
    public final Context b;
    public final int c;
    public final t83 d;
    public ae3 e;
    public final AtomicBoolean f;
    public final od2 g;
    public final bf2 h;
    public final PriorityQueue i;
    public final kb3 j;
    public final String k;
    public final AtomicBoolean l;
    public final ScheduledExecutorService m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public sq0 p;
    public final ym q;
    public final qb3 r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jb3(ClientApi clientApi, Context context, int i, t83 t83Var, ae3 ae3Var, od2 od2Var, ScheduledExecutorService scheduledExecutorService, kb3 kb3Var, ym ymVar, int i2) {
        this("none", clientApi, context, i, t83Var, ae3Var, scheduledExecutorService, kb3Var, ymVar);
        this.s = i2;
        this.g = od2Var;
    }

    public final synchronized void a(Object obj) {
        try {
            ym ymVar = this.q;
            rb3 rb3Var = new rb3(obj, ymVar);
            this.i.add(rb3Var);
            tx2 tx2VarG = g(obj);
            ymVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.n.get()) {
                lf4.l.post(new sz2(this, tx2VarG, 11, false));
            }
            ScheduledExecutorService scheduledExecutorService = this.m;
            scheduledExecutorService.execute(new le1(this, jCurrentTimeMillis, tx2VarG));
            tb3 tb3Var = new tb3(this, 0);
            long jMin = rb3Var.d + Math.min(Math.max(((Long) tw1.e.c.a(mz1.C)).longValue(), -900000L), 10000L);
            ymVar.getClass();
            scheduledExecutorService.schedule(tb3Var, jMin - (System.currentTimeMillis() - rb3Var.b), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z) {
        kb3 kb3Var = this.j;
        if (kb3Var.a()) {
            return;
        }
        if (z) {
            double d = kb3Var.e;
            kb3Var.e = Math.min((long) (d + d), kb3Var.b);
            kb3Var.c++;
        }
        ScheduledExecutorService scheduledExecutorService = this.m;
        tb3 tb3Var = new tb3(this, 0);
        double d2 = kb3Var.e;
        double d3 = 0.2d * d2;
        long j = (long) (d2 + d3);
        scheduledExecutorService.schedule(tb3Var, ((long) (d2 - d3)) + ((long) (kb3Var.f.nextDouble() * ((j - r4) + 1))), TimeUnit.MILLISECONDS);
    }

    public final synchronized void c() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            rb3 rb3Var = (rb3) it.next();
            long j = rb3Var.b;
            long j2 = rb3Var.d;
            rb3Var.c.getClass();
            if (System.currentTimeMillis() >= j + j2) {
                it.remove();
            }
        }
    }

    public final synchronized void d() {
        try {
            if (this.o.get() && this.i.isEmpty()) {
                this.o.set(false);
                if (this.n.get()) {
                    lf4.l.post(new tb3(this, 1));
                }
                this.m.execute(new tb3(this, 2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String e() {
        return true != "none".equals(this.k) ? "2" : "1";
    }

    public final fp3 f(Context context) {
        switch (this.s) {
            case 0:
                u62 u62Var = (u62) ((AtomicReference) this.d.i).get();
                if (u62Var == null) {
                    break;
                } else {
                    ba2 ba2VarY2 = this.a.Y2(new oi0(context), xe4.b(), this.e.f, u62Var, this.c);
                    if (ba2VarY2 == null) {
                        break;
                    } else {
                        wq3 wq3Var = new wq3();
                        try {
                            p(this.e.h);
                            y63 y63Var = (y63) ba2VarY2;
                            y63Var.K2(new ib3(this, wq3Var, this.e));
                            y63Var.Z(this.e.h);
                            break;
                        } catch (RemoteException unused) {
                            gi2.q0(5);
                            return pu1.B(new fb3());
                        }
                    }
                }
            case 1:
                u62 u62Var2 = (u62) ((AtomicReference) this.d.i).get();
                if (u62Var2 == null) {
                    break;
                } else {
                    ba2 ba2VarE2 = this.a.E2(new oi0(context), new xe4(), this.e.f, u62Var2, this.c);
                    if (ba2VarE2 == null) {
                        break;
                    } else {
                        wq3 wq3Var2 = new wq3();
                        try {
                            p(this.e.h);
                            ((w23) ba2VarE2).a1(this.e.h, new lb3(this, wq3Var2, (w23) ba2VarE2));
                            break;
                        } catch (RemoteException unused2) {
                            gi2.q0(5);
                            return pu1.B(new fb3());
                        }
                    }
                }
            default:
                u62 u62Var3 = (u62) ((AtomicReference) this.d.i).get();
                if (u62Var3 == null) {
                    break;
                } else {
                    ya2 ya2VarS2 = this.a.s2(new oi0(context), this.e.f, u62Var3, this.c);
                    if (ya2VarS2 == null) {
                        break;
                    } else {
                        wq3 wq3Var3 = new wq3();
                        try {
                            p(this.e.h);
                            ((x73) ya2VarS2).q2(this.e.h, new vb3(this, wq3Var3, (x73) ya2VarS2));
                            break;
                        } catch (RemoteException unused3) {
                            gi2.i0("Failed to load rewarded ad.");
                            return pu1.B(new fb3());
                        }
                    }
                }
        }
        return pu1.B(new fb3());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        defpackage.gi2.q0(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        defpackage.gi2.q0(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        defpackage.gi2.q0(3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.tx2 g(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.s
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            ya2 r2 = (defpackage.ya2) r2
            tx2 r2 = r2.n()     // Catch: android.os.RemoteException -> Lc
            goto L11
        Lc:
            r2 = 3
            defpackage.gi2.q0(r2)
            r2 = 0
        L11:
            return r2
        L12:
            ba2 r2 = (defpackage.ba2) r2
            tx2 r2 = r2.N()     // Catch: android.os.RemoteException -> L19
            goto L1e
        L19:
            r2 = 3
            defpackage.gi2.q0(r2)
            r2 = 0
        L1e:
            return r2
        L1f:
            kw1 r2 = (defpackage.kw1) r2
            tx2 r2 = r2.e()     // Catch: android.os.RemoteException -> L26
            goto L2b
        L26:
            r2 = 3
            defpackage.gi2.q0(r2)
            r2 = 0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb3.g(java.lang.Object):tx2");
    }

    public final synchronized boolean h() {
        try {
            if (((Boolean) tw1.e.c.a(mz1.H)).booleanValue()) {
                kb3 kb3Var = this.j;
                kb3Var.e = kb3Var.a;
                kb3Var.c = 0L;
            }
            c();
        } catch (Throwable th) {
            throw th;
        }
        return !this.i.isEmpty();
    }

    public final synchronized Object i() {
        try {
            kb3 kb3Var = this.j;
            kb3Var.e = kb3Var.a;
            kb3Var.c = 0L;
            PriorityQueue priorityQueue = this.i;
            rb3 rb3Var = (rb3) priorityQueue.poll();
            this.o.set(rb3Var != null);
            if (rb3Var == null) {
                rb3Var = null;
            } else if (!priorityQueue.isEmpty()) {
                rb3 rb3Var2 = (rb3) priorityQueue.peek();
                s2 s2VarA = s2.a(this.e.g);
                tx2 tx2VarG = g(rb3Var.a);
                String str = !(tx2VarG instanceof rm2) ? null : ((rm2) tx2VarG).i;
                if (rb3Var2 != null && s2VarA != null && str != null && rb3Var2.b < rb3Var.b) {
                    sq0 sq0Var = this.p;
                    this.q.getClass();
                    sq0Var.z("poll_ad", "psvroc_ts", System.currentTimeMillis(), this.e.i, m(), str, this.r, e());
                }
            }
            n();
            if (rb3Var == null) {
                return null;
            }
            return rb3Var.a;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        this.f.set(true);
        this.n.set(true);
        this.m.submit(new tb3(this, 0));
    }

    public final synchronized String k() {
        String str;
        Object obj;
        synchronized (this) {
            rb3 rb3Var = (rb3) this.i.peek();
            str = null;
            obj = rb3Var == null ? null : rb3Var.a;
        }
        return str;
        tx2 tx2VarG = obj == null ? null : g(obj);
        if (tx2VarG instanceof rm2) {
            str = ((rm2) tx2VarG).i;
        }
        return str;
    }

    public final synchronized void l(int i) {
        ou1.f(i >= 5);
        kb3 kb3Var = this.j;
        synchronized (kb3Var) {
            ou1.f(i > 0);
            kb3Var.d = i;
        }
    }

    public final synchronized int m() {
        return this.i.size();
    }

    public final synchronized void n() {
        fp3 fp3VarF;
        try {
            c();
            d();
            if (!this.l.get() && this.f.get() && this.i.size() < this.e.i) {
                this.l.set(true);
                Activity activityI = hg4.C.g.i();
                if (activityI == null) {
                    gi2.i0("Empty activity context at preloading: ".concat(String.valueOf(this.e.f)));
                    fp3VarF = f(this.b);
                } else {
                    fp3VarF = f(activityI);
                }
                f20 f20Var = new f20(27, this);
                fp3VarF.c(new jq3(fp3VarF, f20Var, 0), this.m);
            }
        } finally {
        }
    }

    public final void o(int i) {
        ou1.f(i > 0);
        s2 s2VarA = s2.a(this.e.g);
        int i2 = this.e.i;
        synchronized (this) {
            try {
                ae3 ae3Var = this.e;
                this.e = new ae3(ae3Var.f, ae3Var.g, ae3Var.h, i > 0 ? i : ae3Var.i);
                PriorityQueue priorityQueue = this.i;
                if (priorityQueue.size() > i) {
                    if (((Boolean) tw1.e.c.a(mz1.w)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < i; i3++) {
                            rb3 rb3Var = (rb3) priorityQueue.poll();
                            if (rb3Var != null) {
                                arrayList.add(rb3Var);
                            }
                        }
                        priorityQueue.clear();
                        priorityQueue.addAll(arrayList);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sq0 sq0Var = this.p;
        if (sq0Var == null || s2VarA == null) {
            return;
        }
        this.q.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.e.f;
        lv2 lv2VarA = ((mv2) sq0Var.g).a();
        lv2VarA.k("action", "cache_resize");
        lv2VarA.k("cs_ts", Long.toString(jCurrentTimeMillis));
        lv2VarA.k("orig_ma", Integer.toString(i2));
        lv2VarA.k("max_ads", Integer.toString(i));
        lv2VarA.k("ad_format", s2VarA.name().toLowerCase(Locale.ENGLISH));
        lv2VarA.k("ad_unit_id", str);
        lv2VarA.k("pid", null);
        lv2VarA.k("pv", "1");
        lv2VarA.m();
    }

    public final void p(pc4 pc4Var) {
        if (((Boolean) tw1.e.c.a(mz1.B)).booleanValue()) {
            Bundle bundle = pc4Var.G;
            bundle.putInt("plcs", m());
            bundle.putInt("plbs", this.e.i);
            bundle.putString("plid", this.k);
        }
    }

    public final void q(nx2 nx2Var) {
        synchronized (this) {
            try {
                if (this.n.get()) {
                    lf4.l.post(new sz2(this, nx2Var, 12, false));
                }
                this.l.set(false);
                int i = nx2Var.f;
                if (i != 1 && i != 8 && i != 10 && i != 11) {
                    b(true);
                    return;
                }
                ae3 ae3Var = this.e;
                int i2 = ae3Var.g;
                String str = ae3Var.f;
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26 + String.valueOf(str).length() + 61);
                sb.append("Preloading ");
                sb.append(i2);
                sb.append(", for adUnitId:");
                sb.append(str);
                sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
                gi2.f0(sb.toString());
                this.f.set(false);
                ae3 ae3Var2 = this.e;
                pb3 pb3Var = new pb3(ae3Var2.f, s2.a(ae3Var2.g));
                pb3Var.h = this.k;
                qb3 qb3Var = new qb3(pb3Var);
                sq0 sq0Var = this.p;
                this.q.getClass();
                sq0Var.x(System.currentTimeMillis(), qb3Var, nx2Var, this.e.i, m(), e());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jb3(String str, ClientApi clientApi, Context context, int i, t83 t83Var, ae3 ae3Var, bf2 bf2Var, ScheduledExecutorService scheduledExecutorService, kb3 kb3Var, ym ymVar, int i2) {
        this(str, clientApi, context, i, t83Var, ae3Var, scheduledExecutorService, kb3Var, ymVar);
        this.s = i2;
        this.h = bf2Var;
    }

    public jb3(String str, ClientApi clientApi, Context context, int i, t83 t83Var, ae3 ae3Var, ScheduledExecutorService scheduledExecutorService, kb3 kb3Var, ym ymVar) {
        this.k = str;
        this.a = clientApi;
        this.b = context;
        this.c = i;
        this.d = t83Var;
        this.e = ae3Var;
        this.i = new PriorityQueue(Math.max(1, ae3Var.i), new sb3(0, this));
        this.f = new AtomicBoolean(true);
        this.l = new AtomicBoolean(false);
        this.m = scheduledExecutorService;
        this.j = kb3Var;
        this.n = new AtomicBoolean(true);
        this.o = new AtomicBoolean(false);
        this.q = ymVar;
        pb3 pb3Var = new pb3(ae3Var.f, s2.a(this.e.g));
        pb3Var.h = str;
        this.r = new qb3(pb3Var);
    }
}
