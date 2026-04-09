package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import b5.i0;
import b5.u0;
import b5.z;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: h, reason: collision with root package name */
    public static volatile b f6468h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f6469i;

    /* renamed from: a, reason: collision with root package name */
    public final a8.b f6470a;

    /* renamed from: b, reason: collision with root package name */
    public final b8.f f6471b;

    /* renamed from: c, reason: collision with root package name */
    public final h f6472c;

    /* renamed from: d, reason: collision with root package name */
    public final a8.g f6473d;

    /* renamed from: e, reason: collision with root package name */
    public final m8.l f6474e;

    /* renamed from: f, reason: collision with root package name */
    public final j6.i f6475f;
    public final ArrayList g = new ArrayList();

    public b(Context context, z7.k kVar, b8.f fVar, a8.b bVar, a8.g gVar, m8.l lVar, j6.i iVar, int i4, b7.h hVar, x.e eVar, List list, List list2, nh.a aVar, o7.c cVar) {
        this.f6470a = bVar;
        this.f6473d = gVar;
        this.f6471b = fVar;
        this.f6474e = lVar;
        this.f6475f = iVar;
        i0 i0Var = new i0();
        i0Var.f1821b = this;
        i0Var.f1822c = list2;
        i0Var.f1823d = aVar;
        this.f6472c = new h(context, gVar, i0Var, new i7.b(), hVar, eVar, list, kVar, cVar, i4);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f6468h == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            }
            synchronized (b.class) {
                if (f6468h == null) {
                    if (f6469i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f6469i = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f6469i = false;
                    } catch (Throwable th2) {
                        f6469i = false;
                        throw th2;
                    }
                }
            }
        }
        return f6468h;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        List list;
        g gVar = new g();
        Context applicationContext = context.getApplicationContext();
        List list2 = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || !(generatedAppGlideModule instanceof GeneratedAppGlideModuleImpl)) {
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            pd.b.o(str);
                            throw null;
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
            } catch (PackageManager.NameNotFoundException e2) {
                if (Log.isLoggable("ManifestParser", 6)) {
                    Log.e("ManifestParser", "Failed to parse glide modules", e2);
                }
            }
            list = arrayList;
        } else {
            list = list2;
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw u.o(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw u.o(it2);
            }
        }
        Iterator it3 = list.iterator();
        if (it3.hasNext()) {
            throw u.o(it3);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, gVar);
        }
        int i4 = 4;
        if (gVar.g == null) {
            c8.b bVar = new c8.b();
            if (c8.e.f2818c == 0) {
                c8.e.f2818c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i10 = c8.e.f2818c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            gVar.g = new c8.e(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new c8.c(bVar, "source", false)));
        }
        if (gVar.f6482h == null) {
            int i11 = c8.e.f2818c;
            c8.b bVar2 = new c8.b();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            gVar.f6482h = new c8.e(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new c8.c(bVar2, "disk-cache", true)));
        }
        if (gVar.f6487n == null) {
            if (c8.e.f2818c == 0) {
                c8.e.f2818c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i12 = c8.e.f2818c >= 4 ? 2 : 1;
            c8.b bVar3 = new c8.b();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            gVar.f6487n = new c8.e(new ThreadPoolExecutor(i12, i12, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new c8.c(bVar3, "animation", true)));
        }
        if (gVar.j == null) {
            b8.g gVar2 = new b8.g(applicationContext);
            androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k();
            Context context2 = gVar2.f2081a;
            float f10 = gVar2.f2084d;
            kVar.f1003d = context2;
            ActivityManager activityManager = gVar2.f2082b;
            int i13 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            kVar.f1002c = i13;
            int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) gVar2.f2083c.f31385a;
            float f11 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            int iRound2 = Math.round(f11 * f10);
            int iRound3 = Math.round(f11 * 2.0f);
            int i14 = iRound - i13;
            int i15 = iRound3 + iRound2;
            if (i15 <= i14) {
                kVar.f1001b = iRound3;
                kVar.f1000a = iRound2;
            } else {
                float f12 = i14 / (f10 + 2.0f);
                kVar.f1001b = Math.round(2.0f * f12);
                kVar.f1000a = Math.round(f12 * f10);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                sb2.append(Formatter.formatFileSize(context2, kVar.f1001b));
                sb2.append(", pool size: ");
                sb2.append(Formatter.formatFileSize(context2, kVar.f1000a));
                sb2.append(", byte array size: ");
                sb2.append(Formatter.formatFileSize(context2, i13));
                sb2.append(", memory class limited? ");
                sb2.append(i15 > iRound);
                sb2.append(", max size: ");
                sb2.append(Formatter.formatFileSize(context2, iRound));
                sb2.append(", memoryClass: ");
                sb2.append(activityManager.getMemoryClass());
                sb2.append(", isLowMemoryDevice: ");
                sb2.append(activityManager.isLowRamDevice());
                Log.d("MemorySizeCalculator", sb2.toString());
            }
            gVar.j = kVar;
        }
        if (gVar.f6484k == null) {
            gVar.f6484k = new j6.i(i4);
        }
        if (gVar.f6479d == null) {
            int i16 = gVar.j.f1000a;
            if (i16 > 0) {
                gVar.f6479d = new a8.h(i16);
            } else {
                gVar.f6479d = new ed.f(1);
            }
        }
        if (gVar.f6480e == null) {
            gVar.f6480e = new a8.g(gVar.j.f1002c);
        }
        if (gVar.f6481f == null) {
            gVar.f6481f = new b8.f(2, gVar.j.f1001b);
        }
        if (gVar.f6483i == null) {
            gVar.f6483i = new o7.d(applicationContext, 5);
        }
        if (gVar.f6478c == null) {
            gVar.f6478c = new z7.k(gVar.f6481f, gVar.f6483i, gVar.f6482h, gVar.g, new c8.e(new ThreadPoolExecutor(0, Integer.MAX_VALUE, c8.e.f2817b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new c8.c(new c8.b(), "source-unlimited", false))), gVar.f6487n);
        }
        List list3 = gVar.f6488o;
        if (list3 == null) {
            gVar.f6488o = Collections.EMPTY_LIST;
        } else {
            gVar.f6488o = DesugarCollections.unmodifiableList(list3);
        }
        jf.c cVar = gVar.f6477b;
        cVar.getClass();
        b bVar4 = new b(applicationContext, gVar.f6478c, gVar.f6481f, gVar.f6479d, gVar.f6480e, new m8.l(), gVar.f6484k, gVar.f6485l, gVar.f6486m, gVar.f6476a, gVar.f6488o, list, generatedAppGlideModule, new o7.c(cVar));
        applicationContext.registerComponentCallbacks(bVar4);
        f6468h = bVar4;
    }

    public static p d(View view) {
        View view2;
        Context context = view.getContext();
        t8.f.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m8.l lVar = a(context).f6474e;
        lVar.getClass();
        char[] cArr = t8.m.f34520a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return lVar.c(view.getContext().getApplicationContext());
        }
        t8.f.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = m8.l.a(view.getContext());
        if (activityA == null) {
            return lVar.c(view.getContext().getApplicationContext());
        }
        if (!(activityA instanceof i.g)) {
            return lVar.c(view.getContext().getApplicationContext());
        }
        i.g gVar = (i.g) activityA;
        x.e eVar = lVar.f28965b;
        eVar.clear();
        m8.l.b(gVar.s().f1879c.B(), eVar);
        View viewFindViewById = gVar.findViewById(R.id.content);
        z zVar = null;
        while (!view.equals(viewFindViewById) && (zVar = (z) eVar.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        eVar.clear();
        if (zVar == null) {
            return lVar.d(gVar);
        }
        t8.f.c(zVar.p(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return lVar.c(zVar.p().getApplicationContext());
        }
        if (zVar.n() != null) {
            lVar.f28966c.h(zVar.n());
        }
        u0 u0VarO = zVar.o();
        Context contextP = zVar.p();
        return lVar.f28967d.m(contextP, a(contextP.getApplicationContext()), zVar.Q, u0VarO, (!zVar.y() || zVar.z() || (view2 = zVar.H) == null || view2.getWindowToken() == null || zVar.H.getVisibility() != 0) ? false : true);
    }

    public final void c(p pVar) {
        synchronized (this.g) {
            try {
                if (!this.g.contains(pVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.g.remove(pVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        t8.m.a();
        this.f6471b.g(0L);
        this.f6470a.j();
        this.f6473d.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        t8.m.a();
        synchronized (this.g) {
            try {
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((p) obj).getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f6471b.k(i4);
        this.f6470a.i(i4);
        this.f6473d.j(i4);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
