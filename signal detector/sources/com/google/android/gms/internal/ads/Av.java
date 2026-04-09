package com.google.android.gms.internal.ads;

import j2.EnumC2546b;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Av {

    /* renamed from: a, reason: collision with root package name */
    public final int f7066a;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f7068c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f7071f;

    /* renamed from: g, reason: collision with root package name */
    public final C1014cu f7072g;

    /* renamed from: h, reason: collision with root package name */
    public final Q2.a f7073h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7067b = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7069d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7070e = new AtomicBoolean(false);

    public Av(int i, ScheduledExecutorService scheduledExecutorService, C1014cu c1014cu, Q2.a aVar) {
        this.f7066a = i;
        this.f7071f = scheduledExecutorService;
        this.f7072g = c1014cu;
        this.f7073h = aVar;
    }

    public static String g(String str, EnumC2546b enumC2546b) {
        return str + ":" + enumC2546b;
    }

    public final void a(Ev ev) {
        int i = 1;
        if (ev.r() <= 0 && !ev.f8034m.get()) {
            i = 0;
        }
        c(ev, i);
    }

    public final synchronized void b(Ev ev) {
        try {
            if (h(ev)) {
                return;
            }
            long jH = ev.h();
            if (jH < 0) {
                jH = ((Long) C2841s.f23267e.f23270c.a(H9.f8648P)).longValue();
            }
            if (jH <= 0) {
                a(ev);
                return;
            }
            if (ev.r() > 0 || ev.f8034m.get()) {
                m(ev, 1);
            }
            this.f7067b.set(true);
            ScheduledFuture scheduledFuture = this.f7068c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f7068c = null;
            this.f7070e.set(true);
            this.f7068c = this.f7071f.schedule(new RunnableC2256zv(this, 4), jH, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Ev ev, int i) {
        if (h(ev)) {
            return;
        }
        if (i > 0) {
            m(ev, i);
        }
        if (!n(ev)) {
            j(0L);
        } else {
            j(((Long) C2841s.f23267e.f23270c.a(H9.f8676U)).longValue());
        }
    }

    public final void d(String str, EnumC2546b enumC2546b, Ev ev) {
        LinkedHashMap linkedHashMap = this.f7069d;
        String strG = g(str, enumC2546b);
        synchronized (linkedHashMap) {
            try {
                if (!linkedHashMap.containsKey(strG)) {
                    linkedHashMap.put(strG, ev);
                    n(ev);
                    j(((Long) C2841s.f23267e.f23270c.a(H9.f8676U)).longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str, EnumC2546b enumC2546b) {
        Ev ev;
        LinkedHashMap linkedHashMap = this.f7069d;
        String strG = g(str, enumC2546b);
        synchronized (linkedHashMap) {
            ev = (Ev) linkedHashMap.remove(strG);
        }
        if (ev == null) {
            return;
        }
        int iR = ev.r();
        int i = iR - 1;
        if (!ev.f8034m.get()) {
            iR = i;
        }
        int iMax = Math.max(iR, 0);
        if (iMax > 0) {
            m(ev, iMax);
        }
        if (ev.r() > 0 || ev.f8034m.get()) {
            j(0L);
        }
    }

    public final int f() {
        int iMax;
        LinkedHashMap linkedHashMap = this.f7069d;
        synchronized (linkedHashMap) {
            try {
                iMax = 0;
                for (Ev ev : linkedHashMap.values()) {
                    int iR = ev.r();
                    int i = iR - 1;
                    if (!ev.f8034m.get()) {
                        iR = i;
                    }
                    iMax += Math.max(iR, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iMax;
    }

    public final boolean h(Ev ev) {
        EnumC2546b enumC2546bQ = ev.q();
        if (enumC2546bQ == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f7069d;
        synchronized (linkedHashMap) {
            try {
                return !linkedHashMap.containsKey(g(ev.f8033l, enumC2546bQ));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i() {
        LinkedHashMap linkedHashMap = this.f7069d;
        synchronized (linkedHashMap) {
            try {
                for (Ev ev : linkedHashMap.values()) {
                    if (ev.r() == 0 && ev.s()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void j(long j6) {
        if (this.f7070e.compareAndSet(false, true)) {
            if (j6 > 0) {
                this.f7068c = this.f7071f.schedule(new RunnableC2256zv(this, 1), j6, TimeUnit.MILLISECONDS);
            } else {
                this.f7071f.execute(new RunnableC2256zv(this, 0));
            }
        }
    }

    public final synchronized void k() {
        LB lbM;
        try {
            if (this.f7067b.get()) {
                return;
            }
            Ev ev = null;
            this.f7068c = null;
            if (f() < this.f7066a || i()) {
                LinkedHashMap linkedHashMap = this.f7069d;
                synchronized (linkedHashMap) {
                    lbM = LB.m(linkedHashMap.values());
                }
                int size = lbM.size();
                double d6 = Double.MAX_VALUE;
                for (int i = 0; i < size; i++) {
                    Ev ev2 = (Ev) lbM.get(i);
                    if (ev2.s()) {
                        double dR = ev2.r() / ev2.f8027e.f23142d;
                        if (dR < d6) {
                            d6 = dR;
                        }
                        if (dR < d6) {
                            ev = ev2;
                        }
                    }
                }
                if (ev != null) {
                    ev.k();
                    if (ev.r() > 0) {
                        C1014cu c1014cu = this.f7072g;
                        this.f7073h.getClass();
                        c1014cu.o("acmpa", System.currentTimeMillis(), ev.f8033l, ev.f8027e.f23139a, ev.q(), ev.f8027e.f23142d, ev.r(), 0, f(), this.f7066a);
                    }
                }
                int iF = f();
                int i3 = this.f7066a;
                if (iF >= i3) {
                    l();
                }
                if (f() >= i3) {
                    if (i()) {
                    }
                }
                if (i()) {
                    this.f7071f.execute(new RunnableC2256zv(this, 3));
                    return;
                }
                this.f7068c = this.f7071f.schedule(new RunnableC2256zv(this, 2), ((Long) C2841s.f23267e.f23270c.a(H9.f8682V)).longValue(), TimeUnit.MILLISECONDS);
                return;
            }
            l();
            this.f7070e.set(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l() {
        int size;
        LinkedHashMap linkedHashMap = this.f7069d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        C1014cu c1014cu = this.f7072g;
        Q2.a aVar = this.f7073h;
        int i = this.f7066a;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0697Ql c0697QlA = ((C0784Vn) c1014cu.f13695b).a();
        c0697QlA.r("action", "acmlr");
        c0697QlA.r("pat", Long.toString(jCurrentTimeMillis));
        c0697QlA.r("mpl", Integer.toString(i));
        c0697QlA.r("pas", Integer.toString(size));
        c0697QlA.s();
    }

    public final void m(Ev ev, int i) {
        this.f7073h.getClass();
        this.f7072g.o("acmpr", System.currentTimeMillis(), ev.f8033l, ev.f8027e.f23139a, ev.q(), ev.f8027e.f23142d, ev.r(), i, f(), this.f7066a);
    }

    public final synchronized boolean n(Ev ev) {
        if (!this.f7067b.get() && ev.r() == 0 && ev.s()) {
            ev.k();
            return true;
        }
        return false;
    }
}
