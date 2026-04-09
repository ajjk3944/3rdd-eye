package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.singular.sdk.internal.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzato extends zzgyv implements zzhah {
    private static final zzato zza;
    private static volatile zzhao zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzJ;
    private long zzK;
    private long zzL;
    private long zzN;
    private zzatq zzQ;
    private zzatj zzaH;
    private zzath zzaI;
    private long zzaO;
    private long zzaP;
    private zzasz zzaS;
    private zzatb zzaT;
    private int zzaW;
    private long zzaX;
    private zzatl zzai;
    private zzatn zzak;
    private int zzav;
    private int zzaw;
    private int zzax;
    private int zzay;
    private zzaud zzaz;
    private boolean zzba;
    private long zzbc;
    private zzaub zzbd;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzv;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzw = "";
    private String zzG = "";
    private String zzH = "D";
    private String zzI = "";
    private String zzM = "";
    private long zzO = -1;
    private long zzP = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private long zzV = -1;
    private long zzW = -1;
    private String zzX = "D";
    private String zzY = "D";
    private long zzZ = -1;
    private int zzaa = 1000;
    private int zzab = 1000;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private long zzaf = -1;
    private long zzag = -1;
    private int zzah = 1000;
    private zzgzh zzaj = zzgyv.zzbK();
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private long zzar = -1;
    private long zzas = -1;
    private String zzat = "D";
    private long zzau = -1;
    private long zzaA = -1;
    private int zzaB = 1000;
    private int zzaC = 1000;
    private String zzaD = "D";
    private zzgzh zzaE = zzgyv.zzbK();
    private int zzaF = 1000;
    private zzgzh zzaG = zzgyv.zzbK();
    private String zzaJ = "";
    private long zzaK = -1;
    private long zzaL = -1;
    private long zzaM = -1;
    private long zzaN = -1;
    private long zzaQ = -1;
    private String zzaR = "";
    private long zzaU = -1;
    private long zzaV = -1;
    private String zzaY = "";
    private int zzaZ = 2;
    private String zzbb = "";
    private long zzbe = -1;
    private String zzbf = "";

    static {
        zzato zzatoVar = new zzato();
        zza = zzatoVar;
        zzgyv.zzbZ(zzato.class, zzatoVar);
    }

    private zzato() {
    }

    public static /* synthetic */ void zzA(zzato zzatoVar, long j4) {
        zzatoVar.zze |= 8192;
        zzatoVar.zzaM = j4;
    }

    public static /* synthetic */ void zzB(zzato zzatoVar, String str) {
        str.getClass();
        zzatoVar.zzd |= 256;
        zzatoVar.zzY = str;
    }

    public static /* synthetic */ void zzC(zzato zzatoVar, String str) {
        str.getClass();
        zzatoVar.zzc |= 4194304;
        zzatoVar.zzG = str;
    }

    public static /* synthetic */ void zzD(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 1048576;
        zzatoVar.zzE = j4;
    }

    public static /* synthetic */ void zzE(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 1024;
        zzatoVar.zzu = j4;
    }

    public static /* synthetic */ void zzF(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 2048;
        zzatoVar.zzv = j4;
    }

    public static /* synthetic */ void zzG(zzato zzatoVar, String str) {
        str.getClass();
        zzatoVar.zzc |= 1;
        zzatoVar.zzg = str;
    }

    public static /* synthetic */ void zzH(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 4194304;
        zzatoVar.zzan = j4;
    }

    public static /* synthetic */ void zzI(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 524288;
        zzatoVar.zzD = j4;
    }

    public static /* synthetic */ void zzJ(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 8388608;
        zzatoVar.zzao = j4;
    }

    public static /* synthetic */ void zzK(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 64;
        zzatoVar.zzW = j4;
    }

    public static /* synthetic */ void zzL(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 16;
        zzatoVar.zzU = j4;
    }

    public static /* synthetic */ void zzM(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= RecyclerView.UNDEFINED_DURATION;
        zzatoVar.zzP = j4;
    }

    public static /* synthetic */ void zzN(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 8;
        zzatoVar.zzT = j4;
    }

    public static /* synthetic */ void zzO(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 4;
        zzatoVar.zzS = j4;
    }

    public static /* synthetic */ void zzP(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 1073741824;
        zzatoVar.zzO = j4;
    }

    public static /* synthetic */ void zzQ(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= Constants.QUEUE_ELEMENT_MAX_SIZE;
        zzatoVar.zzz = j4;
    }

    public static /* synthetic */ void zzR(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 2;
        zzatoVar.zzR = j4;
    }

    public static /* synthetic */ void zzS(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 8192;
        zzatoVar.zzx = j4;
    }

    public static /* synthetic */ void zzT(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 16384;
        zzatoVar.zzy = j4;
    }

    public static /* synthetic */ void zzU(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 16384;
        zzatoVar.zzae = j4;
    }

    public static /* synthetic */ void zzV(zzato zzatoVar, long j4) {
        zzatoVar.zze |= 2048;
        zzatoVar.zzaK = j4;
    }

    public static /* synthetic */ void zzW(zzato zzatoVar, zzatl zzatlVar) {
        zzatlVar.getClass();
        zzatoVar.zzai = zzatlVar;
        zzatoVar.zzd |= 262144;
    }

    public static /* synthetic */ void zzX(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 67108864;
        zzatoVar.zzK = j4;
    }

    public static /* synthetic */ void zzY(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 65536;
        zzatoVar.zzA = j4;
    }

    public static /* synthetic */ void zzZ(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 2097152;
        zzatoVar.zzF = j4;
    }

    public static zzasr zza() {
        return (zzasr) zza.zzaZ();
    }

    public static /* synthetic */ void zzaa(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 134217728;
        zzatoVar.zzL = j4;
    }

    public static /* synthetic */ void zzab(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 33554432;
        zzatoVar.zzJ = j4;
    }

    public static /* synthetic */ void zzac(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 536870912;
        zzatoVar.zzN = j4;
    }

    public static /* synthetic */ void zzad(zzato zzatoVar, zzatn zzatnVar) {
        zzatnVar.getClass();
        zzatoVar.zzak = zzatnVar;
        zzatoVar.zzd |= 524288;
    }

    public static /* synthetic */ void zzae(zzato zzatoVar, String str) {
        str.getClass();
        zzatoVar.zzc |= 268435456;
        zzatoVar.zzM = str;
    }

    public static /* synthetic */ void zzah(zzato zzatoVar, int i) {
        zzatoVar.zzab = i - 1;
        zzatoVar.zzd |= 2048;
    }

    public static /* synthetic */ void zzai(zzato zzatoVar, int i) {
        zzatoVar.zzah = i - 1;
        zzatoVar.zzd |= 131072;
    }

    public static /* synthetic */ void zzaj(zzato zzatoVar, int i) {
        zzatoVar.zzaC = i - 1;
        zzatoVar.zze |= 32;
    }

    public static /* synthetic */ void zzak(zzato zzatoVar, int i) {
        zzatoVar.zzaW = i - 1;
        zzatoVar.zze |= 8388608;
    }

    public static /* synthetic */ void zzal(zzato zzatoVar, int i) {
        zzatoVar.zzaB = i - 1;
        zzatoVar.zze |= 16;
    }

    public static /* synthetic */ void zzam(zzato zzatoVar, int i) {
        zzatoVar.zzaa = i - 1;
        zzatoVar.zzd |= 1024;
    }

    public static zzato zzc() {
        return zza;
    }

    public static zzato zzd(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
        return (zzato) zzgyv.zzbx(zza, bArr, zzgyfVar);
    }

    public static /* synthetic */ void zzh(zzato zzatoVar, zzatl zzatlVar) {
        zzatlVar.getClass();
        zzgzh zzgzhVar = zzatoVar.zzaj;
        if (!zzgzhVar.zzc()) {
            zzatoVar.zzaj = zzgyv.zzbL(zzgzhVar);
        }
        zzatoVar.zzaj.add(zzatlVar);
    }

    public static /* synthetic */ void zzj(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 67108864;
        zzatoVar.zzar = j4;
    }

    public static /* synthetic */ void zzk(zzato zzatoVar, String str) {
        str.getClass();
        zzatoVar.zzd |= 268435456;
        zzatoVar.zzat = str;
    }

    public static /* synthetic */ void zzl(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 134217728;
        zzatoVar.zzas = j4;
    }

    public static /* synthetic */ void zzm(zzato zzatoVar, long j4) {
        zzatoVar.zze |= 4096;
        zzatoVar.zzaL = j4;
    }

    public static /* synthetic */ void zzn(zzato zzatoVar, String str) {
        str.getClass();
        zzatoVar.zze |= 262144;
        zzatoVar.zzaR = str;
    }

    public static /* synthetic */ void zzo(zzato zzatoVar, String str) {
        str.getClass();
        zzatoVar.zzc |= 2;
        zzatoVar.zzh = str;
    }

    public static /* synthetic */ void zzp(zzato zzatoVar, String str) {
        str.getClass();
        zzatoVar.zzd |= 128;
        zzatoVar.zzX = str;
    }

    public static /* synthetic */ void zzq(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 4;
        zzatoVar.zzi = j4;
    }

    public static /* synthetic */ void zzr(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 2097152;
        zzatoVar.zzam = j4;
    }

    public static /* synthetic */ void zzs(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 32;
        zzatoVar.zzl = j4;
    }

    public static /* synthetic */ void zzt(zzato zzatoVar, long j4) {
        zzatoVar.zzc |= 16;
        zzatoVar.zzk = j4;
    }

    public static /* synthetic */ void zzu(zzato zzatoVar, String str) {
        str.getClass();
        zzatoVar.zzc |= 16777216;
        zzatoVar.zzI = str;
    }

    public static /* synthetic */ void zzv(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 32;
        zzatoVar.zzV = j4;
    }

    public static /* synthetic */ void zzw(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 4096;
        zzatoVar.zzac = j4;
    }

    public static /* synthetic */ void zzx(zzato zzatoVar, long j4) {
        zzatoVar.zzd |= 8192;
        zzatoVar.zzad = j4;
    }

    public static /* synthetic */ void zzy(zzato zzatoVar, long j4) {
        zzatoVar.zze |= 536870912;
        zzatoVar.zzbc = j4;
    }

    public static /* synthetic */ void zzz(zzato zzatoVar, long j4) {
        zzatoVar.zze |= 16384;
        zzatoVar.zzaN = j4;
    }

    public final boolean zzaf() {
        return (this.zzc & 4194304) != 0;
    }

    public final boolean zzag() {
        return (this.zze & 1073741824) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzgzb zzgzbVar = zzatw.zza;
            return zzgyv.zzbQ(zza, "\u0001d\u0000\u0004\u0001Įd\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂX\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈY\u0019ဂ]\u001a᠌Z\u001bဈ\u0016\u001cဇ[\u001dဈ\u0018\u001eဈ\\\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉS[ဉT\\ဂU]ဂV^᠌W_᠌@`ဉIaဂPÉဉ^ĭဂ_Įဈ`", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzaX", "zzE", "zzF", "zzaY", "zzbc", "zzaZ", zzasv.zza, "zzG", "zzba", "zzI", "zzbb", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzaj", zzatl.class, "zzV", "zzW", "zzX", "zzY", "zzaa", zzgzbVar, "zzab", zzgzbVar, "zzai", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", zzgzbVar, "zzak", "zzal", "zzam", "zzan", "zzao", "zzar", "zzas", "zzau", "zzav", zzatv.zza, "zzaw", zzatz.zza, "zzat", "zzay", zzass.zza, "zzaz", "zzaA", "zzap", "zzaq", "zzaB", zzgzbVar, "zzZ", "zzH", "zzaC", zzgzbVar, "zzaD", "zzaE", zzatf.class, "zzaF", zzgzbVar, "zzaG", zzasu.class, "zzaH", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaQ", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", "zzaW", zzatc.zza, "zzax", zzasw.zza, "zzaI", "zzaP", "zzbd", "zzbe", "zzbf"});
        }
        if (iOrdinal == 3) {
            return new zzato();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzasr(zzaugVar);
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
        synchronized (zzato.class) {
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

    public final zzaub zzf() {
        zzaub zzaubVar = this.zzbd;
        return zzaubVar == null ? zzaub.zzc() : zzaubVar;
    }

    public final String zzg() {
        return this.zzG;
    }
}
