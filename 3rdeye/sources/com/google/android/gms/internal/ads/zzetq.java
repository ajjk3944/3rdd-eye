package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzetq implements zzett {
    private final Bundle zza;

    public zzetq(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcut zzcutVar = (zzcut) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzcutVar.zzb.putBundle("shared_pref", bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcut zzcutVar = (zzcut) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzcutVar.zza.putBundle("shared_pref", bundle);
    }
}
