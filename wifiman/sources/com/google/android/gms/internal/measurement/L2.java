package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* loaded from: classes.dex */
public final class L2 extends D4 implements InterfaceC4384j5 {
    private static final L2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private String zzf = "";
    private L4 zzg = D4.z();

    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(L2.zzc);
        }
    }

    static {
        L2 l22 = new L2();
        zzc = l22;
        D4.r(L2.class, l22);
    }

    private L2() {
    }

    public final String G() {
        return this.zzf;
    }

    public final List H() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (P2.f35091a[i10 - 1]) {
            case 1:
                return new L2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", N2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (L2.class) {
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
