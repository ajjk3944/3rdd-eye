package com.google.android.gms.internal.ads;

import android.content.Context;
import z0.C5848a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzelo implements zzetu {
    private final Context zza;

    public zzelo(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return zzgdb.zzh(new zzelp(C5848a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
