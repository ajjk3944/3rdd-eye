package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class ED implements InterfaceFutureC2326a {

    /* renamed from: b, reason: collision with root package name */
    public static final ED f7928b = new ED(null);

    /* renamed from: c, reason: collision with root package name */
    public static final HD f7929c = new HD(ED.class);

    /* renamed from: a, reason: collision with root package name */
    public final Object f7930a;

    public ED(Object obj) {
        this.f7930a = obj;
    }

    @Override // f4.InterfaceFutureC2326a
    public final void a(Runnable runnable, Executor executor) {
        AbstractC0582Jp.j0(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            Logger loggerA = f7929c.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerA.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", AbstractC1135f5.o(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e6);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f7930a;
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
        String string = super.toString();
        String strValueOf = String.valueOf(this.f7930a);
        return AbstractC1135f5.o(new StringBuilder(String.valueOf(string).length() + 25 + strValueOf.length() + 2), string, "[status=SUCCESS, result=[", strValueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f7930a;
    }
}
