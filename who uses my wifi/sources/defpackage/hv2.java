package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hv2 implements jo2, rn2, wm2, dq2 {
    public final jv2 f;
    public final pv2 g;
    public final int h;

    public hv2(jv2 jv2Var, pv2 pv2Var, int i) {
        this.f = jv2Var;
        this.g = pv2Var;
        this.h = i;
    }

    @Override // defpackage.jo2
    public final void B(h83 h83Var) {
        jv2 jv2Var = this.f;
        jv2Var.getClass();
        p21 p21Var = h83Var.b;
        List list = (List) p21Var.f;
        if (!list.isEmpty()) {
            int i = ((a83) list.get(0)).b;
            jv2Var.b("ad_format", a83.a(i));
            if (i == 6) {
                jv2Var.a.put("as", true != jv2Var.b.l ? "0" : "1");
            }
        }
        if (((Boolean) tw1.e.c.a(mz1.o2)).booleanValue()) {
            jv2Var.b("mwl", Integer.toString(list.size()));
        }
        jv2Var.b("gqi", ((c83) p21Var.g).b);
    }

    @Override // defpackage.dq2
    public final void G(String str) {
        iz1 iz1Var = mz1.n7;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) tw1Var.c.a(mz1.U7)).booleanValue();
            jv2 jv2Var = this.f;
            if (zBooleanValue) {
                jv2Var.a.put("sgw", String.valueOf(this.h));
            }
            jv2Var.a.put("action", "sgf");
            jv2Var.b("sgf_reason", str);
            jv2Var.c();
            this.g.a(jv2Var.a, false);
        }
    }

    @Override // defpackage.jo2
    public final void G0(fa2 fa2Var) {
        this.f.a(fa2Var.f);
    }

    @Override // defpackage.dq2
    public final void a(l22 l22Var) {
        String str;
        iz1 iz1Var = mz1.n7;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) kz1Var2.a(mz1.U7)).booleanValue();
            jv2 jv2Var = this.f;
            if (zBooleanValue) {
                jv2Var.a.put("sgw", String.valueOf(this.h));
            }
            pv2 pv2Var = this.g;
            if (l22Var == null) {
                ConcurrentHashMap concurrentHashMap = jv2Var.a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap.put("request_id", "-1");
                pv2Var.a(concurrentHashMap, false);
                return;
            }
            fa2 fa2Var = l22Var.d;
            Bundle bundle = l22Var.e;
            if (fa2Var != null) {
                b(fa2Var.r, iv2.d);
            } else if (bundle != null && !bundle.isEmpty()) {
                b(bundle, iv2.d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(l22Var.c) ? l22Var.b : l22Var.c);
                ConcurrentHashMap concurrentHashMap2 = jv2Var.a;
                ConcurrentHashMap concurrentHashMap3 = jv2Var.a;
                concurrentHashMap2.put("action", "sgs");
                if (((Boolean) kz1Var2.a(mz1.wa)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        gi2.c0("Error retrieving JSONObject from the requestJson, ", e);
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap3.put("tpc", str);
                if (fa2Var != null) {
                    jv2Var.a(fa2Var.f);
                }
                jv2Var.c();
                pv2Var.a(concurrentHashMap3, false);
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap4 = jv2Var.a;
                concurrentHashMap4.put("action", "sgf");
                concurrentHashMap4.put("sgf_reason", "request_invalid");
                pv2Var.a(concurrentHashMap4, false);
            }
        }
    }

    public final void b(Bundle bundle, xm3 xm3Var) {
        iz1 iz1Var = mz1.m2;
        tw1 tw1Var = tw1.e;
        if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue() || bundle == null) {
            return;
        }
        ga1.n(hg4.C.k, bundle, "public-api-callback");
        jv2 jv2Var = this.f;
        jv2Var.getClass();
        if (((Boolean) tw1Var.c.a(mz1.ce)).booleanValue()) {
            jv2Var.b("brr", true != jv2Var.c.q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            jv2Var.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = xm3Var.size();
        for (int i = 0; i < size; i++) {
            iv2 iv2Var = (iv2) xm3Var.get(i);
            long j = bundle.getLong(ga1.b(iv2Var.b), -1L);
            long j2 = bundle.getLong(ga1.b(iv2Var.c), -1L);
            if (j > 0 && j2 > 0) {
                jv2Var.b(iv2Var.a, String.valueOf(j2 - j));
            }
        }
        c(bundle.getBundle("client_sig_latency_key"));
        c(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) tw1.e.c.a(mz1.U7)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                jv2Var.b("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                jv2Var.b("cmr", String.valueOf(bundle.getInt("cmr")));
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
                this.f.b(str, String.valueOf(j));
            }
        }
    }

    @Override // defpackage.wm2
    public final void d0(nx2 nx2Var) {
        jv2 jv2Var = this.f;
        jv2Var.a.put("action", "ftl");
        jv2Var.b("ftl", String.valueOf(nx2Var.f));
        jv2Var.b("ed", nx2Var.h);
        if (((Boolean) tw1.e.c.a(mz1.C7)).booleanValue()) {
            jv2Var.b("emsg", nx2Var.g);
        }
        jv2Var.c();
        this.g.a(jv2Var.a, false);
    }

    @Override // defpackage.rn2
    public final void e() {
        jv2 jv2Var = this.f;
        ConcurrentHashMap concurrentHashMap = jv2Var.a;
        concurrentHashMap.put("action", "loaded");
        b(jv2Var.e, iv2.e);
        if (((Boolean) tw1.e.c.a(mz1.td)).booleanValue()) {
            concurrentHashMap.put("mafe", true != ob1.n("MUTE_AUDIO") ? "0" : "1");
        }
        jv2Var.c();
        this.g.a(concurrentHashMap, false);
    }
}
