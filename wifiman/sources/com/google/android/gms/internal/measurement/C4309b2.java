package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4309b2 extends D4 implements InterfaceC4384j5 {
    private static final C4309b2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private L4 zze = D4.z();

    /* renamed from: com.google.android.gms.internal.measurement.b2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(C4309b2.zzc);
        }
    }

    static {
        C4309b2 c4309b2 = new C4309b2();
        zzc = c4309b2;
        D4.r(C4309b2.class, c4309b2);
    }

    private C4309b2() {
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4372i2.f35265a[i10 - 1]) {
            case 1:
                return new C4309b2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4309b2.class) {
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
