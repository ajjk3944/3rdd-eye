package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.Constants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdpx {
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;
    private final Map zza = new ConcurrentHashMap();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzdpx(Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpv
            @Override // java.lang.Runnable
            public final void run() {
                zzdpx zzdpxVar = this.zza;
                zzdpxVar.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdpxVar.zzh();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        JSONObject jSONObjectZzf;
        Map map;
        try {
            this.zzd = true;
            zzbzk zzbzkVarZzg = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg();
            if (zzbzkVarZzg != null && (jSONObjectZzf = zzbzkVarZzg.zzf()) != null) {
                this.zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzen)).booleanValue() ? jSONObjectZzf.optJSONObject("common_settings") : null;
                this.zze = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString(Constants.ADMON_AD_UNIT_ID);
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                Map map2 = this.zza;
                                if (map2.containsKey(strOptString2)) {
                                    map = (Map) map2.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    map2.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    public final JSONObject zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzen)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzel)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzh();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzem)).booleanValue()) {
                zzg();
            }
        }
        Map map = (Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strZza = zzdpz.zza(this.zze, str, str2);
        if (strZza != null) {
            return (JSONObject) map.get(strZza);
        }
        return null;
    }

    public final void zzf() {
        zzg();
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh();
            }
        });
    }
}
