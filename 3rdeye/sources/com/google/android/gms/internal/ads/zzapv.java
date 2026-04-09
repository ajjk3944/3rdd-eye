package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzapv extends Thread {
    private final BlockingQueue zza;
    private final zzapu zzb;
    private final zzapl zzc;
    private volatile boolean zzd = false;
    private final zzaps zze;

    public zzapv(BlockingQueue blockingQueue, zzapu zzapuVar, zzapl zzaplVar, zzaps zzapsVar) {
        this.zza = blockingQueue;
        this.zzb = zzapuVar;
        this.zzc = zzaplVar;
        this.zze = zzapsVar;
    }

    private void zzb() throws InterruptedException {
        zzaqb zzaqbVar = (zzaqb) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaqbVar.zzt(3);
        try {
            try {
                zzaqbVar.zzm("network-queue-take");
                zzaqbVar.zzw();
                TrafficStats.setThreadStatsTag(zzaqbVar.zzc());
                zzapx zzapxVarZza = this.zzb.zza(zzaqbVar);
                zzaqbVar.zzm("network-http-complete");
                if (zzapxVarZza.zze && zzaqbVar.zzv()) {
                    zzaqbVar.zzp("not-modified");
                    zzaqbVar.zzr();
                } else {
                    zzaqh zzaqhVarZzh = zzaqbVar.zzh(zzapxVarZza);
                    zzaqbVar.zzm("network-parse-complete");
                    zzapk zzapkVar = zzaqhVarZzh.zzb;
                    if (zzapkVar != null) {
                        this.zzc.zzd(zzaqbVar.zzj(), zzapkVar);
                        zzaqbVar.zzm("network-cache-written");
                    }
                    zzaqbVar.zzq();
                    this.zze.zzb(zzaqbVar, zzaqhVarZzh, null);
                    zzaqbVar.zzs(zzaqhVarZzh);
                }
            } catch (zzaqk e4) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqbVar, e4);
                zzaqbVar.zzr();
            } catch (Exception e10) {
                zzaqn.zzc(e10, "Unhandled exception %s", e10.toString());
                zzaqk zzaqkVar = new zzaqk(e10);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqbVar, zzaqkVar);
                zzaqbVar.zzr();
            }
            zzaqbVar.zzt(4);
        } catch (Throwable th) {
            zzaqbVar.zzt(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqn.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
