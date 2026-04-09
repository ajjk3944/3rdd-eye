package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgni {
    private static final zzgni zza = new zzgni();
    private final Map zzb = new HashMap();

    public static zzgni zzb() {
        return zza;
    }

    public final synchronized zzgfa zza(String str) throws GeneralSecurityException {
        Map map;
        map = this.zzb;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzgfa) map.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzgfa zzgfaVar) throws GeneralSecurityException {
        try {
            Map map = this.zzb;
            if (!map.containsKey(str)) {
                map.put(str, zzgfaVar);
                return;
            }
            if (((zzgfa) map.get(str)).equals(zzgfaVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(map.get(str)) + "), cannot insert " + String.valueOf(zzgfaVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzgfa) entry.getValue());
        }
    }
}
