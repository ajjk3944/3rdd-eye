package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import t2.AbstractC2907C;

/* loaded from: classes.dex */
public final class Ur implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11802a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f11803b;

    public /* synthetic */ Ur(int i, Bundle bundle) {
        this.f11802a = i;
        this.f11803b = bundle;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    private final /* synthetic */ void e(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) throws JSONException {
        switch (this.f11802a) {
            case 0:
                C0797Wj c0797Wj = (C0797Wj) obj;
                Bundle bundle = this.f11803b;
                if (!bundle.isEmpty()) {
                    c0797Wj.f12308a.putBundle("installed_adapter_data", bundle);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((C0797Wj) obj).f12308a;
                Bundle bundleA = AbstractC0582Jp.a("device", bundle2);
                bundleA.putBundle("android_mem_info", this.f11803b);
                bundle2.putBundle("device", bundleA);
                break;
            case 2:
                C0797Wj c0797Wj2 = (C0797Wj) obj;
                Bundle bundle3 = this.f11803b;
                if (bundle3 != null) {
                    c0797Wj2.f12308a.putAll(bundle3);
                    break;
                }
                break;
            case 3:
                C0797Wj c0797Wj3 = (C0797Wj) obj;
                Bundle bundle4 = this.f11803b;
                if (!bundle4.isEmpty()) {
                    c0797Wj3.f12308a.putBundle("shared_pref", bundle4);
                    break;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle5 = this.f11803b;
                if (bundle5 != null) {
                    try {
                        a4.p.F("play_store", a4.p.F("device", jSONObject)).put("parental_controls", q2.r.f23260g.f23261a.k(bundle5));
                        break;
                    } catch (JSONException unused) {
                        AbstractC2907C.m("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        switch (this.f11802a) {
            case 2:
                C0797Wj c0797Wj = (C0797Wj) obj;
                Bundle bundle = this.f11803b;
                if (bundle != null) {
                    c0797Wj.f12309b.putAll(bundle);
                    break;
                }
                break;
            case 3:
                C0797Wj c0797Wj2 = (C0797Wj) obj;
                Bundle bundle2 = this.f11803b;
                if (!bundle2.isEmpty()) {
                    c0797Wj2.f12309b.putBundle("shared_pref", bundle2);
                    break;
                }
                break;
        }
    }
}
