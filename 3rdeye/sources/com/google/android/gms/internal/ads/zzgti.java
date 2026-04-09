package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgti extends zzgyv implements zzhah {
    private static final zzgti zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgtl zzd;
    private int zze;
    private int zzf;

    static {
        zzgti zzgtiVar = new zzgti();
        zza = zzgtiVar;
        zzgyv.zzbZ(zzgti.class, zzgtiVar);
    }

    private zzgti() {
    }

    public static zzgtg zzc() {
        return (zzgtg) zza.zzaZ();
    }

    public static zzgti zzf() {
        return zza;
    }

    public static zzgti zzg(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgti) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzj(zzgti zzgtiVar, zzgtl zzgtlVar) {
        zzgtlVar.getClass();
        zzgtiVar.zzd = zzgtlVar;
        zzgtiVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgti();
        }
        zzgth zzgthVar = null;
        if (iOrdinal == 4) {
            return new zzgtg(zzgthVar);
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
        synchronized (zzgti.class) {
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

    public final zzgtl zzh() {
        zzgtl zzgtlVar = this.zzd;
        return zzgtlVar == null ? zzgtl.zzf() : zzgtlVar;
    }
}
