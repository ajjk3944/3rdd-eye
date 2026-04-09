package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzess implements zzett {
    private final String zza;
    private final int zzb;

    public zzess(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcut) obj).zzb.putString(CommonUrlParts.REQUEST_ID, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        bundle.putString(CommonUrlParts.REQUEST_ID, this.zza);
        if (this.zzb == 2) {
            bundle.putInt("sod", 1);
        }
    }
}
