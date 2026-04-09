package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfku implements Runnable {
    final /* synthetic */ zzfkv zza;

    public zzfku(zzfkv zzfkvVar) {
        this.zza = zzfkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfkv zzfkvVar = this.zza;
        if (zzfkvVar.zzp != null) {
            zzfkvVar.zzp.zzj(zzfkvVar.zzq.currentTimeMillis(), zzfkvVar.zzr, zzfkvVar.zze.zzd, zzfkvVar.zzD());
        }
    }
}
