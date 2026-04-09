package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.l.c;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f5248a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Long> f5249b;

    /* renamed from: c, reason: collision with root package name */
    private int f5250c;

    /* renamed from: d, reason: collision with root package name */
    private int f5251d;

    public f(Context context) {
        this.f5249b = null;
        this.f5250c = 50;
        this.f5251d = 100;
        this.f5248a = context;
        this.f5249b = b();
        this.f5250c = a.a(this.f5250c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f5251d = a.a(this.f5251d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> b() {
        File fileH = com.apm.insight.l.j.h(this.f5248a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayA = com.apm.insight.l.f.a(fileH.getAbsolutePath());
            if (!com.apm.insight.a.a(jSONArrayA)) {
                Long lDecode = Long.decode(jSONArrayA.optString(0, null));
                if (System.currentTimeMillis() - lDecode.longValue() > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                    File fileG = com.apm.insight.l.j.g(this.f5248a);
                    fileH.renameTo(new File(fileG, String.valueOf(System.currentTimeMillis())));
                    String[] list = fileG.list();
                    if (list != null && list.length > 5) {
                        Arrays.sort(list);
                        new File(fileG, list[0]).delete();
                        return map;
                    }
                } else {
                    map.put("time", lDecode);
                    for (int i10 = 1; i10 < jSONArrayA.length(); i10++) {
                        String[] strArrSplit = jSONArrayA.optString(i10, "").split(" ");
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
        HashMap<String, Long> map = this.f5249b;
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
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.f5248a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    public final boolean a(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return c.AnonymousClass1.a(this.f5249b, str, 1L).longValue() < ((long) this.f5250c) && c.AnonymousClass1.a(this.f5249b, "all", 1L).longValue() < ((long) this.f5251d);
    }
}
