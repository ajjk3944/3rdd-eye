package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4444r2 extends D4 implements InterfaceC4384j5 {
    private static final C4444r2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* renamed from: com.google.android.gms.internal.measurement.r2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a u(int i10) {
            q();
            C4444r2.F((C4444r2) this.f34974b, i10);
            return this;
        }

        public final a w(long j10) {
            q();
            C4444r2.G((C4444r2) this.f34974b, j10);
            return this;
        }

        private a() {
            super(C4444r2.zzc);
        }
    }

    static {
        C4444r2 c4444r2 = new C4444r2();
        zzc = c4444r2;
        D4.r(C4444r2.class, c4444r2);
    }

    private C4444r2() {
    }

    static /* synthetic */ void F(C4444r2 c4444r2, int i10) {
        c4444r2.zze |= 1;
        c4444r2.zzf = i10;
    }

    static /* synthetic */ void G(C4444r2 c4444r2, long j10) {
        c4444r2.zze |= 2;
        c4444r2.zzg = j10;
    }

    public static a I() {
        return (a) zzc.u();
    }

    public final long H() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zze & 2) != 0;
    }

    public final boolean L() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4444r2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4444r2.class) {
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
