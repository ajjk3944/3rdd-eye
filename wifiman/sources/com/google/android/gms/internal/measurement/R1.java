package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* loaded from: classes.dex */
public final class R1 extends D4 implements InterfaceC4384j5 {
    private static final R1 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private U1 zzf;
    private S1 zzg;
    private boolean zzh;
    private String zzi = "";

    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a u(String str) {
            q();
            R1.G((R1) this.f34974b, str);
            return this;
        }

        private a() {
            super(R1.zzc);
        }
    }

    static {
        R1 r12 = new R1();
        zzc = r12;
        D4.r(R1.class, r12);
    }

    private R1() {
    }

    static /* synthetic */ void G(R1 r12, String str) {
        str.getClass();
        r12.zze |= 8;
        r12.zzi = str;
    }

    public static R1 H() {
        return zzc;
    }

    public final S1 I() {
        S1 s12 = this.zzg;
        return s12 == null ? S1.H() : s12;
    }

    public final U1 J() {
        U1 u12 = this.zzf;
        return u12 == null ? U1.H() : u12;
    }

    public final String K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    public final boolean O() {
        return (this.zze & 8) != 0;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (O1.f35089a[i10 - 1]) {
            case 1:
                return new R1();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (R1.class) {
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
