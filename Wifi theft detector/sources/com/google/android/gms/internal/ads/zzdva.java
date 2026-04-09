package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import androidx.annotation.VisibleForTesting;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzdva {

    @Nullable
    private volatile InputEvent zza;

    @VisibleForTesting(otherwise = 3)
    public zzdva() {
    }

    public final void zza(InputEvent inputEvent) {
        this.zza = inputEvent;
    }

    @Nullable
    public final InputEvent zzb() {
        return this.zza;
    }
}
