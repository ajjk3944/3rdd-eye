package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbzo {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbzo() {
    }

    public final void zza() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc == 3) {
                    if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzge)).longValue() <= jCurrentTimeMillis) {
                        this.zzc = 1;
                    }
                }
            } finally {
            }
        }
        long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc != 2) {
                    return;
                }
                this.zzc = 3;
                if (this.zzc == 3) {
                    this.zzb = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }

    public /* synthetic */ zzbzo(zzbzp zzbzpVar) {
    }
}
