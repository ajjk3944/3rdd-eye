package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class et0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10856a;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f10858c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f10861f;
    public final kh0 g;

    /* renamed from: h, reason: collision with root package name */
    public final tb.a f10862h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10857b = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f10859d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10860e = new AtomicBoolean(false);

    public et0(int i4, ScheduledExecutorService scheduledExecutorService, kh0 kh0Var, tb.a aVar) {
        this.f10856a = i4;
        this.f10861f = scheduledExecutorService;
        this.g = kh0Var;
        this.f10862h = aVar;
    }

    public static String g(String str, pa.b bVar) {
        return str + ":" + bVar;
    }

    public final void a(it0 it0Var) {
        int i4 = 1;
        if (it0Var.r() <= 0 && !it0Var.f12437m.get()) {
            i4 = 0;
        }
        c(it0Var, i4);
    }

    public final synchronized void b(it0 it0Var) {
        try {
            if (h(it0Var)) {
                return;
            }
            long jH = it0Var.h();
            if (jH < 0) {
                jH = ((Long) va.s.f36163e.f36166c.a(sk.P)).longValue();
            }
            if (jH <= 0) {
                a(it0Var);
                return;
            }
            if (it0Var.r() > 0 || it0Var.f12437m.get()) {
                m(it0Var, 1);
            }
            this.f10857b.set(true);
            ScheduledFuture scheduledFuture = this.f10858c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f10858c = null;
            this.f10860e.set(true);
            this.f10858c = this.f10861f.schedule(new dt0(this, 4), jH, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(it0 it0Var, int i4) {
        if (h(it0Var)) {
            return;
        }
        if (i4 > 0) {
            m(it0Var, i4);
        }
        if (!n(it0Var)) {
            j(0L);
        } else {
            j(((Long) va.s.f36163e.f36166c.a(sk.U)).longValue());
        }
    }

    public final void d(String str, pa.b bVar, it0 it0Var) {
        LinkedHashMap linkedHashMap = this.f10859d;
        String strG = g(str, bVar);
        synchronized (linkedHashMap) {
            try {
                if (!linkedHashMap.containsKey(strG)) {
                    linkedHashMap.put(strG, it0Var);
                    n(it0Var);
                    j(((Long) va.s.f36163e.f36166c.a(sk.U)).longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(String str, pa.b bVar) {
        it0 it0Var;
        LinkedHashMap linkedHashMap = this.f10859d;
        String strG = g(str, bVar);
        synchronized (linkedHashMap) {
            it0Var = (it0) linkedHashMap.remove(strG);
        }
        if (it0Var == null) {
            return;
        }
        int iR = it0Var.r();
        int i4 = iR - 1;
        if (!it0Var.f12437m.get()) {
            iR = i4;
        }
        int iMax = Math.max(iR, 0);
        if (iMax > 0) {
            m(it0Var, iMax);
        }
        if (it0Var.r() > 0 || it0Var.f12437m.get()) {
            j(0L);
        }
    }

    public final int f() {
        int iMax;
        LinkedHashMap linkedHashMap = this.f10859d;
        synchronized (linkedHashMap) {
            try {
                iMax = 0;
                for (it0 it0Var : linkedHashMap.values()) {
                    int iR = it0Var.r();
                    int i4 = iR - 1;
                    if (!it0Var.f12437m.get()) {
                        iR = i4;
                    }
                    iMax += Math.max(iR, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iMax;
    }

    public final boolean h(it0 it0Var) {
        pa.b bVarQ = it0Var.q();
        if (bVarQ == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f10859d;
        synchronized (linkedHashMap) {
            try {
                return !linkedHashMap.containsKey(g(it0Var.f12436l, bVarQ));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i() {
        LinkedHashMap linkedHashMap = this.f10859d;
        synchronized (linkedHashMap) {
            try {
                for (it0 it0Var : linkedHashMap.values()) {
                    if (it0Var.r() == 0 && it0Var.s()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void j(long j) {
        if (this.f10860e.compareAndSet(false, true)) {
            if (j > 0) {
                this.f10858c = this.f10861f.schedule(new dt0(this, 1), j, TimeUnit.MILLISECONDS);
            } else {
                this.f10861f.execute(new dt0(this, 0));
            }
        }
    }

    public final synchronized void k() {
        x41 x41VarQ;
        try {
            if (this.f10857b.get()) {
                return;
            }
            it0 it0Var = null;
            this.f10858c = null;
            if (f() < this.f10856a || i()) {
                LinkedHashMap linkedHashMap = this.f10859d;
                synchronized (linkedHashMap) {
                    x41VarQ = x41.q(linkedHashMap.values());
                }
                int size = x41VarQ.size();
                double d10 = Double.MAX_VALUE;
                for (int i4 = 0; i4 < size; i4++) {
                    it0 it0Var2 = (it0) x41VarQ.get(i4);
                    if (it0Var2.s()) {
                        double dR = it0Var2.r() / it0Var2.f12431e.f36173d;
                        if (dR < d10) {
                            d10 = dR;
                        }
                        if (dR < d10) {
                            it0Var = it0Var2;
                        }
                    }
                }
                if (it0Var != null) {
                    it0Var.k();
                    if (it0Var.r() > 0) {
                        kh0 kh0Var = this.g;
                        this.f10862h.getClass();
                        kh0Var.E("acmpa", System.currentTimeMillis(), it0Var.f12436l, it0Var.f12431e.f36170a, it0Var.q(), it0Var.f12431e.f36173d, it0Var.r(), 0, f(), this.f10856a);
                    }
                }
                int iF = f();
                int i10 = this.f10856a;
                if (iF >= i10) {
                    l();
                }
                if (f() >= i10) {
                    if (i()) {
                    }
                }
                if (i()) {
                    this.f10861f.execute(new dt0(this, 3));
                    return;
                }
                this.f10858c = this.f10861f.schedule(new dt0(this, 2), ((Long) va.s.f36163e.f36166c.a(sk.V)).longValue(), TimeUnit.MILLISECONDS);
                return;
            }
            l();
            this.f10860e.set(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void l() {
        int size;
        LinkedHashMap linkedHashMap = this.f10859d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        kh0 kh0Var = this.g;
        tb.a aVar = this.f10862h;
        int i4 = this.f10856a;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        rt rtVarA = ((qd0) kh0Var.f13160b).a();
        rtVarA.u("action", "acmlr");
        rtVarA.u("pat", Long.toString(jCurrentTimeMillis));
        rtVarA.u("mpl", Integer.toString(i4));
        rtVarA.u("pas", Integer.toString(size));
        rtVarA.v();
    }

    public final void m(it0 it0Var, int i4) {
        this.f10862h.getClass();
        this.g.E("acmpr", System.currentTimeMillis(), it0Var.f12436l, it0Var.f12431e.f36170a, it0Var.q(), it0Var.f12431e.f36173d, it0Var.r(), i4, f(), this.f10856a);
    }

    public final synchronized boolean n(it0 it0Var) {
        if (!this.f10857b.get() && it0Var.r() == 0 && it0Var.s()) {
            it0Var.k();
            return true;
        }
        return false;
    }
}
