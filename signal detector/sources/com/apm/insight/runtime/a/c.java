package com.apm.insight.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected CrashType f6394a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f6395b;

    /* renamed from: c, reason: collision with root package name */
    private ICommonParams f6396c = com.apm.insight.e.a().c();

    /* renamed from: d, reason: collision with root package name */
    private b f6397d;

    /* renamed from: e, reason: collision with root package name */
    private d f6398e;

    public interface a {
        com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar);

        com.apm.insight.entity.a b(int i, com.apm.insight.entity.a aVar);
    }

    public c(CrashType crashType, Context context, b bVar, d dVar) {
        this.f6394a = crashType;
        this.f6395b = context;
        this.f6397d = bVar;
        this.f6398e = dVar;
    }

    public int a() {
        return 6;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    private com.apm.insight.entity.a b(com.apm.insight.entity.a aVar) throws JSONException {
        aVar.a(com.apm.insight.e.q(), com.apm.insight.e.r());
        if (com.apm.insight.e.n()) {
            aVar.a("is_mp", (Object) 1);
        }
        try {
            aVar.a(this.f6396c.getPluginInfo());
        } catch (Throwable th) {
            try {
                HashMap map = new HashMap();
                map.put("Data fetch failed since source misstake:\n" + m.a(th), 0);
                aVar.a(map);
            } catch (Throwable unused) {
            }
        }
        aVar.b(com.apm.insight.e.p());
        com.apm.insight.e.g();
        aVar.a("process_name", com.apm.insight.l.a.b());
        return aVar;
    }

    private com.apm.insight.entity.a c(com.apm.insight.entity.a aVar) throws JSONException {
        b bVar;
        if (!com.apm.insight.l.a.b(com.apm.insight.e.g())) {
            aVar.a("remote_process", (Object) 1);
        }
        aVar.a("pid", Integer.valueOf(Process.myPid()));
        aVar.a(com.apm.insight.e.j());
        if (b() && (bVar = this.f6397d) != null) {
            aVar.a(bVar);
        }
        try {
            aVar.a(this.f6396c.getPatchInfo());
        } catch (Throwable th) {
            try {
                aVar.a(Arrays.asList("Data fetch failed since source misstake:\n" + m.a(th)));
            } catch (Throwable unused) {
            }
        }
        String strK = com.apm.insight.e.k();
        if (strK != null) {
            aVar.a("business", (Object) strK);
        }
        aVar.a("is_background", Boolean.valueOf(!com.apm.insight.l.a.a()));
        return aVar;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        return aVar;
    }

    public final com.apm.insight.entity.a a(com.apm.insight.entity.a aVar, a aVar2, boolean z6) throws JSONException {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a aVar3 = aVar;
        for (int i = 0; i < a(); i++) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.a(i, aVar3);
                } catch (Throwable unused) {
                }
            }
            try {
                aVar3 = a(i, aVar3);
            } catch (Throwable unused2) {
            }
            if (aVar2 != null) {
                try {
                    a();
                    aVar3 = aVar2.b(i, aVar3);
                } catch (Throwable unused3) {
                }
                if (z6) {
                    if (i != 0) {
                        aVar.c(aVar3.c());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new com.apm.insight.entity.a();
                }
            }
            aVar.b("step_cost_".concat(String.valueOf(i)), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return a(aVar);
    }

    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) throws JSONException {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        if (i == 0) {
            b(aVar);
            return aVar;
        }
        if (i == 1) {
            c(aVar);
            List<AttachUserData> listA = com.apm.insight.e.b().a(this.f6394a);
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = aVar.c().optJSONObject("custom");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                aVar.a("custom", jSONObjectOptJSONObject);
            }
            if (listA != null) {
                for (int i3 = 0; i3 < listA.size(); i3++) {
                    try {
                        AttachUserData attachUserData = listA.get(i3);
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject, attachUserData.getUserData(this.f6394a));
                        map.put("custom_cost_" + attachUserData.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                    } catch (Throwable th) {
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject, th);
                    }
                }
            }
            try {
                jSONObjectOptJSONObject.put("fd_count", com.apm.insight.a.f());
            } catch (Throwable unused) {
            }
            List<AttachUserData> listB = com.apm.insight.e.b().b(this.f6394a);
            if (listB != null) {
                JSONObject jSONObjectOptJSONObject2 = aVar.c().optJSONObject("custom_long");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    aVar.a("custom_long", jSONObjectOptJSONObject2);
                }
                while (i < listB.size()) {
                    try {
                        AttachUserData attachUserData2 = listB.get(i);
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, attachUserData2.getUserData(this.f6394a));
                        map.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                    } catch (Throwable th2) {
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, th2);
                    }
                    i++;
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                try {
                    jSONObjectOptJSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (Throwable unused2) {
                }
            }
        } else if (i != 2) {
            if (i == 5 && c()) {
                aVar.b(n.a());
                return aVar;
            }
        } else {
            d dVar = this.f6398e;
            aVar.a("battery", Integer.valueOf(dVar != null ? dVar.a() : 0));
            aVar.c(com.apm.insight.e.b().a());
            return aVar;
        }
        return aVar;
    }
}
