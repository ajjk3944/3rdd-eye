package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbkz extends zzblb {
    private final OnH5AdsEventListener zza;

    public zzbkz(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
