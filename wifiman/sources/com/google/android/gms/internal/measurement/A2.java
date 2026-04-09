package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* loaded from: classes.dex */
public final class A2 extends D4 implements InterfaceC4384j5 {
    private static final A2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private J4 zzg = D4.y();

    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a u(int i10) {
            q();
            A2.G((A2) this.f34974b, i10);
            return this;
        }

        public final a w(Iterable iterable) {
            q();
            A2.H((A2) this.f34974b, iterable);
            return this;
        }

        private a() {
            super(A2.zzc);
        }
    }

    static {
        A2 a22 = new A2();
        zzc = a22;
        D4.r(A2.class, a22);
    }

    private A2() {
    }

    static /* synthetic */ void G(A2 a22, int i10) {
        a22.zze |= 1;
        a22.zzf = i10;
    }

    static /* synthetic */ void H(A2 a22, Iterable iterable) {
        J4 j42 = a22.zzg;
        if (!j42.zzc()) {
            a22.zzg = D4.m(j42);
        }
        N3.f(iterable, a22.zzg);
    }

    public static a J() {
        return (a) zzc.u();
    }

    public final long F(int i10) {
        return this.zzg.r(i10);
    }

    public final int I() {
        return this.zzf;
    }

    public final List L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new A2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (A2.class) {
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
