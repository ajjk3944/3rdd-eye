package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.b.h;
import com.apm.insight.b.i;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6441a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6442b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6443c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f6444d = false;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f6445e = false;

    /* renamed from: f, reason: collision with root package name */
    private static c f6446f = new c();

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f6447g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f6448h = false;

    public static c a() {
        return f6446f;
    }

    public static boolean b() {
        return f6442b;
    }

    public static boolean c() {
        return f6443c;
    }

    public static boolean d() {
        return f6444d;
    }

    public static boolean e() {
        return f6441a;
    }

    public static void f() {
        if (!f6441a || f6442b) {
            return;
        }
        Context contextG = com.apm.insight.e.g();
        com.apm.insight.g.a aVarA = com.apm.insight.g.a.a();
        aVarA.a(new com.apm.insight.i.b(contextG));
        aVarA.b(new com.apm.insight.g.d(contextG));
    }

    public static void g() {
        if (f6441a) {
            com.apm.insight.b.f.a(com.apm.insight.e.g()).c();
            f6443c = true;
        }
    }

    public static boolean h() {
        if (f6441a && !f6444d) {
            boolean zA = NativeImpl.a(com.apm.insight.e.g());
            f6444d = zA;
            if (!zA) {
                f6445e = true;
            }
        }
        return f6444d;
    }

    public static boolean i() {
        return com.apm.insight.b.c.c();
    }

    public static void j() {
        if (f6441a) {
            com.apm.insight.b.f.a(com.apm.insight.e.g()).d();
            f6443c = false;
        }
    }

    public static void k() {
        NativeImpl.c();
    }

    public static boolean l() {
        return com.apm.insight.g.a.b() || NativeImpl.e();
    }

    public static boolean m() {
        return com.apm.insight.g.a.c() || NativeImpl.e();
    }

    public static boolean n() {
        return com.apm.insight.g.a.b();
    }

    public static boolean o() {
        return f6448h;
    }

    public static void p() {
        f6448h = true;
    }

    public static /* synthetic */ boolean r() {
        f6447g = true;
        return true;
    }

    public static synchronized void a(Context context) {
        Application applicationH;
        try {
            if (com.apm.insight.e.h() != null) {
                applicationH = com.apm.insight.e.h();
            } else if (context instanceof Application) {
                applicationH = (Application) context;
                if (applicationH.getBaseContext() == null) {
                    throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                }
            } else {
                applicationH = (Application) context.getApplicationContext();
                if (applicationH == null) {
                    throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                }
                if (applicationH.getBaseContext() != null) {
                    context = applicationH.getBaseContext();
                }
            }
            a(applicationH, context);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public static void b(String str) {
        if (com.apm.insight.e.i().isReportErrorEnable()) {
            com.apm.insight.g.a.c(str);
        }
    }

    public static void c(String str) {
        NativeImpl.b(str);
    }

    public static void d(boolean z6) {
        com.apm.insight.e.d(z6);
    }

    public static /* synthetic */ void e(boolean z6) {
        Context contextG = com.apm.insight.e.g();
        com.apm.insight.runtime.a.f.a();
        j.a();
        int iB = NativeImpl.b();
        NativeImpl.d();
        if (f6445e) {
            com.apm.insight.c.a();
            com.apm.insight.b.a.a("NativeLibraryLoad faild");
        } else if (iB < 0) {
            com.apm.insight.c.a();
            com.apm.insight.b.a.a("createCallbackThread faild");
        }
        com.apm.insight.e.a.a().a(contextG);
        com.apm.insight.c.a();
        com.apm.insight.k.h.a(contextG);
        if (z6) {
            com.apm.insight.b.f.a(contextG).c();
            f6443c = z6;
        }
        com.apm.insight.k.g.a().b();
        NativeImpl.g();
        com.apm.insight.k.j.d();
        NativeImpl.k();
        n.a("afterNpthInitAsync", "noValue");
    }

    public static void c(boolean z6) {
        com.apm.insight.e.c(z6);
    }

    public static void b(h.a aVar) {
        com.apm.insight.k.e.a(aVar);
    }

    private static boolean c(Context context) {
        try {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libapminsighta.so").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(long j6) {
        NativeImpl.b(j6);
    }

    public static void b(boolean z6) {
        com.apm.insight.e.b(z6);
    }

    private static boolean b(Context context) {
        try {
            return new File(com.apm.insight.l.j.j(context), "npth").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(ICrashCallback iCrashCallback, CrashType crashType) {
        f6446f.b(iCrashCallback, crashType);
    }

    public static void b(IOOMCallback iOOMCallback) {
        f6446f.b(iOOMCallback);
    }

    public static synchronized void a(Application application, Context context) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (f6441a) {
                return;
            }
            f6441a = true;
            if (context != null && application != null) {
                com.apm.insight.e.a(application, context);
                if (!com.apm.insight.e.u() || (!b(application) && !c(application))) {
                    com.apm.insight.g.a aVarA = com.apm.insight.g.a.a();
                    aVarA.a(new com.apm.insight.i.b(context));
                    aVarA.b(new com.apm.insight.g.d(context));
                    f6442b = true;
                    NativeImpl.a();
                    boolean zA = NativeImpl.a(context);
                    f6444d = zA;
                    if (!zA) {
                        f6445e = true;
                    }
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        f6447g = true;
                        NativeImpl.i();
                    }
                    m.a().a(new Runnable() { // from class: com.apm.insight.runtime.l.2

                        /* renamed from: a, reason: collision with root package name */
                        private /* synthetic */ boolean f6451a = true;

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (!l.f6447g) {
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.apm.insight.runtime.l.2.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        l.r();
                                        NativeImpl.i();
                                    }
                                });
                            }
                            l.e(this.f6451a);
                        }
                    }, 0L);
                    com.apm.insight.a.a((Object) ("Npth.init takes " + (SystemClock.uptimeMillis() - jUptimeMillis) + " ms."));
                    return;
                }
                Log.e("apminsight", "Inner npth checked.");
                return;
            }
            throw new IllegalArgumentException("context or Application must be not null.");
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void a(final String str, final h.a aVar) {
        m.a().a(new Runnable() { // from class: com.apm.insight.runtime.l.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                    com.apm.insight.b.d.a(str, aVar);
                }
            }
        });
    }

    public static void a(h.a aVar) {
        h.a(aVar);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str);
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, h.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, aVar);
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, h.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, map3, aVar);
    }

    @Deprecated
    public static void a(Throwable th) {
        if (com.apm.insight.e.i().isReportErrorEnable()) {
            com.apm.insight.g.a.a(th);
        }
    }

    public static void a(String str, i.a aVar, i.a aVar2) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return;
        }
        com.apm.insight.a.a.a().a(str, aVar, aVar2);
    }

    public static void a(long j6) {
        NativeImpl.a(j6);
    }

    public static void a(i.a aVar) {
        com.apm.insight.e.i().setEncryptImpl$22f2d42e(aVar);
    }

    public static void a(boolean z6) {
        com.apm.insight.e.a(z6);
    }

    public static void a(ICrashCallback iCrashCallback, CrashType crashType) {
        f6446f.a(iCrashCallback, crashType);
    }

    public static void a(IOOMCallback iOOMCallback) {
        f6446f.a(iOOMCallback);
    }
}
