package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4429p2 extends D4 implements InterfaceC4384j5 {
    private static final C4429p2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* renamed from: com.google.android.gms.internal.measurement.p2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a A(boolean z10) {
            q();
            C4429p2.N((C4429p2) this.f34974b, z10);
            return this;
        }

        public final a B(boolean z10) {
            q();
            C4429p2.P((C4429p2) this.f34974b, z10);
            return this;
        }

        public final a D(boolean z10) {
            q();
            C4429p2.R((C4429p2) this.f34974b, z10);
            return this;
        }

        public final a u(boolean z10) {
            q();
            C4429p2.G((C4429p2) this.f34974b, z10);
            return this;
        }

        public final a w(boolean z10) {
            q();
            C4429p2.I((C4429p2) this.f34974b, z10);
            return this;
        }

        public final a x(boolean z10) {
            q();
            C4429p2.K((C4429p2) this.f34974b, z10);
            return this;
        }

        public final a z(boolean z10) {
            q();
            C4429p2.L((C4429p2) this.f34974b, z10);
            return this;
        }

        private a() {
            super(C4429p2.zzc);
        }
    }

    static {
        C4429p2 c4429p2 = new C4429p2();
        zzc = c4429p2;
        D4.r(C4429p2.class, c4429p2);
    }

    private C4429p2() {
    }

    public static a F() {
        return (a) zzc.u();
    }

    static /* synthetic */ void G(C4429p2 c4429p2, boolean z10) {
        c4429p2.zze |= 32;
        c4429p2.zzk = z10;
    }

    static /* synthetic */ void I(C4429p2 c4429p2, boolean z10) {
        c4429p2.zze |= 16;
        c4429p2.zzj = z10;
    }

    public static C4429p2 J() {
        return zzc;
    }

    static /* synthetic */ void K(C4429p2 c4429p2, boolean z10) {
        c4429p2.zze |= 1;
        c4429p2.zzf = z10;
    }

    static /* synthetic */ void L(C4429p2 c4429p2, boolean z10) {
        c4429p2.zze |= 64;
        c4429p2.zzl = z10;
    }

    static /* synthetic */ void N(C4429p2 c4429p2, boolean z10) {
        c4429p2.zze |= 2;
        c4429p2.zzg = z10;
    }

    static /* synthetic */ void P(C4429p2 c4429p2, boolean z10) {
        c4429p2.zze |= 4;
        c4429p2.zzh = z10;
    }

    static /* synthetic */ void R(C4429p2 c4429p2, boolean z10) {
        c4429p2.zze |= 8;
        c4429p2.zzi = z10;
    }

    public final boolean M() {
        return this.zzk;
    }

    public final boolean O() {
        return this.zzj;
    }

    public final boolean Q() {
        return this.zzf;
    }

    public final boolean S() {
        return this.zzl;
    }

    public final boolean T() {
        return this.zzg;
    }

    public final boolean U() {
        return this.zzh;
    }

    public final boolean V() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4429p2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4429p2.class) {
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
