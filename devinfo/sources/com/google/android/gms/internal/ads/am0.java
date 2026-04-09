package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class am0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9364c;

    public /* synthetic */ am0(String str, int i4, int i10) {
        this.f9362a = i10;
        this.f9363b = str;
        this.f9364c = i4;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) throws JSONException {
        int i4;
        int i10;
        switch (this.f9362a) {
            case 0:
                Bundle bundle = ((t50) obj).f16705a;
                String str = this.f9363b;
                if (!TextUtils.isEmpty(str) && (i4 = this.f9364c) != -1) {
                    Bundle bundleA = mq0.a(bundle, "pii");
                    bundle.putBundle("pii", bundleA);
                    bundleA.putString("pvid", str);
                    bundleA.putInt("pvid_s", i4);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((t50) obj).f16705a;
                bundle2.putString("request_id", this.f9363b);
                if (this.f9364c == 2) {
                    bundle2.putInt("sod", 1);
                    break;
                }
                break;
            case 2:
                Bundle bundle3 = ((t50) obj).f16705a;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Hb)).booleanValue()) {
                    String str2 = this.f9363b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle3.putString("topics", str2);
                    }
                    int i11 = this.f9364c;
                    if (i11 != -1) {
                        bundle3.putInt("atps", i11);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f9363b;
                if (!TextUtils.isEmpty(str3) && (i10 = this.f9364c) != -1) {
                    try {
                        JSONObject jSONObjectC = pd.b.C("pii", jSONObject);
                        jSONObjectC.put("pvid", str3);
                        jSONObjectC.put("pvid_s", i10);
                        break;
                    } catch (JSONException e2) {
                        ya.a0.n("Failed putting gms core app set ID info.", e2);
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        switch (this.f9362a) {
            case 1:
                ((t50) obj).f16706b.putString("request_id", this.f9363b);
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
