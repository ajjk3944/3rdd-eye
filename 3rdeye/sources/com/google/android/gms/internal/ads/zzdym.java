package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdym implements zzdyo {
    private final Map zza;
    private final zzgdm zzb;
    private final zzcyr zzc;

    public zzdym(Map map, zzgdm zzgdmVar, zzcyr zzcyrVar) {
        this.zza = map;
        this.zzb = zzgdmVar;
        this.zzc = zzcyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final A4.a zzc(final zzbvo zzbvoVar) {
        this.zzc.zzdn(zzbvoVar);
        A4.a aVarZzg = zzgdb.zzg(new zzdwe(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziv)).split(StringUtils.COMMA)) {
            final zzhgn zzhgnVar = (zzhgn) this.zza.get(str.trim());
            if (zzhgnVar != null) {
                aVarZzg = zzgdb.zzf(aVarZzg, zzdwe.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdyk
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final A4.a zza(Object obj) {
                        return ((zzdyo) zzhgnVar.zzb()).zzc(zzbvoVar);
                    }
                }, this.zzb);
            }
        }
        zzgdb.zzr(aVarZzg, new zzdyl(this), zzcad.zzg);
        return aVarZzg;
    }
}
