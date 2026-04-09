package com.apm.insight.f;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.c;
import com.apm.insight.k.g;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.m;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f6125a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f6126b;

    /* renamed from: c, reason: collision with root package name */
    private String f6127c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6128d;

    /* renamed from: e, reason: collision with root package name */
    private String f6129e;

    /* renamed from: f, reason: collision with root package name */
    private String f6130f;

    /* renamed from: g, reason: collision with root package name */
    private String f6131g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f6132h;

    public final JSONObject b() {
        return this.f6126b;
    }

    public final String c() {
        return this.f6127c;
    }

    public final String d() {
        return this.f6129e;
    }

    public final String e() {
        return this.f6130f;
    }

    public final String f() {
        return this.f6131g;
    }

    public final List<String> g() {
        return this.f6132h;
    }

    public static void a(final Throwable th, final String str, final String str2) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.1

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ boolean f6135c = true;

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ Map f6136d = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(null, th, str, this.f6135c, null, "EnsureNotReachHere", str2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final void b(String str) {
        this.f6127c = str;
    }

    public final void c(String str) {
        this.f6129e = str;
    }

    public final void d(String str) {
        this.f6130f = str;
    }

    public final void e(String str) {
        this.f6131g = str;
    }

    public static void a(final Object obj, final Throwable th, final String str, final String str2, final String str3) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.2

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ boolean f6141d = true;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Map f6142e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(obj, th, str, this.f6141d, null, str2, str3);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj, Throwable th, String str, boolean z6, Map<String, String> map, String str2, String str3) {
        if (th == null) {
            return;
        }
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            StackTraceElement stackTraceElement = stackTrace[0];
            if (stackTraceElement == null) {
                return;
            }
            String strA = com.apm.insight.l.m.a(th);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            c cVarA = c.a(stackTraceElement, strA, str, Thread.currentThread().getName(), z6, str2, str3);
            if (obj != null) {
                cVarA.a("exception_line_num", (Object) com.apm.insight.entity.b.a(obj, th, stackTrace));
            }
            a(null, cVarA);
            f.a().a(CrashType.ENSURE, cVarA);
            g.a(obj, cVarA);
            com.apm.insight.a.b((Object) "[reportException] ".concat(String.valueOf(str)));
        } catch (Throwable th2) {
            com.apm.insight.a.b(th2);
        }
    }

    public static void a(final StackTraceElement[] stackTraceElementArr, final String str, final String str2) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.3

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ int f6146b = 5;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Map f6149e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(stackTraceElementArr, this.f6146b, str, str2, "core_exception_monitor", (Map) null);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void a(Map<String, String> map, c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                cVar.a("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, String str3, Map map) {
        StackTraceElement stackTraceElement;
        String string;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1 && (stackTraceElement = stackTraceElementArr[i]) != null) {
                    if (stackTraceElementArr.length <= 0) {
                        string = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        while (i < stackTraceElementArr.length) {
                            com.apm.insight.l.m.a(stackTraceElementArr[i], sb);
                            i++;
                        }
                        string = sb.toString();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    c cVarA = c.a(stackTraceElement, string, str, Thread.currentThread().getName(), true, str2, str3);
                    a(null, cVarA);
                    f.a().a(CrashType.ENSURE, cVarA);
                    g.a(cVarA);
                    com.apm.insight.a.b((Object) "[report] ".concat(String.valueOf(str)));
                }
            } catch (Throwable th) {
                com.apm.insight.a.b(th);
            }
        }
    }

    public final String a() {
        return this.f6125a;
    }

    public final void a(String str) {
        this.f6125a = str;
    }

    public final void a(JSONObject jSONObject) {
        this.f6126b = jSONObject;
    }

    public final void a(boolean z6) {
        this.f6128d = z6;
    }

    public final void a(List<String> list) {
        this.f6132h = list;
    }
}
