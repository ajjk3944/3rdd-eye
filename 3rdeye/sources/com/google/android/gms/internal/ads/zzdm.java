package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdm {
    private boolean zza;

    public zzdm() {
        throw null;
    }

    public final synchronized void zza() throws InterruptedException {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z10 = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc(long j4) {
        if (j4 > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = j4 + jElapsedRealtime;
                if (j10 < jElapsedRealtime) {
                    zzb();
                } else {
                    boolean z10 = false;
                    while (!this.zza && jElapsedRealtime < j10) {
                        try {
                            wait(j10 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z10 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zza;
    }

    public final synchronized boolean zzd() {
        boolean z10;
        z10 = this.zza;
        this.zza = false;
        return z10;
    }

    public final synchronized boolean zze() {
        return this.zza;
    }

    public final synchronized boolean zzf() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }

    public zzdm(zzdj zzdjVar) {
    }
}
