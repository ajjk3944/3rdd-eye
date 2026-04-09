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
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.de, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1053de implements InterfaceC1107ee {

    /* renamed from: C, reason: collision with root package name */
    public static InterfaceC1107ee f13773C;

    /* renamed from: D, reason: collision with root package name */
    public static Boolean f13774D;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f13775l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static InterfaceC1107ee f13776m;

    /* renamed from: n, reason: collision with root package name */
    public static InterfaceC1107ee f13777n;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13779b;

    /* renamed from: e, reason: collision with root package name */
    public final C2951a f13782e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageInfo f13783f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13784g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13785h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13786j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f13787k;

    /* renamed from: a, reason: collision with root package name */
    public final Object f13778a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f13780c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f13781d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    public final AtomicBoolean i = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1053de(android.content.Context r4, u2.C2951a r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f13778a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.f13780c = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r3.f13781d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r3.i = r0
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto L2c
            android.content.Context r4 = r4.getApplicationContext()
        L2c:
            r3.f13779b = r4
            r3.f13782e = r5
            com.google.android.gms.internal.ads.E9 r5 = com.google.android.gms.internal.ads.H9.Q8
            q2.s r0 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r0 = r0.f23270c
            java.lang.Object r5 = r0.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0 = 0
            if (r5 == 0) goto L4d
            W2.e r5 = u2.f.f23795b
            if (r4 == 0) goto L4d
            android.content.pm.ApplicationInfo r5 = r4.getApplicationInfo()
            if (r5 != 0) goto L4f
        L4d:
            r4 = r0
            goto L5e
        L4f:
            J2.i r5 = R2.b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r1 = 0
            android.content.pm.PackageInfo r4 = r5.h(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
        L5e:
            r3.f13783f = r4
            com.google.android.gms.internal.ads.E9 r4 = com.google.android.gms.internal.ads.H9.E8
            q2.s r5 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r1 = r5.f23270c
            java.lang.Object r1 = r1.a(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L7f
            W2.e r1 = u2.f.f23795b
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            goto L80
        L7f:
            r1 = r2
        L80:
            r3.f13784g = r1
            com.google.android.gms.internal.ads.G9 r5 = r5.f23270c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lad
            android.content.Context r4 = r3.f13779b
            W2.e r5 = u2.f.f23795b
            if (r4 != 0) goto L97
            goto Lae
        L97:
            J2.i r4 = R2.b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            java.lang.String r5 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r4.h(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            if (r4 != 0) goto La6
            goto Lae
        La6:
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lae
            goto Lae
        Lad:
            r0 = r2
        Lae:
            r3.f13785h = r0
            com.google.android.gms.internal.ads.E9 r4 = com.google.android.gms.internal.ads.H9.A8
            q2.s r5 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r5 = r5.f23270c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto Lc9
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3.f13787k = r4
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1053de.<init>(android.content.Context, u2.a):void");
    }

    public static InterfaceC1107ee a(Context context) {
        synchronized (f13775l) {
            try {
                if (f13776m == null) {
                    if (h(context)) {
                        f13776m = new C1053de(context, C2951a.a());
                    } else {
                        f13776m = new W9(13);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13776m;
    }

    public static InterfaceC1107ee b(Context context, C2951a c2951a) {
        synchronized (f13775l) {
            try {
                if (f13773C == null) {
                    boolean z6 = false;
                    if (((Boolean) AbstractC0994ca.f13569c.v()).booleanValue()) {
                        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.y8)).booleanValue() || ((Boolean) AbstractC0994ca.f13567a.v()).booleanValue()) {
                            z6 = true;
                        }
                    }
                    if (h(context)) {
                        C1053de c1053de = new C1053de(context, c2951a);
                        c1053de.i();
                        Thread.setDefaultUncaughtExceptionHandler(new C0998ce(c1053de, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f13773C = c1053de;
                    } else if (!z6 || context == null) {
                        f13773C = new W9(13);
                    } else {
                        C1053de c1053de2 = new C1053de(context, c2951a);
                        c1053de2.f13786j = true;
                        c1053de2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new C0998ce(c1053de2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f13773C = c1053de2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13773C;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002b, B:14:0x0039, B:15:0x0042), top: B:20:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.InterfaceC1107ee c(android.content.Context r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C1053de.f13775l
            monitor-enter(r0)
            com.google.android.gms.internal.ads.ee r1 = com.google.android.gms.internal.ads.C1053de.f13777n     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.z8     // Catch: java.lang.Throwable -> L37
            q2.s r2 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.G9 r3 = r2.f23270c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.y8     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.G9 r2 = r2.f23270c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.de r1 = new com.google.android.gms.internal.ads.de     // Catch: java.lang.Throwable -> L37
            u2.a r2 = u2.C2951a.a()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C1053de.f13777n = r1     // Catch: java.lang.Throwable -> L37
            goto L42
        L37:
            r4 = move-exception
            goto L46
        L39:
            com.google.android.gms.internal.ads.W9 r4 = new com.google.android.gms.internal.ads.W9     // Catch: java.lang.Throwable -> L37
            r1 = 13
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C1053de.f13777n = r4     // Catch: java.lang.Throwable -> L37
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.ee r4 = com.google.android.gms.internal.ads.C1053de.f13777n
            return r4
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1053de.c(android.content.Context):com.google.android.gms.internal.ads.ee");
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (f13775l) {
                try {
                    if (f13774D == null) {
                        f13774D = Boolean.valueOf(q2.r.f23260g.f23265e.nextInt(100) < ((Integer) C2841s.f23267e.f23270c.a(H9.Vd)).intValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (f13774D.booleanValue()) {
                if (!((Boolean) C2841s.f23267e.f23270c.a(H9.y8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1107ee
    public final void e(String str, Throwable th) {
        if (this.f13786j) {
            return;
        }
        f(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1107ee
    public final void f(Throwable th, String str, float f2) {
        Throwable th2;
        boolean zI;
        String packageName;
        PackageInfo packageInfoH;
        ActivityManager.MemoryInfo memoryInfoI;
        String strD;
        Context context = this.f13779b;
        if (this.f13786j) {
            return;
        }
        W2.e eVar = u2.f.f23795b;
        if (((Boolean) AbstractC1857sa.f16753e.v()).booleanValue()) {
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
                boolean z6 = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8639N2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && u2.f.m(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (u2.f.m(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z6 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z6) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strD2 = d(th);
            String str2 = "";
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.U9)).booleanValue() && (strD = u2.f.d(d(th), "SHA-256")) != null) {
                str2 = strD;
            }
            double d6 = f2;
            double dRandom = Math.random();
            int i = f2 > 0.0f ? (int) (1.0f / f2) : 1;
            if (dRandom < d6) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zI = R2.b.a(context).i();
                } catch (Throwable th4) {
                    u2.k.f("Error fetching instant app info", th4);
                    zI = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    u2.k.h("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zI)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i3 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i3));
                String str3 = Build.MANUFACTURER;
                String strN = Build.MODEL;
                if (!strN.startsWith(str3)) {
                    strN = AbstractC1135f5.n(new StringBuilder(String.valueOf(str3).length() + 1 + strN.length()), str3, " ", strN);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", strN);
                C2951a c2951a = this.f13782e;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", c2951a.f23784a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strD2);
                C2841s c2841s = C2841s.f23267e;
                C1338iu c1338iu = c2841s.f23268a;
                G9 g9 = c2841s.f23270c;
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", c1338iu.C())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "839961582").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(AbstractC1857sa.f16751c.v()));
                J2.f.f2059b.getClass();
                Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(J2.f.a(context))).appendQueryParameter("lite", true != c2951a.f23788e ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter6.appendQueryParameter("hash", str2);
                }
                if (((Boolean) g9.a(H9.F8)).booleanValue() && (memoryInfoI = u2.f.i(context)) != null) {
                    builderAppendQueryParameter6.appendQueryParameter("available_memory", Long.toString(memoryInfoI.availMem));
                    builderAppendQueryParameter6.appendQueryParameter("total_memory", Long.toString(memoryInfoI.totalMem));
                    builderAppendQueryParameter6.appendQueryParameter("is_low_memory", true != memoryInfoI.lowMemory ? "0" : "1");
                }
                if (((Boolean) g9.a(H9.E8)).booleanValue()) {
                    String str4 = this.f13784g;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter6.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.f13785h;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter6.appendQueryParameter("psv", str5);
                    }
                    if (i3 >= 26) {
                        packageInfoH = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoH = null;
                    } else {
                        try {
                            packageInfoH = R2.b.a(context).h(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (packageInfoH != null) {
                        builderAppendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(packageInfoH.versionCode));
                        builderAppendQueryParameter6.appendQueryParameter("wvvn", packageInfoH.versionName);
                        builderAppendQueryParameter6.appendQueryParameter("wvpn", packageInfoH.packageName);
                    }
                }
                PackageInfo packageInfo = this.f13783f;
                if (packageInfo != null) {
                    builderAppendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter6.toString());
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    this.f13781d.execute(new CD(new u2.n(context, null), 9, (String) obj));
                }
            }
        }
    }

    public final void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean zM = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zM |= u2.f.m(stackTraceElement.getClassName());
                    zEquals |= C1053de.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) C2841s.f23267e.f23270c.a(H9.A8)).intValue();
            if (iIntValue > 0) {
                HashSet hashSet = this.f13787k;
                if (hashSet.size() >= iIntValue) {
                    return;
                }
                String strD = u2.f.d(d(th), "SHA-256");
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
            if (!this.f13786j) {
                e("", th);
            }
            if (this.i.getAndSet(true) || !((Boolean) AbstractC0994ca.f13569c.v()).booleanValue() || (sharedPreferences = (context = this.f13779b).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", AbstractC2022vd.I(context, "crash_without_write") + 1).commit();
        }
    }

    public final void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f13778a) {
            this.f13780c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C0998ce(this, thread.getUncaughtExceptionHandler(), 1));
    }
}
