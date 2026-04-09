package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzuy {
    private static final AtomicLong zza = new AtomicLong();

    public zzuy(long j4, zzgo zzgoVar, Uri uri, Map map, long j10, long j11, long j12) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }

    public zzuy(long j4, zzgo zzgoVar, long j10) {
        Uri uri = zzgoVar.zza;
    }
}
