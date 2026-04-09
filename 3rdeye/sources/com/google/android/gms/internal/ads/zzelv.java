package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzelv implements zzetu {
    private final Clock zza;
    private final zzfco zzb;

    public zzelv(Clock clock, zzfco zzfcoVar) {
        this.zza = clock;
        this.zzb = zzfcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return zzgdb.zzh(new zzelw(this.zzb, this.zza.currentTimeMillis()));
    }
}
