package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgsd extends zzgyv implements zzhah {
    private static final zzgsd zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgsj zze;
    private zzgxn zzf = zzgxn.zzb;

    static {
        zzgsd zzgsdVar = new zzgsd();
        zza = zzgsdVar;
        zzgyv.zzbZ(zzgsd.class, zzgsdVar);
    }

    private zzgsd() {
    }

    public static zzgsb zzb() {
        return (zzgsb) zza.zzaZ();
    }

    public static zzgsd zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgsd) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static zzhao zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgsd zzgsdVar, zzgsj zzgsjVar) {
        zzgsjVar.getClass();
        zzgsdVar.zze = zzgsjVar;
        zzgsdVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgsd();
        }
        zzgsc zzgscVar = null;
        if (iOrdinal == 4) {
            return new zzgsb(zzgscVar);
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
        synchronized (zzgsd.class) {
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
        zzgsj zzgsjVar = this.zze;
        return zzgsjVar == null ? zzgsj.zzd() : zzgsjVar;
    }

    public final zzgxn zzg() {
        return this.zzf;
    }
}
