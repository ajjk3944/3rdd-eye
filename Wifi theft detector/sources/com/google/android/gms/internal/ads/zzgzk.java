package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public abstract class zzgzk extends zzgzi implements com.google.common.util.concurrent.a {
    @Override // com.google.common.util.concurrent.a
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public /* bridge */ /* synthetic */ Future zza() {
        throw null;
    }

    public abstract com.google.common.util.concurrent.a zzc();
}
