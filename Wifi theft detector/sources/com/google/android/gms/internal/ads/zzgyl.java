package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgyl extends zzgyn {
    public zzgyl(com.google.common.util.concurrent.a aVar, zzgyw zzgywVar) {
        super(aVar, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* synthetic */ void zze(Object obj) {
        zzk((com.google.common.util.concurrent.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        com.google.common.util.concurrent.a aVarZza = zzgywVar.zza(obj2);
        zzgrc.zzl(aVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return aVarZza;
    }
}
