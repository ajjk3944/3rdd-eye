package com.google.android.gms.tasks;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
final class zzi implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzj zzb;

    public zzi(zzj zzjVar, Task task) {
        this.zzb = zzjVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzb) {
            try {
                zzj zzjVar = this.zzb;
                if (zzjVar.zzc != null) {
                    zzjVar.zzc.onComplete(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
