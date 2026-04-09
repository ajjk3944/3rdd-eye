package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdp {
    private final Map zza = new HashMap();
    private final zzbdr zzb;

    public zzbdp(zzbdr zzbdrVar) {
        this.zzb = zzbdrVar;
    }

    public final zzbdr zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbdo zzbdoVar) {
        this.zza.put(str, zzbdoVar);
    }

    public final void zzc(String str, String str2, long j4) {
        Map map = this.zza;
        zzbdo zzbdoVar = (zzbdo) map.get(str2);
        String[] strArr = {str};
        if (zzbdoVar != null) {
            this.zzb.zze(zzbdoVar, j4, strArr);
        }
        map.put(str, new zzbdo(j4, null, null));
    }
}
