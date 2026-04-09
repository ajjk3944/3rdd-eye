package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tl0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16877a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f16878b;

    public /* synthetic */ tl0(int i4, Bundle bundle) {
        this.f16877a = i4;
        this.f16878b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) throws JSONException {
        switch (this.f16877a) {
            case 0:
                t50 t50Var = (t50) obj;
                Bundle bundle = this.f16878b;
                if (!bundle.isEmpty()) {
                    t50Var.f16705a.putBundle("installed_adapter_data", bundle);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((t50) obj).f16705a;
                Bundle bundleA = mq0.a(bundle2, "device");
                bundleA.putBundle("android_mem_info", this.f16878b);
                bundle2.putBundle("device", bundleA);
                break;
            case 2:
                t50 t50Var2 = (t50) obj;
                Bundle bundle3 = this.f16878b;
                if (bundle3 != null) {
                    t50Var2.f16705a.putAll(bundle3);
                    break;
                }
                break;
            case 3:
                t50 t50Var3 = (t50) obj;
                Bundle bundle4 = this.f16878b;
                if (!bundle4.isEmpty()) {
                    t50Var3.f16705a.putBundle("shared_pref", bundle4);
                    break;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle5 = this.f16878b;
                if (bundle5 != null) {
                    try {
                        pd.b.C("play_store", pd.b.C("device", jSONObject)).put("parental_controls", va.r.g.f36157a.k(bundle5));
                        break;
                    } catch (JSONException unused) {
                        ya.a0.m("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        switch (this.f16877a) {
            case 2:
                t50 t50Var = (t50) obj;
                Bundle bundle = this.f16878b;
                if (bundle != null) {
                    t50Var.f16706b.putAll(bundle);
                    break;
                }
                break;
            case 3:
                t50 t50Var2 = (t50) obj;
                Bundle bundle2 = this.f16878b;
                if (!bundle2.isEmpty()) {
                    t50Var2.f16706b.putBundle("shared_pref", bundle2);
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void d(Object obj) {
    }
}
