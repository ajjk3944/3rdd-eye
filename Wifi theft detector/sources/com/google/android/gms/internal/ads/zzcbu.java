package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzcbu implements zzgzl {
    final /* synthetic */ com.google.common.util.concurrent.a zza;

    public zzcbu(zzcbz zzcbzVar, com.google.common.util.concurrent.a aVar) {
        this.zza = aVar;
        Objects.requireNonNull(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzcbz.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcbz.zzc.remove(this.zza);
    }
}
