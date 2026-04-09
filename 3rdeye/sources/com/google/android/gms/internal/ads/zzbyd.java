package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbyd {
    private final Clock zza;
    private final zzbyb zzb;

    public zzbyd(Clock clock, zzbyb zzbybVar) {
        this.zza = clock;
        this.zzb = zzbybVar;
    }

    public static zzbyd zza(Context context) {
        return zzbyn.zzb(context).zza();
    }

    public final void zzb(int i, long j4) {
        this.zzb.zza(i, j4);
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }
}
