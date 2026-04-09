package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4508z2 extends D4 implements InterfaceC4384j5 {
    private static final C4508z2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private J4 zze = D4.y();
    private J4 zzf = D4.y();
    private L4 zzg = D4.z();
    private L4 zzh = D4.z();

    /* renamed from: com.google.android.gms.internal.measurement.z2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a A() {
            q();
            C4508z2.L((C4508z2) this.f34974b);
            return this;
        }

        public final a B(Iterable iterable) {
            q();
            C4508z2.M((C4508z2) this.f34974b, iterable);
            return this;
        }

        public final a D() {
            q();
            C4508z2.O((C4508z2) this.f34974b);
            return this;
        }

        public final a E(Iterable iterable) {
            q();
            C4508z2.P((C4508z2) this.f34974b, iterable);
            return this;
        }

        public final a u() {
            q();
            C4508z2.F((C4508z2) this.f34974b);
            return this;
        }

        public final a w(Iterable iterable) {
            q();
            C4508z2.G((C4508z2) this.f34974b, iterable);
            return this;
        }

        public final a x() {
            q();
            C4508z2.I((C4508z2) this.f34974b);
            return this;
        }

        public final a z(Iterable iterable) {
            q();
            C4508z2.J((C4508z2) this.f34974b, iterable);
            return this;
        }

        private a() {
            super(C4508z2.zzc);
        }
    }

    static {
        C4508z2 c4508z2 = new C4508z2();
        zzc = c4508z2;
        D4.r(C4508z2.class, c4508z2);
    }

    private C4508z2() {
    }

    static /* synthetic */ void F(C4508z2 c4508z2) {
        c4508z2.zzg = D4.z();
    }

    static /* synthetic */ void G(C4508z2 c4508z2, Iterable iterable) {
        L4 l42 = c4508z2.zzg;
        if (!l42.zzc()) {
            c4508z2.zzg = D4.n(l42);
        }
        N3.f(iterable, c4508z2.zzg);
    }

    static /* synthetic */ void I(C4508z2 c4508z2) {
        c4508z2.zzf = D4.y();
    }

    static /* synthetic */ void J(C4508z2 c4508z2, Iterable iterable) {
        J4 j42 = c4508z2.zzf;
        if (!j42.zzc()) {
            c4508z2.zzf = D4.m(j42);
        }
        N3.f(iterable, c4508z2.zzf);
    }

    static /* synthetic */ void L(C4508z2 c4508z2) {
        c4508z2.zzh = D4.z();
    }

    static /* synthetic */ void M(C4508z2 c4508z2, Iterable iterable) {
        L4 l42 = c4508z2.zzh;
        if (!l42.zzc()) {
            c4508z2.zzh = D4.n(l42);
        }
        N3.f(iterable, c4508z2.zzh);
    }

    static /* synthetic */ void O(C4508z2 c4508z2) {
        c4508z2.zze = D4.y();
    }

    static /* synthetic */ void P(C4508z2 c4508z2, Iterable iterable) {
        J4 j42 = c4508z2.zze;
        if (!j42.zzc()) {
            c4508z2.zze = D4.m(j42);
        }
        N3.f(iterable, c4508z2.zze);
    }

    public static a Q() {
        return (a) zzc.u();
    }

    public static C4508z2 S() {
        return zzc;
    }

    public final int H() {
        return this.zzf.size();
    }

    public final int K() {
        return this.zzh.size();
    }

    public final int N() {
        return this.zze.size();
    }

    public final List T() {
        return this.zzg;
    }

    public final List U() {
        return this.zzf;
    }

    public final List V() {
        return this.zzh;
    }

    public final List W() {
        return this.zze;
    }

    public final int j() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4508z2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C4444r2.class, "zzh", A2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4508z2.class) {
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
