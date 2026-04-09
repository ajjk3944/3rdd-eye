package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static Context f6087a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Application f6088b = null;

    /* renamed from: c, reason: collision with root package name */
    private static long f6089c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static String f6090d = "default";

    /* renamed from: e, reason: collision with root package name */
    private static boolean f6091e = false;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.nativecrash.b f6092f;
    private static volatile ConcurrentHashMap<Integer, String> i;

    /* renamed from: n, reason: collision with root package name */
    private static volatile String f6099n;

    /* renamed from: g, reason: collision with root package name */
    private static ConfigManager f6093g = new ConfigManager();

    /* renamed from: h, reason: collision with root package name */
    private static a f6094h = new a();

    /* renamed from: j, reason: collision with root package name */
    private static g f6095j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile String f6096k = null;

    /* renamed from: l, reason: collision with root package name */
    private static Object f6097l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static volatile int f6098m = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f6100o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f6101p = true;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f6102q = true;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f6103r = false;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f6104s = true;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f6105t = true;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f6106u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f6092f == null) {
            f6092f = g.a(f6087a);
        }
        return f6092f;
    }

    public static a b() {
        return f6094h;
    }

    public static g c() {
        if (f6095j == null) {
            synchronized (e.class) {
                f6095j = new g();
            }
        }
        return f6095j;
    }

    public static void d(boolean z6) {
        f6104s = z6;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    public static String f() {
        if (f6096k == null) {
            synchronized (f6097l) {
                try {
                    if (f6096k == null) {
                        f6096k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } finally {
                }
            }
        }
        return f6096k;
    }

    public static Context g() {
        return f6087a;
    }

    public static Application h() {
        return f6088b;
    }

    public static ConfigManager i() {
        return f6093g;
    }

    public static long j() {
        return f6089c;
    }

    public static String k() {
        return f6090d;
    }

    public static void l() {
        f6100o = 1;
    }

    public static int m() {
        return f6100o;
    }

    public static boolean n() {
        return f6091e;
    }

    public static void o() {
        f6091e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return i;
    }

    public static int q() {
        return f6098m;
    }

    public static String r() {
        return f6099n;
    }

    public static boolean s() {
        return f6101p;
    }

    public static boolean t() {
        return f6102q;
    }

    public static boolean u() {
        return f6103r;
    }

    public static boolean v() {
        return f6104s;
    }

    public static boolean w() {
        return f6106u;
    }

    public static boolean x() {
        return f6105t;
    }

    public static void b(int i3, String str) {
        f6098m = i3;
        f6099n = str;
    }

    public static boolean d() {
        if (!f6093g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z6) {
        f6106u = z6;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f6092f = bVar;
    }

    public static void b(boolean z6) {
        f6102q = z6;
    }

    public static void a(Application application) {
        if (application != null) {
            f6088b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f6088b == null) {
            f6089c = System.currentTimeMillis();
            f6087a = context;
            f6088b = application;
            f6096k = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    public static void c(boolean z6) {
        f6103r = z6;
    }

    public static void f(boolean z6) {
        f6105t = z6;
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f6092f = new com.apm.insight.nativecrash.b(f6087a, iCommonParams, a());
    }

    public static String a(long j6, CrashType crashType, boolean z6, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append(j6);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(f());
        sb.append('_');
        sb.append(z6 ? "oom_" : "normal_");
        sb.append(f6089c);
        sb.append('_');
        sb.append(z7 ? "ignore_" : "normal_");
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("G");
        return sb.toString();
    }

    public static void a(String str) {
        f6090d = str;
    }

    public static void a(int i3, String str) {
        if (i == null) {
            synchronized (e.class) {
                try {
                    if (i == null) {
                        i = new ConcurrentHashMap<>();
                    }
                } finally {
                }
            }
        }
        i.put(Integer.valueOf(i3), str);
    }

    public static void a(boolean z6) {
        f6101p = z6;
    }
}
