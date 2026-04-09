package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbhq {
    private final long zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final zzbhq zzc;

    public zzbhq(long j10, @Nullable String str, @Nullable zzbhq zzbhqVar) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = zzbhqVar;
    }

    public final long zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzbhq zzc() {
        return this.zzc;
    }
}
