package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfnm {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfnl zzd = null;

    public zzfnm() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfnl zzfnlVar = (zzfnl) this.zzc.poll();
        this.zzd = zzfnlVar;
        if (zzfnlVar != null) {
            zzfnlVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfnl zzfnlVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfnl zzfnlVar) {
        zzfnlVar.zzb(this);
        this.zzc.add(zzfnlVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
