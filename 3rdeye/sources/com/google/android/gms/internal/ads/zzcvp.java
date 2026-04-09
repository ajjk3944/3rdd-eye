package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcvp extends zzdbm implements com.google.android.gms.ads.internal.client.zza {
    public zzcvp(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcvo
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
