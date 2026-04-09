package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.AppLovinUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class od0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f14674a;

    /* renamed from: b, reason: collision with root package name */
    public final bx f14675b;

    /* renamed from: c, reason: collision with root package name */
    public final hq0 f14676c;

    /* renamed from: d, reason: collision with root package name */
    public final oe f14677d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f14678e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f14679f;

    public od0(Context context, ud0 ud0Var, bx bxVar, hq0 hq0Var, String str, String str2, oe oeVar) {
        ActivityManager.MemoryInfo memoryInfoI;
        va.z2 z2Var = hq0Var.f11944d;
        this.f14678e = new Bundle();
        ud0Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(ud0Var.f17174a);
        this.f14674a = concurrentHashMap;
        this.f14675b = bxVar;
        this.f14676c = hq0Var;
        this.f14677d = oeVar;
        this.f14679f = context;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        c();
        pk pkVar = sk.B2;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(ua.j.C.f35265h.f19201k.get()));
            if (((Boolean) rkVar2.a(sk.J2)).booleanValue() && (memoryInfoI = za.d.i(context)) != null) {
                b("mem_avl", String.valueOf(memoryInfoI.availMem));
                b("mem_tt", String.valueOf(memoryInfoI.totalMem));
                b("low_m", true != memoryInfoI.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) rkVar2.a(sk.L2)).booleanValue()) {
            b(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, hq0Var.g);
        }
        if (((Boolean) rkVar2.a(sk.I7)).booleanValue()) {
            int iD = u6.t.D(hq0Var) - 1;
            if (iD == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iD == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (iD == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iD != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            b("ragent", z2Var.f36201p);
            b("rtype", u6.t.v(u6.t.x(z2Var)));
        }
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            b("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            b("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f14674a.put(str, str2);
    }

    public final void c() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Oa)).booleanValue()) {
            me meVar = this.f14677d.f14684b;
            boolean z3 = meVar instanceof ua.e;
            ConcurrentHashMap concurrentHashMap = this.f14674a;
            if (z3) {
                int i4 = ((ua.e) meVar).f35243o;
                int i10 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                concurrentHashMap.put("asv", i10 != 0 ? "2" : "1");
                return;
            }
            if (!(meVar instanceof u00)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            az0 az0Var = (az0) ((px0) ((u00) meVar).f17029b.f12502b).f15135b.f10931f.get();
            int iE = (az0Var == null ? 1 : az0Var.e()) - 1;
            concurrentHashMap.put("asv", iE != 1 ? iE != 2 ? iE != 3 ? "uns" : "3.0" : "2.0" : "1.0");
        }
    }
}
