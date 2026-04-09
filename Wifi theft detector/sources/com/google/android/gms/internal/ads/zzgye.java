package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgye extends zzgyg {
    public zzgye(com.google.common.util.concurrent.a aVar, Class cls, zzgyw zzgywVar) {
        super(aVar, cls, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* synthetic */ void zze(Object obj) {
        zzk((com.google.common.util.concurrent.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        com.google.common.util.concurrent.a aVarZza = zzgywVar.zza(th);
        zzgrc.zzl(aVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return aVarZza;
    }
}
