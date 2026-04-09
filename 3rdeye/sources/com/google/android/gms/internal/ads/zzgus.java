package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgus extends zzgyv implements zzhah {
    private static final zzgus zza;
    private static volatile zzhao zzb;
    private int zzc;
    private String zzd = "";
    private zzgtt zze;

    static {
        zzgus zzgusVar = new zzgus();
        zza = zzgusVar;
        zzgyv.zzbZ(zzgus.class, zzgusVar);
    }

    private zzgus() {
    }

    public static zzguq zzb() {
        return (zzguq) zza.zzaZ();
    }

    public static zzgus zzd() {
        return zza;
    }

    public static zzgus zzf(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgus) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzh(zzgus zzgusVar, zzgtt zzgttVar) {
        zzgttVar.getClass();
        zzgusVar.zze = zzgttVar;
        zzgusVar.zzc |= 1;
    }

    public static /* synthetic */ void zzi(zzgus zzgusVar, String str) {
        str.getClass();
        zzgusVar.zzd = str;
    }

    public final zzgtt zza() {
        zzgtt zzgttVar = this.zze;
        return zzgttVar == null ? zzgtt.zzd() : zzgttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgus();
        }
        zzgur zzgurVar = null;
        if (iOrdinal == 4) {
            return new zzguq(zzgurVar);
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
        synchronized (zzgus.class) {
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

    public final String zzg() {
        return this.zzd;
    }
}
