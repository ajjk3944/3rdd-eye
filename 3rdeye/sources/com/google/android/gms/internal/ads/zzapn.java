package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzapn extends Thread {
    private static final boolean zza = zzaqn.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzapl zzd;
    private volatile boolean zze = false;
    private final zzaqo zzf;
    private final zzaps zzg;

    public zzapn(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzapl zzaplVar, zzaps zzapsVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaplVar;
        this.zzg = zzapsVar;
        this.zzf = new zzaqo(this, blockingQueue2, zzapsVar);
    }

    private void zzc() throws InterruptedException {
        zzaqb zzaqbVar = (zzaqb) this.zzb.take();
        zzaqbVar.zzm("cache-queue-take");
        zzaqbVar.zzt(1);
        try {
            zzaqbVar.zzw();
            zzapl zzaplVar = this.zzd;
            zzapk zzapkVarZza = zzaplVar.zza(zzaqbVar.zzj());
            if (zzapkVarZza == null) {
                zzaqbVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzaqbVar)) {
                    this.zzc.put(zzaqbVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzapkVarZza.zza(jCurrentTimeMillis)) {
                    zzaqbVar.zzm("cache-hit-expired");
                    zzaqbVar.zze(zzapkVarZza);
                    if (!this.zzf.zzc(zzaqbVar)) {
                        this.zzc.put(zzaqbVar);
                    }
                } else {
                    zzaqbVar.zzm("cache-hit");
                    zzaqh zzaqhVarZzh = zzaqbVar.zzh(new zzapx(zzapkVarZza.zza, zzapkVarZza.zzg));
                    zzaqbVar.zzm("cache-hit-parsed");
                    if (!zzaqhVarZzh.zzc()) {
                        zzaqbVar.zzm("cache-parsing-failed");
                        zzaplVar.zzc(zzaqbVar.zzj(), true);
                        zzaqbVar.zze(null);
                        if (!this.zzf.zzc(zzaqbVar)) {
                            this.zzc.put(zzaqbVar);
                        }
                    } else if (zzapkVarZza.zzf < jCurrentTimeMillis) {
                        zzaqbVar.zzm("cache-hit-refresh-needed");
                        zzaqbVar.zze(zzapkVarZza);
                        zzaqhVarZzh.zzd = true;
                        if (this.zzf.zzc(zzaqbVar)) {
                            this.zzg.zzb(zzaqbVar, zzaqhVarZzh, null);
                        } else {
                            this.zzg.zzb(zzaqbVar, zzaqhVarZzh, new zzapm(this, zzaqbVar));
                        }
                    } else {
                        this.zzg.zzb(zzaqbVar, zzaqhVarZzh, null);
                    }
                }
            }
            zzaqbVar.zzt(2);
        } catch (Throwable th) {
            zzaqbVar.zzt(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (zza) {
            zzaqn.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqn.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
