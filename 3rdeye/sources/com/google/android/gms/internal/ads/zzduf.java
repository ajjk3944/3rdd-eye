package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.presenter.g;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzduf extends zzbme {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfhb zzd;
    final /* synthetic */ zzcai zze;
    final /* synthetic */ zzdug zzf;

    public zzduf(zzdug zzdugVar, Object obj, String str, long j4, zzfhb zzfhbVar, zzcai zzcaiVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j4;
        this.zzd = zzfhbVar;
        this.zze = zzcaiVar;
        this.zzf = zzdugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(String str) {
        synchronized (this.zza) {
            zzdug zzdugVar = this.zzf;
            String str2 = this.zzb;
            zzdugVar.zzv(str2, false, str, (int) (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - this.zzc));
            zzdugVar.zzl.zzb(str2, g.ERROR);
            zzdugVar.zzo.zzb(str2, g.ERROR);
            zzfhp zzfhpVar = zzdugVar.zzp;
            zzfhb zzfhbVar = this.zzd;
            zzfhbVar.zzc(str);
            zzfhbVar.zzg(false);
            zzfhpVar.zzc(zzfhbVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zzf() {
        synchronized (this.zza) {
            zzdug zzdugVar = this.zzf;
            String str = this.zzb;
            zzdugVar.zzv(str, true, "", (int) (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - this.zzc));
            zzdugVar.zzl.zzd(str);
            zzdugVar.zzo.zzd(str);
            zzfhp zzfhpVar = zzdugVar.zzp;
            zzfhb zzfhbVar = this.zzd;
            zzfhbVar.zzg(true);
            zzfhpVar.zzc(zzfhbVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
