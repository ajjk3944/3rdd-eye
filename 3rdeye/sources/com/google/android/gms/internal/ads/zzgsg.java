package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgsg extends zzgyv implements zzhah {
    private static final zzgsg zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgsj zzd;
    private int zze;

    static {
        zzgsg zzgsgVar = new zzgsg();
        zza = zzgsgVar;
        zzgyv.zzbZ(zzgsg.class, zzgsgVar);
    }

    private zzgsg() {
    }

    public static zzgse zzb() {
        return (zzgse) zza.zzaZ();
    }

    public static zzgsg zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgsg) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzh(zzgsg zzgsgVar, zzgsj zzgsjVar) {
        zzgsjVar.getClass();
        zzgsgVar.zzd = zzgsjVar;
        zzgsgVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgsg();
        }
        zzgsf zzgsfVar = null;
        if (iOrdinal == 4) {
            return new zzgse(zzgsfVar);
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
        synchronized (zzgsg.class) {
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

    public final zzgsj zzf() {
        zzgsj zzgsjVar = this.zzd;
        return zzgsjVar == null ? zzgsj.zzd() : zzgsjVar;
    }
}
