package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzfb {
    private final String zza;
    private final Bundle zzb;
    private final String zzc;

    public zzfb(String str, Bundle bundle, String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    public final Bundle zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        String str = this.zzc;
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString(CommonUrlParts.REQUEST_ID, "");
            } catch (JSONException unused) {
            }
        }
        return "";
    }
}
