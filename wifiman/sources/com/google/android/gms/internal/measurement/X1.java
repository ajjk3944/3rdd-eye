package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* loaded from: classes.dex */
public final class X1 extends D4 implements InterfaceC4384j5 {
    private static final X1 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private boolean zzi;
    private L4 zzf = D4.z();
    private L4 zzg = D4.z();
    private L4 zzh = D4.z();
    private L4 zzj = D4.z();

    public static final class a extends D4 implements InterfaceC4384j5 {
        private static final a zzc;
        private static volatile InterfaceC4432p5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* renamed from: com.google.android.gms.internal.measurement.X1$a$a, reason: collision with other inner class name */
        public static final class C1202a extends D4.b implements InterfaceC4384j5 {
            private C1202a() {
                super(a.zzc);
            }
        }

        static {
            a aVar = new a();
            zzc = aVar;
            D4.r(a.class, aVar);
        }

        private a() {
        }

        public final d G() {
            d dVarZza = d.zza(this.zzg);
            return dVarZza == null ? d.CONSENT_STATUS_UNSPECIFIED : dVarZza;
        }

        public final e H() {
            e eVarZza = e.zza(this.zzf);
            return eVarZza == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarZza;
        }

        @Override // com.google.android.gms.internal.measurement.D4
        protected final Object o(int i10, Object obj, Object obj2) {
            switch (AbstractC4372i2.f35265a[i10 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C1202a();
                case 3:
                    return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.zzb(), "zzg", d.zzb()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC4432p5 aVar = zzd;
                    if (aVar == null) {
                        synchronized (a.class) {
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

    public static final class b extends D4.b implements InterfaceC4384j5 {
        private b() {
            super(X1.zzc);
        }
    }

    public static final class c extends D4 implements InterfaceC4384j5 {
        private static final c zzc;
        private static volatile InterfaceC4432p5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends D4.b implements InterfaceC4384j5 {
            private a() {
                super(c.zzc);
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            D4.r(c.class, cVar);
        }

        private c() {
        }

        public final e G() {
            e eVarZza = e.zza(this.zzg);
            return eVarZza == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarZza;
        }

        public final e H() {
            e eVarZza = e.zza(this.zzf);
            return eVarZza == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarZza;
        }

        @Override // com.google.android.gms.internal.measurement.D4
        protected final Object o(int i10, Object obj, Object obj2) {
            switch (AbstractC4372i2.f35265a[i10 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.zzb(), "zzg", e.zzb()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC4432p5 aVar = zzd;
                    if (aVar == null) {
                        synchronized (c.class) {
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

    public enum d implements I4 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);

        private final int zze;

        d(int i10) {
            this.zze = i10;
        }

        public static H4 zzb() {
            return C4381j2.f35274a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zze;
        }

        public static d zza(int i10) {
            if (i10 == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i10 == 1) {
                return GRANTED;
            }
            if (i10 != 2) {
                return null;
            }
            return DENIED;
        }
    }

    public enum e implements I4 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);

        private final int zzg;

        e(int i10) {
            this.zzg = i10;
        }

        public static H4 zzb() {
            return C4389k2.f35282a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zzg;
        }

        public static e zza(int i10) {
            if (i10 == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return AD_STORAGE;
            }
            if (i10 == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i10 == 3) {
                return AD_USER_DATA;
            }
            if (i10 != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }
    }

    public static final class f extends D4 implements InterfaceC4384j5 {
        private static final f zzc;
        private static volatile InterfaceC4432p5 zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        public static final class a extends D4.b implements InterfaceC4384j5 {
            private a() {
                super(f.zzc);
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            D4.r(f.class, fVar);
        }

        private f() {
        }

        public final String G() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.D4
        protected final Object o(int i10, Object obj, Object obj2) {
            switch (AbstractC4372i2.f35265a[i10 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC4432p5 aVar = zzd;
                    if (aVar == null) {
                        synchronized (f.class) {
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

    static {
        X1 x12 = new X1();
        zzc = x12;
        D4.r(X1.class, x12);
    }

    private X1() {
    }

    public static X1 G() {
        return zzc;
    }

    public final List H() {
        return this.zzh;
    }

    public final List I() {
        return this.zzf;
    }

    public final List J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzj;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4372i2.f35265a[i10 - 1]) {
            case 1:
                return new X1();
            case 2:
                return new b();
            case 3:
                return D4.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", a.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", a.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (X1.class) {
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
