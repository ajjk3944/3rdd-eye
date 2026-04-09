package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.C4452s2;
import com.google.android.gms.internal.measurement.C4500y2;
import com.google.android.gms.internal.measurement.D4;
import com.google.ar.core.ImageMetadata;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.transport.TLSTM;

/* renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4492x2 extends D4 implements InterfaceC4384j5 {
    private static final C4492x2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private long zzab;
    private int zzac;
    private boolean zzaf;
    private int zzai;
    private int zzaj;
    private int zzak;
    private long zzam;
    private long zzan;
    private int zzaq;
    private C4500y2 zzas;
    private long zzau;
    private long zzav;
    private int zzay;
    private boolean zzaz;
    private boolean zzbb;
    private C4476v2 zzbc;
    private long zzbg;
    private boolean zzbh;
    private boolean zzbj;
    private int zzbl;
    private C4429p2 zzbn;
    private int zzbo;
    private C4413n2 zzbp;
    private B2 zzbr;
    private long zzbs;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private L4 zzh = D4.z();
    private L4 zzi = D4.z();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzaa = "";
    private String zzad = "";
    private String zzae = "";
    private L4 zzag = D4.z();
    private String zzah = "";
    private String zzal = "";
    private String zzao = "";
    private String zzap = "";
    private String zzar = "";
    private K4 zzat = D4.x();
    private String zzaw = "";
    private String zzax = "";
    private String zzba = "";
    private String zzbd = "";
    private L4 zzbe = D4.z();
    private String zzbf = "";
    private String zzbi = "";
    private String zzbk = "";
    private String zzbm = "";
    private String zzbq = "";
    private String zzbt = "";

    /* renamed from: com.google.android.gms.internal.measurement.x2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a A(int i10, C2 c22) {
            q();
            C4492x2.J((C4492x2) this.f34974b, i10, c22);
            return this;
        }

        public final a A0(long j10) {
            q();
            C4492x2.J1((C4492x2) this.f34974b, j10);
            return this;
        }

        public final a B(long j10) {
            q();
            C4492x2.K((C4492x2) this.f34974b, j10);
            return this;
        }

        public final a B0(String str) {
            q();
            C4492x2.K1((C4492x2) this.f34974b, str);
            return this;
        }

        public final a C0() {
            q();
            C4492x2.x0((C4492x2) this.f34974b);
            return this;
        }

        public final a D(C4413n2 c4413n2) {
            q();
            C4492x2.L((C4492x2) this.f34974b, c4413n2);
            return this;
        }

        public final a D0(int i10) {
            q();
            C4492x2.I1((C4492x2) this.f34974b, 1);
            return this;
        }

        public final a E(C4429p2 c4429p2) {
            q();
            C4492x2.M((C4492x2) this.f34974b, c4429p2);
            return this;
        }

        public final a E0(long j10) {
            q();
            C4492x2.O1((C4492x2) this.f34974b, j10);
            return this;
        }

        public final a F(C4452s2.a aVar) {
            q();
            C4492x2.N((C4492x2) this.f34974b, (C4452s2) ((D4) aVar.p()));
            return this;
        }

        public final a F0(String str) {
            q();
            C4492x2.P1((C4492x2) this.f34974b, str);
            return this;
        }

        public final a G(C4500y2.a aVar) {
            q();
            C4492x2.O((C4492x2) this.f34974b, (C4500y2) ((D4) aVar.p()));
            return this;
        }

        public final a G0() {
            q();
            C4492x2.e1((C4492x2) this.f34974b);
            return this;
        }

        public final a H(B2 b22) {
            q();
            C4492x2.P((C4492x2) this.f34974b, b22);
            return this;
        }

        public final a H0(int i10) {
            q();
            C4492x2.N1((C4492x2) this.f34974b, i10);
            return this;
        }

        public final a I(C2.a aVar) {
            q();
            C4492x2.Q((C4492x2) this.f34974b, (C2) ((D4) aVar.p()));
            return this;
        }

        public final a I0(long j10) {
            q();
            C4492x2.T1((C4492x2) this.f34974b, j10);
            return this;
        }

        public final a J0(String str) {
            q();
            C4492x2.U1((C4492x2) this.f34974b, str);
            return this;
        }

        public final a K(C2 c22) {
            q();
            C4492x2.Q((C4492x2) this.f34974b, c22);
            return this;
        }

        public final a L(Iterable iterable) {
            q();
            C4492x2.R((C4492x2) this.f34974b, iterable);
            return this;
        }

        public final a L0() {
            q();
            C4492x2.p1((C4492x2) this.f34974b);
            return this;
        }

        public final a M(String str) {
            q();
            C4492x2.S((C4492x2) this.f34974b, str);
            return this;
        }

        public final a M0(int i10) {
            q();
            C4492x2.S1((C4492x2) this.f34974b, i10);
            return this;
        }

        public final a N(boolean z10) {
            q();
            C4492x2.T((C4492x2) this.f34974b, z10);
            return this;
        }

        public final a N0(long j10) {
            q();
            C4492x2.X1((C4492x2) this.f34974b, j10);
            return this;
        }

        public final String O() {
            return ((C4492x2) this.f34974b).j0();
        }

        public final a O0(String str) {
            q();
            C4492x2.Y1((C4492x2) this.f34974b, str);
            return this;
        }

        public final List P() {
            return Collections.unmodifiableList(((C4492x2) this.f34974b).n0());
        }

        public final a P0() {
            q();
            C4492x2.w1((C4492x2) this.f34974b);
            return this;
        }

        public final List Q() {
            return Collections.unmodifiableList(((C4492x2) this.f34974b).o0());
        }

        public final a Q0(long j10) {
            q();
            C4492x2.b2((C4492x2) this.f34974b, j10);
            return this;
        }

        public final boolean R() {
            return ((C4492x2) this.f34974b).r0();
        }

        public final a R0(String str) {
            q();
            C4492x2.c2((C4492x2) this.f34974b, str);
            return this;
        }

        public final boolean S() {
            return ((C4492x2) this.f34974b).s0();
        }

        public final C2 S0(int i10) {
            return ((C4492x2) this.f34974b).w0(i10);
        }

        public final a T0() {
            q();
            C4492x2.C1((C4492x2) this.f34974b);
            return this;
        }

        public final boolean U() {
            return ((C4492x2) this.f34974b).u0();
        }

        public final a U0(long j10) {
            q();
            C4492x2.f2((C4492x2) this.f34974b, j10);
            return this;
        }

        public final int V() {
            return ((C4492x2) this.f34974b).v0();
        }

        public final a V0(String str) {
            q();
            C4492x2.g2((C4492x2) this.f34974b, str);
            return this;
        }

        public final a W(int i10) {
            q();
            C4492x2.H((C4492x2) this.f34974b, i10);
            return this;
        }

        public final a W0() {
            q();
            C4492x2.H1((C4492x2) this.f34974b);
            return this;
        }

        public final a X(long j10) {
            q();
            C4492x2.z0((C4492x2) this.f34974b, j10);
            return this;
        }

        public final a X0(long j10) {
            q();
            C4492x2.j2((C4492x2) this.f34974b, j10);
            return this;
        }

        public final a Y(Iterable iterable) {
            q();
            C4492x2.A0((C4492x2) this.f34974b, iterable);
            return this;
        }

        public final a Y0(String str) {
            q();
            C4492x2.k2((C4492x2) this.f34974b, str);
            return this;
        }

        public final a Z(String str) {
            q();
            C4492x2.B0((C4492x2) this.f34974b, str);
            return this;
        }

        public final a Z0() {
            q();
            C4492x2.M1((C4492x2) this.f34974b);
            return this;
        }

        public final a a0(boolean z10) {
            q();
            C4492x2.C0((C4492x2) this.f34974b, z10);
            return this;
        }

        public final a a1(String str) {
            q();
            C4492x2.n2((C4492x2) this.f34974b, str);
            return this;
        }

        public final a b1() {
            q();
            C4492x2.R1((C4492x2) this.f34974b);
            return this;
        }

        public final int c0() {
            return ((C4492x2) this.f34974b).v1();
        }

        public final a c1(String str) {
            q();
            C4492x2.p2((C4492x2) this.f34974b, str);
            return this;
        }

        public final a d0(int i10) {
            q();
            C4492x2.y0((C4492x2) this.f34974b, i10);
            return this;
        }

        public final a d1() {
            q();
            C4492x2.W1((C4492x2) this.f34974b);
            return this;
        }

        public final a e0(long j10) {
            q();
            C4492x2.g1((C4492x2) this.f34974b, j10);
            return this;
        }

        public final a e1(String str) {
            q();
            C4492x2.r2((C4492x2) this.f34974b, str);
            return this;
        }

        public final a f0(Iterable iterable) {
            q();
            C4492x2.h1((C4492x2) this.f34974b, iterable);
            return this;
        }

        public final a f1() {
            q();
            C4492x2.a2((C4492x2) this.f34974b);
            return this;
        }

        public final a g0(String str) {
            q();
            C4492x2.i1((C4492x2) this.f34974b, str);
            return this;
        }

        public final a g1(String str) {
            q();
            C4492x2.t2((C4492x2) this.f34974b, str);
            return this;
        }

        public final a h0(boolean z10) {
            q();
            C4492x2.j1((C4492x2) this.f34974b, z10);
            return this;
        }

        public final a h1() {
            q();
            C4492x2.e2((C4492x2) this.f34974b);
            return this;
        }

        public final int i0() {
            return ((C4492x2) this.f34974b).Q1();
        }

        public final a i1(String str) {
            q();
            C4492x2.v2((C4492x2) this.f34974b, str);
            return this;
        }

        public final a j0(int i10) {
            q();
            C4492x2.f1((C4492x2) this.f34974b, i10);
            return this;
        }

        public final a j1() {
            q();
            C4492x2.i2((C4492x2) this.f34974b);
            return this;
        }

        public final a k0(long j10) {
            q();
            C4492x2.r1((C4492x2) this.f34974b, j10);
            return this;
        }

        public final a k1(String str) {
            q();
            C4492x2.x2((C4492x2) this.f34974b, str);
            return this;
        }

        public final a l0(Iterable iterable) {
            q();
            C4492x2.s1((C4492x2) this.f34974b, iterable);
            return this;
        }

        public final a l1() {
            q();
            C4492x2.m2((C4492x2) this.f34974b);
            return this;
        }

        public final a m0(String str) {
            q();
            C4492x2.t1((C4492x2) this.f34974b, str);
            return this;
        }

        public final a m1(String str) {
            q();
            C4492x2.z2((C4492x2) this.f34974b, str);
            return this;
        }

        public final a n0(boolean z10) {
            q();
            C4492x2.u1((C4492x2) this.f34974b, z10);
            return this;
        }

        public final String n1() {
            return ((C4492x2) this.f34974b).V();
        }

        public final long o0() {
            return ((C4492x2) this.f34974b).l2();
        }

        public final String o1() {
            return ((C4492x2) this.f34974b).W();
        }

        public final a p0(int i10) {
            q();
            C4492x2.q1((C4492x2) this.f34974b, i10);
            return this;
        }

        public final String p1() {
            return ((C4492x2) this.f34974b).Z();
        }

        public final String q1() {
            return ((C4492x2) this.f34974b).b0();
        }

        public final a r0(long j10) {
            q();
            C4492x2.y1((C4492x2) this.f34974b, j10);
            return this;
        }

        public final String r1() {
            return ((C4492x2) this.f34974b).f0();
        }

        public final a s0(Iterable iterable) {
            q();
            C4492x2.z1((C4492x2) this.f34974b, iterable);
            return this;
        }

        public final String s1() {
            return ((C4492x2) this.f34974b).h0();
        }

        public final a t0(String str) {
            q();
            C4492x2.A1((C4492x2) this.f34974b, str);
            return this;
        }

        public final int u() {
            return ((C4492x2) this.f34974b).j();
        }

        public final long u0() {
            return ((C4492x2) this.f34974b).u2();
        }

        public final a v0(int i10) {
            q();
            C4492x2.x1((C4492x2) this.f34974b, i10);
            return this;
        }

        public final C4452s2 w(int i10) {
            return ((C4492x2) this.f34974b).F(i10);
        }

        public final a w0(long j10) {
            q();
            C4492x2.E1((C4492x2) this.f34974b, j10);
            return this;
        }

        public final a x(int i10, C4452s2.a aVar) {
            q();
            C4492x2.I((C4492x2) this.f34974b, i10, (C4452s2) ((D4) aVar.p()));
            return this;
        }

        public final a x0(String str) {
            q();
            C4492x2.F1((C4492x2) this.f34974b, str);
            return this;
        }

        public final C4413n2 y0() {
            return ((C4492x2) this.f34974b).B2();
        }

        public final a z(int i10, C4452s2 c4452s2) {
            q();
            C4492x2.I((C4492x2) this.f34974b, i10, c4452s2);
            return this;
        }

        public final a z0(int i10) {
            q();
            C4492x2.D1((C4492x2) this.f34974b, i10);
            return this;
        }

        private a() {
            super(C4492x2.zzc);
        }
    }

    static {
        C4492x2 c4492x2 = new C4492x2();
        zzc = c4492x2;
        D4.r(C4492x2.class, c4492x2);
    }

    private C4492x2() {
    }

    static /* synthetic */ void A0(C4492x2 c4492x2, Iterable iterable) {
        c4492x2.m1();
        N3.f(iterable, c4492x2.zzh);
    }

    static /* synthetic */ void A1(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 8192;
        c4492x2.zzv = str;
    }

    static /* synthetic */ void B0(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 4096;
        c4492x2.zzu = str;
    }

    static /* synthetic */ void C0(C4492x2 c4492x2, boolean z10) {
        c4492x2.zzf |= 262144;
        c4492x2.zzbj = z10;
    }

    static /* synthetic */ void C1(C4492x2 c4492x2) {
        c4492x2.zzh = D4.z();
    }

    static /* synthetic */ void D1(C4492x2 c4492x2, int i10) {
        c4492x2.zzf |= 8388608;
        c4492x2.zzbo = i10;
    }

    public static a D2() {
        return (a) zzc.u();
    }

    static /* synthetic */ void E1(C4492x2 c4492x2, long j10) {
        c4492x2.zze |= 8;
        c4492x2.zzl = j10;
    }

    static /* synthetic */ void F1(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zzf |= 131072;
        c4492x2.zzbi = str;
    }

    public static a G(C4492x2 c4492x2) {
        return (a) zzc.k(c4492x2);
    }

    static /* synthetic */ void H(C4492x2 c4492x2, int i10) {
        c4492x2.m1();
        c4492x2.zzh.remove(i10);
    }

    static /* synthetic */ void H1(C4492x2 c4492x2) {
        c4492x2.zze &= -2097153;
        c4492x2.zzad = zzc.zzad;
    }

    static /* synthetic */ void I(C4492x2 c4492x2, int i10, C4452s2 c4452s2) {
        c4452s2.getClass();
        c4492x2.m1();
        c4492x2.zzh.set(i10, c4452s2);
    }

    static /* synthetic */ void I1(C4492x2 c4492x2, int i10) {
        c4492x2.zze |= 1;
        c4492x2.zzg = 1;
    }

    static /* synthetic */ void J(C4492x2 c4492x2, int i10, C2 c22) {
        c22.getClass();
        c4492x2.n1();
        c4492x2.zzi.set(i10, c22);
    }

    static /* synthetic */ void J1(C4492x2 c4492x2, long j10) {
        c4492x2.zze |= TLSTM.TLS_MAX_FRAGMENT_SIZE;
        c4492x2.zzw = j10;
    }

    static /* synthetic */ void K(C4492x2 c4492x2, long j10) {
        c4492x2.zzf |= 134217728;
        c4492x2.zzbs = j10;
    }

    static /* synthetic */ void K1(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zzf |= 128;
        c4492x2.zzax = str;
    }

    static /* synthetic */ void L(C4492x2 c4492x2, C4413n2 c4413n2) {
        c4413n2.getClass();
        c4492x2.zzbp = c4413n2;
        c4492x2.zzf |= 16777216;
    }

    static /* synthetic */ void M(C4492x2 c4492x2, C4429p2 c4429p2) {
        c4429p2.getClass();
        c4492x2.zzbn = c4429p2;
        c4492x2.zzf |= 4194304;
    }

    static /* synthetic */ void M1(C4492x2 c4492x2) {
        c4492x2.zze &= -131073;
        c4492x2.zzz = false;
    }

    static /* synthetic */ void N(C4492x2 c4492x2, C4452s2 c4452s2) {
        c4452s2.getClass();
        c4492x2.m1();
        c4492x2.zzh.add(c4452s2);
    }

    static /* synthetic */ void N1(C4492x2 c4492x2, int i10) {
        c4492x2.zzf |= 2;
        c4492x2.zzaq = i10;
    }

    static /* synthetic */ void O(C4492x2 c4492x2, C4500y2 c4500y2) {
        c4500y2.getClass();
        c4492x2.zzas = c4500y2;
        c4492x2.zzf |= 8;
    }

    static /* synthetic */ void O1(C4492x2 c4492x2, long j10) {
        c4492x2.zze |= 32;
        c4492x2.zzn = j10;
    }

    static /* synthetic */ void P(C4492x2 c4492x2, B2 b22) {
        b22.getClass();
        c4492x2.zzbr = b22;
        c4492x2.zzf |= 67108864;
    }

    static /* synthetic */ void P1(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zzf |= ImageMetadata.LENS_APERTURE;
        c4492x2.zzbk = str;
    }

    static /* synthetic */ void Q(C4492x2 c4492x2, C2 c22) {
        c22.getClass();
        c4492x2.n1();
        c4492x2.zzi.add(c22);
    }

    static /* synthetic */ void R(C4492x2 c4492x2, Iterable iterable) {
        L4 l42 = c4492x2.zzag;
        if (!l42.zzc()) {
            c4492x2.zzag = D4.n(l42);
        }
        N3.f(iterable, c4492x2.zzag);
    }

    static /* synthetic */ void R1(C4492x2 c4492x2) {
        c4492x2.zze &= -33;
        c4492x2.zzn = 0L;
    }

    static /* synthetic */ void S(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zzf |= 4;
        c4492x2.zzar = str;
    }

    static /* synthetic */ void S1(C4492x2 c4492x2, int i10) {
        c4492x2.zze |= 1024;
        c4492x2.zzs = i10;
    }

    static /* synthetic */ void T(C4492x2 c4492x2, boolean z10) {
        c4492x2.zzf |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        c4492x2.zzbh = z10;
    }

    static /* synthetic */ void T1(C4492x2 c4492x2, long j10) {
        c4492x2.zze |= 16;
        c4492x2.zzm = j10;
    }

    static /* synthetic */ void U1(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        c4492x2.zzq = str;
    }

    static /* synthetic */ void W1(C4492x2 c4492x2) {
        c4492x2.zze &= -17;
        c4492x2.zzm = 0L;
    }

    static /* synthetic */ void X1(C4492x2 c4492x2, long j10) {
        c4492x2.zze |= 4;
        c4492x2.zzk = j10;
    }

    static /* synthetic */ void Y1(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= PduHandle.NONE;
        c4492x2.zzao = str;
    }

    static /* synthetic */ void a2(C4492x2 c4492x2) {
        c4492x2.zze &= -65537;
        c4492x2.zzy = zzc.zzy;
    }

    static /* synthetic */ void b2(C4492x2 c4492x2, long j10) {
        c4492x2.zzf |= 32768;
        c4492x2.zzbg = j10;
    }

    static /* synthetic */ void c2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zzf |= TLSTM.TLS_MAX_FRAGMENT_SIZE;
        c4492x2.zzbf = str;
    }

    static /* synthetic */ void e1(C4492x2 c4492x2) {
        c4492x2.zzag = D4.z();
    }

    static /* synthetic */ void e2(C4492x2 c4492x2) {
        c4492x2.zzf &= -8193;
        c4492x2.zzbd = zzc.zzbd;
    }

    static /* synthetic */ void f1(C4492x2 c4492x2, int i10) {
        c4492x2.zzf |= ImageMetadata.SHADING_MODE;
        c4492x2.zzbl = i10;
    }

    static /* synthetic */ void f2(C4492x2 c4492x2, long j10) {
        c4492x2.zze |= 2;
        c4492x2.zzj = j10;
    }

    static /* synthetic */ void g1(C4492x2 c4492x2, long j10) {
        c4492x2.zze |= 536870912;
        c4492x2.zzam = j10;
    }

    static /* synthetic */ void g2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zzf |= SQLiteDatabase.CREATE_IF_NECESSARY;
        c4492x2.zzbt = str;
    }

    static /* synthetic */ void h1(C4492x2 c4492x2, Iterable iterable) {
        K4 k42 = c4492x2.zzat;
        if (!k42.zzc()) {
            c4492x2.zzat = k42.zza(k42.size() << 1);
        }
        N3.f(iterable, c4492x2.zzat);
    }

    static /* synthetic */ void i1(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 262144;
        c4492x2.zzaa = str;
    }

    static /* synthetic */ void i2(C4492x2 c4492x2) {
        c4492x2.zze &= -268435457;
        c4492x2.zzal = zzc.zzal;
    }

    static /* synthetic */ void j1(C4492x2 c4492x2, boolean z10) {
        c4492x2.zze |= 131072;
        c4492x2.zzz = z10;
    }

    static /* synthetic */ void j2(C4492x2 c4492x2, long j10) {
        c4492x2.zze |= 32768;
        c4492x2.zzx = j10;
    }

    static /* synthetic */ void k2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 16777216;
        c4492x2.zzah = str;
    }

    private final void m1() {
        L4 l42 = this.zzh;
        if (l42.zzc()) {
            return;
        }
        this.zzh = D4.n(l42);
    }

    static /* synthetic */ void m2(C4492x2 c4492x2) {
        c4492x2.zze &= -3;
        c4492x2.zzj = 0L;
    }

    private final void n1() {
        L4 l42 = this.zzi;
        if (l42.zzc()) {
            return;
        }
        this.zzi = D4.n(l42);
    }

    static /* synthetic */ void n2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 4194304;
        c4492x2.zzae = str;
    }

    static /* synthetic */ void p1(C4492x2 c4492x2) {
        c4492x2.zze &= -257;
        c4492x2.zzq = zzc.zzq;
    }

    static /* synthetic */ void p2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 2097152;
        c4492x2.zzad = str;
    }

    static /* synthetic */ void q1(C4492x2 c4492x2, int i10) {
        c4492x2.zze |= 33554432;
        c4492x2.zzai = i10;
    }

    static /* synthetic */ void r1(C4492x2 c4492x2, long j10) {
        c4492x2.zze |= ImageMetadata.LENS_APERTURE;
        c4492x2.zzab = j10;
    }

    static /* synthetic */ void r2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 128;
        c4492x2.zzp = str;
    }

    static /* synthetic */ void s1(C4492x2 c4492x2, Iterable iterable) {
        L4 l42 = c4492x2.zzbe;
        if (!l42.zzc()) {
            c4492x2.zzbe = D4.n(l42);
        }
        N3.f(iterable, c4492x2.zzbe);
    }

    static /* synthetic */ void t1(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 2048;
        c4492x2.zzt = str;
    }

    static /* synthetic */ void t2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 64;
        c4492x2.zzo = str;
    }

    static /* synthetic */ void u1(C4492x2 c4492x2, boolean z10) {
        c4492x2.zze |= 8388608;
        c4492x2.zzaf = z10;
    }

    static /* synthetic */ void v2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        c4492x2.zzy = str;
    }

    static /* synthetic */ void w1(C4492x2 c4492x2) {
        c4492x2.zze &= MPv3.MAX_MESSAGE_ID;
        c4492x2.zzao = zzc.zzao;
    }

    static /* synthetic */ void x0(C4492x2 c4492x2) {
        c4492x2.zze &= -262145;
        c4492x2.zzaa = zzc.zzaa;
    }

    static /* synthetic */ void x1(C4492x2 c4492x2, int i10) {
        c4492x2.zze |= ImageMetadata.SHADING_MODE;
        c4492x2.zzac = i10;
    }

    static /* synthetic */ void x2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zzf |= 8192;
        c4492x2.zzbd = str;
    }

    static /* synthetic */ void y0(C4492x2 c4492x2, int i10) {
        c4492x2.n1();
        c4492x2.zzi.remove(i10);
    }

    static /* synthetic */ void y1(C4492x2 c4492x2, long j10) {
        c4492x2.zzf |= 16;
        c4492x2.zzau = j10;
    }

    static /* synthetic */ void z0(C4492x2 c4492x2, long j10) {
        c4492x2.zzf |= 32;
        c4492x2.zzav = j10;
    }

    static /* synthetic */ void z1(C4492x2 c4492x2, Iterable iterable) {
        c4492x2.n1();
        N3.f(iterable, c4492x2.zzi);
    }

    static /* synthetic */ void z2(C4492x2 c4492x2, String str) {
        str.getClass();
        c4492x2.zze |= 512;
        c4492x2.zzr = str;
    }

    public final long A2() {
        return this.zzx;
    }

    public final int B1() {
        return this.zzg;
    }

    public final C4413n2 B2() {
        C4413n2 c4413n2 = this.zzbp;
        return c4413n2 == null ? C4413n2.T() : c4413n2;
    }

    public final C4429p2 C2() {
        C4429p2 c4429p2 = this.zzbn;
        return c4429p2 == null ? C4429p2.J() : c4429p2;
    }

    public final boolean D0() {
        return (this.zze & 33554432) != 0;
    }

    public final boolean E0() {
        return (this.zzf & 4194304) != 0;
    }

    public final C4452s2 F(int i10) {
        return (C4452s2) this.zzh.get(i10);
    }

    public final boolean F0() {
        return (this.zzf & 134217728) != 0;
    }

    public final B2 F2() {
        B2 b22 = this.zzbr;
        return b22 == null ? B2.N() : b22;
    }

    public final boolean G0() {
        return (this.zze & ImageMetadata.SHADING_MODE) != 0;
    }

    public final int G1() {
        return this.zzaq;
    }

    public final boolean H0() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean I0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean J0() {
        return (this.zzf & 128) != 0;
    }

    public final boolean K0() {
        return (this.zzf & ImageMetadata.LENS_APERTURE) != 0;
    }

    public final boolean L0() {
        return (this.zzf & 8388608) != 0;
    }

    public final int L1() {
        return this.zzs;
    }

    public final boolean M0() {
        return (this.zze & ImageMetadata.LENS_APERTURE) != 0;
    }

    public final boolean N0() {
        return (this.zze & PduHandle.NONE) != 0;
    }

    public final boolean O0() {
        return (this.zzf & 16) != 0;
    }

    public final boolean P0() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q0() {
        return (this.zze & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0;
    }

    public final int Q1() {
        return this.zzi.size();
    }

    public final boolean R0() {
        return (this.zzf & 262144) != 0;
    }

    public final boolean S0() {
        return (this.zze & 131072) != 0;
    }

    public final boolean T0() {
        return (this.zze & 32) != 0;
    }

    public final String U() {
        return this.zzar;
    }

    public final boolean U0() {
        return (this.zze & 16) != 0;
    }

    public final String V() {
        return this.zzu;
    }

    public final boolean V0() {
        return (this.zze & 1) != 0;
    }

    public final long V1() {
        return this.zzbs;
    }

    public final String W() {
        return this.zzaa;
    }

    public final boolean W0() {
        return (this.zzf & 2) != 0;
    }

    public final String X() {
        return this.zzt;
    }

    public final boolean X0() {
        return (this.zze & 8388608) != 0;
    }

    public final String Y() {
        return this.zzv;
    }

    public final boolean Y0() {
        return (this.zzf & 8192) != 0;
    }

    public final String Z() {
        return this.zzbi;
    }

    public final boolean Z0() {
        return (this.zzf & 67108864) != 0;
    }

    public final long Z1() {
        return this.zzam;
    }

    public final String a0() {
        return this.zzax;
    }

    public final boolean a1() {
        return (this.zze & 4) != 0;
    }

    public final String b0() {
        return this.zzbk;
    }

    public final boolean b1() {
        return (this.zzf & 32768) != 0;
    }

    public final String c0() {
        return this.zzq;
    }

    public final boolean c1() {
        return (this.zze & 1024) != 0;
    }

    public final String d0() {
        return this.zzao;
    }

    public final int d1() {
        return this.zzac;
    }

    public final long d2() {
        return this.zzab;
    }

    public final String e0() {
        return this.zzah;
    }

    public final String f0() {
        return this.zzae;
    }

    public final String g0() {
        return this.zzad;
    }

    public final String h0() {
        return this.zzp;
    }

    public final long h2() {
        return this.zzau;
    }

    public final String i0() {
        return this.zzo;
    }

    public final int j() {
        return this.zzbl;
    }

    public final String j0() {
        return this.zzy;
    }

    public final String k0() {
        return this.zzbd;
    }

    public final boolean k1() {
        return (this.zze & 2) != 0;
    }

    public final String l0() {
        return this.zzr;
    }

    public final boolean l1() {
        return (this.zze & 32768) != 0;
    }

    public final long l2() {
        return this.zzl;
    }

    public final List m0() {
        return this.zzag;
    }

    public final List n0() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4492x2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004B\u0000\u0002\u0001SB\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<", new Object[]{"zze", "zzf", "zzg", "zzh", C4452s2.class, "zzi", C2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", C4437q2.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", E2.zzb(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp", "zzbq", "zzbr", "zzbs", "zzbt"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4492x2.class) {
                        try {
                            aVar = zzd;
                            if (aVar == null) {
                                aVar = new D4.a(zzc);
                                zzd = aVar;
                            }
                        } finally {
                        }
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final List o0() {
        return this.zzi;
    }

    public final int o1() {
        return this.zzbo;
    }

    public final long o2() {
        return this.zzw;
    }

    public final boolean p0() {
        return this.zzbh;
    }

    public final long q2() {
        return this.zzn;
    }

    public final boolean r0() {
        return this.zzbj;
    }

    public final boolean s0() {
        return this.zzz;
    }

    public final long s2() {
        return this.zzm;
    }

    public final boolean t0() {
        return this.zzaf;
    }

    public final boolean u0() {
        return (this.zzf & 16777216) != 0;
    }

    public final long u2() {
        return this.zzk;
    }

    public final int v0() {
        return this.zzai;
    }

    public final int v1() {
        return this.zzh.size();
    }

    public final C2 w0(int i10) {
        return (C2) this.zzi.get(i10);
    }

    public final long w2() {
        return this.zzbg;
    }

    public final long y2() {
        return this.zzj;
    }
}
