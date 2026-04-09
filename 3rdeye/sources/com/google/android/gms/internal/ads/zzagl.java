package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzagl extends zzaeg {
    final /* synthetic */ zzaes zza;
    final /* synthetic */ zzagm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzagl(zzagm zzagmVar, zzaes zzaesVar, zzaes zzaesVar2) {
        super(zzaesVar);
        this.zza = zzaesVar2;
        this.zzb = zzagmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeg, com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        zzaeq zzaeqVarZzg = this.zza.zzg(j4);
        zzaet zzaetVar = zzaeqVarZzg.zza;
        long j10 = zzaetVar.zzc;
        zzagm zzagmVar = this.zzb;
        zzaet zzaetVar2 = new zzaet(zzaetVar.zzb, zzagmVar.zzb + j10);
        zzaet zzaetVar3 = zzaeqVarZzg.zzb;
        return new zzaeq(zzaetVar2, new zzaet(zzaetVar3.zzb, zzagmVar.zzb + zzaetVar3.zzc));
    }
}
