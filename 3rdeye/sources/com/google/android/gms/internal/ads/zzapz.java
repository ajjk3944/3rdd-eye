package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzapz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaqb zzc;

    public zzapz(zzaqb zzaqbVar, String str, long j4) {
        this.zza = str;
        this.zzb = j4;
        this.zzc = zzaqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqb zzaqbVar = this.zzc;
        zzaqbVar.zza.zza(this.zza, this.zzb);
        zzaqbVar.zza.zzb(zzaqbVar.toString());
    }
}
