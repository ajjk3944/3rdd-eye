package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzhal extends zzgzv {
    final /* synthetic */ zzhan zza;
    private final zzgyv zzb;

    public zzhal(zzhan zzhanVar, zzgyv zzgyvVar) {
        Objects.requireNonNull(zzhanVar);
        this.zza = zzhanVar;
        this.zzb = zzgyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgyv zzgyvVar = this.zzb;
        com.google.common.util.concurrent.a aVarZza = zzgyvVar.zza();
        zzgrc.zzl(aVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgyvVar);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((com.google.common.util.concurrent.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
