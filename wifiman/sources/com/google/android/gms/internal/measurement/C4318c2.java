package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4318c2 extends D4 implements InterfaceC4384j5 {
    private static final C4318c2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    /* renamed from: com.google.android.gms.internal.measurement.c2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(C4318c2.zzc);
        }
    }

    static {
        C4318c2 c4318c2 = new C4318c2();
        zzc = c4318c2;
        D4.r(C4318c2.class, c4318c2);
    }

    private C4318c2() {
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4372i2.f35265a[i10 - 1]) {
            case 1:
                return new C4318c2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4318c2.class) {
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
