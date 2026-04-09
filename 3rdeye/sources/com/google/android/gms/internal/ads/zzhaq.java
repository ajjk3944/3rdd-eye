package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhaq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhaq zzb = new zzhaq();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzhba zzc = new zzgzy();

    private zzhaq() {
    }

    public static zzhaq zza() {
        return zzb;
    }

    public final zzhaz zzb(Class cls) {
        zzgzi.zzc(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzd;
        zzhaz zzhazVarZza = (zzhaz) concurrentMap.get(cls);
        if (zzhazVarZza == null) {
            zzhazVarZza = this.zzc.zza(cls);
            zzgzi.zzc(cls, "messageType");
            zzhaz zzhazVar = (zzhaz) concurrentMap.putIfAbsent(cls, zzhazVarZza);
            if (zzhazVar != null) {
                return zzhazVar;
            }
        }
        return zzhazVarZza;
    }
}
