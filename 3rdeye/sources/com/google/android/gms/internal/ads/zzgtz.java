package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgtz extends zzgyv implements zzhah {
    private static final zzgtz zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgtp zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgtz zzgtzVar = new zzgtz();
        zza = zzgtzVar;
        zzgyv.zzbZ(zzgtz.class, zzgtzVar);
    }

    private zzgtz() {
    }

    public static zzgty zzc() {
        return (zzgty) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzgtz zzgtzVar, zzgtp zzgtpVar) {
        zzgtpVar.getClass();
        zzgtzVar.zzd = zzgtpVar;
        zzgtzVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgtp zzb() {
        zzgtp zzgtpVar = this.zzd;
        return zzgtpVar == null ? zzgtp.zzd() : zzgtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzgtz();
        }
        zzgua zzguaVar = null;
        if (iOrdinal == 4) {
            return new zzgty(zzguaVar);
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
        synchronized (zzgtz.class) {
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

    public final zzgut zzf() {
        zzgut zzgutVarZzb = zzgut.zzb(this.zzg);
        return zzgutVarZzb == null ? zzgut.UNRECOGNIZED : zzgutVarZzb;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i = this.zze;
        int i10 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
