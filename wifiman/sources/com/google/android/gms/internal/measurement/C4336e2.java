package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4336e2 extends D4 implements InterfaceC4384j5 {
    private static final C4336e2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* renamed from: com.google.android.gms.internal.measurement.e2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(C4336e2.zzc);
        }
    }

    static {
        C4336e2 c4336e2 = new C4336e2();
        zzc = c4336e2;
        D4.r(C4336e2.class, c4336e2);
    }

    private C4336e2() {
    }

    public final String G() {
        return this.zzf;
    }

    public final String H() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4372i2.f35265a[i10 - 1]) {
            case 1:
                return new C4336e2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4336e2.class) {
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
