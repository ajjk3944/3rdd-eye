package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzauf extends zzgyv implements zzhah {
    private static final zzauf zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgzh zzd = zzgyv.zzbK();
    private zzgxn zze = zzgxn.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzauf zzaufVar = new zzauf();
        zza = zzaufVar;
        zzgyv.zzbZ(zzauf.class, zzaufVar);
    }

    private zzauf() {
    }

    public static zzaue zza() {
        return (zzaue) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzauf zzaufVar, zzgxn zzgxnVar) {
        zzgzh zzgzhVar = zzaufVar.zzd;
        if (!zzgzhVar.zzc()) {
            zzaufVar.zzd = zzgyv.zzbL(zzgzhVar);
        }
        zzaufVar.zzd.add(zzgxnVar);
    }

    public static /* synthetic */ void zzd(zzauf zzaufVar, zzgxn zzgxnVar) {
        zzaufVar.zzc |= 1;
        zzaufVar.zze = zzgxnVar;
    }

    public static /* synthetic */ void zzf(zzauf zzaufVar, int i) {
        zzaufVar.zzg = i - 1;
        zzaufVar.zzc |= 4;
    }

    public static /* synthetic */ void zzg(zzauf zzaufVar, int i) {
        zzaufVar.zzf = 4;
        zzaufVar.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzatz.zza, "zzg", zzatv.zza});
        }
        if (iOrdinal == 3) {
            return new zzauf();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzaue(zzaugVar);
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
        synchronized (zzauf.class) {
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
