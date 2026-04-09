package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcyf extends zzdbm {
    private boolean zzb;

    public zzcyf(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcye
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcyh) obj).zzu();
            }
        });
        this.zzb = true;
    }
}
