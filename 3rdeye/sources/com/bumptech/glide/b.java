package com.bumptech.glide;

import P2.f;
import Q2.a;
import a3.C1649c;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import b3.AbstractC1846a;
import b3.C1849d;
import b3.InterfaceC1847b;
import com.bumptech.glide.f;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
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
import m0.C5308a;
import t4.C5606d;

/* compiled from: Glide.java */
/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {
    public static volatile b i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f22236j;

    /* renamed from: b, reason: collision with root package name */
    public final O2.b f22237b;

    /* renamed from: c, reason: collision with root package name */
    public final P2.e f22238c;

    /* renamed from: d, reason: collision with root package name */
    public final e f22239d;

    /* renamed from: e, reason: collision with root package name */
    public final O2.g f22240e;

    /* renamed from: f, reason: collision with root package name */
    public final a3.m f22241f;

    /* renamed from: g, reason: collision with root package name */
    public final C1649c f22242g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f22243h = new ArrayList();

    public b(Context context, N2.m mVar, P2.e eVar, O2.b bVar, O2.g gVar, a3.m mVar2, C1649c c1649c, int i10, B7.d dVar, C5308a c5308a, List list, ArrayList arrayList, AbstractC1846a abstractC1846a, f fVar) {
        g gVar2 = g.LOW;
        this.f22237b = bVar;
        this.f22240e = gVar;
        this.f22238c = eVar;
        this.f22241f = mVar2;
        this.f22242g = c1649c;
        this.f22239d = new e(context, gVar, new W6.d(this, arrayList, abstractC1846a), new B7.d(21), dVar, c5308a, list, mVar, fVar, i10);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            }
            synchronized (b.class) {
                if (i == null) {
                    if (f22236j) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f22236j = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f22236j = false;
                    } catch (Throwable th) {
                        f22236j = false;
                        throw th;
                    }
                }
            }
        }
        return i;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        C5308a c5308a = new C5308a();
        f.a aVar = new f.a();
        B7.d dVar = new B7.d(18);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
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
                        arrayList.add(C1849d.a(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e4) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e4);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC1847b interfaceC1847b = (InterfaceC1847b) it.next();
                if (hashSet.contains(interfaceC1847b.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + interfaceC1847b);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((InterfaceC1847b) it2.next()).getClass());
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC1847b) it3.next()).b();
        }
        a.ThreadFactoryC0131a threadFactoryC0131a = new a.ThreadFactoryC0131a();
        if (Q2.a.f10920d == 0) {
            Q2.a.f10920d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i10 = Q2.a.f10920d;
        if (TextUtils.isEmpty(AdRevenueConstants.SOURCE_KEY)) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        Q2.a aVar2 = new Q2.a(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0131a, AdRevenueConstants.SOURCE_KEY, false)));
        int i11 = Q2.a.f10920d;
        a.ThreadFactoryC0131a threadFactoryC0131a2 = new a.ThreadFactoryC0131a();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        Q2.a aVar3 = new Q2.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0131a2, "disk-cache", true)));
        if (Q2.a.f10920d == 0) {
            Q2.a.f10920d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i12 = Q2.a.f10920d >= 4 ? 2 : 1;
        a.ThreadFactoryC0131a threadFactoryC0131a3 = new a.ThreadFactoryC0131a();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        Q2.a aVar4 = new Q2.a(new ThreadPoolExecutor(i12, i12, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0131a3, "animation", true)));
        P2.f fVar = new P2.f(new f.a(applicationContext));
        C1649c c1649c = new C1649c();
        int i13 = fVar.f10573a;
        O2.b hVar = i13 > 0 ? new O2.h(i13) : new O2.c();
        O2.g gVar = new O2.g(fVar.f10575c);
        P2.e eVar = new P2.e(fVar.f10574b);
        P2.d dVar2 = new P2.d();
        dVar2.f10571a = applicationContext;
        b bVar = new b(applicationContext, new N2.m(eVar, new H7.e(dVar2), aVar3, aVar2, new Q2.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, Q2.a.f10919c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.b(new a.ThreadFactoryC0131a(), "source-unlimited", false))), aVar4), eVar, hVar, gVar, new a3.m(), c1649c, 4, dVar, c5308a, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new f(aVar));
        applicationContext.registerComponentCallbacks(bVar);
        i = bVar;
    }

    public static l d(Context context) {
        C5606d.l(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f22241f.b(context);
    }

    public final void c(l lVar) {
        synchronized (this.f22243h) {
            try {
                if (!this.f22243h.contains(lVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f22243h.remove(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        h3.l.a();
        this.f22238c.e(0L);
        this.f22237b.e();
        this.f22240e.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        h3.l.a();
        synchronized (this.f22243h) {
            try {
                Iterator it = this.f22243h.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f22238c.f(i10);
        this.f22237b.d(i10);
        this.f22240e.i(i10);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
