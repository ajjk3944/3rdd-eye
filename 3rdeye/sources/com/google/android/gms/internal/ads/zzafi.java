package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzafi implements zzaes {
    final /* synthetic */ zzafl zza;
    private final long zzb;

    public zzafi(zzafl zzaflVar, long j4) {
        this.zza = zzaflVar;
        this.zzb = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        zzafl zzaflVar = this.zza;
        zzaeq zzaeqVarZza = zzaflVar.zzi[0].zza(j4);
        for (int i = 1; i < zzaflVar.zzi.length; i++) {
            zzaeq zzaeqVarZza2 = zzaflVar.zzi[i].zza(j4);
            if (zzaeqVarZza2.zza.zzc < zzaeqVarZza.zza.zzc) {
                zzaeqVarZza = zzaeqVarZza2;
            }
        }
        return zzaeqVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
