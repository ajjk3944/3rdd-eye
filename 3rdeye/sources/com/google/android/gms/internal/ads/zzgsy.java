package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgsy extends zzgyv implements zzhah {
    private static final zzgsy zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgxn zzd = zzgxn.zzb;

    static {
        zzgsy zzgsyVar = new zzgsy();
        zza = zzgsyVar;
        zzgyv.zzbZ(zzgsy.class, zzgsyVar);
    }

    private zzgsy() {
    }

    public static zzgsw zzb() {
        return (zzgsw) zza.zzaZ();
    }

    public static zzgsy zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgsy) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static zzhao zzg() {
        return zza.zzbN();
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzgsy();
        }
        zzgsx zzgsxVar = null;
        if (iOrdinal == 4) {
            return new zzgsw(zzgsxVar);
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
        synchronized (zzgsy.class) {
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
}
