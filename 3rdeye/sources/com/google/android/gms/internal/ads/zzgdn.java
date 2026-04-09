package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public interface zzgdn extends ScheduledExecutorService, zzgdm {
    zzgdl zzc(Callable callable, long j4, TimeUnit timeUnit);
}
