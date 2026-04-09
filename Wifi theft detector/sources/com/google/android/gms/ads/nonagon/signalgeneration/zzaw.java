package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdkb;
import com.google.android.gms.internal.ads.zzgzl;

/* loaded from: classes2.dex */
final class zzaw implements zzgzl {
    final /* synthetic */ zzdkb zza;

    public zzaw(zzdkb zzdkbVar) {
        this.zza = zzdkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        this.zza.zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        this.zza.zza((zzbj) obj);
    }
}
