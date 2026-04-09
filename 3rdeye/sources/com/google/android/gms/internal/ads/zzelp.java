package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzelp implements zzett {
    private final boolean zza;

    public zzelp(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcut) obj).zza.putString("adid_p", true != this.zza ? CommonUrlParts.Values.FALSE_INTEGER : "1");
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
