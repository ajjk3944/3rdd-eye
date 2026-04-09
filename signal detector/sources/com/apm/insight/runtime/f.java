package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.l.c;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f6425a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Long> f6426b;

    /* renamed from: c, reason: collision with root package name */
    private int f6427c;

    /* renamed from: d, reason: collision with root package name */
    private int f6428d;

    public f(Context context) {
        this.f6426b = null;
        this.f6427c = 50;
        this.f6428d = 100;
        this.f6425a = context;
        this.f6426b = b();
        this.f6427c = a.a(this.f6427c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f6428d = a.a(this.f6428d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> b() {
        File fileH = com.apm.insight.l.j.h(this.f6425a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayA = com.apm.insight.l.f.a(fileH.getAbsolutePath());
            if (!com.apm.insight.a.a(jSONArrayA)) {
                Long lDecode = Long.decode(jSONArrayA.optString(0, null));
                if (System.currentTimeMillis() - lDecode.longValue() > 86400000) {
                    File fileG = com.apm.insight.l.j.g(this.f6425a);
                    fileH.renameTo(new File(fileG, String.valueOf(System.currentTimeMillis())));
                    String[] list = fileG.list();
                    if (list != null && list.length > 5) {
                        Arrays.sort(list);
                        new File(fileG, list[0]).delete();
                        return map;
                    }
                } else {
                    map.put("time", lDecode);
                    for (int i = 1; i < jSONArrayA.length(); i++) {
                        String[] strArrSplit = jSONArrayA.optString(i, "").split(" ");
                        if (strArrSplit.length == 2) {
                            map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                        }
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
        }
        return map;
    }

    public final void a() throws Throwable {
        HashMap<String, Long> map = this.f6426b;
        Long lRemove = map.remove("time");
        if (lRemove == null) {
            com.apm.insight.c.a();
            j.a(new RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lRemove);
        sb.append('\n');
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(' ');
            sb.append(entry.getValue());
            sb.append('\n');
        }
        try {
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.f6425a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    public final boolean a(String str) {
        if (str == null) {
            str = "default";
        }
        return c.AnonymousClass1.a(this.f6426b, str, 1L).longValue() < ((long) this.f6427c) && c.AnonymousClass1.a(this.f6426b, "all", 1L).longValue() < ((long) this.f6428d);
    }
}
