package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaqm {
    public static final boolean zza = zzaqn.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzaqn.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j4) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzaql(str, j4, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzaql> list = this.zzb;
        long j4 = list.size() == 0 ? 0L : ((zzaql) list.get(list.size() - 1)).zzc - ((zzaql) list.get(0)).zzc;
        if (j4 > 0) {
            long j10 = ((zzaql) list.get(0)).zzc;
            zzaqn.zza("(%-4d ms) %s", Long.valueOf(j4), str);
            for (zzaql zzaqlVar : list) {
                long j11 = zzaqlVar.zzc;
                zzaqn.zza("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(zzaqlVar.zzb), zzaqlVar.zza);
                j10 = j11;
            }
        }
    }
}
