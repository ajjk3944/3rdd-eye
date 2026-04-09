package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgne {
    private static final zzgne zza = new zzgne();
    private final Map zzb = new HashMap();

    public static zzgne zza() {
        return zza;
    }

    public final synchronized void zzb(zzgnd zzgndVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zzb;
            zzgnd zzgndVar2 = (zzgnd) map.get(cls);
            if (zzgndVar2 != null && !zzgndVar2.equals(zzgndVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, zzgndVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
