package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgtb extends zzgyv implements zzhah {
    private static final zzgtb zza;
    private static volatile zzhao zzb;

    static {
        zzgtb zzgtbVar = new zzgtb();
        zza = zzgtbVar;
        zzgyv.zzbZ(zzgtb.class, zzgtbVar);
    }

    private zzgtb() {
    }

    public static zzgtb zzb() {
        return zza;
    }

    public static zzgtb zzc(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgtb) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        zzgta zzgtaVar = null;
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzgtb();
        }
        if (iOrdinal == 4) {
            return new zzgsz(zzgtaVar);
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
        synchronized (zzgtb.class) {
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
