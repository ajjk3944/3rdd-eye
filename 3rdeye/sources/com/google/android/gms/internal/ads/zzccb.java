package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzccb implements Runnable {
    private final zzcbn zza;
    private boolean zzb = false;

    public zzccb(zzcbn zzcbnVar) {
        this.zza = zzcbnVar;
    }

    private final void zzc() {
        zzfrn zzfrnVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfrnVar.removeCallbacks(this);
        zzfrnVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
