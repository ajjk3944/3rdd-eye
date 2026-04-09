package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzajs implements zzaes {
    final /* synthetic */ zzaju zza;

    public /* synthetic */ zzajs(zzaju zzajuVar, zzajt zzajtVar) {
        this.zza = zzajuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        zzaju zzajuVar = this.zza;
        return zzajuVar.zzd.zzf(zzajuVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        zzaju zzajuVar = this.zza;
        long jLongValue = BigInteger.valueOf(zzajuVar.zzd.zzg(j4)).multiply(BigInteger.valueOf(zzajuVar.zzc - zzajuVar.zzb)).divide(BigInteger.valueOf(zzajuVar.zzf)).longValue() + zzajuVar.zzb;
        long j10 = zzajuVar.zzb;
        long j11 = zzajuVar.zzc - 1;
        String str = zzex.zza;
        zzaet zzaetVar = new zzaet(j4, Math.max(j10, Math.min(jLongValue - 30000, j11)));
        return new zzaeq(zzaetVar, zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
