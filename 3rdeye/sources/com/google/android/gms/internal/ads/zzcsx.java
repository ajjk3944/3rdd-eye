package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcsx implements zzdbj, zzcxf {
    private final Clock zza;
    private final zzcsz zzb;
    private final zzfco zzc;
    private final String zzd;

    public zzcsx(Clock clock, zzcsz zzcszVar, zzfco zzfcoVar, String str) {
        this.zza = clock;
        this.zzb = zzcszVar;
        this.zzc = zzfcoVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        Clock clock = this.zza;
        this.zzb.zzd(this.zzc.zzf, this.zzd, clock.elapsedRealtime());
    }
}
