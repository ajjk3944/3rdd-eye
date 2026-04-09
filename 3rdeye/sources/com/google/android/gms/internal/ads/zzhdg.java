package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhdg extends zzgyv implements zzhah {
    private static final zzhdg zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgxn zzd;
    private zzgxn zze;
    private byte zzf = 2;

    static {
        zzhdg zzhdgVar = new zzhdg();
        zza = zzhdgVar;
        zzgyv.zzbZ(zzhdg.class, zzhdgVar);
    }

    private zzhdg() {
        zzgxn zzgxnVar = zzgxn.zzb;
        this.zzd = zzgxnVar;
        this.zze = zzgxnVar;
    }

    public static zzhdf zzc() {
        return (zzhdf) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhdg zzhdgVar, zzgxn zzgxnVar) {
        zzhdgVar.zzc |= 1;
        zzhdgVar.zzd = zzgxnVar;
    }

    public static /* synthetic */ void zzg(zzhdg zzhdgVar, zzgxn zzgxnVar) {
        zzhdgVar.zzc |= 2;
        zzhdgVar.zze = zzgxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        zzhfe zzhfeVar = null;
        switch (zzgyuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyv.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdg();
            case NEW_BUILDER:
                return new zzhdf(zzhfeVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhao zzhaoVar = zzb;
                if (zzhaoVar != null) {
                    return zzhaoVar;
                }
                synchronized (zzhdg.class) {
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
