package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgro extends zzgyv implements zzhah {
    private static final zzgro zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgru zze;
    private zzgtf zzf;

    static {
        zzgro zzgroVar = new zzgro();
        zza = zzgroVar;
        zzgyv.zzbZ(zzgro.class, zzgroVar);
    }

    private zzgro() {
    }

    public static zzgrm zzb() {
        return (zzgrm) zza.zzaZ();
    }

    public static zzgro zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgro) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static zzhao zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzi(zzgro zzgroVar, zzgru zzgruVar) {
        zzgruVar.getClass();
        zzgroVar.zze = zzgruVar;
        zzgroVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzgro zzgroVar, zzgtf zzgtfVar) {
        zzgtfVar.getClass();
        zzgroVar.zzf = zzgtfVar;
        zzgroVar.zzc |= 2;
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
            return zzgyv.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgro();
        }
        zzgrn zzgrnVar = null;
        if (iOrdinal == 4) {
            return new zzgrm(zzgrnVar);
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
        synchronized (zzgro.class) {
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

    public final zzgru zzf() {
        zzgru zzgruVar = this.zze;
        return zzgruVar == null ? zzgru.zzd() : zzgruVar;
    }

    public final zzgtf zzg() {
        zzgtf zzgtfVar = this.zzf;
        return zzgtfVar == null ? zzgtf.zzd() : zzgtfVar;
    }
}
