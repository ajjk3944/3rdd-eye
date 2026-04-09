package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.lD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1466lD extends AbstractC1628oD {

    /* renamed from: C, reason: collision with root package name */
    public static final HD f15368C = new HD(AbstractC1466lD.class);

    /* renamed from: l, reason: collision with root package name */
    public HB f15369l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f15370m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f15371n;

    public AbstractC1466lD(HB hb, boolean z6, boolean z7) {
        int size = hb.size();
        this.f15919h = null;
        this.i = size;
        this.f15369l = hb;
        this.f15370m = z6;
        this.f15371n = z7;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final void f() {
        HB hb = this.f15369l;
        r(1);
        if ((hb != null) && (this.f14234a instanceof RC)) {
            boolean zL = l();
            AbstractC1896tC abstractC1896tCA = hb.a();
            while (abstractC1896tCA.hasNext()) {
                ((Future) abstractC1896tCA.next()).cancel(zL);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final String g() {
        HB hb = this.f15369l;
        return hb != null ? "futures=".concat(hb.toString()) : super.g();
    }

    public abstract void r(int i);

    public final void s(int i, InterfaceFutureC2326a interfaceFutureC2326a) {
        try {
            if (interfaceFutureC2326a.isCancelled()) {
                this.f15369l = null;
                cancel(false);
            } else {
                try {
                    w(i, AbstractC0582Jp.d(interfaceFutureC2326a));
                } catch (ExecutionException e6) {
                    t(e6.getCause());
                } catch (Throwable th) {
                    t(th);
                }
            }
        } finally {
            u(null);
        }
    }

    public final void t(Throwable th) {
        th.getClass();
        if (this.f15370m && !e(th)) {
            Set set = this.f15919h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f14234a instanceof RC)) {
                    Throwable thB = b();
                    Objects.requireNonNull(thB);
                    while (thB != null && setNewSetFromMap.add(thB)) {
                        thB = thB.getCause();
                    }
                }
                AbstractC1628oD.f15917j.k(this, setNewSetFromMap);
                set = this.f15919h;
                Objects.requireNonNull(set);
            }
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            f15368C.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z6 = th instanceof Error;
        if (z6) {
            f15368C.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z6 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public final void u(HB hb) {
        int iP = AbstractC1628oD.f15917j.p(this);
        int i = 0;
        AbstractC0582Jp.i0("Less than 0 remaining futures", iP >= 0);
        if (iP == 0) {
            if (hb != null) {
                AbstractC1896tC abstractC1896tCA = hb.a();
                while (abstractC1896tCA.hasNext()) {
                    Future future = (Future) abstractC1896tCA.next();
                    if (!future.isCancelled()) {
                        try {
                            w(i, AbstractC0582Jp.d(future));
                        } catch (ExecutionException e6) {
                            t(e6.getCause());
                        } catch (Throwable th) {
                            t(th);
                        }
                    }
                    i++;
                }
            }
            this.f15919h = null;
            x();
            r(2);
        }
    }

    public final void v() {
        Objects.requireNonNull(this.f15369l);
        if (this.f15369l.isEmpty()) {
            x();
            return;
        }
        boolean z6 = this.f15370m;
        EnumC2059wD enumC2059wD = EnumC2059wD.f17407a;
        if (z6) {
            AbstractC1896tC abstractC1896tCA = this.f15369l.a();
            int i = 0;
            while (abstractC1896tCA.hasNext()) {
                InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) abstractC1896tCA.next();
                int i3 = i + 1;
                if (interfaceFutureC2326a.isDone()) {
                    s(i, interfaceFutureC2326a);
                } else {
                    interfaceFutureC2326a.a(new RunnableC0496Eo(i, 1, this, interfaceFutureC2326a), enumC2059wD);
                }
                i = i3;
            }
            return;
        }
        HB hb = this.f15369l;
        HB hb2 = true != this.f15371n ? null : hb;
        RunnableC0786Vp runnableC0786Vp = new RunnableC0786Vp(this, 18, hb2);
        AbstractC1896tC abstractC1896tCA2 = hb.a();
        while (abstractC1896tCA2.hasNext()) {
            InterfaceFutureC2326a interfaceFutureC2326a2 = (InterfaceFutureC2326a) abstractC1896tCA2.next();
            if (interfaceFutureC2326a2.isDone()) {
                u(hb2);
            } else {
                interfaceFutureC2326a2.a(runnableC0786Vp, enumC2059wD);
            }
        }
    }

    public abstract void w(int i, Object obj);

    public abstract void x();
}
