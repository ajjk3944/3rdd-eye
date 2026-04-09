package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgtp extends zzgyv implements zzhah {
    private static final zzgtp zza;
    private static volatile zzhao zzb;
    private String zzc = "";
    private zzgxn zzd = zzgxn.zzb;
    private int zze;

    static {
        zzgtp zzgtpVar = new zzgtp();
        zza = zzgtpVar;
        zzgyv.zzbZ(zzgtp.class, zzgtpVar);
    }

    private zzgtp() {
    }

    public static zzgtm zza() {
        return (zzgtm) zza.zzaZ();
    }

    public static zzgtp zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzgtp zzgtpVar, String str) {
        str.getClass();
        zzgtpVar.zzc = str;
    }

    public static /* synthetic */ void zzj(zzgtp zzgtpVar, zzgxn zzgxnVar) {
        zzgxnVar.getClass();
        zzgtpVar.zzd = zzgxnVar;
    }

    public final zzgtn zzb() {
        int i = this.zze;
        zzgtn zzgtnVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzgtn.REMOTE : zzgtn.ASYMMETRIC_PUBLIC : zzgtn.ASYMMETRIC_PRIVATE : zzgtn.SYMMETRIC : zzgtn.UNKNOWN_KEYMATERIAL;
        return zzgtnVar == null ? zzgtn.UNRECOGNIZED : zzgtnVar;
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
            return new zzgtp();
        }
        zzgto zzgtoVar = null;
        if (iOrdinal == 4) {
            return new zzgtm(zzgtoVar);
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
        synchronized (zzgtp.class) {
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

    public final zzgxn zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
