package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4460t2 extends D4 implements InterfaceC4384j5 {
    private static final C4460t2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* renamed from: com.google.android.gms.internal.measurement.t2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a u(long j10) {
            q();
            C4460t2.G((C4460t2) this.f34974b, j10);
            return this;
        }

        public final a w(String str) {
            q();
            C4460t2.H((C4460t2) this.f34974b, str);
            return this;
        }

        private a() {
            super(C4460t2.zzc);
        }
    }

    static {
        C4460t2 c4460t2 = new C4460t2();
        zzc = c4460t2;
        D4.r(C4460t2.class, c4460t2);
    }

    private C4460t2() {
    }

    public static a F() {
        return (a) zzc.u();
    }

    static /* synthetic */ void G(C4460t2 c4460t2, long j10) {
        c4460t2.zze |= 2;
        c4460t2.zzg = j10;
    }

    static /* synthetic */ void H(C4460t2 c4460t2, String str) {
        str.getClass();
        c4460t2.zze |= 1;
        c4460t2.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4460t2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4460t2.class) {
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
