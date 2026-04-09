package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzayj {
    private final Map zza = new HashMap();

    public final AtomicReference zza(String str) {
        synchronized (this) {
            try {
                Map map = this.zza;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.zza.get(str);
    }
}
