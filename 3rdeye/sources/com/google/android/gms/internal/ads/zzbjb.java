package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.SingularParamsBase;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbjb implements zzbkd {
    public final /* synthetic */ zzddw zza;
    public final /* synthetic */ zzcml zzb;

    public /* synthetic */ zzbjb(zzddw zzddwVar, zzcml zzcmlVar) {
        this.zza = zzddwVar;
        this.zzb = zzcmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        zzbkc.zzc(map, this.zza);
        final String str = (String) map.get(SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY);
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from click GMSG.");
            return;
        }
        final zzcml zzcmlVar = this.zzb;
        zzgcs zzgcsVarZzw = zzgcs.zzw(zzbkc.zza(zzcfeVar, str));
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzbje
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj2) {
                zzcml zzcmlVar2;
                String str2 = (String) obj2;
                zzbkd zzbkdVar = zzbkc.zza;
                return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkn)).booleanValue() && (zzcmlVar2 = zzcmlVar) != null && zzcml.zzj(str)) ? zzcmlVar2.zze(str2, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgdb.zzh(str2);
            }
        };
        zzgdm zzgdmVar = zzcad.zza;
        zzgdb.zzr((zzgcs) zzgdb.zzn(zzgcsVarZzw, zzgciVar, zzgdmVar), new zzbjr(zzcfeVar), zzgdmVar);
    }
}
