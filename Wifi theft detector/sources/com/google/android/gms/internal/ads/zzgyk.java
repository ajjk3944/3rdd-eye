package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes2.dex */
public abstract class zzgyk extends AbstractExecutorService implements zzgzy {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzhan.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (com.google.common.util.concurrent.a) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final com.google.common.util.concurrent.a zza(Runnable runnable) {
        return (com.google.common.util.concurrent.a) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final com.google.common.util.concurrent.a zzb(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.a) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final com.google.common.util.concurrent.a zzc(Callable callable) {
        return (com.google.common.util.concurrent.a) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzhan(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.a) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Callable callable) {
        return (com.google.common.util.concurrent.a) super.submit(callable);
    }
}
