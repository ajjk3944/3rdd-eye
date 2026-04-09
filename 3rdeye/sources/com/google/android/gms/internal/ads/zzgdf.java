package com.google.android.gms.internal.ads;

import F3.h;
import io.appmetrica.analytics.impl.Oo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgdf implements A4.a {
    static final A4.a zza = new zzgdf(null);
    private static final zzgdk zzb = new zzgdk(zzgdf.class);
    private final Object zzc;

    public zzgdf(Object obj) {
        this.zzc = obj;
    }

    @Override // A4.a
    public final void addListener(Runnable runnable, Executor executor) {
        zzfve.zzc(runnable, "Runnable was null.");
        zzfve.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", Oo.f("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return h.i(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.zzc), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }
}
