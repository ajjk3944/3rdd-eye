package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbch;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcsl implements zzcxf, com.google.android.gms.ads.internal.client.zza, zzcyt, zzcwl, zzcvr, zzdbf {
    private final Clock zza;
    private final zzbzj zzb;

    public zzcsl(Clock clock, zzbzj zzbzjVar) {
        this.zza = clock;
        this.zzb = zzbzjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzi(zzbch.zzb zzbVar) {
        this.zzb.zzi();
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzj(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzm(zzbch.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzj(zzbch.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzl(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzn(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) {
    }
}
