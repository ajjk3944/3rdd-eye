package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcaz implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcbd zzc;

    public zzcaz(zzcbd zzcbdVar, int i, int i10) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = zzcbdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbd zzcbdVar = this.zzc;
        if (zzcbdVar.zzr != null) {
            zzcbdVar.zzr.zzj(this.zza, this.zzb);
        }
    }
}
