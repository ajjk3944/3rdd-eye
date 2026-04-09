package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhet extends zzgyv implements zzhah {
    private static final zzhet zza;
    private static volatile zzhao zzb;
    private zzhep zzC;
    private zzhda zzE;
    private zzhcs zzG;
    private zzhdt zzI;
    private int zzJ;
    private long zzM;
    private zzhes zzN;
    private zzhdy zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhcw zzi;
    private zzhee zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhel zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzgzh zzj = zzgyv.zzbK();
    private zzgzh zzk = zzgyv.zzbK();
    private String zzl = "";
    private zzgzh zzo = zzgyv.zzbK();
    private String zzp = "";
    private zzgxn zzw = zzgxn.zzb;
    private String zzz = "";
    private zzgzh zzA = zzgyv.zzbK();
    private zzgzh zzB = zzgyv.zzbK();
    private zzgzh zzD = zzgyv.zzbK();
    private String zzF = "";
    private zzgzh zzH = zzgyv.zzbK();
    private zzgzh zzK = zzgyv.zzbK();
    private zzgzh zzL = zzgyv.zzbK();
    private String zzP = "";

    static {
        zzhet zzhetVar = new zzhet();
        zza = zzhetVar;
        zzgyv.zzbZ(zzhet.class, zzhetVar);
    }

    private zzhet() {
    }

    public static zzhcu zzc() {
        return (zzhcu) zza.zzaZ();
    }

    public static /* synthetic */ void zzi(zzhet zzhetVar, Iterable iterable) {
        zzgzh zzgzhVar = zzhetVar.zzA;
        if (!zzgzhVar.zzc()) {
            zzhetVar.zzA = zzgyv.zzbL(zzgzhVar);
        }
        zzgww.zzaQ(iterable, zzhetVar.zzA);
    }

    public static /* synthetic */ void zzj(zzhet zzhetVar, Iterable iterable) {
        zzgzh zzgzhVar = zzhetVar.zzB;
        if (!zzgzhVar.zzc()) {
            zzhetVar.zzB = zzgyv.zzbL(zzgzhVar);
        }
        zzgww.zzaQ(iterable, zzhetVar.zzB);
    }

    public static /* synthetic */ void zzk(zzhet zzhetVar, zzhej zzhejVar) {
        zzhejVar.getClass();
        zzgzh zzgzhVar = zzhetVar.zzj;
        if (!zzgzhVar.zzc()) {
            zzhetVar.zzj = zzgyv.zzbL(zzgzhVar);
        }
        zzhetVar.zzj.add(zzhejVar);
    }

    public static /* synthetic */ void zzl(zzhet zzhetVar) {
        zzhetVar.zzc &= -65;
        zzhetVar.zzl = zza.zzl;
    }

    public static /* synthetic */ void zzm(zzhet zzhetVar, String str) {
        zzhetVar.zzc |= 64;
        zzhetVar.zzl = str;
    }

    public static /* synthetic */ void zzn(zzhet zzhetVar, zzhel zzhelVar) {
        zzhelVar.getClass();
        zzhetVar.zzx = zzhelVar;
        zzhetVar.zzc |= 8192;
    }

    public static /* synthetic */ void zzo(zzhet zzhetVar, zzhcw zzhcwVar) {
        zzhcwVar.getClass();
        zzhetVar.zzi = zzhcwVar;
        zzhetVar.zzc |= 32;
    }

    public static /* synthetic */ void zzp(zzhet zzhetVar, String str) {
        zzhetVar.zzc |= 8;
        zzhetVar.zzg = str;
    }

    public static /* synthetic */ void zzq(zzhet zzhetVar, zzhee zzheeVar) {
        zzheeVar.getClass();
        zzhetVar.zzm = zzheeVar;
        zzhetVar.zzc |= 128;
    }

    public static /* synthetic */ void zzr(zzhet zzhetVar, String str) {
        zzhetVar.zzc |= 4;
        zzhetVar.zzf = str;
    }

    public static /* synthetic */ void zzs(zzhet zzhetVar, int i) {
        zzhetVar.zzd = i - 1;
        zzhetVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        zzhfe zzhfeVar = null;
        switch (zzgyuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyv.zzbQ(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhej.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhef.zza, "zze", zzhct.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhex.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhfd.class, "zzE", "zzF", "zzG", "zzH", zzhde.class, "zzI", "zzJ", zzhen.zza, "zzK", zzhdw.class, "zzL", zzheb.class, "zzM", "zzN", "zzO", "zzP"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhet();
            case NEW_BUILDER:
                return new zzhcu(zzhfeVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhao zzhaoVar = zzb;
                if (zzhaoVar != null) {
                    return zzhaoVar;
                }
                synchronized (zzhet.class) {
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

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
