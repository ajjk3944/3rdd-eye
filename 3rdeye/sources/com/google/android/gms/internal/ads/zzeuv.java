package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeuv implements zzett {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfrr zzc;

    public zzeuv(AdvertisingIdClient.Info info, String str, zzfrr zzfrrVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbs.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectZzg.put("pdid", str);
                    jSONObjectZzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzg.put("rdid", info.getId());
            jSONObjectZzg.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzg.put("idtype", "adid");
            zzfrr zzfrrVar = this.zzc;
            if (zzfrrVar.zzc()) {
                jSONObjectZzg.put("paidv1_id_android_3p", zzfrrVar.zzb());
                jSONObjectZzg.put("paidv1_creation_time_android_3p", zzfrrVar.zza());
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
