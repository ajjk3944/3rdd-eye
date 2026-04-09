package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzip implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzis zzb;

    public zzip(zzis zzisVar, long j4) {
        this.zzb = zzisVar;
        this.zza = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
