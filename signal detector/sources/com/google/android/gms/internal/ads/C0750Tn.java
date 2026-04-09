package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Tn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750Tn {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f11457a;

    /* renamed from: b, reason: collision with root package name */
    public final C0572Jf f11458b;

    /* renamed from: c, reason: collision with root package name */
    public final C0960bu f11459c;

    /* renamed from: d, reason: collision with root package name */
    public final H6 f11460d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f11461e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f11462f;

    public C0750Tn(Context context, C0852Zn c0852Zn, C0572Jf c0572Jf, C0960bu c0960bu, String str, String str2, H6 h6) {
        ActivityManager.MemoryInfo memoryInfoI;
        q2.a1 a1Var = c0960bu.f13482d;
        this.f11461e = new Bundle();
        c0852Zn.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c0852Zn.f12958a);
        this.f11457a = concurrentHashMap;
        this.f11458b = c0572Jf;
        this.f11459c = c0960bu;
        this.f11460d = h6;
        this.f11462f = context;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        c();
        E9 e9 = H9.f8565B2;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(p2.j.f22785C.f22795h.f8977k.get()));
            if (((Boolean) g92.a(H9.f8617J2)).booleanValue() && (memoryInfoI = u2.f.i(context)) != null) {
                b("mem_avl", String.valueOf(memoryInfoI.availMem));
                b("mem_tt", String.valueOf(memoryInfoI.totalMem));
                b("low_m", true != memoryInfoI.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) g92.a(H9.f8629L2)).booleanValue()) {
            b("ad_unit_id", c0960bu.f13485g);
        }
        if (((Boolean) g92.a(H9.I7)).booleanValue()) {
            int iE = I5.b.E(c0960bu) - 1;
            if (iE == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iE == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (iE == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iE != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            b("ragent", a1Var.f23153D);
            b("rtype", I5.b.A(I5.b.B(a1Var)));
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
        this.f11457a.put(str, str2);
    }

    public final void c() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ma)).booleanValue()) {
            F6 f6 = this.f11460d.f8555b;
            boolean z6 = f6 instanceof p2.e;
            ConcurrentHashMap concurrentHashMap = this.f11457a;
            if (z6) {
                int i = ((p2.e) f6).f22755C;
                int i3 = i - 1;
                if (i == 0) {
                    throw null;
                }
                concurrentHashMap.put("asv", i3 != 0 ? "2" : "1");
                return;
            }
            if (!(f6 instanceof C0438Bh)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            My my = (My) ((Ux) ((C0438Bh) f6).f7390b.f14592b).f11841b.f10818f.get();
            int iE = (my == null ? 1 : my.e()) - 1;
            concurrentHashMap.put("asv", iE != 1 ? iE != 2 ? iE != 3 ? "uns" : "3.0" : "2.0" : "1.0");
        }
    }
}
