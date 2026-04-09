package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgbw extends zzgby {
    public zzgbw(A4.a aVar, zzgci zzgciVar) {
        super(aVar, zzgciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgci zzgciVar = (zzgci) obj;
        A4.a aVarZza = zzgciVar.zza(obj2);
        zzfve.zzd(aVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgciVar);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final /* synthetic */ void zzf(Object obj) {
        zzn((A4.a) obj);
    }
}
