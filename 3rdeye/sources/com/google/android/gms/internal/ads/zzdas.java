package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdas extends zzdbm implements zzbiv {
    public zzdas(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final synchronized void zzb(final String str, final String str2) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdar
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
