package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgup extends zzgyv implements zzhah {
    private static final zzgup zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgus zze;

    static {
        zzgup zzgupVar = new zzgup();
        zza = zzgupVar;
        zzgyv.zzbZ(zzgup.class, zzgupVar);
    }

    private zzgup() {
    }

    public static zzgun zzb() {
        return (zzgun) zza.zzaZ();
    }

    public static zzgup zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgup) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static zzhao zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgup zzgupVar, zzgus zzgusVar) {
        zzgusVar.getClass();
        zzgupVar.zze = zzgusVar;
        zzgupVar.zzc |= 1;
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
            return new zzgup();
        }
        zzguo zzguoVar = null;
        if (iOrdinal == 4) {
            return new zzgun(zzguoVar);
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
        synchronized (zzgup.class) {
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

    public final zzgus zzf() {
        zzgus zzgusVar = this.zze;
        return zzgusVar == null ? zzgus.zzd() : zzgusVar;
    }
}
