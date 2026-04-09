package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzftb implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzftc zzb;

    public zzftb(zzftc zzftcVar, float f10) {
        this.zza = f10;
        Objects.requireNonNull(zzftcVar);
        this.zzb = zzftcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
