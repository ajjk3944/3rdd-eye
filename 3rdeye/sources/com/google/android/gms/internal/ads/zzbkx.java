package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbkx implements zzbkd {
    private final zzdvb zza;

    public zzbkx(zzdvb zzdvbVar) {
        Preconditions.checkNotNull(zzdvbVar, "The Inspector Manager must not be null");
        this.zza = zzdvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws NumberFormatException {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j4 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j4 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j4);
    }
}
