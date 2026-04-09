package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdod implements zzbku {
    private final zzcwy zza;
    private final zzbwm zzb;
    private final String zzc;
    private final String zzd;

    public zzdod(zzcwy zzcwyVar, zzfbt zzfbtVar) {
        this.zza = zzcwyVar;
        this.zzb = zzfbtVar.zzl;
        this.zzc = zzfbtVar.zzj;
        this.zzd = zzfbtVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbku
    public final void zza(zzbwm zzbwmVar) {
        int i;
        String str;
        zzbwm zzbwmVar2 = this.zzb;
        if (zzbwmVar2 != null) {
            zzbwmVar = zzbwmVar2;
        }
        if (zzbwmVar != null) {
            str = zzbwmVar.zza;
            i = zzbwmVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbvx(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbku
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbku
    public final void zzc() {
        this.zza.zzf();
    }
}
