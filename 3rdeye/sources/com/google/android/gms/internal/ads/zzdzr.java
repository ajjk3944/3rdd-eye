package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdzr implements zzbon {
    @Override // com.google.android.gms.internal.ads.zzbon
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzdzs zzdzsVar = (zzdzs) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjz)).booleanValue()) {
            zzbvq zzbvqVar = zzdzsVar.zzd;
            jSONObject2.put("ad_request_url", zzbvqVar.zzg());
            jSONObject2.put("ad_request_post_body", zzbvqVar.zzf());
        }
        zzbvq zzbvqVar2 = zzdzsVar.zzd;
        jSONObject2.put("base_url", zzbvqVar2.zzd());
        jSONObject2.put("signals", zzdzsVar.zzc);
        zzdzw zzdzwVar = zzdzsVar.zzb;
        jSONObject3.put("body", zzdzwVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbb.zzb().zzo(zzdzwVar.zzb));
        jSONObject3.put("response_code", zzdzwVar.zza);
        jSONObject3.put("latency", zzdzwVar.zzd);
        jSONObject.put(com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbvqVar2.zzi());
        return jSONObject;
    }
}
