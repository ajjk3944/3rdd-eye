package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgtf extends zzgyv implements zzhah {
    private static final zzgtf zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgtl zze;
    private zzgxn zzf = zzgxn.zzb;

    static {
        zzgtf zzgtfVar = new zzgtf();
        zza = zzgtfVar;
        zzgyv.zzbZ(zzgtf.class, zzgtfVar);
    }

    private zzgtf() {
    }

    public static zzgtd zzb() {
        return (zzgtd) zza.zzaZ();
    }

    public static zzgtf zzd() {
        return zza;
    }

    public static zzgtf zzf(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgtf) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static zzhao zzi() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzk(zzgtf zzgtfVar, zzgtl zzgtlVar) {
        zzgtlVar.getClass();
        zzgtfVar.zze = zzgtlVar;
        zzgtfVar.zzc |= 1;
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
            return new zzgtf();
        }
        zzgte zzgteVar = null;
        if (iOrdinal == 4) {
            return new zzgtd(zzgteVar);
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
        synchronized (zzgtf.class) {
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

    public final zzgtl zzg() {
        zzgtl zzgtlVar = this.zze;
        return zzgtlVar == null ? zzgtl.zzf() : zzgtlVar;
    }

    public final zzgxn zzh() {
        return this.zzf;
    }
}
