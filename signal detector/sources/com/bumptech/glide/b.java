package com.bumptech.glide;

import A1.w;
import A2.C0117e;
import G3.C0152f;
import H1.p;
import a.AbstractC0241a;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import b4.C0344i;
import com.google.android.gms.internal.ads.C0752Tp;
import com.google.android.gms.internal.ads.C1506m;
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
import o1.C2758f;
import o1.InterfaceC2753a;
import u.C2936e;

/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: h, reason: collision with root package name */
    public static volatile b f6483h;
    public static volatile boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2753a f6484a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.c f6485b;

    /* renamed from: c, reason: collision with root package name */
    public final f f6486c;

    /* renamed from: d, reason: collision with root package name */
    public final C0752Tp f6487d;

    /* renamed from: e, reason: collision with root package name */
    public final A1.m f6488e;

    /* renamed from: f, reason: collision with root package name */
    public final C0152f f6489f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6490g = new ArrayList();

    public b(Context context, n1.l lVar, p1.c cVar, InterfaceC2753a interfaceC2753a, C0752Tp c0752Tp, A1.m mVar, C0152f c0152f, C0344i c0344i, C2936e c2936e, List list, ArrayList arrayList, T2.g gVar, C0117e c0117e) {
        this.f6484a = interfaceC2753a;
        this.f6487d = c0752Tp;
        this.f6485b = cVar;
        this.f6488e = mVar;
        this.f6489f = c0152f;
        this.f6486c = new f(context, c0752Tp, new w(this, arrayList, gVar), new C0152f(13), c0344i, c2936e, list, lVar, c0117e);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f6483h == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            }
            synchronized (b.class) {
                if (f6483h == null) {
                    if (i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    i = true;
                    try {
                        b(context, generatedAppGlideModule);
                        i = false;
                    } catch (Throwable th) {
                        i = false;
                        throw th;
                    }
                }
            }
        }
        return f6483h;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        q1.d dVar;
        C2936e c2936e = new C2936e(0);
        g gVar = new g(0);
        C0344i c0344i = new C0344i(3);
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
                        AbstractC0241a.l(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e6) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e6);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw A.f.f(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw A.f.f(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw A.f.f(it3);
        }
        q1.a aVar = new q1.a();
        if (q1.d.f23087c == 0) {
            q1.d.f23087c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i3 = q1.d.f23087c;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        q1.d dVar2 = new q1.d(new ThreadPoolExecutor(i3, i3, 0L, timeUnit, new PriorityBlockingQueue(), new q1.b(aVar, "source", false)));
        q1.a aVar2 = new q1.a();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        q1.d dVar3 = new q1.d(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new q1.b(aVar2, "disk-cache", true)));
        if (q1.d.f23087c == 0) {
            q1.d.f23087c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i6 = q1.d.f23087c >= 4 ? 2 : 1;
        q1.a aVar3 = new q1.a();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        q1.d dVar4 = new q1.d(new ThreadPoolExecutor(i6, i6, 0L, timeUnit, new PriorityBlockingQueue(), new q1.b(aVar3, "animation", true)));
        p1.d dVar5 = new p1.d(applicationContext);
        C1506m c1506m = new C1506m();
        Context context2 = dVar5.f22739a;
        float f2 = dVar5.f22742d;
        c1506m.f15505d = context2;
        ActivityManager activityManager = dVar5.f22740b;
        int i7 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c1506m.f15504c = i7;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) dVar5.f22741c.f20472a;
        float f5 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f5 * f2);
        int iRound3 = Math.round(f5 * 2.0f);
        int i8 = iRound - i7;
        int i9 = iRound3 + iRound2;
        if (i9 <= i8) {
            c1506m.f15503b = iRound3;
            c1506m.f15502a = iRound2;
        } else {
            float f6 = i8 / (f2 + 2.0f);
            c1506m.f15503b = Math.round(2.0f * f6);
            c1506m.f15502a = Math.round(f6 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            dVar = dVar4;
            sb.append(Formatter.formatFileSize(context2, c1506m.f15503b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context2, c1506m.f15502a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context2, i7));
            sb.append(", memory class limited? ");
            sb.append(i9 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context2, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        } else {
            dVar = dVar4;
        }
        C0152f c0152f = new C0152f(7);
        int i10 = c1506m.f15502a;
        InterfaceC2753a c2758f = i10 > 0 ? new C2758f(i10) : new C0344i(26);
        C0752Tp c0752Tp = new C0752Tp(c1506m.f15504c);
        p1.c cVar = new p1.c(0, c1506m.f15503b);
        b bVar = new b(applicationContext, new n1.l(cVar, new d4.h(applicationContext), dVar3, dVar2, new q1.d(new ThreadPoolExecutor(0, Integer.MAX_VALUE, q1.d.f23086b, timeUnit, new SynchronousQueue(), new q1.b(new q1.a(), "source-unlimited", false))), dVar), cVar, c2758f, c0752Tp, new A1.m(), c0152f, c0344i, c2936e, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C0117e(gVar));
        applicationContext.registerComponentCallbacks(bVar);
        f6483h = bVar;
    }

    public final void c(n nVar) {
        synchronized (this.f6490g) {
            try {
                if (!this.f6490g.contains(nVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f6490g.remove(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        p.a();
        this.f6485b.e(0L);
        this.f6484a.o();
        this.f6487d.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        p.a();
        synchronized (this.f6490g) {
            try {
                ArrayList arrayList = this.f6490g;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((n) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6485b.i(i3);
        this.f6484a.n(i3);
        this.f6487d.j(i3);
    }
}
