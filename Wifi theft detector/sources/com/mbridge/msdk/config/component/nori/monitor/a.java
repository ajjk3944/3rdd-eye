package com.mbridge.msdk.config.component.nori.monitor;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class a {
    private static boolean H = MBridgeConstans.DEBUG;
    private static final AtomicInteger I = new AtomicInteger(0);
    private static final AtomicInteger J = new AtomicInteger(0);
    private Map<String, Object> F;
    private Map<String, Integer> G;

    /* renamed from: a, reason: collision with root package name */
    private boolean f13627a;

    /* renamed from: b, reason: collision with root package name */
    private int f13628b;

    /* renamed from: c, reason: collision with root package name */
    private long f13629c;

    /* renamed from: d, reason: collision with root package name */
    private long f13630d;

    /* renamed from: e, reason: collision with root package name */
    private long f13631e;

    /* renamed from: f, reason: collision with root package name */
    private long f13632f;

    /* renamed from: g, reason: collision with root package name */
    private long f13633g;

    /* renamed from: h, reason: collision with root package name */
    private long f13634h;

    /* renamed from: i, reason: collision with root package name */
    private long f13635i;

    /* renamed from: j, reason: collision with root package name */
    private long f13636j;

    /* renamed from: k, reason: collision with root package name */
    private long f13637k;

    /* renamed from: l, reason: collision with root package name */
    private long f13638l;

    /* renamed from: m, reason: collision with root package name */
    private long f13639m = 0;

    /* renamed from: n, reason: collision with root package name */
    private long f13640n = 0;

    /* renamed from: o, reason: collision with root package name */
    private long f13641o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f13642p = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f13643q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f13644r = 0;

    /* renamed from: s, reason: collision with root package name */
    private long f13645s = 0;

    /* renamed from: t, reason: collision with root package name */
    private long f13646t = 0;

    /* renamed from: u, reason: collision with root package name */
    private long f13647u = 0;

    /* renamed from: v, reason: collision with root package name */
    private long f13648v = 0;

    /* renamed from: w, reason: collision with root package name */
    private long f13649w = 0;

    /* renamed from: x, reason: collision with root package name */
    private long f13650x = 0;

    /* renamed from: y, reason: collision with root package name */
    private long f13651y = 0;

    /* renamed from: z, reason: collision with root package name */
    private long f13652z = 0;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;

    public void a(int i10, int i11, int i12) {
        if (this.f13627a) {
            return;
        }
        HashMap map = new HashMap();
        this.G = map;
        map.put("threadPoolSize", Integer.valueOf(i10));
        this.G.put("activeThreads", Integer.valueOf(i11));
        this.G.put("queuedTasks", Integer.valueOf(i12));
    }

    public void b() {
        if (this.f13627a) {
            return;
        }
        l();
    }

    public void c() {
        if (this.f13627a) {
            return;
        }
        this.f13633g = (System.nanoTime() - this.f13643q) / 1000000;
    }

    public void d() {
    }

    public void e() {
        if (this.f13627a) {
            return;
        }
        this.f13643q = System.nanoTime();
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
        if (this.f13627a) {
            return;
        }
        this.f13632f = (System.nanoTime() - this.f13641o) / 1000000;
    }

    public void i() {
        if (this.f13627a) {
            return;
        }
        this.f13641o = System.nanoTime();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("isRetry", Boolean.valueOf(this.f13627a));
        map2.put("retryCount", Integer.valueOf(this.f13628b));
        map2.put("requestBodySize", Long.valueOf(this.f13629c));
        map2.put("responseBodySize", Long.valueOf(this.f13630d));
        map.put("basicInfo", map2);
        HashMap map3 = new HashMap();
        map3.put("totalTime", Long.valueOf(this.f13631e));
        map3.put("dnsTime", Long.valueOf(this.f13632f));
        map3.put("connectionTime", Long.valueOf(this.f13633g));
        map3.put("requestTime", Long.valueOf(this.f13634h));
        map3.put("serverTime", Long.valueOf(this.f13635i));
        map3.put("responseTime", Long.valueOf(this.f13636j));
        map3.put("queueTime", Long.valueOf(this.f13637k));
        map3.put("parsingTime", Long.valueOf(this.f13638l));
        map.put("timingInfo", map3);
        map.put("connectionInfo", this.F);
        map.put("threadPoolInfo", this.G);
        return map;
    }

    public void k() {
        if (this.f13627a) {
            return;
        }
        this.f13631e = (System.nanoTime() - this.f13639m) / 1000000;
    }

    public void l() {
        if (this.f13627a) {
            return;
        }
        this.f13637k = (System.nanoTime() - this.f13639m) / 1000000;
    }

    public void m() {
        if (this.f13627a) {
            return;
        }
        this.f13639m = System.nanoTime();
    }

    public void n() {
        if (this.f13627a) {
            return;
        }
        this.f13649w = System.nanoTime();
    }

    public void o() {
        if (this.f13627a) {
            return;
        }
        this.f13648v = System.nanoTime();
    }

    public void p() {
        if (this.f13627a) {
            return;
        }
        this.f13647u = System.nanoTime();
    }

    public void q() {
        if (this.f13627a) {
            return;
        }
        this.A = System.nanoTime();
    }

    public void r() {
        if (this.f13627a) {
            return;
        }
        this.f13652z = System.nanoTime();
    }

    public void s() {
        if (this.f13627a) {
            return;
        }
        long jNanoTime = System.nanoTime();
        this.f13651y = jNanoTime;
        this.f13635i = (jNanoTime - this.f13650x) / 1000000;
    }

    public void t() {
        if (this.f13627a) {
            return;
        }
        this.f13645s = System.nanoTime();
    }

    public void u() {
        if (this.f13627a) {
            return;
        }
        this.f13644r = System.nanoTime();
    }

    public void b(long j10) {
        if (this.f13627a) {
            return;
        }
        this.f13636j = (System.nanoTime() - this.f13651y) / 1000000;
        this.f13630d = j10;
    }

    public void a(boolean z10) {
        this.f13627a = z10;
        if (z10) {
            this.f13628b++;
        }
    }

    public void a(long j10) {
        if (this.f13627a) {
            return;
        }
        this.f13634h = (System.nanoTime() - this.f13647u) / 1000000;
        this.f13629c = j10;
    }

    public void a() {
        if (this.f13627a) {
            return;
        }
        k();
    }

    public void a(IOException iOException) {
        if (this.f13627a) {
            return;
        }
        k();
    }

    public void a(String str) {
        if (H) {
            try {
                int iH = m0.h();
                int iW = m0.w();
                HashMap map = new HashMap();
                map.put("reason", str);
                map.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                map.put("available_memory_mb", Integer.valueOf(iH));
                map.put("total_memory_mb", Integer.valueOf(iW));
                j().put("task_rejection", map);
            } catch (Exception e10) {
                q0.b("NetworkRequestMonitor", "Failed to record task rejection: " + e10.getMessage());
            }
        }
    }
}
