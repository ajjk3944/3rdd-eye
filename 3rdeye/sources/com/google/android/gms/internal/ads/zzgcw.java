package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgcw extends zzgcu implements A4.a {
    @Override // A4.a
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract A4.a zzc();
}
