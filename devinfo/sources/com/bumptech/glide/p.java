package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.measurement.i4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import m8.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements ComponentCallbacks2, m8.i {

    /* renamed from: k, reason: collision with root package name */
    public static final p8.f f6555k;

    /* renamed from: a, reason: collision with root package name */
    public final b f6556a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6557b;

    /* renamed from: c, reason: collision with root package name */
    public final m8.g f6558c;

    /* renamed from: d, reason: collision with root package name */
    public final i4 f6559d;

    /* renamed from: e, reason: collision with root package name */
    public final m8.m f6560e;

    /* renamed from: f, reason: collision with root package name */
    public final t f6561f;
    public final b5.o g;

    /* renamed from: h, reason: collision with root package name */
    public final m8.b f6562h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f6563i;
    public p8.f j;

    static {
        p8.f fVar = (p8.f) new p8.f().d(Bitmap.class);
        fVar.f31464n = true;
        f6555k = fVar;
        ((p8.f) new p8.f().d(k8.b.class)).f31464n = true;
    }

    public p(b bVar, m8.g gVar, m8.m mVar, Context context) {
        i4 i4Var = new i4(5);
        j6.i iVar = bVar.f6475f;
        this.f6561f = new t();
        b5.o oVar = new b5.o(3, this);
        this.g = oVar;
        this.f6556a = bVar;
        this.f6558c = gVar;
        this.f6560e = mVar;
        this.f6559d = i4Var;
        this.f6557b = context;
        Context applicationContext = context.getApplicationContext();
        o oVar2 = new o(this, i4Var);
        iVar.getClass();
        boolean z3 = wd.b.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z3 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        m8.b cVar = z3 ? new m8.c(applicationContext, oVar2) : new m8.k();
        this.f6562h = cVar;
        synchronized (bVar.g) {
            if (bVar.g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.g.add(this);
        }
        char[] cArr = t8.m.f34520a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar.n(this);
        } else {
            t8.m.f().post(oVar);
        }
        gVar.n(cVar);
        this.f6563i = new CopyOnWriteArrayList(bVar.f6472c.f6494e);
        o(bVar.f6472c.a());
    }

    public final m i(Class cls) {
        return new m(this.f6556a, this, cls, this.f6557b);
    }

    public final void j(q8.e eVar) {
        if (eVar == null) {
            return;
        }
        boolean zP = p(eVar);
        p8.c cVarF = eVar.f();
        if (zP) {
            return;
        }
        b bVar = this.f6556a;
        synchronized (bVar.g) {
            try {
                ArrayList arrayList = bVar.g;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    if (((p) obj).p(eVar)) {
                        return;
                    }
                }
                if (cVarF != null) {
                    eVar.a(null);
                    cVarF.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void k() {
        try {
            ArrayList arrayListE = t8.m.e(this.f6561f.f28985a);
            int size = arrayListE.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListE.get(i4);
                i4++;
                j((q8.e) obj);
            }
            this.f6561f.f28985a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final m l(Uri uri) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        m mVarI = i(Drawable.class);
        m mVarC = mVarI.C(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return mVarC;
        }
        Context context = mVarI.f6543s;
        m mVar = (m) mVarC.r(context.getTheme());
        ConcurrentHashMap concurrentHashMap = s8.b.f33507a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = s8.b.f33507a;
        x7.e eVar = (x7.e) concurrentHashMap2.get(packageName);
        if (eVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e2);
                packageInfo = null;
            }
            s8.d dVar = new s8.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            x7.e eVar2 = (x7.e) concurrentHashMap2.putIfAbsent(packageName, dVar);
            eVar = eVar2 == null ? dVar : eVar2;
        }
        return (m) mVar.p(new s8.a(context.getResources().getConfiguration().uiMode & 48, eVar));
    }

    public final synchronized void m() {
        i4 i4Var = this.f6559d;
        i4Var.f19781b = true;
        ArrayList arrayListE = t8.m.e((Set) i4Var.f19782c);
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            p8.c cVar = (p8.c) obj;
            if (cVar.isRunning()) {
                cVar.pause();
                ((HashSet) i4Var.f19783d).add(cVar);
            }
        }
    }

    public final synchronized void n() {
        i4 i4Var = this.f6559d;
        int i4 = 0;
        i4Var.f19781b = false;
        ArrayList arrayListE = t8.m.e((Set) i4Var.f19782c);
        int size = arrayListE.size();
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            p8.c cVar = (p8.c) obj;
            if (!cVar.b() && !cVar.isRunning()) {
                cVar.g();
            }
        }
        ((HashSet) i4Var.f19783d).clear();
    }

    public final synchronized void o(p8.f fVar) {
        p8.f fVar2 = (p8.f) fVar.clone();
        if (fVar2.f31464n && !fVar2.f31466p) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        fVar2.f31466p = true;
        fVar2.f31464n = true;
        this.j = fVar2;
    }

    @Override // m8.i
    public final synchronized void onDestroy() {
        this.f6561f.onDestroy();
        k();
        i4 i4Var = this.f6559d;
        ArrayList arrayListE = t8.m.e((Set) i4Var.f19782c);
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            i4Var.b((p8.c) obj);
        }
        ((HashSet) i4Var.f19783d).clear();
        this.f6558c.f(this);
        this.f6558c.f(this.f6562h);
        t8.m.f().removeCallbacks(this.g);
        this.f6556a.c(this);
    }

    @Override // m8.i
    public final synchronized void onStart() {
        n();
        this.f6561f.onStart();
    }

    @Override // m8.i
    public final synchronized void onStop() {
        this.f6561f.onStop();
        m();
    }

    public final synchronized boolean p(q8.e eVar) {
        p8.c cVarF = eVar.f();
        if (cVarF == null) {
            return true;
        }
        if (!this.f6559d.b(cVarF)) {
            return false;
        }
        this.f6561f.f28985a.remove(eVar);
        eVar.a(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6559d + ", treeNode=" + this.f6560e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
    }
}
