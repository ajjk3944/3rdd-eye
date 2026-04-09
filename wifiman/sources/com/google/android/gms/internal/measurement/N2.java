package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* loaded from: classes.dex */
public final class N2 extends D4 implements InterfaceC4384j5 {
    private static final N2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private L4 zzg = D4.z();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    public enum a implements I4 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);

        private final int zzg;

        a(int i10) {
            this.zzg = i10;
        }

        public static H4 zzb() {
            return R2.f35100a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zzg;
        }

        public static a zza(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return STRING;
            }
            if (i10 == 2) {
                return NUMBER;
            }
            if (i10 == 3) {
                return BOOLEAN;
            }
            if (i10 != 4) {
                return null;
            }
            return STATEMENT;
        }
    }

    public static final class b extends D4.b implements InterfaceC4384j5 {
        private b() {
            super(N2.zzc);
        }
    }

    static {
        N2 n22 = new N2();
        zzc = n22;
        D4.r(N2.class, n22);
    }

    private N2() {
    }

    public final double F() {
        return this.zzk;
    }

    public final a G() {
        a aVarZza = a.zza(this.zzf);
        return aVarZza == null ? a.UNKNOWN : aVarZza;
    }

    public final String I() {
        return this.zzh;
    }

    public final String J() {
        return this.zzi;
    }

    public final List K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 16) != 0;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (P2.f35091a[i10 - 1]) {
            case 1:
                return new N2();
            case 2:
                return new b();
            case 3:
                return D4.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", a.zzb(), "zzg", N2.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (N2.class) {
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
