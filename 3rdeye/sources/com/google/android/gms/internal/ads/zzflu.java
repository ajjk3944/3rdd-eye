package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzflu implements Runnable {
    final /* synthetic */ zzflv zza;

    public zzflu(zzflv zzflvVar) {
        this.zza = zzflvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzflv zzflvVar = this.zza;
        float fZza = zzflv.zza(zzflvVar);
        if (((Float) zzflvVar.zzc.getAndSet(Float.valueOf(fZza))).floatValue() != fZza) {
            zzflvVar.zzd.zze(fZza);
        }
    }
}
