package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhdn extends zzgyv implements zzhah {
    private static final zzhdn zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgxn zze;
    private zzgxn zzf;

    static {
        zzhdn zzhdnVar = new zzhdn();
        zza = zzhdnVar;
        zzgyv.zzbZ(zzhdn.class, zzhdnVar);
    }

    private zzhdn() {
        zzgxn zzgxnVar = zzgxn.zzb;
        this.zze = zzgxnVar;
        this.zzf = zzgxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhdn();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhdm(zzhfeVar);
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
        synchronized (zzhdn.class) {
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
}
