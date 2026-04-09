package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcyl implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcyo zzcyoVar = (zzcyo) this.zza.get();
        if (zzcyoVar != null) {
            zzcyoVar.zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcyj
                @Override // com.google.android.gms.internal.ads.zzdbl
                public final void zza(Object obj) {
                    ((zzcyi) obj).zza();
                }
            });
        }
    }
}
