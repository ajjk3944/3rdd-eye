package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Bo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445Bo implements InterfaceC1544mk, InterfaceC0730Sk, InterfaceC0475Dk {

    /* renamed from: C, reason: collision with root package name */
    public boolean f7429C;

    /* renamed from: a, reason: collision with root package name */
    public final C0581Jo f7430a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7431b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7432c;

    /* renamed from: f, reason: collision with root package name */
    public BinderC1168fk f7435f;

    /* renamed from: g, reason: collision with root package name */
    public C2852x0 f7436g;

    /* renamed from: k, reason: collision with root package name */
    public JSONObject f7439k;

    /* renamed from: l, reason: collision with root package name */
    public JSONObject f7440l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7441m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7442n;

    /* renamed from: h, reason: collision with root package name */
    public String f7437h = "";
    public String i = "";

    /* renamed from: j, reason: collision with root package name */
    public String f7438j = "";

    /* renamed from: d, reason: collision with root package name */
    public int f7433d = 0;

    /* renamed from: e, reason: collision with root package name */
    public EnumC0428Ao f7434e = EnumC0428Ao.f7044a;

    public C0445Bo(C0581Jo c0581Jo, C0960bu c0960bu, String str) {
        this.f7430a = c0581Jo;
        this.f7432c = str;
        this.f7431b = c0960bu.f13485g;
    }

    public static JSONObject c(C2852x0 c2852x0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c2852x0.f23275c);
        jSONObject.put("errorCode", c2852x0.f23273a);
        jSONObject.put("errorDescription", c2852x0.f23274b);
        C2852x0 c2852x02 = c2852x0.f23276d;
        jSONObject.put("underlyingError", c2852x02 == null ? null : c(c2852x02));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final void D(C2852x0 c2852x0) {
        C0581Jo c0581Jo = this.f7430a;
        if (c0581Jo.g()) {
            this.f7434e = EnumC0428Ao.f7046c;
            this.f7436g = c2852x0;
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Da)).booleanValue()) {
                c0581Jo.d(this.f7431b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void E(C1807re c1807re) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Da)).booleanValue()) {
            return;
        }
        C0581Jo c0581Jo = this.f7430a;
        if (c0581Jo.g()) {
            c0581Jo.d(this.f7431b, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0475Dk
    public final void I(AbstractC1812rj abstractC1812rj) {
        C0581Jo c0581Jo = this.f7430a;
        if (c0581Jo.g()) {
            this.f7435f = abstractC1812rj.f16605f;
            this.f7434e = EnumC0428Ao.f7045b;
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Da)).booleanValue()) {
                c0581Jo.d(this.f7431b, this);
            }
        }
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f7434e);
        jSONObject.put("format", Qt.a(this.f7433d));
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Da)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f7441m);
            if (this.f7441m) {
                jSONObject.put("shown", this.f7442n);
            }
        }
        BinderC1168fk binderC1168fk = this.f7435f;
        if (binderC1168fk != null) {
            jSONObjectB = b(binderC1168fk);
        } else {
            C2852x0 c2852x0 = this.f7436g;
            JSONObject jSONObjectB2 = null;
            if (c2852x0 != null && (iBinder = c2852x0.f23277e) != null) {
                BinderC1168fk binderC1168fk2 = (BinderC1168fk) iBinder;
                jSONObjectB2 = b(binderC1168fk2);
                if (binderC1168fk2.f14128e.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.f7436g));
                    jSONObjectB2.put("errors", jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    public final JSONObject b(BinderC1168fk binderC1168fk) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", binderC1168fk.f14124a);
        jSONObject.put("responseSecsSinceEpoch", binderC1168fk.f14129f);
        jSONObject.put("responseId", binderC1168fk.f14125b);
        E9 e9 = H9.wa;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            String str = binderC1168fk.f14130g;
            if (!TextUtils.isEmpty(str)) {
                u2.k.c("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f7437h)) {
            jSONObject.put("adRequestUrl", this.f7437h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            jSONObject.put("postBody", this.i);
        }
        if (!TextUtils.isEmpty(this.f7438j)) {
            jSONObject.put("adResponseBody", this.f7438j);
        }
        Object obj = this.f7439k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f7440l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) c2841s.f23270c.a(H9.za)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f7429C);
        }
        JSONArray jSONArray = new JSONArray();
        for (q2.f1 f1Var : binderC1168fk.f14128e) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", f1Var.f23209a);
            jSONObject2.put("latencyMillis", f1Var.f23210b);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.xa)).booleanValue()) {
                jSONObject2.put("credentials", q2.r.f23260g.f23261a.k(f1Var.f23212d));
            }
            C2852x0 c2852x0 = f1Var.f23211c;
            jSONObject2.put("error", c2852x0 == null ? null : c(c2852x0));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void w(Xt xt) {
        C0581Jo c0581Jo = this.f7430a;
        if (c0581Jo.g()) {
            C1431kf c1431kf = xt.f12510b;
            List list = (List) c1431kf.f15173b;
            if (!list.isEmpty()) {
                this.f7433d = ((Qt) list.get(0)).f10759b;
            }
            St st = (St) c1431kf.f15174c;
            String str = st.f11278l;
            if (!TextUtils.isEmpty(str)) {
                this.f7437h = str;
            }
            String str2 = st.f11279m;
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            JSONObject jSONObject = st.f11282p;
            if (jSONObject.length() > 0) {
                this.f7440l = jSONObject;
            }
            E9 e9 = H9.za;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                if (c0581Jo.f9370w >= ((Long) c2841s.f23270c.a(H9.Aa)).longValue()) {
                    this.f7429C = true;
                    return;
                }
                String str3 = st.f11280n;
                if (!TextUtils.isEmpty(str3)) {
                    this.f7438j = str3;
                }
                JSONObject jSONObject2 = st.f11281o;
                if (jSONObject2.length() > 0) {
                    this.f7439k = jSONObject2;
                }
                JSONObject jSONObject3 = this.f7439k;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f7438j)) {
                    length += this.f7438j.length();
                }
                long j6 = length;
                synchronized (c0581Jo) {
                    c0581Jo.f9370w += j6;
                }
            }
        }
    }
}
