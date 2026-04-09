package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15043a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15044b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15045c;

    public /* synthetic */ pm0(int i4, Object obj, Object obj2) {
        this.f15043a = i4;
        this.f15044b = obj;
        this.f15045c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        switch (this.f15043a) {
            case 0:
                Bundle bundle = ((t50) obj).f16705a;
                JSONObject jSONObject = (JSONObject) this.f15044b;
                if (jSONObject != null) {
                    bundle.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f15045c;
                if (jSONObject2 != null) {
                    bundle.putString("fwd_common_cld", jSONObject2.toString());
                    break;
                }
                break;
            default:
                try {
                    JSONObject jSONObjectC = pd.b.C("pii", (JSONObject) obj);
                    jSONObjectC.put("doritos", (String) this.f15044b);
                    jSONObjectC.put("doritos_v2", (String) this.f15045c);
                    break;
                } catch (JSONException unused) {
                    ya.a0.m("Failed putting doritos string.");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        switch (this.f15043a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f15045c;
                t50 t50Var = (t50) obj;
                if (jSONObject != null) {
                    t50Var.f16706b.putString("fwd_common_cld", jSONObject.toString());
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }
}
