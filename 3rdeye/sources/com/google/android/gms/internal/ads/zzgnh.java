package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgnh {
    private static final zzgnh zza = new zzgnh();
    private static final zzgnf zzb = new zzgnf(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgnh zzb() {
        return zza;
    }

    public final zzgmx zza() {
        zzgmx zzgmxVar = (zzgmx) this.zzc.get();
        return zzgmxVar == null ? zzb : zzgmxVar;
    }
}
