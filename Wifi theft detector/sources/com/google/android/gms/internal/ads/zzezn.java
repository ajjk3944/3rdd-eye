package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzezn implements zzfax {

    @Nullable
    private final Bundle zza;

    public zzezn(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.a zza() {
        return zzgzo.zza(new zzezo(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 30;
    }
}
