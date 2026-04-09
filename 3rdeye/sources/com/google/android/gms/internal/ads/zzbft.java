package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbft {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbfr zza() {
        return (zzbfr) zza.get();
    }

    public static zzbfs zzb() {
        return (zzbfs) zzb.get();
    }

    public static void zzc(zzbfr zzbfrVar) {
        zza.set(zzbfrVar);
    }
}
