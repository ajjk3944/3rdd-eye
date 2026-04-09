package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgtt extends zzgyv implements zzhah {
    private static final zzgtt zza;
    private static volatile zzhao zzb;
    private String zzc = "";
    private zzgxn zzd = zzgxn.zzb;
    private int zze;

    static {
        zzgtt zzgttVar = new zzgtt();
        zza = zzgttVar;
        zzgyv.zzbZ(zzgtt.class, zzgttVar);
    }

    private zzgtt() {
    }

    public static zzgtr zza() {
        return (zzgtr) zza.zzaZ();
    }

    public static zzgtr zzb(zzgtt zzgttVar) {
        return (zzgtr) zza.zzba(zzgttVar);
    }

    public static zzgtt zzd() {
        return zza;
    }

    public static zzgtt zzf(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
        return (zzgtt) zzgyv.zzbx(zza, bArr, zzgyfVar);
    }

    public static /* synthetic */ void zzk(zzgtt zzgttVar, String str) {
        str.getClass();
        zzgttVar.zzc = str;
    }

    public static /* synthetic */ void zzl(zzgtt zzgttVar, zzgxn zzgxnVar) {
        zzgxnVar.getClass();
        zzgttVar.zzd = zzgxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgtt();
        }
        zzgts zzgtsVar = null;
        if (iOrdinal == 4) {
            return new zzgtr(zzgtsVar);
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
        synchronized (zzgtt.class) {
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

    public final zzgut zzg() {
        zzgut zzgutVarZzb = zzgut.zzb(this.zze);
        return zzgutVarZzb == null ? zzgut.UNRECOGNIZED : zzgutVarZzb;
    }

    public final zzgxn zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
