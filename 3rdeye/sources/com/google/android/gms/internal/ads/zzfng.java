package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfng implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzfnj.zzc != null) {
            zzfnj.zzc.post(zzfnj.zzd);
            zzfnj.zzc.postDelayed(zzfnj.zze, 200L);
        }
    }
}
