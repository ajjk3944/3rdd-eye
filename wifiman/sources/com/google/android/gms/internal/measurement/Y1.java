package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* loaded from: classes.dex */
public final class Y1 extends D4 implements InterfaceC4384j5 {
    private static final Y1 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private String zzf = "";
    private L4 zzg = D4.z();
    private boolean zzh;

    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(Y1.zzc);
        }
    }

    static {
        Y1 y12 = new Y1();
        zzc = y12;
        D4.r(Y1.class, y12);
    }

    private Y1() {
    }

    public final String G() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4372i2.f35265a[i10 - 1]) {
            case 1:
                return new Y1();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C4327d2.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (Y1.class) {
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
