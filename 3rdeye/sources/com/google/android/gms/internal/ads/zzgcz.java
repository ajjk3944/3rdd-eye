package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgcz {
    private final boolean zza;
    private final zzfyf zzb;

    public /* synthetic */ zzgcz(boolean z10, zzfyf zzfyfVar, zzgda zzgdaVar) {
        this.zza = z10;
        this.zzb = zzfyfVar;
    }

    public final A4.a zza(Callable callable, Executor executor) {
        return new zzgco(this.zzb, this.zza, executor, callable);
    }
}
