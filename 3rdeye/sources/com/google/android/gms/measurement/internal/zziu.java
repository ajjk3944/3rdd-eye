package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zziu implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlc zzc;
    final /* synthetic */ zzjs zzd;

    public zziu(zzjs zzjsVar, zzq zzqVar, boolean z10, zzlc zzlcVar) {
        this.zzd = zzjsVar;
        this.zza = zzqVar;
        this.zzb = z10;
        this.zzc = zzlcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.zzd;
        zzee zzeeVar = zzjsVar.zzb;
        if (zzeeVar == null) {
            a.k(zzjsVar.zzs, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzeeVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
