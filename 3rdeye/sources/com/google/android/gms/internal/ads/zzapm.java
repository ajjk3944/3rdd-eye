package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzapm implements Runnable {
    final /* synthetic */ zzaqb zza;
    final /* synthetic */ zzapn zzb;

    public zzapm(zzapn zzapnVar, zzaqb zzaqbVar) {
        this.zza = zzaqbVar;
        this.zzb = zzapnVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
