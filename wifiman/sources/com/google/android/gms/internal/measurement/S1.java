package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* loaded from: classes.dex */
public final class S1 extends D4 implements InterfaceC4384j5 {
    private static final S1 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(S1.zzc);
        }
    }

    public enum b implements I4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);

        private final int zzg;

        b(int i10) {
            this.zzg = i10;
        }

        public static H4 zzb() {
            return V1.f35126a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zzg;
        }

        public static b zza(int i10) {
            if (i10 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i10 == 1) {
                return LESS_THAN;
            }
            if (i10 == 2) {
                return GREATER_THAN;
            }
            if (i10 == 3) {
                return EQUAL;
            }
            if (i10 != 4) {
                return null;
            }
            return BETWEEN;
        }
    }

    static {
        S1 s12 = new S1();
        zzc = s12;
        D4.r(S1.class, s12);
    }

    private S1() {
    }

    public static S1 H() {
        return zzc;
    }

    public final b F() {
        b bVarZza = b.zza(this.zzf);
        return bVarZza == null ? b.UNKNOWN_COMPARISON_TYPE : bVarZza;
    }

    public final String I() {
        return this.zzh;
    }

    public final String J() {
        return this.zzj;
    }

    public final String K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 16) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (O1.f35089a[i10 - 1]) {
            case 1:
                return new S1();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.zzb(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (S1.class) {
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
