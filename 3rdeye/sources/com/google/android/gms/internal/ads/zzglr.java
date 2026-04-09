package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzglr implements zzglt {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzglr(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzglt
    public final boolean zza() {
        return this.zza.get();
    }
}
