package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Qn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699Qn implements InterfaceC0730Sk, InterfaceC0441Bk, InterfaceC1544mk, InterfaceC0425Al {

    /* renamed from: a, reason: collision with root package name */
    public final C0750Tn f10701a;

    /* renamed from: b, reason: collision with root package name */
    public final C0852Zn f10702b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10703c;

    public C0699Qn(C0750Tn c0750Tn, C0852Zn c0852Zn, int i) {
        this.f10701a = c0750Tn;
        this.f10702b = c0852Zn;
        this.f10703c = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final void D(C2852x0 c2852x0) {
        C0750Tn c0750Tn = this.f10701a;
        c0750Tn.f11457a.put("action", "ftl");
        c0750Tn.b("ftl", String.valueOf(c2852x0.f23273a));
        c0750Tn.b("ed", c2852x0.f23275c);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.X7)).booleanValue()) {
            c0750Tn.b("emsg", c2852x0.f23274b);
        }
        c0750Tn.c();
        this.f10702b.a(c0750Tn.f11457a, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void E(C1807re c1807re) {
        this.f10701a.a(c1807re.f16576a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0425Al
    public final void a(A2.w wVar) {
        String str;
        E9 e9 = H9.I7;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) g92.a(H9.p8)).booleanValue();
            C0750Tn c0750Tn = this.f10701a;
            if (zBooleanValue) {
                c0750Tn.f11457a.put("sgw", String.valueOf(this.f10703c));
            }
            C0852Zn c0852Zn = this.f10702b;
            if (wVar == null) {
                ConcurrentHashMap concurrentHashMap = c0750Tn.f11457a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap.put("request_id", "-1");
                c0852Zn.a(concurrentHashMap, false);
                return;
            }
            C1807re c1807re = wVar.f343d;
            Bundle bundle = wVar.f344e;
            if (c1807re != null) {
                b(c1807re.f16587m, C0716Rn.f11039d);
            } else if (bundle != null && !bundle.isEmpty()) {
                b(bundle, C0716Rn.f11039d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(wVar.f342c) ? wVar.f341b : wVar.f342c);
                ConcurrentHashMap concurrentHashMap2 = c0750Tn.f11457a;
                ConcurrentHashMap concurrentHashMap3 = c0750Tn.f11457a;
                concurrentHashMap2.put("action", "sgs");
                if (((Boolean) g92.a(H9.Ta)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e6) {
                        u2.k.f("Error retrieving JSONObject from the requestJson, ", e6);
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap3.put("tpc", str);
                if (c1807re != null) {
                    c0750Tn.a(c1807re.f16576a);
                }
                c0750Tn.c();
                c0852Zn.a(concurrentHashMap3, false);
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap4 = c0750Tn.f11457a;
                concurrentHashMap4.put("action", "sgf");
                concurrentHashMap4.put("sgf_reason", "request_invalid");
                c0852Zn.a(concurrentHashMap4, false);
            }
        }
    }

    public final void b(Bundle bundle, LB lb) {
        E9 e9 = H9.f8565B2;
        C2841s c2841s = C2841s.f23267e;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue() || bundle == null) {
            return;
        }
        A.f.r(p2.j.f22785C.f22797k, bundle, "public-api-callback");
        C0750Tn c0750Tn = this.f10701a;
        c0750Tn.getClass();
        if (((Boolean) c2841s.f23270c.a(H9.ze)).booleanValue()) {
            c0750Tn.b("brr", true != c0750Tn.f11459c.f13494q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            c0750Tn.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = lb.size();
        for (int i = 0; i < size; i++) {
            C0716Rn c0716Rn = (C0716Rn) lb.get(i);
            long j6 = bundle.getLong(AbstractC1135f5.d(c0716Rn.f11042b), -1L);
            long j7 = bundle.getLong(AbstractC1135f5.d(c0716Rn.f11043c), -1L);
            if (j6 > 0 && j7 > 0) {
                c0750Tn.b(c0716Rn.f11041a, String.valueOf(j7 - j6));
            }
        }
        c(bundle.getBundle("client_sig_latency_key"));
        c(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.p8)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                c0750Tn.b("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                c0750Tn.b("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j6 = bundle.getLong(str);
            if (j6 >= 0) {
                this.f10701a.b(str, String.valueOf(j6));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() {
        C0750Tn c0750Tn = this.f10701a;
        ConcurrentHashMap concurrentHashMap = c0750Tn.f11457a;
        concurrentHashMap.put("action", "loaded");
        b(c0750Tn.f11461e, C0716Rn.f11040e);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Qd)).booleanValue()) {
            concurrentHashMap.put("mafe", true != AbstractC0241a.k("MUTE_AUDIO") ? "0" : "1");
        }
        c0750Tn.c();
        this.f10702b.a(concurrentHashMap, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void w(Xt xt) {
        C0750Tn c0750Tn = this.f10701a;
        c0750Tn.getClass();
        C1431kf c1431kf = xt.f12510b;
        List list = (List) c1431kf.f15173b;
        if (!list.isEmpty()) {
            int i = ((Qt) list.get(0)).f10759b;
            c0750Tn.b("ad_format", Qt.a(i));
            if (i == 6) {
                c0750Tn.f11457a.put("as", true != c0750Tn.f11458b.f9325g ? "0" : "1");
            }
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8578D2)).booleanValue()) {
            c0750Tn.b("mwl", Integer.toString(list.size()));
        }
        c0750Tn.b("gqi", ((St) c1431kf.f15174c).f11269b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0425Al
    public final void x(String str) {
        E9 e9 = H9.I7;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) c2841s.f23270c.a(H9.p8)).booleanValue();
            C0750Tn c0750Tn = this.f10701a;
            if (zBooleanValue) {
                c0750Tn.f11457a.put("sgw", String.valueOf(this.f10703c));
            }
            c0750Tn.f11457a.put("action", "sgf");
            c0750Tn.b("sgf_reason", str);
            c0750Tn.c();
            this.f10702b.a(c0750Tn.f11457a, false);
        }
    }
}
