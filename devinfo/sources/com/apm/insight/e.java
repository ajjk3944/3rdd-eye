package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.applovin.sdk.AppLovinMediationProvider;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Random;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static Context f3138a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Application f3139b = null;

    /* renamed from: c, reason: collision with root package name */
    private static long f3140c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static String f3141d = "default";

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3142e = false;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.nativecrash.b f3143f;

    /* renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f3145i;

    /* renamed from: n, reason: collision with root package name */
    private static volatile String f3149n;
    private static ConfigManager g = new ConfigManager();

    /* renamed from: h, reason: collision with root package name */
    private static a f3144h = new a();
    private static g j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile String f3146k = null;

    /* renamed from: l, reason: collision with root package name */
    private static Object f3147l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static volatile int f3148m = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f3150o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f3151p = true;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f3152q = true;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f3153r = false;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f3154s = true;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f3155t = true;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f3156u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f3143f == null) {
            f3143f = g.a(f3138a);
        }
        return f3143f;
    }

    public static a b() {
        return f3144h;
    }

    public static g c() {
        if (j == null) {
            synchronized (e.class) {
                j = new g();
            }
        }
        return j;
    }

    public static void d(boolean z3) {
        f3154s = z3;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    public static String f() {
        if (f3146k == null) {
            synchronized (f3147l) {
                try {
                    if (f3146k == null) {
                        f3146k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } finally {
                }
            }
        }
        return f3146k;
    }

    public static Context g() {
        return f3138a;
    }

    public static Application h() {
        return f3139b;
    }

    public static ConfigManager i() {
        return g;
    }

    public static long j() {
        return f3140c;
    }

    public static String k() {
        return f3141d;
    }

    public static void l() {
        f3150o = 1;
    }

    public static int m() {
        return f3150o;
    }

    public static boolean n() {
        return f3142e;
    }

    public static void o() {
        f3142e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f3145i;
    }

    public static int q() {
        return f3148m;
    }

    public static String r() {
        return f3149n;
    }

    public static boolean s() {
        return f3151p;
    }

    public static boolean t() {
        return f3152q;
    }

    public static boolean u() {
        return f3153r;
    }

    public static boolean v() {
        return f3154s;
    }

    public static boolean w() {
        return f3156u;
    }

    public static boolean x() {
        return f3155t;
    }

    public static void b(int i4, String str) {
        f3148m = i4;
        f3149n = str;
    }

    public static boolean d() {
        if (!g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? AppLovinMediationProvider.UNKNOWN : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z3) {
        f3156u = z3;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f3143f = bVar;
    }

    public static void b(boolean z3) {
        f3152q = z3;
    }

    public static void a(Application application) {
        if (application != null) {
            f3139b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f3139b == null) {
            f3140c = System.currentTimeMillis();
            f3138a = context;
            f3139b = application;
            f3146k = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    public static void c(boolean z3) {
        f3153r = z3;
    }

    public static void f(boolean z3) {
        f3155t = z3;
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f3143f = new com.apm.insight.nativecrash.b(f3138a, iCommonParams, a());
    }

    public static String a(long j8, CrashType crashType, boolean z3, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j8);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z3 ? "oom_" : "normal_");
        sb2.append(f3140c);
        sb2.append('_');
        sb2.append(z10 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append("G");
        return sb2.toString();
    }

    public static void a(String str) {
        f3141d = str;
    }

    public static void a(int i4, String str) {
        if (f3145i == null) {
            synchronized (e.class) {
                try {
                    if (f3145i == null) {
                        f3145i = new ConcurrentHashMap<>();
                    }
                } finally {
                }
            }
        }
        f3145i.put(Integer.valueOf(i4), str);
    }

    public static void a(boolean z3) {
        f3151p = z3;
    }
}
