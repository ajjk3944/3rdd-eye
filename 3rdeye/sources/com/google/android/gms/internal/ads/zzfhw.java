package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfhw extends zzgyv implements zzhah {
    private static final zzfhw zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzfht zzd;

    static {
        zzfhw zzfhwVar = new zzfhw();
        zza = zzfhwVar;
        zzgyv.zzbZ(zzfhw.class, zzfhwVar);
    }

    private zzfhw() {
    }

    public static zzfhv zza() {
        return (zzfhv) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfhw zzfhwVar, zzfht zzfhtVar) {
        zzfhtVar.getClass();
        zzfhwVar.zzd = zzfhtVar;
        zzfhwVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzfhw();
        }
        zzfhx zzfhxVar = null;
        if (iOrdinal == 4) {
            return new zzfhv(zzfhxVar);
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
        synchronized (zzfhw.class) {
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
