package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfep {
    private final HashMap zza = new HashMap();

    public final zzfeo zza(zzfef zzfefVar, Context context, zzfdx zzfdxVar, zzfev zzfevVar) {
        HashMap map = this.zza;
        zzfeo zzfeoVar = (zzfeo) map.get(zzfefVar);
        if (zzfeoVar != null) {
            return zzfeoVar;
        }
        zzfec zzfecVar = new zzfec(zzfei.zza(zzfefVar, context));
        zzfeo zzfeoVar2 = new zzfeo(zzfecVar, new zzfex(zzfecVar, zzfdxVar, zzfevVar));
        map.put(zzfefVar, zzfeoVar2);
        return zzfeoVar2;
    }
}
