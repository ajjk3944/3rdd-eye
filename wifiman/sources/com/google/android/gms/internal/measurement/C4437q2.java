package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4508z2;
import com.google.android.gms.internal.measurement.D4;

/* renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4437q2 extends D4 implements InterfaceC4384j5 {
    private static final C4437q2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private C4508z2 zzg;
    private C4508z2 zzh;
    private boolean zzi;

    /* renamed from: com.google.android.gms.internal.measurement.q2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a u(int i10) {
            q();
            C4437q2.F((C4437q2) this.f34974b, i10);
            return this;
        }

        public final a w(C4508z2.a aVar) {
            q();
            C4437q2.G((C4437q2) this.f34974b, (C4508z2) ((D4) aVar.p()));
            return this;
        }

        public final a x(C4508z2 c4508z2) {
            q();
            C4437q2.J((C4437q2) this.f34974b, c4508z2);
            return this;
        }

        public final a z(boolean z10) {
            q();
            C4437q2.H((C4437q2) this.f34974b, z10);
            return this;
        }

        private a() {
            super(C4437q2.zzc);
        }
    }

    static {
        C4437q2 c4437q2 = new C4437q2();
        zzc = c4437q2;
        D4.r(C4437q2.class, c4437q2);
    }

    private C4437q2() {
    }

    static /* synthetic */ void F(C4437q2 c4437q2, int i10) {
        c4437q2.zze |= 1;
        c4437q2.zzf = i10;
    }

    static /* synthetic */ void G(C4437q2 c4437q2, C4508z2 c4508z2) {
        c4508z2.getClass();
        c4437q2.zzg = c4508z2;
        c4437q2.zze |= 2;
    }

    static /* synthetic */ void H(C4437q2 c4437q2, boolean z10) {
        c4437q2.zze |= 8;
        c4437q2.zzi = z10;
    }

    public static a I() {
        return (a) zzc.u();
    }

    static /* synthetic */ void J(C4437q2 c4437q2, C4508z2 c4508z2) {
        c4508z2.getClass();
        c4437q2.zzh = c4508z2;
        c4437q2.zze |= 4;
    }

    public final C4508z2 L() {
        C4508z2 c4508z2 = this.zzg;
        return c4508z2 == null ? C4508z2.S() : c4508z2;
    }

    public final C4508z2 M() {
        C4508z2 c4508z2 = this.zzh;
        return c4508z2 == null ? C4508z2.S() : c4508z2;
    }

    public final boolean N() {
        return this.zzi;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4405m2.f35399a[i10 - 1]) {
            case 1:
                return new C4437q2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4437q2.class) {
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
