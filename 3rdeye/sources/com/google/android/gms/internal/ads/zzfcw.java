package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.SingularParamsBase;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfcw implements zzbkd {
    public final /* synthetic */ zzddw zza;
    public final /* synthetic */ zzcml zzb;
    public final /* synthetic */ zzfjq zzc;
    public final /* synthetic */ zzebs zzd;

    public /* synthetic */ zzfcw(zzddw zzddwVar, zzcml zzcmlVar, zzfjq zzfjqVar, zzebs zzebsVar) {
        this.zza = zzddwVar;
        this.zzb = zzcmlVar;
        this.zzc = zzfjqVar;
        this.zzd = zzebsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        zzbkc.zzc(map, this.zza);
        String str = (String) map.get(SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY);
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from click GMSG.");
        } else {
            zzebs zzebsVar = this.zzd;
            zzfjq zzfjqVar = this.zzc;
            zzgdb.zzr(zzbkc.zza(zzcfeVar, str), new zzfcy(zzcfeVar, this.zzb, zzfjqVar, zzebsVar), zzcad.zza);
        }
    }
}
