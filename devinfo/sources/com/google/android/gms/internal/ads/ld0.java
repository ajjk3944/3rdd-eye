package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ld0 implements n70, w60, i60, x80 {

    /* renamed from: a, reason: collision with root package name */
    public final od0 f13460a;

    /* renamed from: b, reason: collision with root package name */
    public final ud0 f13461b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13462c;

    public ld0(od0 od0Var, ud0 ud0Var, int i4) {
        this.f13460a = od0Var;
        this.f13461b = ud0Var;
        this.f13462c = i4;
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void a(fb.o oVar) {
        String str;
        pk pkVar = sk.I7;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) rkVar2.a(sk.f16274p8)).booleanValue();
            od0 od0Var = this.f13460a;
            if (zBooleanValue) {
                od0Var.f14674a.put("sgw", String.valueOf(this.f13462c));
            }
            ud0 ud0Var = this.f13461b;
            if (oVar == null) {
                ConcurrentHashMap concurrentHashMap = od0Var.f14674a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap.put("request_id", "-1");
                ud0Var.a(concurrentHashMap, false);
                return;
            }
            iu iuVar = oVar.f23956d;
            Bundle bundle = oVar.f23957e;
            if (iuVar != null) {
                b(iuVar.f12483m, nd0.f14249d);
            } else if (bundle != null && !bundle.isEmpty()) {
                b(bundle, nd0.f14249d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(oVar.f23955c) ? oVar.f23954b : oVar.f23955c);
                ConcurrentHashMap concurrentHashMap2 = od0Var.f14674a;
                ConcurrentHashMap concurrentHashMap3 = od0Var.f14674a;
                concurrentHashMap2.put("action", "sgs");
                if (((Boolean) rkVar2.a(sk.Va)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e2) {
                        za.i.f("Error retrieving JSONObject from the requestJson, ", e2);
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap3.put("tpc", str);
                if (iuVar != null) {
                    od0Var.a(iuVar.f12473a);
                }
                od0Var.c();
                ud0Var.a(concurrentHashMap3, false);
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap4 = od0Var.f14674a;
                concurrentHashMap4.put("action", "sgf");
                concurrentHashMap4.put("sgf_reason", "request_invalid");
                ud0Var.a(concurrentHashMap4, false);
            }
        }
    }

    public final void b(Bundle bundle, x41 x41Var) {
        pk pkVar = sk.B2;
        va.s sVar = va.s.f36163e;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue() || bundle == null) {
            return;
        }
        d.h.D(ua.j.C.f35267k, bundle, "public-api-callback");
        od0 od0Var = this.f13460a;
        od0Var.getClass();
        if (((Boolean) sVar.f36166c.a(sk.Be)).booleanValue()) {
            od0Var.b("brr", true != od0Var.f14676c.f11955q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            od0Var.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = x41Var.size();
        for (int i4 = 0; i4 < size; i4++) {
            nd0 nd0Var = (nd0) x41Var.get(i4);
            long j = bundle.getLong(d7.f(nd0Var.f14252b), -1L);
            long j8 = bundle.getLong(d7.f(nd0Var.f14253c), -1L);
            if (j > 0 && j8 > 0) {
                od0Var.b(nd0Var.f14251a, String.valueOf(j8 - j));
            }
        }
        c(bundle.getBundle("client_sig_latency_key"));
        c(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16274p8)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                od0Var.b("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                od0Var.b("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.f13460a.b(str, String.valueOf(j));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        od0 od0Var = this.f13460a;
        ConcurrentHashMap concurrentHashMap = od0Var.f14674a;
        concurrentHashMap.put("action", "loaded");
        b(od0Var.f14678e, nd0.f14250e);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Sd)).booleanValue()) {
            concurrentHashMap.put("mafe", true != ii.a.s("MUTE_AUDIO") ? "0" : "1");
        }
        od0Var.c();
        this.f13461b.a(concurrentHashMap, false);
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void k(String str) {
        pk pkVar = sk.I7;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) sVar.f36166c.a(sk.f16274p8)).booleanValue();
            od0 od0Var = this.f13460a;
            if (zBooleanValue) {
                od0Var.f14674a.put("sgw", String.valueOf(this.f13462c));
            }
            od0Var.f14674a.put("action", "sgf");
            od0Var.b("sgf_reason", str);
            od0Var.c();
            this.f13461b.a(od0Var.f14674a, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void l(dq0 dq0Var) {
        od0 od0Var = this.f13460a;
        od0Var.getClass();
        aw awVar = dq0Var.f10544b;
        List list = (List) awVar.f9451b;
        if (!list.isEmpty()) {
            int i4 = ((wp0) list.get(0)).f18074b;
            od0Var.b("ad_format", wp0.a(i4));
            if (i4 == 6) {
                od0Var.f14674a.put("as", true != od0Var.f14675b.g ? "0" : "1");
            }
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.D2)).booleanValue()) {
            od0Var.b("mwl", Integer.toString(list.size()));
        }
        od0Var.b("gqi", ((yp0) awVar.f9452c).f18820b);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void o(va.w1 w1Var) {
        od0 od0Var = this.f13460a;
        od0Var.f14674a.put("action", "ftl");
        od0Var.b("ftl", String.valueOf(w1Var.f36177a));
        od0Var.b("ed", w1Var.f36179c);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.X7)).booleanValue()) {
            od0Var.b("emsg", w1Var.f36178b);
        }
        od0Var.c();
        this.f13461b.a(od0Var.f14674a, false);
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) {
        this.f13460a.a(iuVar.f12473a);
    }
}
