package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzayn extends zzgyv implements zzhah {
    private static final zzayn zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzayq zzd;
    private zzgxn zze;
    private zzgxn zzf;

    static {
        zzayn zzaynVar = new zzayn();
        zza = zzaynVar;
        zzgyv.zzbZ(zzayn.class, zzaynVar);
    }

    private zzayn() {
        zzgxn zzgxnVar = zzgxn.zzb;
        this.zze = zzgxnVar;
        this.zzf = zzgxnVar;
    }

    public static zzayn zzb(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzayn) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public final zzayq zzc() {
        zzayq zzayqVar = this.zzd;
        return zzayqVar == null ? zzayq.zzg() : zzayqVar;
    }

    public final zzgxn zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzayn();
        }
        zzaym zzaymVar = null;
        if (iOrdinal == 4) {
            return new zzayl(zzaymVar);
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
        synchronized (zzayn.class) {
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
        return this.zze;
    }
}
