package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* loaded from: classes.dex */
public final class U1 extends D4 implements InterfaceC4384j5 {
    private static final U1 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private L4 zzi = D4.z();

    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(U1.zzc);
        }
    }

    public enum b implements I4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);

        private final int zzi;

        b(int i10) {
            this.zzi = i10;
        }

        public static H4 zzb() {
            return W1.f35140a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zzi;
        }

        public static b zza(int i10) {
            switch (i10) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }
    }

    static {
        U1 u12 = new U1();
        zzc = u12;
        D4.r(U1.class, u12);
    }

    private U1() {
    }

    public static U1 H() {
        return zzc;
    }

    public final b F() {
        b bVarZza = b.zza(this.zzf);
        return bVarZza == null ? b.UNKNOWN_MATCH_TYPE : bVarZza;
    }

    public final String I() {
        return this.zzg;
    }

    public final List J() {
        return this.zzi;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zze & 4) != 0;
    }

    public final boolean M() {
        return (this.zze & 2) != 0;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (O1.f35089a[i10 - 1]) {
            case 1:
                return new U1();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", b.zzb(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (U1.class) {
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
