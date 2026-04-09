package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgri extends zzgyv implements zzhah {
    private static final zzgri zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgrl zze;

    static {
        zzgri zzgriVar = new zzgri();
        zza = zzgriVar;
        zzgyv.zzbZ(zzgri.class, zzgriVar);
    }

    private zzgri() {
    }

    public static zzgrg zzb() {
        return (zzgrg) zza.zzaZ();
    }

    public static zzgri zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgri) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzh(zzgri zzgriVar, zzgrl zzgrlVar) {
        zzgrlVar.getClass();
        zzgriVar.zze = zzgrlVar;
        zzgriVar.zzc |= 1;
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
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgri();
        }
        zzgrh zzgrhVar = null;
        if (iOrdinal == 4) {
            return new zzgrg(zzgrhVar);
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
        synchronized (zzgri.class) {
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
        zzgrl zzgrlVar = this.zze;
        return zzgrlVar == null ? zzgrl.zzd() : zzgrlVar;
    }
}
