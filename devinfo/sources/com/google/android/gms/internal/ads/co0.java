package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class co0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdvertisingIdClient.Info f10182a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10183b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.recyclerview.widget.d f10184c;

    public co0(AdvertisingIdClient.Info info, String str, androidx.recyclerview.widget.d dVar) {
        this.f10182a = info;
        this.f10183b = str;
        this.f10184c = dVar;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectC = pd.b.C("pii", (JSONObject) obj);
            AdvertisingIdClient.Info info = this.f10182a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.f10183b;
                if (str != null) {
                    jSONObjectC.put("pdid", str);
                    jSONObjectC.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectC.put("rdid", info.getId());
            jSONObjectC.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectC.put("idtype", "adid");
            androidx.recyclerview.widget.d dVar = this.f10184c;
            long j = dVar.f1323b;
            String str2 = (String) dVar.f1324c;
            if (str2 != null && j > 0) {
                jSONObjectC.put("paidv1_id_android_3p", str2);
                jSONObjectC.put("paidv1_creation_time_android_3p", j);
            }
        } catch (JSONException e2) {
            ya.a0.n("Failed putting Ad ID.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
    }
}
