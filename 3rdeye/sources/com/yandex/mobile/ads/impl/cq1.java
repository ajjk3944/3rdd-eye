package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class cq1 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f25752a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f25753b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<op1<?>> f25754c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<op1<?>> f25755d;

    /* renamed from: e, reason: collision with root package name */
    private final nm f25756e;

    /* renamed from: f, reason: collision with root package name */
    private final ic1 f25757f;

    /* renamed from: g, reason: collision with root package name */
    private final zq1 f25758g;

    /* renamed from: h, reason: collision with root package name */
    private final jc1[] f25759h;
    private sm i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f25760j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f25761k;

    public interface a {
        void a(op1<?> op1Var, int i);
    }

    public interface b {
        boolean a(op1<?> op1Var);
    }

    @Deprecated
    public interface c<T> {
        void a();
    }

    public cq1(nm nmVar, rk rkVar, int i) {
        this(nmVar, rkVar, i, new c60(new Handler(Looper.getMainLooper())));
    }

    public final void a(op1 op1Var) {
        op1Var.a(this);
        synchronized (this.f25753b) {
            this.f25753b.add(op1Var);
        }
        op1Var.b(this.f25752a.incrementAndGet());
        op1Var.a("add-to-queue");
        a(op1Var, 0);
        if (op1Var.t()) {
            this.f25754c.add(op1Var);
        } else {
            this.f25755d.add(op1Var);
        }
    }

    public final <T> void b(op1<T> op1Var) {
        synchronized (this.f25753b) {
            this.f25753b.remove(op1Var);
        }
        synchronized (this.f25760j) {
            try {
                Iterator it = this.f25760j.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a(op1Var, 5);
    }

    public cq1(nm nmVar, rk rkVar, int i, c60 c60Var) {
        this.f25752a = new AtomicInteger();
        this.f25753b = new HashSet();
        this.f25754c = new PriorityBlockingQueue<>();
        this.f25755d = new PriorityBlockingQueue<>();
        this.f25760j = new ArrayList();
        this.f25761k = new ArrayList();
        this.f25756e = nmVar;
        this.f25757f = rkVar;
        this.f25759h = new jc1[i];
        this.f25758g = c60Var;
    }

    public final void a(up1 up1Var) {
        synchronized (this.f25761k) {
            this.f25761k.add(up1Var);
        }
    }

    public final void a(b bVar) {
        synchronized (this.f25753b) {
            try {
                Iterator it = this.f25753b.iterator();
                while (it.hasNext()) {
                    op1<?> op1Var = (op1) it.next();
                    if (bVar.a(op1Var)) {
                        op1Var.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(op1<?> op1Var, int i) {
        synchronized (this.f25761k) {
            try {
                Iterator it = this.f25761k.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(op1Var, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        sm smVar = this.i;
        if (smVar != null) {
            smVar.b();
        }
        for (jc1 jc1Var : this.f25759h) {
            if (jc1Var != null) {
                jc1Var.b();
            }
        }
        sm smVar2 = new sm(this.f25754c, this.f25755d, this.f25756e, this.f25758g);
        this.i = smVar2;
        smVar2.start();
        for (int i = 0; i < this.f25759h.length; i++) {
            jc1 jc1Var2 = new jc1(this.f25755d, this.f25757f, this.f25756e, this.f25758g);
            this.f25759h[i] = jc1Var2;
            jc1Var2.start();
        }
    }
}
