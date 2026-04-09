package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzflm extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzflo zzb;
    final /* synthetic */ zzcfv zzc;

    public zzflm(zzflo zzfloVar, zzcfv zzcfvVar, Timer timer) {
        this.zzc = zzcfvVar;
        this.zza = timer;
        this.zzb = zzfloVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzb.zzh();
        zzcfw.zzaI(this.zzc.zza, true);
        this.zza.cancel();
    }
}
