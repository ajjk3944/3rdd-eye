package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaaw implements zzacl {
    final /* synthetic */ zztf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzaba zzd;

    public zzaaw(zzaba zzabaVar, zztf zztfVar, int i, long j4) {
        this.zza = zztfVar;
        this.zzb = i;
        this.zzc = j4;
        this.zzd = zzabaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zza(long j4) {
        this.zzd.zzaj(this.zza, this.zzb, this.zzc, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzb() {
        this.zzd.zzap(this.zza, this.zzb, this.zzc);
    }
}
