package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzffk implements zzhfy {
    public static zzffk zza() {
        return zzffj.zza;
    }

    public static zzgdm zzc() {
        zzgdm zzgdmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfU)).booleanValue()) {
            zzgdmVar = zzcad.zzc;
        } else {
            zzgdmVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfT)).booleanValue() ? zzcad.zza : zzcad.zzf;
        }
        zzhgg.zzb(zzgdmVar);
        return zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
