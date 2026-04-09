package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* loaded from: classes.dex */
public final class M2 extends D4 implements InterfaceC4384j5 {
    private static final M2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private L4 zzf = D4.z();
    private K2 zzg;

    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(M2.zzc);
        }
    }

    static {
        M2 m22 = new M2();
        zzc = m22;
        D4.r(M2.class, m22);
    }

    private M2() {
    }

    public final K2 F() {
        K2 k22 = this.zzg;
        return k22 == null ? K2.G() : k22;
    }

    public final List H() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (P2.f35091a[i10 - 1]) {
            case 1:
                return new M2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", N2.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (M2.class) {
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
