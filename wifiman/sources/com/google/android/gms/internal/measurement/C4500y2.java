package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4460t2;
import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4500y2 extends D4 implements InterfaceC4384j5 {
    private static final C4500y2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf = 1;
    private L4 zzg = D4.z();

    /* renamed from: com.google.android.gms.internal.measurement.y2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a u(C4460t2.a aVar) {
            q();
            C4500y2.G((C4500y2) this.f34974b, (C4460t2) ((D4) aVar.p()));
            return this;
        }

        private a() {
            super(C4500y2.zzc);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.y2$b */
    public enum b implements I4 {
        RADS(1),
        PROVISIONING(2);

        private final int zzd;

        b(int i10) {
            this.zzd = i10;
        }

        public static H4 zzb() {
            return G2.f35015a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zzd;
        }

        public static b zza(int i10) {
            if (i10 == 1) {
                return RADS;
            }
            if (i10 != 2) {
                return null;
            }
            return PROVISIONING;
        }
    }

    static {
        C4500y2 c4500y2 = new C4500y2();
        zzc = c4500y2;
        D4.r(C4500y2.class, c4500y2);
    }

    private C4500y2() {
    }

    public static a F() {
        return (a) zzc.u();
    }

    static /* synthetic */ void G(C4500y2 c4500y2, C4460t2 c4460t2) {
        c4460t2.getClass();
        L4 l42 = c4500y2.zzg;
        if (!l42.zzc()) {
            c4500y2.zzg = D4.n(l42);
        }
        c4500y2.zzg.add(c4460t2);
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4500y2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", b.zzb(), "zzg", C4460t2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4500y2.class) {
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
