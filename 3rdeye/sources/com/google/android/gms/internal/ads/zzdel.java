package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdel extends zzdbm {
    public zzdel(Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdej
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdei) obj).zze(zzbkVar);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdek
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdei) obj).zzf(str);
            }
        });
    }
}
