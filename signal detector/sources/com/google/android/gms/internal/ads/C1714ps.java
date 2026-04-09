package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.ps, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1714ps implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16233a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16234b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16235c;

    public /* synthetic */ C1714ps(Object obj, int i, Object obj2) {
        this.f16233a = i;
        this.f16234b = obj;
        this.f16235c = obj2;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void b(Object obj) throws JSONException {
        switch (this.f16233a) {
            case 0:
                Bundle bundle = ((C0797Wj) obj).f12308a;
                JSONObject jSONObject = (JSONObject) this.f16234b;
                if (jSONObject != null) {
                    bundle.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f16235c;
                if (jSONObject2 != null) {
                    bundle.putString("fwd_common_cld", jSONObject2.toString());
                    break;
                }
                break;
            default:
                try {
                    JSONObject jSONObjectF = a4.p.F("pii", (JSONObject) obj);
                    jSONObjectF.put("doritos", (String) this.f16234b);
                    jSONObjectF.put("doritos_v2", (String) this.f16235c);
                    break;
                } catch (JSONException unused) {
                    AbstractC2907C.m("Failed putting doritos string.");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        switch (this.f16233a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f16235c;
                C0797Wj c0797Wj = (C0797Wj) obj;
                if (jSONObject != null) {
                    c0797Wj.f12309b.putString("fwd_common_cld", jSONObject.toString());
                    break;
                }
                break;
        }
    }
}
