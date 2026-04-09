package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgbm extends zzgbo {
    public zzgbm(A4.a aVar, Class cls, zzgci zzgciVar) {
        super(aVar, cls, zzgciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgci zzgciVar = (zzgci) obj;
        A4.a aVarZza = zzgciVar.zza(th);
        zzfve.zzd(aVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgciVar);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* synthetic */ void zzf(Object obj) {
        zzn((A4.a) obj);
    }
}
