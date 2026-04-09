package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzguz extends zzgyv implements zzhah {
    private static final zzguz zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgvf zze;
    private zzgxn zzf = zzgxn.zzb;

    static {
        zzguz zzguzVar = new zzguz();
        zza = zzguzVar;
        zzgyv.zzbZ(zzguz.class, zzguzVar);
    }

    private zzguz() {
    }

    public static zzgux zzb() {
        return (zzgux) zza.zzaZ();
    }

    public static zzguz zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzguz) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzi(zzguz zzguzVar, zzgvf zzgvfVar) {
        zzgvfVar.getClass();
        zzguzVar.zze = zzgvfVar;
        zzguzVar.zzc |= 1;
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
            return new zzguz();
        }
        zzguy zzguyVar = null;
        if (iOrdinal == 4) {
            return new zzgux(zzguyVar);
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
        synchronized (zzguz.class) {
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

    public final zzgvf zzf() {
        zzgvf zzgvfVar = this.zze;
        return zzgvfVar == null ? zzgvf.zzd() : zzgvfVar;
    }

    public final zzgxn zzg() {
        return this.zzf;
    }
}
