package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class we0 implements i60, n70, y60 {

    /* renamed from: a, reason: collision with root package name */
    public final ff0 f17993a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17994b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17995c;

    /* renamed from: f, reason: collision with root package name */
    public c60 f17998f;
    public va.w1 g;

    /* renamed from: k, reason: collision with root package name */
    public JSONObject f18001k;

    /* renamed from: l, reason: collision with root package name */
    public JSONObject f18002l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18003m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18004n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18005o;

    /* renamed from: h, reason: collision with root package name */
    public String f17999h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f18000i = "";
    public String j = "";

    /* renamed from: d, reason: collision with root package name */
    public int f17996d = 0;

    /* renamed from: e, reason: collision with root package name */
    public ve0 f17997e = ve0.f17606a;

    public we0(ff0 ff0Var, hq0 hq0Var, String str) {
        this.f17993a = ff0Var;
        this.f17995c = str;
        this.f17994b = hq0Var.g;
    }

    public static JSONObject c(va.w1 w1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", w1Var.f36179c);
        jSONObject.put("errorCode", w1Var.f36177a);
        jSONObject.put("errorDescription", w1Var.f36178b);
        va.w1 w1Var2 = w1Var.f36180d;
        jSONObject.put("underlyingError", w1Var2 == null ? null : c(w1Var2));
        return jSONObject;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f17997e);
        jSONObject.put("format", wp0.a(this.f17996d));
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Fa)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f18003m);
            if (this.f18003m) {
                jSONObject.put("shown", this.f18004n);
            }
        }
        c60 c60Var = this.f17998f;
        if (c60Var != null) {
            jSONObjectB = b(c60Var);
        } else {
            va.w1 w1Var = this.g;
            JSONObject jSONObjectB2 = null;
            if (w1Var != null && (iBinder = w1Var.f36181e) != null) {
                c60 c60Var2 = (c60) iBinder;
                jSONObjectB2 = b(c60Var2);
                if (c60Var2.f10001e.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.g));
                    jSONObjectB2.put("errors", jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    public final JSONObject b(c60 c60Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", c60Var.f9997a);
        jSONObject.put("responseSecsSinceEpoch", c60Var.f10002f);
        jSONObject.put("responseId", c60Var.f9998b);
        pk pkVar = sk.f16421ya;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            String str = c60Var.g;
            if (!TextUtils.isEmpty(str)) {
                za.i.c("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f17999h)) {
            jSONObject.put("adRequestUrl", this.f17999h);
        }
        if (!TextUtils.isEmpty(this.f18000i)) {
            jSONObject.put("postBody", this.f18000i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put("adResponseBody", this.j);
        }
        Object obj = this.f18001k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f18002l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) sVar.f36166c.a(sk.Ba)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f18005o);
        }
        JSONArray jSONArray = new JSONArray();
        for (va.e3 e3Var : c60Var.f10001e) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", e3Var.f36083a);
            jSONObject2.put("latencyMillis", e3Var.f36084b);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16437za)).booleanValue()) {
                jSONObject2.put("credentials", va.r.g.f36157a.k(e3Var.f36086d));
            }
            va.w1 w1Var = e3Var.f36085c;
            jSONObject2.put("error", w1Var == null ? null : c(w1Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void l(dq0 dq0Var) {
        ff0 ff0Var = this.f17993a;
        if (ff0Var.g()) {
            aw awVar = dq0Var.f10544b;
            List list = (List) awVar.f9451b;
            if (!list.isEmpty()) {
                this.f17996d = ((wp0) list.get(0)).f18074b;
            }
            yp0 yp0Var = (yp0) awVar.f9452c;
            String str = yp0Var.f18828l;
            if (!TextUtils.isEmpty(str)) {
                this.f17999h = str;
            }
            String str2 = yp0Var.f18829m;
            if (!TextUtils.isEmpty(str2)) {
                this.f18000i = str2;
            }
            JSONObject jSONObject = yp0Var.f18832p;
            if (jSONObject.length() > 0) {
                this.f18002l = jSONObject;
            }
            pk pkVar = sk.Ba;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                if (ff0Var.f11149w >= ((Long) sVar.f36166c.a(sk.Ca)).longValue()) {
                    this.f18005o = true;
                    return;
                }
                String str3 = yp0Var.f18830n;
                if (!TextUtils.isEmpty(str3)) {
                    this.j = str3;
                }
                JSONObject jSONObject2 = yp0Var.f18831o;
                if (jSONObject2.length() > 0) {
                    this.f18001k = jSONObject2;
                }
                JSONObject jSONObject3 = this.f18001k;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.j)) {
                    length += this.j.length();
                }
                long j = length;
                synchronized (ff0Var) {
                    ff0Var.f11149w += j;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void o(va.w1 w1Var) {
        ff0 ff0Var = this.f17993a;
        if (ff0Var.g()) {
            this.f17997e = ve0.f17608c;
            this.g = w1Var;
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Fa)).booleanValue()) {
                ff0Var.d(this.f17994b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Fa)).booleanValue()) {
            return;
        }
        ff0 ff0Var = this.f17993a;
        if (ff0Var.g()) {
            ff0Var.d(this.f17994b, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void v(o40 o40Var) {
        ff0 ff0Var = this.f17993a;
        if (ff0Var.g()) {
            this.f17998f = o40Var.f14537f;
            this.f17997e = ve0.f17607b;
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Fa)).booleanValue()) {
                ff0Var.d(this.f17994b, this);
            }
        }
    }
}
