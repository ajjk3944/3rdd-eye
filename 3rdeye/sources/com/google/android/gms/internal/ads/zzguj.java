package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzguj extends zzgyv implements zzhah {
    private static final zzguj zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgum zze;

    static {
        zzguj zzgujVar = new zzguj();
        zza = zzgujVar;
        zzgyv.zzbZ(zzguj.class, zzgujVar);
    }

    private zzguj() {
    }

    public static zzguh zzb() {
        return (zzguh) zza.zzaZ();
    }

    public static zzguj zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzguj) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static zzhao zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzguj zzgujVar, zzgum zzgumVar) {
        zzgumVar.getClass();
        zzgujVar.zze = zzgumVar;
        zzgujVar.zzc |= 1;
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
            return new zzguj();
        }
        zzgui zzguiVar = null;
        if (iOrdinal == 4) {
            return new zzguh(zzguiVar);
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
        synchronized (zzguj.class) {
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

    public final zzgum zzf() {
        zzgum zzgumVar = this.zze;
        return zzgumVar == null ? zzgum.zzc() : zzgumVar;
    }
}
