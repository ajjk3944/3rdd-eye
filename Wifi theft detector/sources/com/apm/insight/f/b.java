package com.apm.insight.f;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
    private String f4943a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f4944b;

    /* renamed from: c, reason: collision with root package name */
    private String f4945c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4946d;

    /* renamed from: e, reason: collision with root package name */
    private String f4947e;

    /* renamed from: f, reason: collision with root package name */
    private String f4948f;

    /* renamed from: g, reason: collision with root package name */
    private String f4949g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f4950h;

    public final JSONObject b() {
        return this.f4944b;
    }

    public final String c() {
        return this.f4945c;
    }

    public final String d() {
        return this.f4947e;
    }

    public final String e() {
        return this.f4948f;
    }

    public final String f() {
        return this.f4949g;
    }

    public final List<String> g() {
        return this.f4950h;
    }

    public static void a(final Throwable th, final String str, @NonNull final String str2) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.1

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ boolean f4953c = true;

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ Map f4954d = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(null, th, str, this.f4953c, null, "EnsureNotReachHere", str2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final void b(String str) {
        this.f4945c = str;
    }

    public final void c(String str) {
        this.f4947e = str;
    }

    public final void d(String str) {
        this.f4948f = str;
    }

    public final void e(String str) {
        this.f4949g = str;
    }

    public static void a(final Object obj, final Throwable th, final String str, final String str2, @NonNull final String str3) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.2

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ boolean f4959d = true;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Map f4960e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(obj, th, str, this.f4959d, null, str2, str3);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj, Throwable th, String str, boolean z10, Map<String, String> map, String str2, @NonNull String str3) {
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
            c cVarA = c.a(stackTraceElement, strA, str, Thread.currentThread().getName(), z10, str2, str3);
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

    public static void a(final StackTraceElement[] stackTraceElementArr, @Nullable final String str, final String str2) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.3

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ int f4964b = 5;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Map f4967e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(stackTraceElementArr, this.f4964b, str, str2, "core_exception_monitor", (Map) null);
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

    public static /* synthetic */ void a(StackTraceElement[] stackTraceElementArr, int i10, String str, String str2, String str3, Map map) {
        StackTraceElement stackTraceElement;
        String string;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i10 + 1 && (stackTraceElement = stackTraceElementArr[i10]) != null) {
                    if (stackTraceElementArr.length <= 0) {
                        string = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        while (i10 < stackTraceElementArr.length) {
                            com.apm.insight.l.m.a(stackTraceElementArr[i10], sb);
                            i10++;
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
        return this.f4943a;
    }

    public final void a(String str) {
        this.f4943a = str;
    }

    public final void a(JSONObject jSONObject) {
        this.f4944b = jSONObject;
    }

    public final void a(boolean z10) {
        this.f4946d = z10;
    }

    public final void a(List<String> list) {
        this.f4950h = list;
    }
}
