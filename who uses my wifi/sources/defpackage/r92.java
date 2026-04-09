package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r92 implements s92 {
    public static final Object q = new Object();
    public static s92 r;
    public static s92 s;
    public static s92 t;
    public static Boolean u;
    public final Context g;
    public final e51 j;
    public final PackageInfo k;
    public final String l;
    public final String m;
    public boolean o;
    public final HashSet p;
    public final Object f = new Object();
    public final WeakHashMap h = new WeakHashMap();
    public final ExecutorService i = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    public final AtomicBoolean n = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r92(android.content.Context r4, defpackage.e51 r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.h = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r3.i = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r3.n = r0
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto L2c
            android.content.Context r4 = r4.getApplicationContext()
        L2c:
            r3.g = r4
            r3.j = r5
            iz1 r5 = defpackage.mz1.v8
            tw1 r0 = defpackage.tw1.e
            kz1 r0 = r0.c
            java.lang.Object r5 = r0.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0 = 0
            if (r5 == 0) goto L4d
            wc1 r5 = defpackage.j63.b
            if (r4 == 0) goto L4d
            android.content.pm.ApplicationInfo r5 = r4.getApplicationInfo()
            if (r5 != 0) goto L4f
        L4d:
            r4 = r0
            goto L5e
        L4f:
            zj0 r5 = defpackage.za1.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r1 = 0
            android.content.pm.PackageInfo r4 = r5.b(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
        L5e:
            r3.k = r4
            iz1 r4 = defpackage.mz1.j8
            tw1 r5 = defpackage.tw1.e
            kz1 r1 = r5.c
            java.lang.Object r1 = r1.a(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L7f
            wc1 r1 = defpackage.j63.b
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            goto L80
        L7f:
            r1 = r2
        L80:
            r3.l = r1
            kz1 r5 = r5.c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lad
            android.content.Context r4 = r3.g
            wc1 r5 = defpackage.j63.b
            if (r4 != 0) goto L97
            goto Lae
        L97:
            zj0 r4 = defpackage.za1.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            java.lang.String r5 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r4.b(r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            if (r4 != 0) goto La6
            goto Lae
        La6:
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            goto Lae
        Lad:
            r0 = r2
        Lae:
            r3.m = r0
            iz1 r4 = defpackage.mz1.f8
            tw1 r5 = defpackage.tw1.e
            kz1 r5 = r5.c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto Lc9
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3.p = r4
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r92.<init>(android.content.Context, e51):void");
    }

    public static s92 a(Context context) {
        synchronized (q) {
            try {
                if (r == null) {
                    if (h(context)) {
                        r = new r92(context, e51.a());
                    } else {
                        r = new us0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r;
    }

    public static s92 b(Context context, e51 e51Var) {
        synchronized (q) {
            try {
                if (t == null) {
                    boolean z = false;
                    if (((Boolean) m02.c.w()).booleanValue()) {
                        if (!((Boolean) tw1.e.c.a(mz1.d8)).booleanValue() || ((Boolean) m02.a.w()).booleanValue()) {
                            z = true;
                        }
                    }
                    if (h(context)) {
                        r92 r92Var = new r92(context, e51Var);
                        r92Var.i();
                        Thread.setDefaultUncaughtExceptionHandler(new q92(r92Var, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        t = r92Var;
                    } else if (!z || context == null) {
                        t = new us0();
                    } else {
                        r92 r92Var2 = new r92(context, e51Var);
                        r92Var2.o = true;
                        r92Var2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new q92(r92Var2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        t = r92Var2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x0029, B:13:0x0037, B:14:0x003e), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.s92 c(android.content.Context r4) {
        /*
            java.lang.Object r0 = defpackage.r92.q
            monitor-enter(r0)
            s92 r1 = defpackage.r92.s     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L3e
            iz1 r1 = defpackage.mz1.e8     // Catch: java.lang.Throwable -> L35
            tw1 r2 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L35
            kz1 r3 = r2.c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L37
            iz1 r1 = defpackage.mz1.d8     // Catch: java.lang.Throwable -> L35
            kz1 r2 = r2.c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L37
            r92 r1 = new r92     // Catch: java.lang.Throwable -> L35
            e51 r2 = defpackage.e51.a()     // Catch: java.lang.Throwable -> L35
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L35
            defpackage.r92.s = r1     // Catch: java.lang.Throwable -> L35
            goto L3e
        L35:
            r4 = move-exception
            goto L42
        L37:
            us0 r4 = new us0     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            defpackage.r92.s = r4     // Catch: java.lang.Throwable -> L35
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            s92 r4 = defpackage.r92.s
            return r4
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r92.c(android.content.Context):s92");
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (q) {
                try {
                    if (u == null) {
                        u = Boolean.valueOf(sv1.f.e.nextInt(100) < ((Integer) tw1.e.c.a(mz1.yd)).intValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (u.booleanValue()) {
                if (!((Boolean) tw1.e.c.a(mz1.d8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.s92
    public final void e(String str, Throwable th) {
        if (this.o) {
            return;
        }
        g(th, str, 1.0f);
    }

    public final void f(Throwable th) throws NoSuchAlgorithmException {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean zL = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zL |= j63.l(stackTraceElement.getClassName());
                    zEquals |= r92.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) tw1.e.c.a(mz1.f8)).intValue();
            if (iIntValue > 0) {
                HashSet hashSet = this.p;
                if (hashSet.size() >= iIntValue) {
                    return;
                }
                String strD = j63.d(d(th), "SHA-256");
                if (strD == null) {
                    strD = "";
                }
                if (hashSet.contains(strD)) {
                    return;
                } else {
                    hashSet.add(strD);
                }
            }
            if (!zL || zEquals) {
                return;
            }
            if (!this.o) {
                e("", th);
            }
            if (this.n.getAndSet(true) || !((Boolean) m02.c.w()).booleanValue() || (sharedPreferences = (context = this.g).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", i41.S(context, "crash_without_write") + 1).commit();
        }
    }

    @Override // defpackage.s92
    public final void g(Throwable th, String str, float f) {
        Throwable th2;
        boolean zD;
        String packageName;
        ActivityManager activityManager;
        ActivityManager.MemoryInfo memoryInfo;
        String strD;
        Context context = this.g;
        if (this.o) {
            return;
        }
        wc1 wc1Var = j63.b;
        if (((Boolean) f12.e.w()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z = ((Boolean) tw1.e.c.a(mz1.y2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && j63.l(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (j63.l(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strD2 = d(th);
            String str2 = "";
            if (((Boolean) tw1.e.c.a(mz1.x9)).booleanValue() && (strD = j63.d(d(th), "SHA-256")) != null) {
                str2 = strD;
            }
            double d = f;
            double dRandom = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (dRandom < d) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zD = za1.a(context).d();
                } catch (Throwable th4) {
                    gi2.c0("Error fetching instant app info", th4);
                    zD = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    gi2.i0("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zD)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String strL = Build.MODEL;
                if (!strL.startsWith(str3)) {
                    strL = ex0.l(new StringBuilder(String.valueOf(str3).length() + 1 + strL.length()), str3, " ", strL);
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", strL);
                e51 e51Var = this.j;
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("js", e51Var.f).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strD2);
                tw1 tw1Var = tw1.e;
                xb4 xb4Var = tw1Var.a;
                kz1 kz1Var = tw1Var.c;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("eids", TextUtils.join(",", xb4Var.H())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "811902923").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(f12.c.w()));
                gz.b.getClass();
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(gz.a(context))).appendQueryParameter("lite", true != e51Var.j ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", str2);
                }
                if (((Boolean) kz1Var.a(mz1.k8)).booleanValue()) {
                    if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
                        memoryInfo = null;
                    } else {
                        memoryInfo = new ActivityManager.MemoryInfo();
                        try {
                            activityManager.getMemoryInfo(memoryInfo);
                        } catch (NullPointerException unused2) {
                            gi2.i0("Error retrieving the memory information.");
                        }
                    }
                    if (memoryInfo != null) {
                        builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfo.availMem));
                        builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfo.totalMem));
                        builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfo.lowMemory ? "0" : "1");
                    }
                }
                if (((Boolean) kz1Var.a(mz1.j8)).booleanValue()) {
                    String str4 = this.l;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.m;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", str5);
                    }
                    PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                    if (currentWebViewPackage != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(currentWebViewPackage.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", currentWebViewPackage.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", currentWebViewPackage.packageName);
                    }
                }
                PackageInfo packageInfo = this.k;
                if (packageInfo != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    this.i.execute(new n62(new ug4(context, null), (String) obj, 3));
                }
            }
        }
    }

    public final void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f) {
            this.h.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new q92(this, thread.getUncaughtExceptionHandler(), 1));
    }
}
