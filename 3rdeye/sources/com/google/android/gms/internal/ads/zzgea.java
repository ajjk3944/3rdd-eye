package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgea extends zzgdj {
    final /* synthetic */ zzgec zza;
    private final zzgch zzb;

    public zzgea(zzgec zzgecVar, zzgch zzgchVar) {
        this.zza = zzgecVar;
        this.zzb = zzgchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgch zzgchVar = this.zzb;
        A4.a aVarZza = zzgchVar.zza();
        zzfve.zzd(aVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgchVar);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzn((A4.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
