package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfjy {
    private final long zza;
    private final long zzb;
    private long zze;
    private long zzd = 5;
    private final Random zzf = new Random();
    private long zzc = 0;

    public zzfjy(long j4, double d10, long j10, double d11) {
        this.zza = j4;
        this.zzb = j10;
        zzc();
    }

    public final long zza() {
        double d10 = this.zze;
        double d11 = 0.2d * d10;
        long j4 = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.zzf.nextDouble() * ((j4 - r0) + 1)));
    }

    public final void zzb() {
        double d10 = this.zze;
        this.zze = Math.min((long) (d10 + d10), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final synchronized void zzd(int i) {
        Preconditions.checkArgument(i > 0);
        this.zzd = i;
    }

    public final boolean zze() {
        return this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzC)).intValue()) && this.zze >= this.zzb;
    }
}
