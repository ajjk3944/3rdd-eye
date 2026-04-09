package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbyf {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbym zzd;

    private zzbyf() {
        throw null;
    }

    public final zzbyf zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbyf zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbyf zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzbyf zzd(zzbym zzbymVar) {
        this.zzd = zzbymVar;
        return this;
    }

    public final zzbyn zze() {
        zzhgg.zzc(this.zza, Context.class);
        zzhgg.zzc(this.zzb, Clock.class);
        zzhgg.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhgg.zzc(this.zzd, zzbym.class);
        return new zzbyg(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public /* synthetic */ zzbyf(zzbyh zzbyhVar) {
    }
}
