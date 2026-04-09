package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* loaded from: classes.dex */
public final class C2 extends D4 implements InterfaceC4384j5 {
    private static final C2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a A() {
            q();
            C2.L((C2) this.f34974b);
            return this;
        }

        public final a B(long j10) {
            q();
            C2.M((C2) this.f34974b, j10);
            return this;
        }

        public final a D(String str) {
            q();
            C2.N((C2) this.f34974b, str);
            return this;
        }

        public final a E() {
            q();
            C2.P((C2) this.f34974b);
            return this;
        }

        public final a u() {
            q();
            C2.G((C2) this.f34974b);
            return this;
        }

        public final a w(double d10) {
            q();
            C2.H((C2) this.f34974b, d10);
            return this;
        }

        public final a x(long j10) {
            q();
            C2.I((C2) this.f34974b, j10);
            return this;
        }

        public final a z(String str) {
            q();
            C2.J((C2) this.f34974b, str);
            return this;
        }

        private a() {
            super(C2.zzc);
        }
    }

    static {
        C2 c22 = new C2();
        zzc = c22;
        D4.r(C2.class, c22);
    }

    private C2() {
    }

    static /* synthetic */ void G(C2 c22) {
        c22.zze &= -33;
        c22.zzk = 0.0d;
    }

    static /* synthetic */ void H(C2 c22, double d10) {
        c22.zze |= 32;
        c22.zzk = d10;
    }

    static /* synthetic */ void I(C2 c22, long j10) {
        c22.zze |= 8;
        c22.zzi = j10;
    }

    static /* synthetic */ void J(C2 c22, String str) {
        str.getClass();
        c22.zze |= 2;
        c22.zzg = str;
    }

    static /* synthetic */ void L(C2 c22) {
        c22.zze &= -9;
        c22.zzi = 0L;
    }

    static /* synthetic */ void M(C2 c22, long j10) {
        c22.zze |= 1;
        c22.zzf = j10;
    }

    static /* synthetic */ void N(C2 c22, String str) {
        str.getClass();
        c22.zze |= 4;
        c22.zzh = str;
    }

    static /* synthetic */ void P(C2 c22) {
        c22.zze &= -5;
        c22.zzh = zzc.zzh;
    }

    public static a R() {
        return (a) zzc.u();
    }

    public final double F() {
        return this.zzk;
    }

    public final float K() {
        return this.zzj;
    }

    public final long O() {
        return this.zzi;
    }

    public final long Q() {
        return this.zzf;
    }

    public final String T() {
        return this.zzg;
    }

    public final String U() {
        return this.zzh;
    }

    public final boolean V() {
        return (this.zze & 32) != 0;
    }

    public final boolean W() {
        return (this.zze & 16) != 0;
    }

    public final boolean X() {
        return (this.zze & 8) != 0;
    }

    public final boolean Y() {
        return (this.zze & 1) != 0;
    }

    public final boolean Z() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C2.class) {
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
