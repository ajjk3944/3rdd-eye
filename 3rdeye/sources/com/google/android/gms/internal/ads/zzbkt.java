package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbkt implements zzbkd {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(FacebookMediationAdapter.KEY_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbks zzbksVar = (zzbks) this.zzb.remove(str);
                if (zzbksVar == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    zzbksVar.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    zzbksVar.zzb(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    zzbksVar.zzb(jSONObject);
                } catch (JSONException e4) {
                    zzbksVar.zza(e4.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final A4.a zzb(zzbnk zzbnkVar, String str, JSONObject jSONObject) throws JSONException {
        zzcai zzcaiVar = new zzcai();
        com.google.android.gms.ads.internal.zzv.zzr();
        String string = UUID.randomUUID().toString();
        zzc(string, new zzbkr(this, zzcaiVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FacebookMediationAdapter.KEY_ID, string);
            jSONObject2.put("args", jSONObject);
            zzbnkVar.zzp(str, jSONObject2);
            return zzcaiVar;
        } catch (Exception e4) {
            zzcaiVar.zzd(e4);
            return zzcaiVar;
        }
    }

    public final void zzc(String str, zzbks zzbksVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbksVar);
        }
    }
}
