package com.apm.insight.k;

import android.util.Log;
import com.apm.insight.runtime.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static File f6276a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6277b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6278c = false;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, String> f6279d;

    public static boolean a() {
        return f6277b;
    }

    public static boolean b() {
        return f6278c;
    }

    public static void c() {
        if (f6277b) {
            return;
        }
        f6278c = true;
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.f.a(file, "\n")), false);
                f6277b = true;
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
        Map<String, String> map = f6279d;
        if (map != null) {
            map.clear();
        }
    }

    public static boolean g() {
        File fileH = h();
        try {
            Map<String, String> mapC = f6279d;
            if (mapC == null) {
                mapC = com.apm.insight.l.f.c(fileH);
            }
            f6279d = mapC;
            if (mapC == null) {
                f6279d = new HashMap();
                return true;
            }
            if (mapC.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!f6279d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z6 = false;
            for (Map.Entry<String, String> entry : f6279d.entrySet()) {
                try {
                    if (jCurrentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.d.d(entry.getKey())) {
                        z6 = true;
                    }
                } catch (Throwable th) {
                    com.apm.insight.a.a(th);
                }
            }
            if (z6) {
                com.apm.insight.a.a((Object) "config should be updated");
            } else {
                com.apm.insight.a.a((Object) "config should not be updated");
            }
            return z6;
        } catch (Throwable th2) {
            Log.e("npth", "err", th2);
            return true;
        }
    }

    private static File h() {
        if (f6276a == null) {
            f6276a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configInvalid");
        }
        return f6276a;
    }

    public static void a(JSONArray jSONArray) {
        try {
            com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.f.a(h(), f6279d);
        } catch (Throwable unused2) {
        }
    }

    public static void a(String str) {
        if (f6279d == null) {
            f6279d = new HashMap();
        }
        f6279d.put(str, String.valueOf(System.currentTimeMillis()));
    }
}
