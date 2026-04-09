package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfmc {
    private final zzfnq zza;
    private final String zzb;
    private final zzflk zzc;
    private final String zzd = "Ad overlay";

    public zzfmc(View view, zzflk zzflkVar, String str) {
        this.zza = new zzfnq(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzflkVar;
    }

    public final zzflk zza() {
        return this.zzc;
    }

    public final zzfnq zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
