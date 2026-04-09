package com.bumptech.glide;

import Q2.b;
import Q2.l;
import Q2.p;
import Q2.q;
import Q2.s;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class j implements ComponentCallbacks2, l {

    /* renamed from: m, reason: collision with root package name */
    private static final com.bumptech.glide.request.f f34229m = (com.bumptech.glide.request.f) com.bumptech.glide.request.f.d0(Bitmap.class).P();

    /* renamed from: n, reason: collision with root package name */
    private static final com.bumptech.glide.request.f f34230n = (com.bumptech.glide.request.f) com.bumptech.glide.request.f.d0(O2.c.class).P();

    /* renamed from: o, reason: collision with root package name */
    private static final com.bumptech.glide.request.f f34231o = (com.bumptech.glide.request.f) ((com.bumptech.glide.request.f) com.bumptech.glide.request.f.e0(E2.a.f4020c).R(g.LOW)).X(true);

    /* renamed from: a, reason: collision with root package name */
    protected final com.bumptech.glide.b f34232a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f34233b;

    /* renamed from: c, reason: collision with root package name */
    final Q2.j f34234c;

    /* renamed from: d, reason: collision with root package name */
    private final q f34235d;

    /* renamed from: e, reason: collision with root package name */
    private final p f34236e;

    /* renamed from: f, reason: collision with root package name */
    private final s f34237f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f34238g;

    /* renamed from: h, reason: collision with root package name */
    private final Q2.b f34239h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList f34240i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.request.f f34241j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f34242k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34243l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.f34234c.b(jVar);
        }
    }

    private class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f34245a;

        b(q qVar) {
            this.f34245a = qVar;
        }

        @Override // Q2.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (j.this) {
                    this.f34245a.e();
                }
            }
        }
    }

    public j(com.bumptech.glide.b bVar, Q2.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.g(), context);
    }

    private void B(T2.d dVar) {
        boolean zA = A(dVar);
        com.bumptech.glide.request.c cVarJ = dVar.j();
        if (zA || this.f34232a.p(dVar) || cVarJ == null) {
            return;
        }
        dVar.e(null);
        cVarJ.clear();
    }

    private synchronized void q() {
        try {
            Iterator it = this.f34237f.m().iterator();
            while (it.hasNext()) {
                p((T2.d) it.next());
            }
            this.f34237f.c();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean A(T2.d dVar) {
        com.bumptech.glide.request.c cVarJ = dVar.j();
        if (cVarJ == null) {
            return true;
        }
        if (!this.f34235d.a(cVarJ)) {
            return false;
        }
        this.f34237f.o(dVar);
        dVar.e(null);
        return true;
    }

    @Override // Q2.l
    public synchronized void a() {
        try {
            this.f34237f.a();
            if (this.f34243l) {
                q();
            } else {
                w();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Q2.l
    public synchronized void b() {
        x();
        this.f34237f.b();
    }

    public i c(Class cls) {
        return new i(this.f34232a, this, cls, this.f34233b);
    }

    @Override // Q2.l
    public synchronized void f() {
        this.f34237f.f();
        q();
        this.f34235d.b();
        this.f34234c.a(this);
        this.f34234c.a(this.f34239h);
        W2.l.v(this.f34238g);
        this.f34232a.s(this);
    }

    public i m() {
        return c(Bitmap.class).b(f34229m);
    }

    public i n() {
        return c(Drawable.class);
    }

    public i o() {
        return c(O2.c.class).b(f34230n);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f34242k) {
            v();
        }
    }

    public void p(T2.d dVar) {
        if (dVar == null) {
            return;
        }
        B(dVar);
    }

    List r() {
        return this.f34240i;
    }

    synchronized com.bumptech.glide.request.f s() {
        return this.f34241j;
    }

    k t(Class cls) {
        return this.f34232a.i().d(cls);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f34235d + ", treeNode=" + this.f34236e + "}";
    }

    public synchronized void u() {
        this.f34235d.c();
    }

    public synchronized void v() {
        u();
        Iterator it = this.f34236e.a().iterator();
        while (it.hasNext()) {
            ((j) it.next()).u();
        }
    }

    public synchronized void w() {
        this.f34235d.d();
    }

    public synchronized void x() {
        this.f34235d.f();
    }

    protected synchronized void y(com.bumptech.glide.request.f fVar) {
        this.f34241j = (com.bumptech.glide.request.f) ((com.bumptech.glide.request.f) fVar.clone()).c();
    }

    synchronized void z(T2.d dVar, com.bumptech.glide.request.c cVar) {
        this.f34237f.n(dVar);
        this.f34235d.g(cVar);
    }

    j(com.bumptech.glide.b bVar, Q2.j jVar, p pVar, q qVar, Q2.c cVar, Context context) {
        this.f34237f = new s();
        a aVar = new a();
        this.f34238g = aVar;
        this.f34232a = bVar;
        this.f34234c = jVar;
        this.f34236e = pVar;
        this.f34235d = qVar;
        this.f34233b = context;
        Q2.b bVarA = cVar.a(context.getApplicationContext(), new b(qVar));
        this.f34239h = bVarA;
        bVar.o(this);
        if (W2.l.q()) {
            W2.l.u(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(bVarA);
        this.f34240i = new CopyOnWriteArrayList(bVar.i().b());
        y(bVar.i().c());
    }
}
