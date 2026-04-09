package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import java.util.List;

/* loaded from: classes.dex */
public final class Q1 extends D4 implements InterfaceC4384j5 {
    private static final Q1 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private L4 zzh = D4.z();
    private boolean zzi;
    private S1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final String A() {
            return ((Q1) this.f34974b).M();
        }

        public final int u() {
            return ((Q1) this.f34974b).j();
        }

        public final a w(int i10, R1 r12) {
            q();
            Q1.G((Q1) this.f34974b, i10, r12);
            return this;
        }

        public final a x(String str) {
            q();
            Q1.H((Q1) this.f34974b, str);
            return this;
        }

        public final R1 z(int i10) {
            return ((Q1) this.f34974b).F(i10);
        }

        private a() {
            super(Q1.zzc);
        }
    }

    static {
        Q1 q12 = new Q1();
        zzc = q12;
        D4.r(Q1.class, q12);
    }

    private Q1() {
    }

    static /* synthetic */ void G(Q1 q12, int i10, R1 r12) {
        r12.getClass();
        L4 l42 = q12.zzh;
        if (!l42.zzc()) {
            q12.zzh = D4.n(l42);
        }
        q12.zzh.set(i10, r12);
    }

    static /* synthetic */ void H(Q1 q12, String str) {
        str.getClass();
        q12.zze |= 2;
        q12.zzg = str;
    }

    public static a J() {
        return (a) zzc.u();
    }

    public final R1 F(int i10) {
        return (R1) this.zzh.get(i10);
    }

    public final int I() {
        return this.zzf;
    }

    public final S1 L() {
        S1 s12 = this.zzj;
        return s12 == null ? S1.H() : s12;
    }

    public final String M() {
        return this.zzg;
    }

    public final List N() {
        return this.zzh;
    }

    public final boolean O() {
        return this.zzk;
    }

    public final boolean P() {
        return this.zzl;
    }

    public final boolean Q() {
        return this.zzm;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final boolean T() {
        return (this.zze & 64) != 0;
    }

    public final int j() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (O1.f35089a[i10 - 1]) {
            case 1:
                return new Q1();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", R1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (Q1.class) {
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
