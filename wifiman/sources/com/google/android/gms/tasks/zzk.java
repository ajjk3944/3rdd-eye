package com.google.android.gms.tasks;

import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    zzk(zzl zzlVar, Task task) {
        this.zzb = zzlVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzb) {
            try {
                zzl zzlVar = this.zzb;
                if (zzlVar.zzc != null) {
                    zzlVar.zzc.onFailure((Exception) AbstractC7901p.l(this.zza.getException()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
