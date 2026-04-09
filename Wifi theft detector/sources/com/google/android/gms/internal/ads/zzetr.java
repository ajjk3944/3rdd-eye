package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzetr {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzetq zzb;

    public final void zza(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    public final void zzc(zzetq zzetqVar) {
        this.zzb = zzetqVar;
    }

    @Nullable
    public final zzetq zzd() {
        return this.zzb;
    }
}
