package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4492x2;
import com.google.android.gms.internal.measurement.D4;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4484w2 extends D4 implements InterfaceC4384j5 {
    private static final C4484w2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private L4 zzf = D4.z();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* renamed from: com.google.android.gms.internal.measurement.w2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a A(String str) {
            q();
            C4484w2.K((C4484w2) this.f34974b, str);
            return this;
        }

        public final C4492x2 B(int i10) {
            return ((C4484w2) this.f34974b).G(i10);
        }

        public final a D() {
            q();
            C4484w2.M((C4484w2) this.f34974b);
            return this;
        }

        public final a E(String str) {
            q();
            C4484w2.N((C4484w2) this.f34974b, str);
            return this;
        }

        public final String F() {
            return ((C4484w2) this.f34974b).P();
        }

        public final List G() {
            return Collections.unmodifiableList(((C4484w2) this.f34974b).R());
        }

        public final int u() {
            return ((C4484w2) this.f34974b).j();
        }

        public final a w(int i10, C4492x2.a aVar) {
            q();
            C4484w2.H((C4484w2) this.f34974b, i10, (C4492x2) ((D4) aVar.p()));
            return this;
        }

        public final a x(C4492x2.a aVar) {
            q();
            C4484w2.I((C4484w2) this.f34974b, (C4492x2) ((D4) aVar.p()));
            return this;
        }

        public final a z(Iterable iterable) {
            q();
            C4484w2.J((C4484w2) this.f34974b, iterable);
            return this;
        }

        private a() {
            super(C4484w2.zzc);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.w2$b */
    public enum b implements I4 {
        SDK(0),
        SGTM(1);

        private final int zzd;

        b(int i10) {
            this.zzd = i10;
        }

        public static H4 zzb() {
            return F2.f34998a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.I4
        public final int zza() {
            return this.zzd;
        }

        public static b zza(int i10) {
            if (i10 == 0) {
                return SDK;
            }
            if (i10 != 1) {
                return null;
            }
            return SGTM;
        }
    }

    static {
        C4484w2 c4484w2 = new C4484w2();
        zzc = c4484w2;
        D4.r(C4484w2.class, c4484w2);
    }

    private C4484w2() {
    }

    public static a F(C4484w2 c4484w2) {
        return (a) zzc.k(c4484w2);
    }

    static /* synthetic */ void H(C4484w2 c4484w2, int i10, C4492x2 c4492x2) {
        c4492x2.getClass();
        c4484w2.U();
        c4484w2.zzf.set(i10, c4492x2);
    }

    static /* synthetic */ void I(C4484w2 c4484w2, C4492x2 c4492x2) {
        c4492x2.getClass();
        c4484w2.U();
        c4484w2.zzf.add(c4492x2);
    }

    static /* synthetic */ void J(C4484w2 c4484w2, Iterable iterable) {
        c4484w2.U();
        N3.f(iterable, c4484w2.zzf);
    }

    static /* synthetic */ void K(C4484w2 c4484w2, String str) {
        str.getClass();
        c4484w2.zze |= 1;
        c4484w2.zzg = str;
    }

    public static a L() {
        return (a) zzc.u();
    }

    static /* synthetic */ void M(C4484w2 c4484w2) {
        c4484w2.zzf = D4.z();
    }

    static /* synthetic */ void N(C4484w2 c4484w2, String str) {
        str.getClass();
        c4484w2.zze |= 2;
        c4484w2.zzh = str;
    }

    private final void U() {
        L4 l42 = this.zzf;
        if (l42.zzc()) {
            return;
        }
        this.zzf = D4.n(l42);
    }

    public final C4492x2 G(int i10) {
        return (C4492x2) this.zzf.get(i10);
    }

    public final String P() {
        return this.zzg;
    }

    public final String Q() {
        return this.zzh;
    }

    public final List R() {
        return this.zzf;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final boolean T() {
        return (this.zze & 2) != 0;
    }

    public final int j() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4484w2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C4492x2.class, "zzg", "zzh", "zzi", b.zzb()});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4484w2.class) {
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
