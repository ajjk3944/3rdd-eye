package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzboy implements zzbok {
    private final zzbom zza;
    private final zzbon zzb;
    private final zzbog zzc;
    private final String zzd;

    public zzboy(zzbog zzbogVar, String str, zzbon zzbonVar, zzbom zzbomVar) {
        this.zzc = zzbogVar;
        this.zzd = str;
        this.zzb = zzbonVar;
        this.zza = zzbomVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzboy zzboyVar, zzboa zzboaVar, zzboh zzbohVar, Object obj, zzcai zzcaiVar) throws JSONException {
        try {
            com.google.android.gms.ads.internal.zzv.zzr();
            String string = UUID.randomUUID().toString();
            zzbkc.zzo.zzc(string, new zzbox(zzboyVar, zzboaVar, zzcaiVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, string);
            jSONObject.put("args", zzboyVar.zzb.zzb(obj));
            zzbohVar.zzp(zzboyVar.zzd, jSONObject);
        } catch (Exception e4) {
            try {
                zzcaiVar.zzd(e4);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to invokeJavascript", e4);
            } finally {
                zzboaVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final A4.a zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final A4.a zzb(Object obj) {
        zzcai zzcaiVar = new zzcai();
        zzboa zzboaVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzboaVarZzb.zzj(new zzbov(this, zzboaVarZzb, obj, zzcaiVar), new zzbow(this, zzcaiVar, zzboaVarZzb));
        return zzcaiVar;
    }
}
