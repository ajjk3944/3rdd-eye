package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ml0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13936a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13937b;

    public /* synthetic */ ml0(String str, int i4) {
        this.f13936a = i4;
        this.f13937b = str;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        switch (this.f13936a) {
            case 0:
                t50 t50Var = (t50) obj;
                String str = this.f13937b;
                if (str != null) {
                    t50Var.f16705a.putString("arek", str);
                    break;
                }
                break;
            case 1:
                ((t50) obj).f16705a.putString("ms", this.f13937b);
                break;
            case 2:
                mq0.V("key_schema", this.f13937b, ((t50) obj).f16705a);
                break;
            case 3:
                mq0.V("omid_v", this.f13937b, ((t50) obj).f16705a);
                break;
            case 4:
                try {
                    ((JSONObject) obj).put("ms", this.f13937b);
                    break;
                } catch (JSONException e2) {
                    ya.a0.n("Failed putting Ad ID.", e2);
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    String str2 = this.f13937b;
                    if (!TextUtils.isEmpty(str2)) {
                        pd.b.C("pii", jSONObject).put("adsid", str2);
                        break;
                    }
                } catch (JSONException e10) {
                    za.i.i("Failed putting trustless token.", e10);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        int i4 = this.f13936a;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void d(Object obj) {
    }

    private final /* synthetic */ void e(Object obj) {
    }

    private final /* synthetic */ void f(Object obj) {
    }

    private final /* synthetic */ void g(Object obj) {
    }
}
