package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.1.1 */
/* loaded from: classes2.dex */
abstract class zzdt implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzee zzk;

    public zzdt(zzee zzeeVar, boolean z10) {
        this.zzk = zzeeVar;
        this.zzh = zzeeVar.zza.currentTimeMillis();
        this.zzi = zzeeVar.zza.elapsedRealtime();
        this.zzj = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzk.zzh) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e4) {
            this.zzk.zzS(e4, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza() throws RemoteException;

    public void zzb() {
    }
}
