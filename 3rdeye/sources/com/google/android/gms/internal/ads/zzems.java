package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzems {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzemr zzb;

    public final zzemr zza() {
        return this.zzb;
    }

    public final void zzb(zzemr zzemrVar) {
        this.zzb = zzemrVar;
    }

    public final void zzc(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
