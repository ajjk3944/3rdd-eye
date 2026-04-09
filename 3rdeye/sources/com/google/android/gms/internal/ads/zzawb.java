package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzawb extends zzaui {
    public long zza;
    public long zzb;

    public zzawb() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.zza));
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzawb(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap mapZza = zzaui.zza(str);
        if (mapZza != null) {
            this.zza = ((Long) mapZza.get(0)).longValue();
            this.zzb = ((Long) mapZza.get(1)).longValue();
        }
    }
}
