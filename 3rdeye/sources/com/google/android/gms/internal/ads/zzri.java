package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzri {
    private Exception zza;
    private long zzb = -9223372036854775807L;
    private long zzc = -9223372036854775807L;

    public final void zza() {
        this.zza = null;
        this.zzb = -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final void zzb(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
        }
        if (this.zzb == -9223372036854775807L && !zzro.zzK()) {
            this.zzb = 200 + jElapsedRealtime;
        }
        long j4 = this.zzb;
        if (j4 == -9223372036854775807L || jElapsedRealtime < j4) {
            this.zzc = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.zza;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.zza;
        zza();
        throw exc3;
    }

    public final boolean zzc() {
        if (this.zza == null) {
            return false;
        }
        return zzro.zzK() || SystemClock.elapsedRealtime() < this.zzc;
    }
}
