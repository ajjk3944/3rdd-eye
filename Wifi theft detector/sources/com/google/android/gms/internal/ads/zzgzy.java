package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public interface zzgzy extends ExecutorService {
    /* bridge */ /* synthetic */ Future submit(Runnable runnable);

    /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj);

    /* bridge */ /* synthetic */ Future submit(Callable callable);

    com.google.common.util.concurrent.a zza(Runnable runnable);

    com.google.common.util.concurrent.a zzb(Runnable runnable, Object obj);

    com.google.common.util.concurrent.a zzc(Callable callable);
}
