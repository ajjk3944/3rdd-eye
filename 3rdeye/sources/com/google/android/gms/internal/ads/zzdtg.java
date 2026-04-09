package com.google.android.gms.internal.ads;

import F3.h;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdtg {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdtg(String str, zzdth zzdthVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdtg zzdtgVar) throws JSONException {
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkk);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtgVar.zza);
            jSONObject.put("eventCategory", zzdtgVar.zzb);
            jSONObject.putOpt("event", zzdtgVar.zzc);
            jSONObject.putOpt("errorCode", zzdtgVar.zzd);
            jSONObject.putOpt("rewardType", zzdtgVar.zze);
            jSONObject.putOpt("rewardAmount", zzdtgVar.zzf);
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
        return h.i(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
