package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ut implements vt {

    /* renamed from: l, reason: collision with root package name */
    public static final Object f17317l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static vt f17318m;

    /* renamed from: n, reason: collision with root package name */
    public static vt f17319n;

    /* renamed from: o, reason: collision with root package name */
    public static vt f17320o;

    /* renamed from: p, reason: collision with root package name */
    public static Boolean f17321p;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17323b;

    /* renamed from: e, reason: collision with root package name */
    public final za.a f17326e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageInfo f17327f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17328h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f17330k;

    /* renamed from: a, reason: collision with root package name */
    public final Object f17322a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f17324c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f17325d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f17329i = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ut(android.content.Context r4, za.a r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f17322a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.f17324c = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r3.f17325d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r3.f17329i = r0
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto L2c
            android.content.Context r4 = r4.getApplicationContext()
        L2c:
            r3.f17323b = r4
            r3.f17326e = r5
            com.google.android.gms.internal.ads.pk r5 = com.google.android.gms.internal.ads.sk.Q8
            va.s r0 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r0 = r0.f36166c
            java.lang.Object r5 = r0.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0 = 0
            if (r5 == 0) goto L4d
            ac.k r5 = za.d.f38136b
            if (r4 == 0) goto L4d
            android.content.pm.ApplicationInfo r5 = r4.getApplicationInfo()
            if (r5 != 0) goto L4f
        L4d:
            r4 = r0
            goto L5e
        L4f:
            j1.q r5 = ub.b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r1 = 0
            android.content.pm.PackageInfo r4 = r5.e(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
        L5e:
            r3.f17327f = r4
            com.google.android.gms.internal.ads.pk r4 = com.google.android.gms.internal.ads.sk.E8
            va.s r5 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r1 = r5.f36166c
            java.lang.Object r1 = r1.a(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L7f
            ac.k r1 = za.d.f38136b
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            goto L80
        L7f:
            r1 = r2
        L80:
            r3.g = r1
            com.google.android.gms.internal.ads.rk r5 = r5.f36166c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lad
            android.content.Context r4 = r3.f17323b
            ac.k r5 = za.d.f38136b
            if (r4 != 0) goto L97
            goto Lae
        L97:
            j1.q r4 = ub.b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            java.lang.String r5 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r4.e(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            if (r4 != 0) goto La6
            goto Lae
        La6:
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            goto Lae
        Lad:
            r0 = r2
        Lae:
            r3.f17328h = r0
            com.google.android.gms.internal.ads.pk r4 = com.google.android.gms.internal.ads.sk.A8
            va.s r5 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r5 = r5.f36166c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto Lc9
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3.f17330k = r4
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut.<init>(android.content.Context, za.a):void");
    }

    public static vt a(Context context) {
        synchronized (f17317l) {
            try {
                if (f17318m == null) {
                    if (h(context)) {
                        f17318m = new ut(context, za.a.a());
                    } else {
                        f17318m = new hl(13);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f17318m;
    }

    public static vt b(Context context, za.a aVar) {
        synchronized (f17317l) {
            try {
                if (f17320o == null) {
                    boolean z3 = false;
                    if (((Boolean) nl.f14323c.u()).booleanValue()) {
                        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16419y8)).booleanValue() || ((Boolean) nl.f14321a.u()).booleanValue()) {
                            z3 = true;
                        }
                    }
                    if (h(context)) {
                        ut utVar = new ut(context, aVar);
                        utVar.i();
                        Thread.setDefaultUncaughtExceptionHandler(new tt(utVar, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f17320o = utVar;
                    } else if (!z3 || context == null) {
                        f17320o = new hl(13);
                    } else {
                        ut utVar2 = new ut(context, aVar);
                        utVar2.j = true;
                        utVar2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new tt(utVar2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f17320o = utVar2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f17320o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002b, B:14:0x0039, B:15:0x0042), top: B:20:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.vt c(android.content.Context r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.ut.f17317l
            monitor-enter(r0)
            com.google.android.gms.internal.ads.vt r1 = com.google.android.gms.internal.ads.ut.f17319n     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.pk r1 = com.google.android.gms.internal.ads.sk.f16435z8     // Catch: java.lang.Throwable -> L37
            va.s r2 = va.s.f36163e     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.rk r3 = r2.f36166c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.pk r1 = com.google.android.gms.internal.ads.sk.f16419y8     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.rk r2 = r2.f36166c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.ut r1 = new com.google.android.gms.internal.ads.ut     // Catch: java.lang.Throwable -> L37
            za.a r2 = za.a.a()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.ut.f17319n = r1     // Catch: java.lang.Throwable -> L37
            goto L42
        L37:
            r4 = move-exception
            goto L46
        L39:
            com.google.android.gms.internal.ads.hl r4 = new com.google.android.gms.internal.ads.hl     // Catch: java.lang.Throwable -> L37
            r1 = 13
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.ut.f17319n = r4     // Catch: java.lang.Throwable -> L37
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.vt r4 = com.google.android.gms.internal.ads.ut.f17319n
            return r4
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut.c(android.content.Context):com.google.android.gms.internal.ads.vt");
    }

    public static String f(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (f17317l) {
                try {
                    if (f17321p == null) {
                        f17321p = Boolean.valueOf(va.r.g.f36161e.nextInt(100) < ((Integer) va.s.f36163e.f36166c.a(sk.Xd)).intValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (f17321p.booleanValue()) {
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16419y8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vt
    public final void d(String str, Throwable th2) {
        if (this.j) {
            return;
        }
        e(th2, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.vt
    public final void e(Throwable th2, String str, float f10) {
        Throwable th3;
        boolean zF;
        String packageName;
        PackageInfo packageInfoE;
        ActivityManager.MemoryInfo memoryInfoI;
        String strD;
        Context context = this.f17323b;
        if (this.j) {
            return;
        }
        ac.k kVar = za.d.f38136b;
        if (((Boolean) dm.f10520e.u()).booleanValue()) {
            th3 = th2;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th3 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z3 = ((Boolean) va.s.f36163e.f36166c.a(sk.N2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && za.d.m(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (za.d.m(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z3 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z3) {
                    th3 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th3 != null) {
            String name = th2.getClass().getName();
            String strF = f(th2);
            String str2 = "";
            if (((Boolean) va.s.f36163e.f36166c.a(sk.W9)).booleanValue() && (strD = za.d.d(f(th2), "SHA-256")) != null) {
                str2 = strD;
            }
            double d10 = f10;
            double dRandom = Math.random();
            int i4 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zF = ub.b.a(context).f();
                } catch (Throwable th5) {
                    za.i.f("Error fetching instant app info", th5);
                    zF = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    za.i.h("Cannot obtain package name, proceeding.");
                    packageName = AppLovinMediationProvider.UNKNOWN;
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zF)).appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i10 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i10));
                String str3 = Build.MANUFACTURER;
                String strM = Build.MODEL;
                if (!strM.startsWith(str3)) {
                    strM = r5.c.m(new StringBuilder(String.valueOf(str3).length() + 1 + strM.length()), str3, " ", strM);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", strM);
                za.a aVar = this.f17326e;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", aVar.f38129a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strF);
                va.s sVar = va.s.f36163e;
                pq0 pq0Var = sVar.f36164a;
                rk rkVar = sVar.f36166c;
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", pq0Var.A())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "839961582").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i4)).appendQueryParameter("pb_tm", String.valueOf(dm.f10518c.u()));
                nb.f.f29899b.getClass();
                Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(nb.f.a(context))).appendQueryParameter("lite", true != aVar.f38133e ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter6.appendQueryParameter("hash", str2);
                }
                if (((Boolean) rkVar.a(sk.F8)).booleanValue() && (memoryInfoI = za.d.i(context)) != null) {
                    builderAppendQueryParameter6.appendQueryParameter("available_memory", Long.toString(memoryInfoI.availMem));
                    builderAppendQueryParameter6.appendQueryParameter("total_memory", Long.toString(memoryInfoI.totalMem));
                    builderAppendQueryParameter6.appendQueryParameter("is_low_memory", true != memoryInfoI.lowMemory ? "0" : "1");
                }
                if (((Boolean) rkVar.a(sk.E8)).booleanValue()) {
                    String str4 = this.g;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter6.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.f17328h;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter6.appendQueryParameter("psv", str5);
                    }
                    if (i10 >= 26) {
                        packageInfoE = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoE = null;
                    } else {
                        try {
                            packageInfoE = ub.b.a(context).e(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (packageInfoE != null) {
                        builderAppendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(packageInfoE.versionCode));
                        builderAppendQueryParameter6.appendQueryParameter("wvvn", packageInfoE.versionName);
                        builderAppendQueryParameter6.appendQueryParameter("wvpn", packageInfoE.packageName);
                    }
                }
                PackageInfo packageInfo = this.f17327f;
                if (packageInfo != null) {
                    builderAppendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter6.toString());
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    this.f17325d.execute(new q81(9, new za.l(context, null), (String) obj));
                }
            }
        }
    }

    public final void g(Throwable th2) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th2 != null) {
            boolean zM = false;
            boolean zEquals = false;
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zM |= za.d.m(stackTraceElement.getClassName());
                    zEquals |= ut.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) va.s.f36163e.f36166c.a(sk.A8)).intValue();
            if (iIntValue > 0) {
                HashSet hashSet = this.f17330k;
                if (hashSet.size() >= iIntValue) {
                    return;
                }
                String strD = za.d.d(f(th2), "SHA-256");
                if (strD == null) {
                    strD = "";
                }
                if (hashSet.contains(strD)) {
                    return;
                } else {
                    hashSet.add(strD);
                }
            }
            if (!zM || zEquals) {
                return;
            }
            if (!this.j) {
                d("", th2);
            }
            if (this.f17329i.getAndSet(true) || !((Boolean) nl.f14323c.u()).booleanValue() || (sharedPreferences = (context = this.f17323b).getSharedPreferences(AppLovinMediationProvider.ADMOB, 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", nn1.z(context, "crash_without_write") + 1).commit();
        }
    }

    public final void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f17322a) {
            this.f17324c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new tt(this, thread.getUncaughtExceptionHandler(), 1));
    }
}
