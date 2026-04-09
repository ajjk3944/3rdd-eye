package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcym implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcyo zzcyoVar = (zzcyo) this.zza.get();
        if (zzcyoVar != null) {
            zzcyoVar.zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcyk
                @Override // com.google.android.gms.internal.ads.zzdbl
                public final void zza(Object obj) throws ExecutionException, InterruptedException {
                    ((zzcyi) obj).zzb();
                }
            });
        }
    }
}
