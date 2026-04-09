package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcvt extends zzdbm implements zzcvu {
    public zzcvt(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcvs
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcvu) obj).zzdD(zzeVar);
            }
        });
    }
}
