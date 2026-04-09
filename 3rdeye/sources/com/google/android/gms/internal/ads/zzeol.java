package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeol {
    public final A4.a zza;
    private final long zzb;
    private final Clock zzc;

    public zzeol(A4.a aVar, long j4, Clock clock) {
        this.zza = aVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j4;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
