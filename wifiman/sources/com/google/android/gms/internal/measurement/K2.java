package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* loaded from: classes.dex */
public final class K2 extends D4 implements InterfaceC4384j5 {
    private static final K2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private L4 zze = D4.z();

    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(K2.zzc);
        }
    }

    static {
        K2 k22 = new K2();
        zzc = k22;
        D4.r(K2.class, k22);
    }

    private K2() {
    }

    public static K2 G() {
        return zzc;
    }

    public final List H() {
        return this.zze;
    }

    public final int j() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (P2.f35091a[i10 - 1]) {
            case 1:
                return new K2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", L2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (K2.class) {
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
