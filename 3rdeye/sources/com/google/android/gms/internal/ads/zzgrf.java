package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgrf extends zzgyv implements zzhah {
    private static final zzgrf zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgxn zze = zzgxn.zzb;
    private zzgrl zzf;

    static {
        zzgrf zzgrfVar = new zzgrf();
        zza = zzgrfVar;
        zzgyv.zzbZ(zzgrf.class, zzgrfVar);
    }

    private zzgrf() {
    }

    public static zzgrd zzb() {
        return (zzgrd) zza.zzaZ();
    }

    public static zzgrf zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgrf) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static zzhao zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgrf zzgrfVar, zzgrl zzgrlVar) {
        zzgrlVar.getClass();
        zzgrfVar.zzf = zzgrlVar;
        zzgrfVar.zzc |= 1;
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
            return zzgyv.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgrf();
        }
        zzgre zzgreVar = null;
        if (iOrdinal == 4) {
            return new zzgrd(zzgreVar);
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
        synchronized (zzgrf.class) {
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

    public final zzgrl zzf() {
        zzgrl zzgrlVar = this.zzf;
        return zzgrlVar == null ? zzgrl.zzd() : zzgrlVar;
    }

    public final zzgxn zzg() {
        return this.zze;
    }
}
