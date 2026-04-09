package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import com.google.ar.core.ImageFormat;

/* loaded from: classes.dex */
public final class B2 extends D4 implements InterfaceC4384j5 {
    private static final B2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a u(b bVar) {
            q();
            B2.G((B2) this.f34974b, bVar);
            return this;
        }

        public final a w(c cVar) {
            q();
            B2.H((B2) this.f34974b, cVar);
            return this;
        }

        public final a x(d dVar) {
            q();
            B2.I((B2) this.f34974b, dVar);
            return this;
        }

        private a() {
            super(B2.zzc);
        }
    }

    public enum b implements I4 {
        CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
        CLIENT_UPLOAD_ELIGIBLE(1),
        MEASUREMENT_SERVICE_NOT_ENABLED(2),
        ANDROID_TOO_OLD(3),
        NON_PLAY_MODE(4),
        SDK_TOO_OLD(5),
        MISSING_JOB_SCHEDULER(6),
        NOT_ENABLED_IN_MANIFEST(7),
        CLIENT_FLAG_OFF(8),
        SERVICE_FLAG_OFF(20),
        PINNED_TO_SERVICE_UPLOAD(21),
        MISSING_SGTM_SERVER_URL(22);

        private final int zzn;

        b(int i10) {
            this.zzn = i10;
        }

        public static H4 zzb() {
            return H2.f35033a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzn + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zzn;
        }

        public static b zza(int i10) {
            switch (i10) {
                case 0:
                    return CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
                case 1:
                    return CLIENT_UPLOAD_ELIGIBLE;
                case 2:
                    return MEASUREMENT_SERVICE_NOT_ENABLED;
                case 3:
                    return ANDROID_TOO_OLD;
                case 4:
                    return NON_PLAY_MODE;
                case 5:
                    return SDK_TOO_OLD;
                case 6:
                    return MISSING_JOB_SCHEDULER;
                case 7:
                    return NOT_ENABLED_IN_MANIFEST;
                case 8:
                    return CLIENT_FLAG_OFF;
                default:
                    switch (i10) {
                        case 20:
                            return SERVICE_FLAG_OFF;
                        case 21:
                            return PINNED_TO_SERVICE_UPLOAD;
                        case ImageFormat.RGBA_FP16 /* 22 */:
                            return MISSING_SGTM_SERVER_URL;
                        default:
                            return null;
                    }
            }
        }
    }

    public enum c implements I4 {
        SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN(0),
        SERVICE_UPLOAD_ELIGIBLE(1),
        NOT_IN_ROLLOUT(2),
        MISSING_SGTM_SETTINGS(3),
        MISSING_SGTM_PROXY_INFO(4),
        NON_PLAY_MISSING_SGTM_SERVER_URL(5);

        private final int zzh;

        c(int i10) {
            this.zzh = i10;
        }

        public static H4 zzb() {
            return I2.f35041a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zzh;
        }

        public static c zza(int i10) {
            if (i10 == 0) {
                return SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN;
            }
            if (i10 == 1) {
                return SERVICE_UPLOAD_ELIGIBLE;
            }
            if (i10 == 2) {
                return NOT_IN_ROLLOUT;
            }
            if (i10 == 3) {
                return MISSING_SGTM_SETTINGS;
            }
            if (i10 == 4) {
                return MISSING_SGTM_PROXY_INFO;
            }
            if (i10 != 5) {
                return null;
            }
            return NON_PLAY_MISSING_SGTM_SERVER_URL;
        }
    }

    public enum d implements I4 {
        UPLOAD_TYPE_UNKNOWN(0),
        GA_UPLOAD(1),
        SDK_CLIENT_UPLOAD(2),
        PACKAGE_SERVICE_UPLOAD(3),
        SDK_SERVICE_UPLOAD(4);

        private final int zzg;

        d(int i10) {
            this.zzg = i10;
        }

        public static H4 zzb() {
            return J2.f35048a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zzg;
        }

        public static d zza(int i10) {
            if (i10 == 0) {
                return UPLOAD_TYPE_UNKNOWN;
            }
            if (i10 == 1) {
                return GA_UPLOAD;
            }
            if (i10 == 2) {
                return SDK_CLIENT_UPLOAD;
            }
            if (i10 == 3) {
                return PACKAGE_SERVICE_UPLOAD;
            }
            if (i10 != 4) {
                return null;
            }
            return SDK_SERVICE_UPLOAD;
        }
    }

    static {
        B2 b22 = new B2();
        zzc = b22;
        D4.r(B2.class, b22);
    }

    private B2() {
    }

    public static a F() {
        return (a) zzc.u();
    }

    static /* synthetic */ void G(B2 b22, b bVar) {
        b22.zzg = bVar.zza();
        b22.zze |= 2;
    }

    static /* synthetic */ void H(B2 b22, c cVar) {
        b22.zzh = cVar.zza();
        b22.zze |= 4;
    }

    static /* synthetic */ void I(B2 b22, d dVar) {
        b22.zzf = dVar.zza();
        b22.zze |= 1;
    }

    public static B2 N() {
        return zzc;
    }

    public final b J() {
        b bVarZza = b.zza(this.zzg);
        return bVarZza == null ? b.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : bVarZza;
    }

    public final c K() {
        c cVarZza = c.zza(this.zzh);
        return cVarZza == null ? c.SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN : cVarZza;
    }

    public final d L() {
        d dVarZza = d.zza(this.zzf);
        return dVarZza == null ? d.UPLOAD_TYPE_UNKNOWN : dVarZza;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new B2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zze", "zzf", d.zzb(), "zzg", b.zzb(), "zzh", c.zzb()});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (B2.class) {
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
