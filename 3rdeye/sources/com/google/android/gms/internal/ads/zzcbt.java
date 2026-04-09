package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcbt {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzT)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcbe zzcbeVar) {
        if (zzcbeVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j4 = timestamp - this.zzb;
            if (Math.abs(j4) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbs
            @Override // java.lang.Runnable
            public final void run() {
                zzcbeVar.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}
