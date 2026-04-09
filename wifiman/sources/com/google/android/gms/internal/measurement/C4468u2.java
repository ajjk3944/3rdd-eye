package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4468u2 extends D4 implements InterfaceC4384j5 {
    private static final C4468u2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private L4 zzk = D4.z();

    /* renamed from: com.google.android.gms.internal.measurement.u2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a A(Iterable iterable) {
            q();
            C4468u2.K((C4468u2) this.f34974b, iterable);
            return this;
        }

        public final a B(String str) {
            q();
            C4468u2.L((C4468u2) this.f34974b, str);
            return this;
        }

        public final a D() {
            q();
            C4468u2.G((C4468u2) this.f34974b);
            return this;
        }

        public final a E(String str) {
            q();
            C4468u2.O((C4468u2) this.f34974b, str);
            return this;
        }

        public final a F() {
            q();
            C4468u2.N((C4468u2) this.f34974b);
            return this;
        }

        public final a G() {
            q();
            C4468u2.Q((C4468u2) this.f34974b);
            return this;
        }

        public final a H() {
            q();
            C4468u2.S((C4468u2) this.f34974b);
            return this;
        }

        public final String I() {
            return ((C4468u2) this.f34974b).V();
        }

        public final String K() {
            return ((C4468u2) this.f34974b).W();
        }

        public final int u() {
            return ((C4468u2) this.f34974b).P();
        }

        public final a w(double d10) {
            q();
            C4468u2.H((C4468u2) this.f34974b, d10);
            return this;
        }

        public final a x(long j10) {
            q();
            C4468u2.I((C4468u2) this.f34974b, j10);
            return this;
        }

        public final a z(a aVar) {
            q();
            C4468u2.J((C4468u2) this.f34974b, (C4468u2) ((D4) aVar.p()));
            return this;
        }

        private a() {
            super(C4468u2.zzc);
        }
    }

    static {
        C4468u2 c4468u2 = new C4468u2();
        zzc = c4468u2;
        D4.r(C4468u2.class, c4468u2);
    }

    private C4468u2() {
    }

    static /* synthetic */ void G(C4468u2 c4468u2) {
        c4468u2.zze &= -17;
        c4468u2.zzj = 0.0d;
    }

    static /* synthetic */ void H(C4468u2 c4468u2, double d10) {
        c4468u2.zze |= 16;
        c4468u2.zzj = d10;
    }

    static /* synthetic */ void I(C4468u2 c4468u2, long j10) {
        c4468u2.zze |= 4;
        c4468u2.zzh = j10;
    }

    static /* synthetic */ void J(C4468u2 c4468u2, C4468u2 c4468u22) {
        c4468u22.getClass();
        c4468u2.d0();
        c4468u2.zzk.add(c4468u22);
    }

    static /* synthetic */ void K(C4468u2 c4468u2, Iterable iterable) {
        c4468u2.d0();
        N3.f(iterable, c4468u2.zzk);
    }

    static /* synthetic */ void L(C4468u2 c4468u2, String str) {
        str.getClass();
        c4468u2.zze |= 1;
        c4468u2.zzf = str;
    }

    static /* synthetic */ void N(C4468u2 c4468u2) {
        c4468u2.zze &= -5;
        c4468u2.zzh = 0L;
    }

    static /* synthetic */ void O(C4468u2 c4468u2, String str) {
        str.getClass();
        c4468u2.zze |= 2;
        c4468u2.zzg = str;
    }

    static /* synthetic */ void Q(C4468u2 c4468u2) {
        c4468u2.zzk = D4.z();
    }

    static /* synthetic */ void S(C4468u2 c4468u2) {
        c4468u2.zze &= -3;
        c4468u2.zzg = zzc.zzg;
    }

    public static a T() {
        return (a) zzc.u();
    }

    private final void d0() {
        L4 l42 = this.zzk;
        if (l42.zzc()) {
            return;
        }
        this.zzk = D4.n(l42);
    }

    public final double F() {
        return this.zzj;
    }

    public final float M() {
        return this.zzi;
    }

    public final int P() {
        return this.zzk.size();
    }

    public final long R() {
        return this.zzh;
    }

    public final String V() {
        return this.zzf;
    }

    public final String W() {
        return this.zzg;
    }

    public final List X() {
        return this.zzk;
    }

    public final boolean Y() {
        return (this.zze & 16) != 0;
    }

    public final boolean Z() {
        return (this.zze & 8) != 0;
    }

    public final boolean a0() {
        return (this.zze & 4) != 0;
    }

    public final boolean b0() {
        return (this.zze & 1) != 0;
    }

    public final boolean c0() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4468u2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C4468u2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4468u2.class) {
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
