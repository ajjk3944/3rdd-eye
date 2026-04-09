package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136f6 extends AbstractC1096eL {
    private static final C1136f6 zzbl;
    private static volatile CL zzbm;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private C1191g6 zzO;
    private int zza;
    private int zzaA;
    private String zzaB;
    private InterfaceC1474lL zzaC;
    private int zzaD;
    private InterfaceC1474lL zzaE;
    private C0863a6 zzaF;
    private Y5 zzaG;
    private String zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private long zzaN;
    private long zzaO;
    private String zzaP;
    private long zzaQ;
    private V5 zzaR;
    private W5 zzaS;
    private long zzaT;
    private long zzaU;
    private int zzaV;
    private String zzaW;
    private String zzaX;
    private long zzaY;
    private long zzaZ;
    private C0972c6 zzag;
    private InterfaceC1474lL zzah;
    private C1081e6 zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private String zzar;
    private long zzas;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private C1567n6 zzax;
    private long zzay;
    private int zzaz;
    private int zzb;
    private int zzba;
    private U5 zzbb;
    private long zzbc;
    private String zzbd;
    private int zzbe;
    private boolean zzbf;
    private String zzbg;
    private long zzbh;
    private C1513m6 zzbi;
    private long zzbj;
    private String zzbk;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zzZ = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = TTAdConstant.STYLE_SIZE_RADIO_1_1;

    static {
        C1136f6 c1136f6 = new C1136f6();
        zzbl = c1136f6;
        AbstractC1096eL.u(C1136f6.class, c1136f6);
    }

    public C1136f6() {
        FL fl = FL.f8088e;
        this.zzah = fl;
        this.zzaj = -1L;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = "D";
        this.zzas = -1L;
        this.zzay = -1L;
        this.zzaz = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        this.zzaA = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        this.zzaB = "D";
        this.zzaC = fl;
        this.zzaD = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        this.zzaE = fl;
        this.zzaH = "";
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaL = -1L;
        this.zzaO = -1L;
        this.zzaP = "";
        this.zzaT = -1L;
        this.zzaU = -1L;
        this.zzaW = "";
        this.zzaX = "";
        this.zzaY = -1L;
        this.zzaZ = -1L;
        this.zzbd = "";
        this.zzbe = 2;
        this.zzbg = "";
        this.zzbj = -1L;
        this.zzbk = "";
    }

    public static C1136f6 B0(byte[] bArr, XK xk) {
        return (C1136f6) AbstractC1096eL.n(zzbl, bArr, xk);
    }

    public static S5 C0() {
        return (S5) zzbl.r();
    }

    public static C1136f6 D0() {
        return zzbl;
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }

    public final C1513m6 A0() {
        C1513m6 c1513m6 = this.zzbi;
        return c1513m6 == null ? C1513m6.E() : c1513m6;
    }

    public final /* synthetic */ void B(long j6) {
        this.zza |= 33554432;
        this.zzH = j6;
    }

    public final /* synthetic */ void C(long j6) {
        this.zza |= 67108864;
        this.zzI = j6;
    }

    public final /* synthetic */ void D(long j6) {
        this.zza |= 134217728;
        this.zzJ = j6;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void E0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void F(long j6) {
        this.zza |= 536870912;
        this.zzL = j6;
    }

    public final /* synthetic */ void F0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void G(long j6) {
        this.zza |= 1073741824;
        this.zzM = j6;
    }

    public final /* synthetic */ void G0(long j6) {
        this.zza |= 4;
        this.zzg = j6;
    }

    public final /* synthetic */ void H(long j6) {
        this.zza |= LinearLayoutManager.INVALID_OFFSET;
        this.zzN = j6;
    }

    public final /* synthetic */ void H0(long j6) {
        this.zza |= 16;
        this.zzi = j6;
    }

    public final /* synthetic */ void I(long j6) {
        this.zzb |= 2;
        this.zzP = j6;
    }

    public final /* synthetic */ void I0(long j6) {
        this.zza |= 32;
        this.zzj = j6;
    }

    public final /* synthetic */ void J(long j6) {
        this.zzb |= 4;
        this.zzQ = j6;
    }

    public final /* synthetic */ void J0(long j6) {
        this.zza |= 1024;
        this.zzo = j6;
    }

    public final /* synthetic */ void K(long j6) {
        this.zzb |= 8;
        this.zzR = j6;
    }

    public final /* synthetic */ void K0(long j6) {
        this.zza |= 2048;
        this.zzp = j6;
    }

    public final /* synthetic */ void L(long j6) {
        this.zzb |= 16;
        this.zzS = j6;
    }

    public final /* synthetic */ void L0(long j6) {
        this.zza |= 8192;
        this.zzv = j6;
    }

    public final /* synthetic */ void M(long j6) {
        this.zzb |= 32;
        this.zzT = j6;
    }

    public final /* synthetic */ void M0(long j6) {
        this.zza |= 16384;
        this.zzw = j6;
    }

    public final /* synthetic */ void N(long j6) {
        this.zzb |= 64;
        this.zzU = j6;
    }

    public final /* synthetic */ void N0(long j6) {
        this.zza |= 32768;
        this.zzx = j6;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void O0(long j6) {
        this.zza |= 65536;
        this.zzy = j6;
    }

    public final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    public final /* synthetic */ void P0(long j6) {
        this.zza |= 524288;
        this.zzB = j6;
    }

    public final /* synthetic */ void Q(long j6) {
        this.zzb |= 4096;
        this.zzaa = j6;
    }

    public final /* synthetic */ void Q0(long j6) {
        this.zza |= 1048576;
        this.zzC = j6;
    }

    public final /* synthetic */ void R(long j6) {
        this.zzb |= 8192;
        this.zzab = j6;
    }

    public final /* synthetic */ void R0(long j6) {
        this.zza |= 2097152;
        this.zzD = j6;
    }

    public final /* synthetic */ void S(long j6) {
        this.zzb |= 16384;
        this.zzac = j6;
    }

    public final /* synthetic */ void S0(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    public final /* synthetic */ void T(C0972c6 c0972c6) {
        this.zzag = c0972c6;
        this.zzb |= 262144;
    }

    public final void U(C0972c6 c0972c6) {
        InterfaceC1474lL interfaceC1474lL = this.zzah;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzah = interfaceC1474lL.B(size + size);
        }
        this.zzah.add(c0972c6);
    }

    public final void V() {
        this.zzah = FL.f8088e;
    }

    public final /* synthetic */ void W(C1081e6 c1081e6) {
        this.zzai = c1081e6;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void X(long j6) {
        this.zzb |= 1048576;
        this.zzaj = j6;
    }

    public final /* synthetic */ void Y(long j6) {
        this.zzb |= 2097152;
        this.zzak = j6;
    }

    public final /* synthetic */ void Z(long j6) {
        this.zzb |= 4194304;
        this.zzal = j6;
    }

    public final boolean a0() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void b0(long j6) {
        this.zzb |= 8388608;
        this.zzam = j6;
    }

    public final /* synthetic */ void c0(long j6) {
        this.zzb |= 16777216;
        this.zzan = j6;
    }

    public final /* synthetic */ void d0(long j6) {
        this.zzb |= 67108864;
        this.zzap = j6;
    }

    public final /* synthetic */ void e0(long j6) {
        this.zzb |= 134217728;
        this.zzaq = j6;
    }

    public final /* synthetic */ void f0(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void g0(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    public final /* synthetic */ void h0(long j6) {
        this.zzc |= 2048;
        this.zzaI = j6;
    }

    public final /* synthetic */ void i0(long j6) {
        this.zzc |= 4096;
        this.zzaJ = j6;
    }

    public final /* synthetic */ void j0(long j6) {
        this.zzc |= 8192;
        this.zzaK = j6;
    }

    public final /* synthetic */ void k0(long j6) {
        this.zzc |= 16384;
        this.zzaL = j6;
    }

    public final /* synthetic */ void l0(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void m0(long j6) {
        this.zzc |= 8388608;
        this.zzaU = j6;
    }

    public final /* synthetic */ void n0(long j6) {
        this.zzd |= 16;
        this.zzbh = j6;
    }

    public final /* synthetic */ void o0(C1513m6 c1513m6) {
        c1513m6.getClass();
        this.zzbi = c1513m6;
        this.zzd |= 32;
    }

    public final /* synthetic */ void p0(int i) {
        this.zzY = i - 1;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void q0(int i) {
        this.zzZ = i - 1;
        this.zzb |= 2048;
    }

    public final /* synthetic */ void r0(int i) {
        this.zzaf = i - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void s0(int i) {
        this.zzaz = i - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void t0(int i) {
        this.zzaA = i - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void u0(int i) {
        this.zzaV = i - 1;
        this.zzc |= 16777216;
    }

    public final String v0() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            J5 j52 = J5.f9242m;
            return new GL(zzbl, "\u0001k\u0000\u0004\u0001Įk\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ_\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈ`\u0019ဂd\u001a᠌a\u001bဈ\u0016\u001cဇb\u001dဈ\u0018\u001eဈc\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^ÉဉeĭဂfĮဈg", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbc", "zzC", "zzD", "zzbd", "zzbh", "zzbe", J5.f9237g, "zzE", "zzbf", "zzG", "zzbg", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", C0972c6.class, "zzT", "zzU", "zzV", "zzW", "zzY", j52, "zzZ", j52, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", j52, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", J5.f9241l, "zzau", J5.f9243n, "zzar", "zzaw", J5.f9236f, "zzax", "zzay", "zzan", "zzao", "zzaz", j52, "zzX", "zzF", "zzaA", j52, "zzaB", "zzaC", X5.class, "zzaD", j52, "zzaE", T5.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", J5.f9239j, "zzav", J5.f9238h, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", J5.f9240k, "zzaQ", "zzbb", "zzbi", "zzbj", "zzbk"});
        }
        if (iC == 3) {
            return new C1136f6();
        }
        if (iC == 4) {
            return new S5(zzbl);
        }
        if (iC == 5) {
            return zzbl;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzbm;
        if (cl != null) {
            return cl;
        }
        synchronized (C1136f6.class) {
            try {
                c1042dL = zzbm;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzbl);
                    zzbm = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }

    public final boolean w0() {
        return (this.zzb & 1048576) != 0;
    }

    public final long x0() {
        return this.zzaj;
    }

    public final long y0() {
        return this.zzan;
    }

    public final boolean z0() {
        return (this.zzd & 32) != 0;
    }
}
