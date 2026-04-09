package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfiu extends zzgyv implements zzhah {
    private static final zzfiu zza;
    private static volatile zzhao zzb;
    private zzgzh zzc = zzgyv.zzbK();

    static {
        zzfiu zzfiuVar = new zzfiu();
        zza = zzfiuVar;
        zzgyv.zzbZ(zzfiu.class, zzfiuVar);
    }

    private zzfiu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfir.class});
        }
        if (iOrdinal == 3) {
            return new zzfiu();
        }
        zzfit zzfitVar = null;
        if (iOrdinal == 4) {
            return new zzfis(zzfitVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhao zzhaoVar = zzb;
        if (zzhaoVar != null) {
            return zzhaoVar;
        }
        synchronized (zzfiu.class) {
            try {
                zzgyqVar = zzb;
                if (zzgyqVar == null) {
                    zzgyqVar = new zzgyq(zza);
                    zzb = zzgyqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgyqVar;
    }
}
