package com.bumptech.glide;

import A1.w;
import A1.x;
import G3.C0152f;
import H1.p;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class n implements ComponentCallbacks2, A1.j {

    /* renamed from: k, reason: collision with root package name */
    public static final D1.e f6567k;

    /* renamed from: a, reason: collision with root package name */
    public final b f6568a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6569b;

    /* renamed from: c, reason: collision with root package name */
    public final A1.h f6570c;

    /* renamed from: d, reason: collision with root package name */
    public final w f6571d;

    /* renamed from: e, reason: collision with root package name */
    public final C0152f f6572e;

    /* renamed from: f, reason: collision with root package name */
    public final x f6573f;

    /* renamed from: g, reason: collision with root package name */
    public final C0.k f6574g;

    /* renamed from: h, reason: collision with root package name */
    public final A1.b f6575h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public D1.e f6576j;

    static {
        D1.e eVar = (D1.e) new D1.e().c(Bitmap.class);
        eVar.f1216m = true;
        f6567k = eVar;
        ((D1.e) new D1.e().c(y1.b.class)).f1216m = true;
    }

    public n(b bVar, A1.h hVar, C0152f c0152f, Context context) {
        w wVar = new w(1);
        C0152f c0152f2 = bVar.f6489f;
        this.f6573f = new x();
        C0.k kVar = new C0.k(20, this);
        this.f6574g = kVar;
        this.f6568a = bVar;
        this.f6570c = hVar;
        this.f6572e = c0152f;
        this.f6571d = wVar;
        this.f6569b = context;
        Context applicationContext = context.getApplicationContext();
        m mVar = new m(this, wVar);
        c0152f2.getClass();
        boolean z6 = G.c.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z6 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        A1.b cVar = z6 ? new A1.c(applicationContext, mVar) : new A1.l();
        this.f6575h = cVar;
        synchronized (bVar.f6490g) {
            if (bVar.f6490g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f6490g.add(this);
        }
        char[] cArr = p.f1779a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            hVar.f(this);
        } else {
            p.f().post(kVar);
        }
        hVar.f(cVar);
        this.i = new CopyOnWriteArrayList(bVar.f6486c.f6502e);
        o(bVar.f6486c.a());
    }

    @Override // A1.j
    public final synchronized void e() {
        this.f6573f.e();
        m();
    }

    @Override // A1.j
    public final synchronized void j() {
        n();
        this.f6573f.j();
    }

    public final void k(E1.c cVar) {
        if (cVar == null) {
            return;
        }
        boolean zP = p(cVar);
        D1.c cVarH = cVar.h();
        if (zP) {
            return;
        }
        b bVar = this.f6568a;
        synchronized (bVar.f6490g) {
            try {
                ArrayList arrayList = bVar.f6490g;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((n) obj).p(cVar)) {
                        return;
                    }
                }
                if (cVarH != null) {
                    cVar.f(null);
                    cVarH.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l() {
        try {
            ArrayList arrayListE = p.e(this.f6573f.f142a);
            int size = arrayListE.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListE.get(i);
                i++;
                k((E1.c) obj);
            }
            this.f6573f.f142a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m() {
        w wVar = this.f6571d;
        wVar.f140c = true;
        ArrayList arrayListE = p.e((Set) wVar.f141d);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            D1.c cVar = (D1.c) obj;
            if (cVar.isRunning()) {
                cVar.d();
                ((HashSet) wVar.f139b).add(cVar);
            }
        }
    }

    public final synchronized void n() {
        w wVar = this.f6571d;
        int i = 0;
        wVar.f140c = false;
        ArrayList arrayListE = p.e((Set) wVar.f141d);
        int size = arrayListE.size();
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            D1.c cVar = (D1.c) obj;
            if (!cVar.k() && !cVar.isRunning()) {
                cVar.j();
            }
        }
        ((HashSet) wVar.f139b).clear();
    }

    public final synchronized void o(D1.e eVar) {
        D1.e eVar2 = (D1.e) eVar.clone();
        if (eVar2.f1216m && !eVar2.f1217n) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        eVar2.f1217n = true;
        eVar2.f1216m = true;
        this.f6576j = eVar2;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // A1.j
    public final synchronized void onDestroy() {
        this.f6573f.onDestroy();
        l();
        w wVar = this.f6571d;
        ArrayList arrayListE = p.e((Set) wVar.f141d);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            wVar.a((D1.c) obj);
        }
        ((HashSet) wVar.f139b).clear();
        this.f6570c.g(this);
        this.f6570c.g(this.f6575h);
        p.f().removeCallbacks(this.f6574g);
        this.f6568a.c(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized boolean p(E1.c cVar) {
        D1.c cVarH = cVar.h();
        if (cVarH == null) {
            return true;
        }
        if (!this.f6571d.a(cVarH)) {
            return false;
        }
        this.f6573f.f142a.remove(cVar);
        cVar.f(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6571d + ", treeNode=" + this.f6572e + "}";
    }
}
