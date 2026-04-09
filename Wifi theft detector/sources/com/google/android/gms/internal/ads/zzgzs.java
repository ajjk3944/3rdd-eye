package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class zzgzs implements com.google.common.util.concurrent.a {
    static final com.google.common.util.concurrent.a zza = new zzgzs(null);
    private static final zzgzw zzb = new zzgzw(zzgzs.class);
    private final Object zzc;

    public zzgzs(Object obj) {
        this.zzc = obj;
    }

    @Override // com.google.common.util.concurrent.a
    public final void addListener(Runnable runnable, Executor executor) {
        zzgrc.zzk(runnable, "Runnable was null.");
        zzgrc.zzk(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger loggerZza = zzb.zza();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            loggerZza.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e10);
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
        Object obj = this.zzc;
        String string = super.toString();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 25 + strValueOf.length() + 2);
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(strValueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }
}
