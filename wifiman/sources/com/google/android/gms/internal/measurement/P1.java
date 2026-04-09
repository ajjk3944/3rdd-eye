package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import com.google.android.gms.internal.measurement.Q1;
import com.google.android.gms.internal.measurement.T1;
import java.util.List;

/* loaded from: classes.dex */
public final class P1 extends D4 implements InterfaceC4384j5 {
    private static final P1 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private L4 zzg = D4.z();
    private L4 zzh = D4.z();
    private boolean zzi;
    private boolean zzj;

    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final int A() {
            return ((P1) this.f34974b).K();
        }

        public final T1 B(int i10) {
            return ((P1) this.f34974b).J(i10);
        }

        public final int u() {
            return ((P1) this.f34974b).I();
        }

        public final a w(int i10, Q1.a aVar) {
            q();
            P1.G((P1) this.f34974b, i10, (Q1) ((D4) aVar.p()));
            return this;
        }

        public final a x(int i10, T1.a aVar) {
            q();
            P1.H((P1) this.f34974b, i10, (T1) ((D4) aVar.p()));
            return this;
        }

        public final Q1 z(int i10) {
            return ((P1) this.f34974b).F(i10);
        }

        private a() {
            super(P1.zzc);
        }
    }

    static {
        P1 p12 = new P1();
        zzc = p12;
        D4.r(P1.class, p12);
    }

    private P1() {
    }

    static /* synthetic */ void G(P1 p12, int i10, Q1 q12) {
        q12.getClass();
        L4 l42 = p12.zzh;
        if (!l42.zzc()) {
            p12.zzh = D4.n(l42);
        }
        p12.zzh.set(i10, q12);
    }

    static /* synthetic */ void H(P1 p12, int i10, T1 t12) {
        t12.getClass();
        L4 l42 = p12.zzg;
        if (!l42.zzc()) {
            p12.zzg = D4.n(l42);
        }
        p12.zzg.set(i10, t12);
    }

    public final Q1 F(int i10) {
        return (Q1) this.zzh.get(i10);
    }

    public final int I() {
        return this.zzh.size();
    }

    public final T1 J(int i10) {
        return (T1) this.zzg.get(i10);
    }

    public final int K() {
        return this.zzg.size();
    }

    public final List M() {
        return this.zzh;
    }

    public final List N() {
        return this.zzg;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (O1.f35089a[i10 - 1]) {
            case 1:
                return new P1();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", T1.class, "zzh", Q1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (P1.class) {
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
