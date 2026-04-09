package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzapr implements Runnable {
    private final zzaqb zza;
    private final zzaqh zzb;
    private final Runnable zzc;

    public zzapr(zzaqb zzaqbVar, zzaqh zzaqhVar, Runnable runnable) {
        this.zza = zzaqbVar;
        this.zzb = zzaqhVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqb zzaqbVar = this.zza;
        zzaqbVar.zzw();
        zzaqh zzaqhVar = this.zzb;
        if (zzaqhVar.zzc()) {
            zzaqbVar.zzo(zzaqhVar.zza);
        } else {
            zzaqbVar.zzn(zzaqhVar.zzc);
        }
        if (zzaqhVar.zzd) {
            zzaqbVar.zzm("intermediate-response");
        } else {
            zzaqbVar.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
