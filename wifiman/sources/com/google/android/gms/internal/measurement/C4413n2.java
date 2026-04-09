package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4413n2 extends D4 implements InterfaceC4384j5 {
    private static final C4413n2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* renamed from: com.google.android.gms.internal.measurement.n2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a A(long j10) {
            q();
            C4413n2.L((C4413n2) this.f34974b, j10);
            return this;
        }

        public final a B(String str) {
            q();
            C4413n2.M((C4413n2) this.f34974b, str);
            return this;
        }

        public final a D() {
            q();
            C4413n2.G((C4413n2) this.f34974b);
            return this;
        }

        public final a E(String str) {
            q();
            C4413n2.P((C4413n2) this.f34974b, str);
            return this;
        }

        public final a F() {
            q();
            C4413n2.K((C4413n2) this.f34974b);
            return this;
        }

        public final a G(String str) {
            q();
            C4413n2.S((C4413n2) this.f34974b, str);
            return this;
        }

        public final a H() {
            q();
            C4413n2.O((C4413n2) this.f34974b);
            return this;
        }

        public final a I(String str) {
            q();
            C4413n2.V((C4413n2) this.f34974b, str);
            return this;
        }

        public final a K() {
            q();
            C4413n2.R((C4413n2) this.f34974b);
            return this;
        }

        public final a L(String str) {
            q();
            C4413n2.Y((C4413n2) this.f34974b, str);
            return this;
        }

        public final a M() {
            q();
            C4413n2.U((C4413n2) this.f34974b);
            return this;
        }

        public final a N() {
            q();
            C4413n2.X((C4413n2) this.f34974b);
            return this;
        }

        public final long u() {
            return ((C4413n2) this.f34974b).F();
        }

        public final a w(long j10) {
            q();
            C4413n2.H((C4413n2) this.f34974b, j10);
            return this;
        }

        public final a x(String str) {
            q();
            C4413n2.I((C4413n2) this.f34974b, str);
            return this;
        }

        public final long z() {
            return ((C4413n2) this.f34974b).J();
        }

        private a() {
            super(C4413n2.zzc);
        }
    }

    static {
        C4413n2 c4413n2 = new C4413n2();
        zzc = c4413n2;
        D4.r(C4413n2.class, c4413n2);
    }

    private C4413n2() {
    }

    static /* synthetic */ void G(C4413n2 c4413n2) {
        c4413n2.zze &= -5;
        c4413n2.zzh = zzc.zzh;
    }

    static /* synthetic */ void H(C4413n2 c4413n2, long j10) {
        c4413n2.zze |= 8;
        c4413n2.zzi = j10;
    }

    static /* synthetic */ void I(C4413n2 c4413n2, String str) {
        str.getClass();
        c4413n2.zze |= 4;
        c4413n2.zzh = str;
    }

    static /* synthetic */ void K(C4413n2 c4413n2) {
        c4413n2.zze &= -3;
        c4413n2.zzg = zzc.zzg;
    }

    static /* synthetic */ void L(C4413n2 c4413n2, long j10) {
        c4413n2.zze |= 128;
        c4413n2.zzm = j10;
    }

    static /* synthetic */ void M(C4413n2 c4413n2, String str) {
        str.getClass();
        c4413n2.zze |= 2;
        c4413n2.zzg = str;
    }

    public static a N() {
        return (a) zzc.u();
    }

    static /* synthetic */ void O(C4413n2 c4413n2) {
        c4413n2.zze &= -2;
        c4413n2.zzf = zzc.zzf;
    }

    static /* synthetic */ void P(C4413n2 c4413n2, String str) {
        str.getClass();
        c4413n2.zze |= 1;
        c4413n2.zzf = str;
    }

    static /* synthetic */ void R(C4413n2 c4413n2) {
        c4413n2.zze &= -65;
        c4413n2.zzl = zzc.zzl;
    }

    static /* synthetic */ void S(C4413n2 c4413n2, String str) {
        str.getClass();
        c4413n2.zze |= 64;
        c4413n2.zzl = str;
    }

    public static C4413n2 T() {
        return zzc;
    }

    static /* synthetic */ void U(C4413n2 c4413n2) {
        c4413n2.zze &= -33;
        c4413n2.zzk = zzc.zzk;
    }

    static /* synthetic */ void V(C4413n2 c4413n2, String str) {
        str.getClass();
        c4413n2.zze |= 32;
        c4413n2.zzk = str;
    }

    static /* synthetic */ void X(C4413n2 c4413n2) {
        c4413n2.zze &= -17;
        c4413n2.zzj = zzc.zzj;
    }

    static /* synthetic */ void Y(C4413n2 c4413n2, String str) {
        str.getClass();
        c4413n2.zze |= 16;
        c4413n2.zzj = str;
    }

    public final long F() {
        return this.zzi;
    }

    public final long J() {
        return this.zzm;
    }

    public final String W() {
        return this.zzh;
    }

    public final String Z() {
        return this.zzg;
    }

    public final String a0() {
        return this.zzf;
    }

    public final String b0() {
        return this.zzl;
    }

    public final String c0() {
        return this.zzk;
    }

    public final String d0() {
        return this.zzj;
    }

    public final boolean e0() {
        return (this.zze & 4) != 0;
    }

    public final boolean f0() {
        return (this.zze & 2) != 0;
    }

    public final boolean g0() {
        return (this.zze & 1) != 0;
    }

    public final boolean h0() {
        return (this.zze & 8) != 0;
    }

    public final boolean i0() {
        return (this.zze & 128) != 0;
    }

    public final boolean j0() {
        return (this.zze & 64) != 0;
    }

    public final boolean k0() {
        return (this.zze & 32) != 0;
    }

    public final boolean l0() {
        return (this.zze & 16) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4413n2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4413n2.class) {
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
}
