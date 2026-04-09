package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.bs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958bs implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13476b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13477c;

    public /* synthetic */ C0958bs(String str, int i, int i3) {
        this.f13475a = i3;
        this.f13476b = str;
        this.f13477c = i;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    private final /* synthetic */ void e(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) throws JSONException {
        int i;
        int i3;
        switch (this.f13475a) {
            case 0:
                Bundle bundle = ((C0797Wj) obj).f12308a;
                String str = this.f13476b;
                if (!TextUtils.isEmpty(str) && (i = this.f13477c) != -1) {
                    Bundle bundleA = AbstractC0582Jp.a("pii", bundle);
                    bundle.putBundle("pii", bundleA);
                    bundleA.putString("pvid", str);
                    bundleA.putInt("pvid_s", i);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((C0797Wj) obj).f12308a;
                bundle2.putString("request_id", this.f13476b);
                if (this.f13477c == 2) {
                    bundle2.putInt("sod", 1);
                    break;
                }
                break;
            case 2:
                Bundle bundle3 = ((C0797Wj) obj).f12308a;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Fb)).booleanValue()) {
                    String str2 = this.f13476b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle3.putString("topics", str2);
                    }
                    int i6 = this.f13477c;
                    if (i6 != -1) {
                        bundle3.putInt("atps", i6);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f13476b;
                if (!TextUtils.isEmpty(str3) && (i3 = this.f13477c) != -1) {
                    try {
                        JSONObject jSONObjectF = a4.p.F("pii", jSONObject);
                        jSONObjectF.put("pvid", str3);
                        jSONObjectF.put("pvid_s", i3);
                        break;
                    } catch (JSONException e6) {
                        AbstractC2907C.n("Failed putting gms core app set ID info.", e6);
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        switch (this.f13475a) {
            case 1:
                ((C0797Wj) obj).f12309b.putString("request_id", this.f13476b);
                break;
        }
    }
}
