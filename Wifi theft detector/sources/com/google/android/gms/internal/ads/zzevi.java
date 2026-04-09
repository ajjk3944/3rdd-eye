package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
final class zzevi {
    public final com.google.common.util.concurrent.a zza;
    private final long zzb;
    private final Clock zzc;

    public zzevi(com.google.common.util.concurrent.a aVar, long j10, Clock clock) {
        this.zza = aVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j10;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
