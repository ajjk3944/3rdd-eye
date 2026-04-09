package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import t2.AbstractC2907C;

/* loaded from: classes.dex */
public final class Or implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10260a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10261b;

    public /* synthetic */ Or(String str, int i) {
        this.f10260a = i;
        this.f10261b = str;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    private final /* synthetic */ void e(Object obj) {
    }

    private final /* synthetic */ void f(Object obj) {
    }

    private final /* synthetic */ void g(Object obj) {
    }

    private final /* synthetic */ void h(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void b(Object obj) throws JSONException {
        switch (this.f10260a) {
            case 0:
                C0797Wj c0797Wj = (C0797Wj) obj;
                String str = this.f10261b;
                if (str != null) {
                    c0797Wj.f12308a.putString("arek", str);
                    break;
                }
                break;
            case 1:
                ((C0797Wj) obj).f12308a.putString("ms", this.f10261b);
                break;
            case 2:
                AbstractC0582Jp.X("key_schema", ((C0797Wj) obj).f12308a, this.f10261b);
                break;
            case 3:
                AbstractC0582Jp.X("omid_v", ((C0797Wj) obj).f12308a, this.f10261b);
                break;
            case 4:
                try {
                    ((JSONObject) obj).put("ms", this.f10261b);
                    break;
                } catch (JSONException e6) {
                    AbstractC2907C.n("Failed putting Ad ID.", e6);
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    String str2 = this.f10261b;
                    if (!TextUtils.isEmpty(str2)) {
                        a4.p.F("pii", jSONObject).put("adsid", str2);
                        break;
                    }
                } catch (JSONException e7) {
                    u2.k.i("Failed putting trustless token.", e7);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        int i = this.f10260a;
    }
}
