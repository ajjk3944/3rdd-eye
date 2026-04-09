package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzdqx implements zzgzl {
    final /* synthetic */ zzdxh zza;
    final /* synthetic */ zzdra zzb;

    public zzdqx(zzdra zzdraVar, zzdxh zzdxhVar) {
        this.zza = zzdxhVar;
        Objects.requireNonNull(zzdraVar);
        this.zzb = zzdraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zzb.zzd().zze().putLong(this.zza.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
    }
}
