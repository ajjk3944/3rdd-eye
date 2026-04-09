package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jv2 {
    public final ConcurrentHashMap a;
    public final id2 b;
    public final l83 c;
    public final vs1 d;
    public final Bundle e;

    public jv2(Context context, pv2 pv2Var, id2 id2Var, l83 l83Var, String str, String str2, vs1 vs1Var) {
        ActivityManager.MemoryInfo memoryInfo;
        pc4 pc4Var = l83Var.d;
        this.e = new Bundle();
        pv2Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(pv2Var.a);
        this.a = concurrentHashMap;
        this.b = id2Var;
        this.c = l83Var;
        this.d = vs1Var;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        c();
        iz1 iz1Var = mz1.m2;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(hg4.C.h.k.get()));
            if (((Boolean) kz1Var2.a(mz1.u2)).booleanValue()) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null) {
                    memoryInfo = null;
                } else {
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    try {
                        activityManager.getMemoryInfo(memoryInfo2);
                    } catch (NullPointerException unused) {
                        gi2.i0("Error retrieving the memory information.");
                    }
                    memoryInfo = memoryInfo2;
                }
                if (memoryInfo != null) {
                    b("mem_avl", String.valueOf(memoryInfo.availMem));
                    b("mem_tt", String.valueOf(memoryInfo.totalMem));
                    b("low_m", true != memoryInfo.lowMemory ? "0" : "1");
                }
            }
        }
        if (((Boolean) kz1Var2.a(mz1.w2)).booleanValue()) {
            b("ad_unit_id", l83Var.g);
        }
        if (((Boolean) kz1Var2.a(mz1.n7)).booleanValue()) {
            int iD = a30.D(l83Var) - 1;
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
            b("ragent", pc4Var.u);
            b("rtype", a30.s(a30.w(pc4Var)));
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
        this.a.put(str, str2);
    }

    public final void c() {
        if (((Boolean) tw1.e.c.a(mz1.pa)).booleanValue()) {
            rs1 rs1Var = this.d.b;
            boolean z = rs1Var instanceof gb4;
            ConcurrentHashMap concurrentHashMap = this.a;
            if (z) {
                int i = ((gb4) rs1Var).t;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                concurrentHashMap.put("asv", i2 != 0 ? "2" : "1");
                return;
            }
            if (!(rs1Var instanceof dh2)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            kh3 kh3Var = (kh3) ((tf3) ((dh2) rs1Var).g.g).b.f.get();
            int iE = (kh3Var == null ? 1 : kh3Var.e()) - 1;
            concurrentHashMap.put("asv", iE != 1 ? iE != 2 ? iE != 3 ? "uns" : "3.0" : "2.0" : "1.0");
        }
    }
}
