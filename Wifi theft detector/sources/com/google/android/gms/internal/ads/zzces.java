package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzces implements zzgzl {
    final /* synthetic */ zzceu zza;

    public zzces(zzceu zzceuVar) {
        Objects.requireNonNull(zzceuVar);
        this.zza = zzceuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(@Nullable Object obj) {
        this.zza.zzj().set(1);
    }
}
