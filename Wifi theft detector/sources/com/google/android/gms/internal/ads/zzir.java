package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;

/* loaded from: classes2.dex */
final class zzir {
    public int zza = 1;
    public boolean zzb;
    public int zzc;

    @GuardedBy("this")
    private int zzd;

    public final synchronized void zza() {
        this.zzd++;
    }

    public final synchronized void zzb() {
        this.zzd--;
    }

    public final synchronized int zzc() {
        return this.zzd;
    }
}
