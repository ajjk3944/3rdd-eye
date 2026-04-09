package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4468u2;
import com.google.android.gms.internal.measurement.D4;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4452s2 extends D4 implements InterfaceC4384j5 {
    private static final C4452s2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private L4 zzf = D4.z();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* renamed from: com.google.android.gms.internal.measurement.s2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a A(long j10) {
            q();
            C4452s2.J((C4452s2) this.f34974b, j10);
            return this;
        }

        public final a B(C4468u2.a aVar) {
            q();
            C4452s2.K((C4452s2) this.f34974b, (C4468u2) ((D4) aVar.p()));
            return this;
        }

        public final a D(C4468u2 c4468u2) {
            q();
            C4452s2.K((C4452s2) this.f34974b, c4468u2);
            return this;
        }

        public final a E(Iterable iterable) {
            q();
            C4452s2.L((C4452s2) this.f34974b, iterable);
            return this;
        }

        public final a F(String str) {
            q();
            C4452s2.M((C4452s2) this.f34974b, str);
            return this;
        }

        public final long G() {
            return ((C4452s2) this.f34974b).P();
        }

        public final a H(long j10) {
            q();
            C4452s2.O((C4452s2) this.f34974b, j10);
            return this;
        }

        public final C4468u2 I(int i10) {
            return ((C4452s2) this.f34974b).F(i10);
        }

        public final long K() {
            return ((C4452s2) this.f34974b).Q();
        }

        public final a L() {
            q();
            C4452s2.G((C4452s2) this.f34974b);
            return this;
        }

        public final String M() {
            return ((C4452s2) this.f34974b).T();
        }

        public final List N() {
            return Collections.unmodifiableList(((C4452s2) this.f34974b).U());
        }

        public final boolean O() {
            return ((C4452s2) this.f34974b).X();
        }

        public final int u() {
            return ((C4452s2) this.f34974b).N();
        }

        public final a w(int i10) {
            q();
            C4452s2.H((C4452s2) this.f34974b, i10);
            return this;
        }

        public final a x(int i10, C4468u2.a aVar) {
            q();
            C4452s2.I((C4452s2) this.f34974b, i10, (C4468u2) ((D4) aVar.p()));
            return this;
        }

        public final a z(int i10, C4468u2 c4468u2) {
            q();
            C4452s2.I((C4452s2) this.f34974b, i10, c4468u2);
            return this;
        }

        private a() {
            super(C4452s2.zzc);
        }
    }

    static {
        C4452s2 c4452s2 = new C4452s2();
        zzc = c4452s2;
        D4.r(C4452s2.class, c4452s2);
    }

    private C4452s2() {
    }

    static /* synthetic */ void G(C4452s2 c4452s2) {
        c4452s2.zzf = D4.z();
    }

    static /* synthetic */ void H(C4452s2 c4452s2, int i10) {
        c4452s2.Y();
        c4452s2.zzf.remove(i10);
    }

    static /* synthetic */ void I(C4452s2 c4452s2, int i10, C4468u2 c4468u2) {
        c4468u2.getClass();
        c4452s2.Y();
        c4452s2.zzf.set(i10, c4468u2);
    }

    static /* synthetic */ void J(C4452s2 c4452s2, long j10) {
        c4452s2.zze |= 4;
        c4452s2.zzi = j10;
    }

    static /* synthetic */ void K(C4452s2 c4452s2, C4468u2 c4468u2) {
        c4468u2.getClass();
        c4452s2.Y();
        c4452s2.zzf.add(c4468u2);
    }

    static /* synthetic */ void L(C4452s2 c4452s2, Iterable iterable) {
        c4452s2.Y();
        N3.f(iterable, c4452s2.zzf);
    }

    static /* synthetic */ void M(C4452s2 c4452s2, String str) {
        str.getClass();
        c4452s2.zze |= 1;
        c4452s2.zzg = str;
    }

    static /* synthetic */ void O(C4452s2 c4452s2, long j10) {
        c4452s2.zze |= 2;
        c4452s2.zzh = j10;
    }

    public static a R() {
        return (a) zzc.u();
    }

    private final void Y() {
        L4 l42 = this.zzf;
        if (l42.zzc()) {
            return;
        }
        this.zzf = D4.n(l42);
    }

    public final C4468u2 F(int i10) {
        return (C4468u2) this.zzf.get(i10);
    }

    public final int N() {
        return this.zzf.size();
    }

    public final long P() {
        return this.zzi;
    }

    public final long Q() {
        return this.zzh;
    }

    public final String T() {
        return this.zzg;
    }

    public final List U() {
        return this.zzf;
    }

    public final boolean V() {
        return (this.zze & 8) != 0;
    }

    public final boolean W() {
        return (this.zze & 4) != 0;
    }

    public final boolean X() {
        return (this.zze & 2) != 0;
    }

    public final int j() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4452s2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C4468u2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4452s2.class) {
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
