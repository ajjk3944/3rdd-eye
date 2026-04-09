package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzejt extends com.google.android.gms.ads.internal.client.zzbs {
    final zzfcm zza;
    final zzdiv zzb;
    private final Context zzc;
    private final zzcgz zzd;
    private com.google.android.gms.ads.internal.client.zzbk zze;

    public zzejt(zzcgz zzcgzVar, Context context, String str) {
        zzfcm zzfcmVar = new zzfcm();
        this.zza = zzfcmVar;
        this.zzb = new zzdiv();
        this.zzd = zzcgzVar;
        zzfcmVar.zzt(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final com.google.android.gms.ads.internal.client.zzbq zze() {
        zzdix zzdixVarZzg = this.zzb.zzg();
        ArrayList arrayListZzi = zzdixVarZzg.zzi();
        zzfcm zzfcmVar = this.zza;
        zzfcmVar.zzE(arrayListZzi);
        zzfcmVar.zzF(zzdixVarZzg.zzh());
        if (zzfcmVar.zzh() == null) {
            zzfcmVar.zzs(com.google.android.gms.ads.internal.client.zzr.zzc());
        }
        return new zzeju(this.zzc, this.zzd, zzfcmVar, zzdixVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(zzbhl zzbhlVar) {
        this.zzb.zza(zzbhlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzbho zzbhoVar) {
        this.zzb.zzb(zzbhoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(String str, zzbhu zzbhuVar, zzbhr zzbhrVar) {
        this.zzb.zzc(str, zzbhuVar, zzbhrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(zzbmw zzbmwVar) {
        this.zzb.zzd(zzbmwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbhy zzbhyVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zze(zzbhyVar);
        this.zza.zzs(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbib zzbibVar) {
        this.zzb.zzf(zzbibVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze = zzbkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzbmn zzbmnVar) {
        this.zza.zzw(zzbmnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzbgc zzbgcVar) {
        this.zza.zzD(zzbgcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zza.zzV(zzcsVar);
    }
}
