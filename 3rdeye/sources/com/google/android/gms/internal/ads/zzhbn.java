package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhbn extends zzhbl {
    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzgyv zzgyvVar = (zzgyv) obj;
        zzhbm zzhbmVar = zzgyvVar.zzt;
        if (zzhbmVar != zzhbm.zzc()) {
            return zzhbmVar;
        }
        zzhbm zzhbmVarZzf = zzhbm.zzf();
        zzgyvVar.zzt = zzhbmVarZzf;
        return zzhbmVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* synthetic */ Object zzb() {
        return zzhbm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* synthetic */ Object zzc(Object obj) {
        zzhbm zzhbmVar = (zzhbm) obj;
        zzhbmVar.zzh();
        return zzhbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i, int i10) {
        ((zzhbm) obj).zzj((i << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i, long j4) {
        ((zzhbm) obj).zzj((i << 3) | 1, Long.valueOf(j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, Object obj2) {
        ((zzhbm) obj).zzj((i << 3) | 3, (zzhbm) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i, zzgxn zzgxnVar) {
        ((zzhbm) obj).zzj((i << 3) | 2, zzgxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, long j4) {
        ((zzhbm) obj).zzj(i << 3, Long.valueOf(j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final void zzi(Object obj) {
        ((zzgyv) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzgyv) obj).zzt = (zzhbm) obj2;
    }
}
