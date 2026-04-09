package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4345f2 extends D4 implements InterfaceC4384j5 {
    private static final C4345f2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzi;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";

    /* renamed from: com.google.android.gms.internal.measurement.f2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        private a() {
            super(C4345f2.zzc);
        }
    }

    static {
        C4345f2 c4345f2 = new C4345f2();
        zzc = c4345f2;
        D4.r(C4345f2.class, c4345f2);
    }

    private C4345f2() {
    }

    public static C4345f2 G() {
        return zzc;
    }

    public final String H() {
        return this.zzg;
    }

    public final String I() {
        return this.zzj;
    }

    public final String J() {
        return this.zzf;
    }

    public final int j() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4372i2.f35265a[i10 - 1]) {
            case 1:
                return new C4345f2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4345f2.class) {
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
