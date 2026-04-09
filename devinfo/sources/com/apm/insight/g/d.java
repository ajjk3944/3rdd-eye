package com.apm.insight.g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.e;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.h;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private Context f3213a;

    public d(Context context) {
        this.f3213a = context;
    }

    @Override // com.apm.insight.g.c
    public final void a(final long j, final Thread thread, final Throwable th2, final String str, final String str2, final boolean z3) {
        final File file = new File(j.a(this.f3213a), str);
        a.a().a(file.getName());
        file.mkdirs();
        f.d(file);
        final boolean zC = m.c(th2);
        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(CrashType.JAVA, new c.a() { // from class: com.apm.insight.g.d.1

            /* renamed from: a, reason: collision with root package name */
            private long f3214a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a a(int i4, com.apm.insight.entity.a aVar) throws JSONException {
                this.f3214a = SystemClock.uptimeMillis();
                if (i4 == 0) {
                    aVar.a("data", (Object) m.a(th2));
                    aVar.a("isOOM", Boolean.valueOf(zC));
                    aVar.a("isJava", (Object) 1);
                    aVar.a("crash_time", Long.valueOf(j));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str3 = str2;
                    if (str3 != null) {
                        aVar.a("crash_md5", (Object) str3);
                        aVar.a("crash_md5", str2);
                        boolean z10 = z3;
                        if (z10) {
                            aVar.a("has_ignore", String.valueOf(z10));
                        }
                    }
                } else {
                    if (i4 == 1) {
                        Thread thread2 = thread;
                        aVar.a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                        aVar.a("tid", Integer.valueOf(Process.myTid()));
                        aVar.a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? "true" : "false");
                        aVar.a("crash_after_native", NativeImpl.e() ? "true" : "false");
                        a.a().a(thread, th2, false, aVar);
                        return aVar;
                    }
                    if (i4 == 2) {
                        if (zC) {
                            com.apm.insight.l.a.a(d.this.f3213a, aVar.c());
                        }
                        if (e.x()) {
                            JSONArray jSONArrayB = com.apm.insight.b.f.b().b();
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            JSONObject jSONObjectA = com.apm.insight.b.f.b().a(jUptimeMillis).a();
                            JSONArray jSONArrayA = com.apm.insight.b.j.a(jUptimeMillis);
                            aVar.a("history_message", (Object) jSONArrayB);
                            aVar.a("current_message", jSONObjectA);
                            aVar.a("pending_messages", (Object) jSONArrayA);
                        }
                        aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                        aVar.a("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.a()));
                        return aVar;
                    }
                    if (i4 == 3) {
                        JSONObject jSONObjectB = m.b(Thread.currentThread().getName());
                        if (jSONObjectB != null) {
                            aVar.a("all_thread_stacks", jSONObjectB);
                        }
                        aVar.a("logcat", (Object) h.a(e.f()));
                        return aVar;
                    }
                    if (i4 != 4) {
                        if (i4 == 5) {
                            aVar.a("crash_uuid", (Object) str);
                            return aVar;
                        }
                    } else if (!zC) {
                        com.apm.insight.l.a.a(d.this.f3213a, aVar.c());
                        return aVar;
                    }
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a b(int i4, com.apm.insight.entity.a aVar) {
                try {
                    f.a(new File(file, file.getName() + "." + i4), aVar.c());
                    return aVar;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return aVar;
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        try {
            aVarA.a("crash_type", "normal");
            aVarA.b("crash_cost", String.valueOf(jCurrentTimeMillis));
            aVarA.a("crash_cost", String.valueOf(jCurrentTimeMillis / 1000));
        } catch (Throwable th3) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
        }
    }
}
