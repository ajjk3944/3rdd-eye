package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* loaded from: classes.dex */
public final class Z1 extends D4 implements InterfaceC4384j5 {
    private static final Z1 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final boolean A() {
            return ((Z1) this.f34974b).J();
        }

        public final boolean B() {
            return ((Z1) this.f34974b).K();
        }

        public final boolean D() {
            return ((Z1) this.f34974b).L();
        }

        public final boolean E() {
            return ((Z1) this.f34974b).M();
        }

        public final int u() {
            return ((Z1) this.f34974b).j();
        }

        public final a w(String str) {
            q();
            Z1.F((Z1) this.f34974b, str);
            return this;
        }

        public final String x() {
            return ((Z1) this.f34974b).H();
        }

        public final boolean z() {
            return ((Z1) this.f34974b).I();
        }

        private a() {
            super(Z1.zzc);
        }
    }

    static {
        Z1 z12 = new Z1();
        zzc = z12;
        D4.r(Z1.class, z12);
    }

    private Z1() {
    }

    static /* synthetic */ void F(Z1 z12, String str) {
        str.getClass();
        z12.zze |= 1;
        z12.zzf = str;
    }

    public final String H() {
        return this.zzf;
    }

    public final boolean I() {
        return this.zzg;
    }

    public final boolean J() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zze & 2) != 0;
    }

    public final boolean L() {
        return (this.zze & 4) != 0;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final int j() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4372i2.f35265a[i10 - 1]) {
            case 1:
                return new Z1();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (Z1.class) {
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
