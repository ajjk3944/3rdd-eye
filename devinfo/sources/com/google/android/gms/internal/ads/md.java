package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class md extends qn1 {
    private static final md zzbl;
    private static volatile po1 zzbm;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private nd zzO;
    private int zza;
    private int zzaA;
    private String zzaB;
    private xn1 zzaC;
    private int zzaD;
    private xn1 zzaE;
    private hd zzaF;
    private fd zzaG;
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
    private cd zzaR;
    private dd zzaS;
    private long zzaT;
    private long zzaU;
    private int zzaV;
    private String zzaW;
    private String zzaX;
    private long zzaY;
    private long zzaZ;
    private jd zzag;
    private xn1 zzah;
    private ld zzai;
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
    private ud zzax;
    private long zzay;
    private int zzaz;
    private int zzb;
    private int zzba;
    private bd zzbb;
    private long zzbc;
    private String zzbd;
    private int zzbe;
    private boolean zzbf;
    private String zzbg;
    private long zzbh;
    private td zzbi;
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
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;

    static {
        md mdVar = new md();
        zzbl = mdVar;
        qn1.u(md.class, mdVar);
    }

    public md() {
        so1 so1Var = so1.f16499e;
        this.zzah = so1Var;
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
        this.zzaz = 1000;
        this.zzaA = 1000;
        this.zzaB = "D";
        this.zzaC = so1Var;
        this.zzaD = 1000;
        this.zzaE = so1Var;
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

    public static md B0(byte[] bArr, jn1 jn1Var) {
        return (md) qn1.n(zzbl, bArr, jn1Var);
    }

    public static zc C0() {
        return (zc) zzbl.r();
    }

    public static md D0() {
        return zzbl;
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        this.zzG = str;
    }

    public final td A0() {
        td tdVar = this.zzbi;
        return tdVar == null ? td.E() : tdVar;
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 33554432;
        this.zzH = j;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 67108864;
        this.zzI = j;
    }

    public final /* synthetic */ void D(long j) {
        this.zza |= 134217728;
        this.zzJ = j;
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

    public final /* synthetic */ void F(long j) {
        this.zza |= 536870912;
        this.zzL = j;
    }

    public final /* synthetic */ void F0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 1073741824;
        this.zzM = j;
    }

    public final /* synthetic */ void G0(long j) {
        this.zza |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= LinearLayoutManager.INVALID_OFFSET;
        this.zzN = j;
    }

    public final /* synthetic */ void H0(long j) {
        this.zza |= 16;
        this.zzi = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 2;
        this.zzP = j;
    }

    public final /* synthetic */ void I0(long j) {
        this.zza |= 32;
        this.zzj = j;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 4;
        this.zzQ = j;
    }

    public final /* synthetic */ void J0(long j) {
        this.zza |= Segment.SHARE_MINIMUM;
        this.zzo = j;
    }

    public final /* synthetic */ void K(long j) {
        this.zzb |= 8;
        this.zzR = j;
    }

    public final /* synthetic */ void K0(long j) {
        this.zza |= 2048;
        this.zzp = j;
    }

    public final /* synthetic */ void L(long j) {
        this.zzb |= 16;
        this.zzS = j;
    }

    public final /* synthetic */ void L0(long j) {
        this.zza |= Segment.SIZE;
        this.zzv = j;
    }

    public final /* synthetic */ void M(long j) {
        this.zzb |= 32;
        this.zzT = j;
    }

    public final /* synthetic */ void M0(long j) {
        this.zza |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzw = j;
    }

    public final /* synthetic */ void N(long j) {
        this.zzb |= 64;
        this.zzU = j;
    }

    public final /* synthetic */ void N0(long j) {
        this.zza |= 32768;
        this.zzx = j;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void O0(long j) {
        this.zza |= 65536;
        this.zzy = j;
    }

    public final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    public final /* synthetic */ void P0(long j) {
        this.zza |= 524288;
        this.zzB = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= Buffer.SEGMENTING_THRESHOLD;
        this.zzaa = j;
    }

    public final /* synthetic */ void Q0(long j) {
        this.zza |= 1048576;
        this.zzC = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= Segment.SIZE;
        this.zzab = j;
    }

    public final /* synthetic */ void R0(long j) {
        this.zza |= 2097152;
        this.zzD = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zzb |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzac = j;
    }

    public final /* synthetic */ void S0(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    public final /* synthetic */ void T(jd jdVar) {
        this.zzag = jdVar;
        this.zzb |= 262144;
    }

    public final void U(jd jdVar) {
        xn1 xn1Var = this.zzah;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzah = xn1Var.n(size + size);
        }
        this.zzah.add(jdVar);
    }

    public final void V() {
        this.zzah = so1.f16499e;
    }

    public final /* synthetic */ void W(ld ldVar) {
        this.zzai = ldVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void X(long j) {
        this.zzb |= 1048576;
        this.zzaj = j;
    }

    public final /* synthetic */ void Y(long j) {
        this.zzb |= 2097152;
        this.zzak = j;
    }

    public final /* synthetic */ void Z(long j) {
        this.zzb |= 4194304;
        this.zzal = j;
    }

    public final boolean a0() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void b0(long j) {
        this.zzb |= 8388608;
        this.zzam = j;
    }

    public final /* synthetic */ void c0(long j) {
        this.zzb |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        this.zzan = j;
    }

    public final /* synthetic */ void d0(long j) {
        this.zzb |= 67108864;
        this.zzap = j;
    }

    public final /* synthetic */ void e0(long j) {
        this.zzb |= 134217728;
        this.zzaq = j;
    }

    public final /* synthetic */ void f0(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void g0(String str) {
        str.getClass();
        this.zzc |= Segment.SHARE_MINIMUM;
        this.zzaH = str;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzc |= 2048;
        this.zzaI = j;
    }

    public final /* synthetic */ void i0(long j) {
        this.zzc |= Buffer.SEGMENTING_THRESHOLD;
        this.zzaJ = j;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzc |= Segment.SIZE;
        this.zzaK = j;
    }

    public final /* synthetic */ void k0(long j) {
        this.zzc |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzaL = j;
    }

    public final /* synthetic */ void l0(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void m0(long j) {
        this.zzc |= 8388608;
        this.zzaU = j;
    }

    public final /* synthetic */ void n0(long j) {
        this.zzd |= 16;
        this.zzbh = j;
    }

    public final /* synthetic */ void o0(td tdVar) {
        tdVar.getClass();
        this.zzbi = tdVar;
        this.zzd |= 32;
    }

    public final /* synthetic */ void p0(int i4) {
        this.zzY = i4 - 1;
        this.zzb |= Segment.SHARE_MINIMUM;
    }

    public final /* synthetic */ void q0(int i4) {
        this.zzZ = i4 - 1;
        this.zzb |= 2048;
    }

    public final /* synthetic */ void r0(int i4) {
        this.zzaf = i4 - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void s0(int i4) {
        this.zzaz = i4 - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void t0(int i4) {
        this.zzaA = i4 - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void u0(int i4) {
        this.zzaV = i4 - 1;
        this.zzc |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
    }

    public final String v0() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            qc qcVar = qc.f15299m;
            return new to1(zzbl, "\u0001k\u0000\u0004\u0001Įk\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ_\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈ`\u0019ဂd\u001a᠌a\u001bဈ\u0016\u001cဇb\u001dဈ\u0018\u001eဈc\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^ÉဉeĭဂfĮဈg", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbc", "zzC", "zzD", "zzbd", "zzbh", "zzbe", qc.g, "zzE", "zzbf", "zzG", "zzbg", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", jd.class, "zzT", "zzU", "zzV", "zzW", "zzY", qcVar, "zzZ", qcVar, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", qcVar, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", qc.f15298l, "zzau", qc.f15300n, "zzar", "zzaw", qc.f15294f, "zzax", "zzay", "zzan", "zzao", "zzaz", qcVar, "zzX", "zzF", "zzaA", qcVar, "zzaB", "zzaC", ed.class, "zzaD", qcVar, "zzaE", ad.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", qc.j, "zzav", qc.f15295h, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", qc.f15297k, "zzaQ", "zzbb", "zzbi", "zzbj", "zzbk"});
        }
        if (iC == 3) {
            return new md();
        }
        if (iC == 4) {
            return new zc(zzbl);
        }
        if (iC == 5) {
            return zzbl;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzbm;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (md.class) {
            try {
                pn1Var = zzbm;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzbl);
                    zzbm = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
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
