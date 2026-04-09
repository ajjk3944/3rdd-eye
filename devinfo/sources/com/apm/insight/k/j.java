package com.apm.insight.k;

import android.util.Log;
import com.apm.insight.runtime.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static File f3318a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f3319b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3320c = false;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, String> f3321d;

    public static boolean a() {
        return f3319b;
    }

    public static boolean b() {
        return f3320c;
    }

    public static void c() {
        if (f3319b) {
            return;
        }
        f3320c = true;
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.f.a(file, "\n")), false);
                f3319b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (g()) {
            a.a();
        }
    }

    public static void e() {
        m.a().a(new Runnable() { // from class: com.apm.insight.k.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.g()) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = f3321d;
        if (map != null) {
            map.clear();
        }
    }

    public static boolean g() {
        File fileH = h();
        try {
            Map<String, String> mapC = f3321d;
            if (mapC == null) {
                mapC = com.apm.insight.l.f.c(fileH);
            }
            f3321d = mapC;
            if (mapC == null) {
                f3321d = new HashMap();
                return true;
            }
            if (mapC.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!f3321d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z3 = false;
            for (Map.Entry<String, String> entry : f3321d.entrySet()) {
                try {
                    if (jCurrentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.d.d(entry.getKey())) {
                        z3 = true;
                    }
                } catch (Throwable th2) {
                    com.apm.insight.a.a(th2);
                }
            }
            if (z3) {
                com.apm.insight.a.a((Object) "config should be updated");
            } else {
                com.apm.insight.a.a((Object) "config should not be updated");
            }
            return z3;
        } catch (Throwable th3) {
            Log.e("npth", "err", th3);
            return true;
        }
    }

    private static File h() {
        if (f3318a == null) {
            f3318a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configInvalid");
        }
        return f3318a;
    }

    public static void a(JSONArray jSONArray) {
        try {
            com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.f.a(h(), f3321d);
        } catch (Throwable unused2) {
        }
    }

    public static void a(String str) {
        if (f3321d == null) {
            f3321d = new HashMap();
        }
        f3321d.put(str, String.valueOf(System.currentTimeMillis()));
    }
}
