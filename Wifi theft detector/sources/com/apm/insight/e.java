package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static Context f4904a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Application f4905b = null;

    /* renamed from: c, reason: collision with root package name */
    private static long f4906c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static String f4907d = "default";

    /* renamed from: e, reason: collision with root package name */
    private static boolean f4908e = false;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.nativecrash.b f4909f;

    /* renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f4912i;

    /* renamed from: n, reason: collision with root package name */
    private static volatile String f4917n;

    /* renamed from: g, reason: collision with root package name */
    private static ConfigManager f4910g = new ConfigManager();

    /* renamed from: h, reason: collision with root package name */
    private static a f4911h = new a();

    /* renamed from: j, reason: collision with root package name */
    private static g f4913j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile String f4914k = null;

    /* renamed from: l, reason: collision with root package name */
    private static Object f4915l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static volatile int f4916m = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f4918o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f4919p = true;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f4920q = true;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f4921r = false;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f4922s = true;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f4923t = true;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f4924u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f4909f == null) {
            f4909f = g.a(f4904a);
        }
        return f4909f;
    }

    public static a b() {
        return f4911h;
    }

    public static g c() {
        if (f4913j == null) {
            synchronized (e.class) {
                f4913j = new g();
            }
        }
        return f4913j;
    }

    public static void d(boolean z10) {
        f4922s = z10;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f4914k == null) {
            synchronized (f4915l) {
                try {
                    if (f4914k == null) {
                        f4914k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } finally {
                }
            }
        }
        return f4914k;
    }

    public static Context g() {
        return f4904a;
    }

    public static Application h() {
        return f4905b;
    }

    public static ConfigManager i() {
        return f4910g;
    }

    public static long j() {
        return f4906c;
    }

    public static String k() {
        return f4907d;
    }

    public static void l() {
        f4918o = 1;
    }

    public static int m() {
        return f4918o;
    }

    public static boolean n() {
        return f4908e;
    }

    public static void o() {
        f4908e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f4912i;
    }

    public static int q() {
        return f4916m;
    }

    public static String r() {
        return f4917n;
    }

    public static boolean s() {
        return f4919p;
    }

    public static boolean t() {
        return f4920q;
    }

    public static boolean u() {
        return f4921r;
    }

    public static boolean v() {
        return f4922s;
    }

    public static boolean w() {
        return f4924u;
    }

    public static boolean x() {
        return f4923t;
    }

    public static void b(int i10, String str) {
        f4916m = i10;
        f4917n = str;
    }

    public static boolean d() {
        if (!f4910g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z10) {
        f4924u = z10;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f4909f = bVar;
    }

    public static void b(boolean z10) {
        f4920q = z10;
    }

    public static void a(Application application) {
        if (application != null) {
            f4905b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f4905b == null) {
            f4906c = System.currentTimeMillis();
            f4904a = context;
            f4905b = application;
            f4914k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void c(boolean z10) {
        f4921r = z10;
    }

    public static void f(boolean z10) {
        f4923t = z10;
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f4909f = new com.apm.insight.nativecrash.b(f4904a, iCommonParams, a());
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        sb.append(j10);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(f());
        sb.append('_');
        sb.append(z10 ? "oom_" : "normal_");
        sb.append(f4906c);
        sb.append('_');
        sb.append(z11 ? "ignore_" : "normal_");
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb.toString();
    }

    public static void a(String str) {
        f4907d = str;
    }

    public static void a(int i10, String str) {
        if (f4912i == null) {
            synchronized (e.class) {
                try {
                    if (f4912i == null) {
                        f4912i = new ConcurrentHashMap<>();
                    }
                } finally {
                }
            }
        }
        f4912i.put(Integer.valueOf(i10), str);
    }

    public static void a(boolean z10) {
        f4919p = z10;
    }
}
