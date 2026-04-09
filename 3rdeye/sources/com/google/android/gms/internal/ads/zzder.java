package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzder extends zzdbm {
    private boolean zzb;

    public zzder(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdeo
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzden
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.zzb) {
                zzq(new zzdep());
                this.zzb = true;
            }
            zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdeq
                @Override // com.google.android.gms.internal.ads.zzdbl
                public final void zza(Object obj) {
                    ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        zzq(new zzdep());
        this.zzb = true;
    }
}
