package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhdo extends zzgyv implements zzhah {
    private static final zzhdo zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzhdn zzd;
    private zzgxn zzf;
    private zzgxn zzg;
    private int zzh;
    private zzgxn zzi;
    private byte zzj = 2;
    private zzgzh zze = zzgyv.zzbK();

    static {
        zzhdo zzhdoVar = new zzhdo();
        zza = zzhdoVar;
        zzgyv.zzbZ(zzhdo.class, zzhdoVar);
    }

    private zzhdo() {
        zzgxn zzgxnVar = zzgxn.zzb;
        this.zzf = zzgxnVar;
        this.zzg = zzgxnVar;
        this.zzi = zzgxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        zzhfe zzhfeVar = null;
        switch (zzgyuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyv.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhdg.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdo();
            case NEW_BUILDER:
                return new zzhdl(zzhfeVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhao zzhaoVar = zzb;
                if (zzhaoVar != null) {
                    return zzhaoVar;
                }
                synchronized (zzhdo.class) {
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
            default:
                throw null;
        }
    }
}
