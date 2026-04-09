package com.bumptech.glide;

import a3.C1648b;
import a3.C1649c;
import a3.InterfaceC1647a;
import a3.n;
import a3.o;
import a3.t;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import d3.InterfaceC4272d;
import d3.InterfaceC4274f;
import e3.InterfaceC4313g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import z0.C5848a;

/* compiled from: RequestManager.java */
/* loaded from: classes.dex */
public final class l implements ComponentCallbacks2, a3.i {

    /* renamed from: l, reason: collision with root package name */
    public static final d3.g f22279l;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.b f22280b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f22281c;

    /* renamed from: d, reason: collision with root package name */
    public final a3.g f22282d;

    /* renamed from: e, reason: collision with root package name */
    public final o f22283e;

    /* renamed from: f, reason: collision with root package name */
    public final n f22284f;

    /* renamed from: g, reason: collision with root package name */
    public final t f22285g;

    /* renamed from: h, reason: collision with root package name */
    public final a f22286h;
    public final InterfaceC1647a i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC4274f<Object>> f22287j;

    /* renamed from: k, reason: collision with root package name */
    public d3.g f22288k;

    /* compiled from: RequestManager.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            lVar.f22282d.g(lVar);
        }
    }

    /* compiled from: RequestManager.java */
    public class b implements InterfaceC1647a.InterfaceC0210a {

        /* renamed from: a, reason: collision with root package name */
        public final o f22290a;

        public b(o oVar) {
            this.f22290a = oVar;
        }

        @Override // a3.InterfaceC1647a.InterfaceC0210a
        public final void a(boolean z10) {
            if (z10) {
                synchronized (l.this) {
                    o oVar = this.f22290a;
                    Iterator it = h3.l.e(oVar.f14128a).iterator();
                    while (it.hasNext()) {
                        InterfaceC4272d interfaceC4272d = (InterfaceC4272d) it.next();
                        if (!interfaceC4272d.j() && !interfaceC4272d.g()) {
                            interfaceC4272d.clear();
                            if (oVar.f14130c) {
                                oVar.f14129b.add(interfaceC4272d);
                            } else {
                                interfaceC4272d.h();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        d3.g gVarD = new d3.g().d(Bitmap.class);
        gVarD.f37383n = true;
        f22279l = gVarD;
        new d3.g().d(Y2.c.class).f37383n = true;
    }

    public l(com.bumptech.glide.b bVar, a3.g gVar, n nVar, Context context) {
        o oVar = new o();
        C1649c c1649c = bVar.f22242g;
        this.f22285g = new t();
        a aVar = new a();
        this.f22286h = aVar;
        this.f22280b = bVar;
        this.f22282d = gVar;
        this.f22284f = nVar;
        this.f22283e = oVar;
        this.f22281c = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(oVar);
        c1649c.getClass();
        boolean z10 = C5848a.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC1647a c1648b = z10 ? new C1648b(applicationContext, bVar2) : new a3.l();
        this.i = c1648b;
        synchronized (bVar.f22243h) {
            if (bVar.f22243h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f22243h.add(this);
        }
        char[] cArr = h3.l.f38217a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar.g(this);
        } else {
            h3.l.f().post(aVar);
        }
        gVar.g(c1648b);
        this.f22287j = new CopyOnWriteArrayList<>(bVar.f22239d.f22249e);
        m(bVar.f22239d.a());
    }

    public final void i(InterfaceC4313g<?> interfaceC4313g) {
        if (interfaceC4313g == null) {
            return;
        }
        boolean zN = n(interfaceC4313g);
        InterfaceC4272d interfaceC4272dG = interfaceC4313g.g();
        if (zN) {
            return;
        }
        com.bumptech.glide.b bVar = this.f22280b;
        synchronized (bVar.f22243h) {
            try {
                Iterator it = bVar.f22243h.iterator();
                while (it.hasNext()) {
                    if (((l) it.next()).n(interfaceC4313g)) {
                        return;
                    }
                }
                if (interfaceC4272dG != null) {
                    interfaceC4313g.b(null);
                    interfaceC4272dG.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void j() {
        try {
            Iterator it = h3.l.e(this.f22285g.f14157b).iterator();
            while (it.hasNext()) {
                i((InterfaceC4313g) it.next());
            }
            this.f22285g.f14157b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k() {
        o oVar = this.f22283e;
        oVar.f14130c = true;
        Iterator it = h3.l.e(oVar.f14128a).iterator();
        while (it.hasNext()) {
            InterfaceC4272d interfaceC4272d = (InterfaceC4272d) it.next();
            if (interfaceC4272d.isRunning()) {
                interfaceC4272d.pause();
                oVar.f14129b.add(interfaceC4272d);
            }
        }
    }

    public final synchronized void l() {
        o oVar = this.f22283e;
        oVar.f14130c = false;
        Iterator it = h3.l.e(oVar.f14128a).iterator();
        while (it.hasNext()) {
            InterfaceC4272d interfaceC4272d = (InterfaceC4272d) it.next();
            if (!interfaceC4272d.j() && !interfaceC4272d.isRunning()) {
                interfaceC4272d.h();
            }
        }
        oVar.f14129b.clear();
    }

    public final synchronized void m(d3.g gVar) {
        d3.g gVarClone = gVar.clone();
        if (gVarClone.f37383n && !gVarClone.f37384o) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        gVarClone.f37384o = true;
        gVarClone.f37383n = true;
        this.f22288k = gVarClone;
    }

    public final synchronized boolean n(InterfaceC4313g<?> interfaceC4313g) {
        InterfaceC4272d interfaceC4272dG = interfaceC4313g.g();
        if (interfaceC4272dG == null) {
            return true;
        }
        if (!this.f22283e.a(interfaceC4272dG)) {
            return false;
        }
        this.f22285g.f14157b.remove(interfaceC4313g);
        interfaceC4313g.b(null);
        return true;
    }

    @Override // a3.i
    public final synchronized void onDestroy() {
        this.f22285g.onDestroy();
        j();
        o oVar = this.f22283e;
        Iterator it = h3.l.e(oVar.f14128a).iterator();
        while (it.hasNext()) {
            oVar.a((InterfaceC4272d) it.next());
        }
        oVar.f14129b.clear();
        this.f22282d.b(this);
        this.f22282d.b(this.i);
        h3.l.f().removeCallbacks(this.f22286h);
        this.f22280b.c(this);
    }

    @Override // a3.i
    public final synchronized void onStart() {
        l();
        this.f22285g.onStart();
    }

    @Override // a3.i
    public final synchronized void onStop() {
        this.f22285g.onStop();
        k();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f22283e + ", treeNode=" + this.f22284f + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
