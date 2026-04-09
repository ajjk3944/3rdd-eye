package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4476v2 extends D4 implements InterfaceC4384j5 {
    private static final C4476v2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C4421o2 zzh;

    /* renamed from: com.google.android.gms.internal.measurement.v2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(C4476v2.zzc);
        }
    }

    static {
        C4476v2 c4476v2 = new C4476v2();
        zzc = c4476v2;
        D4.r(C4476v2.class, c4476v2);
    }

    private C4476v2() {
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4476v2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4476v2.class) {
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
