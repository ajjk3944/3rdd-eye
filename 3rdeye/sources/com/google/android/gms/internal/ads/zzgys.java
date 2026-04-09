package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgys implements zzgyj {
    final int zza;
    final zzhby zzb;
    final boolean zzc;
    final boolean zzd;

    public zzgys(zzgza zzgzaVar, int i, zzhby zzhbyVar, boolean z10, boolean z11) {
        this.zza = i;
        this.zzb = zzhbyVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgys) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final zzhby zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final zzhbz zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final boolean zze() {
        return this.zzc;
    }
}
