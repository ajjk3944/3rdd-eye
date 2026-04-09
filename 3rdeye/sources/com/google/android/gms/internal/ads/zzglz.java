package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzglz {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzglz(Map map, Map map2, zzgly zzglyVar) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzglx zza() {
        return new zzglx(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) this.zzb.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r32) throws GeneralSecurityException {
        Object obj = this.zza.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
