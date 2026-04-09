package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcsz {
    private final Object zza = new Object();
    private final ConcurrentHashMap zzb = new ConcurrentHashMap();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final ConcurrentHashMap zzd = new ConcurrentHashMap();

    public final int zza(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzb(String str) {
        Long l5 = (Long) this.zzd.get(str);
        if (l5 == null) {
            return -1L;
        }
        return l5.longValue();
    }

    public final void zzc(String str) {
        synchronized (this.zza) {
            try {
                ConcurrentHashMap concurrentHashMap = this.zzb;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(String str, String str2, long j4) {
        ConcurrentHashMap concurrentHashMap = this.zzc;
        Long l5 = (Long) concurrentHashMap.get(str2);
        if (l5 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.zzd.put(str, Long.valueOf(j4 - l5.longValue()));
    }

    public final void zze(String str, long j4) {
        this.zzc.put(str, Long.valueOf(j4));
    }
}
