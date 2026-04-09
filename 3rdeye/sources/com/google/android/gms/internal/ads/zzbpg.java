package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbpg implements zzgci {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final A4.a zzb;

    public zzbpg(A4.a aVar, String str, zzbon zzbonVar, zzbom zzbomVar) {
        this.zzb = aVar;
    }

    public static /* synthetic */ A4.a zzb(zzbpg zzbpgVar, Object obj, zzboh zzbohVar) throws JSONException {
        zzcai zzcaiVar = new zzcai();
        com.google.android.gms.ads.internal.zzv.zzr();
        String string = UUID.randomUUID().toString();
        zzbkc.zzo.zzc(string, new zzbpf(zzbpgVar, zzcaiVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookMediationAdapter.KEY_ID, string);
        jSONObject.put("args", (JSONObject) obj);
        zzbohVar.zzp(zzbpgVar.zza, jSONObject);
        return zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final A4.a zza(Object obj) throws Exception {
        return zzc(obj);
    }

    public final A4.a zzc(final Object obj) {
        return zzgdb.zzn(this.zzb, new zzgci() { // from class: com.google.android.gms.internal.ads.zzbpe
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj2) {
                return zzbpg.zzb(this.zza, obj, (zzboh) obj2);
            }
        }, zzcad.zzg);
    }
}
