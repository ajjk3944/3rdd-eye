package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import com.google.android.gms.internal.measurement.Z1;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4300a2 extends D4 implements InterfaceC4384j5 {
    private static final C4300a2 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private X1 zzr;
    private C4318c2 zzs;
    private C4345f2 zzt;
    private C4327d2 zzu;
    private C4309b2 zzv;
    private String zzg = "";
    private L4 zzi = D4.z();
    private L4 zzj = D4.z();
    private L4 zzk = D4.z();
    private String zzl = "";
    private L4 zzn = D4.z();
    private L4 zzo = D4.z();
    private String zzp = "";
    private String zzq = "";

    /* renamed from: com.google.android.gms.internal.measurement.a2$a */
    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a A() {
            q();
            C4300a2.J((C4300a2) this.f34974b);
            return this;
        }

        public final String B() {
            return ((C4300a2) this.f34974b).R();
        }

        public final List D() {
            return Collections.unmodifiableList(((C4300a2) this.f34974b).S());
        }

        public final List E() {
            return Collections.unmodifiableList(((C4300a2) this.f34974b).T());
        }

        public final int u() {
            return ((C4300a2) this.f34974b).I();
        }

        public final Z1 w(int i10) {
            return ((C4300a2) this.f34974b).F(i10);
        }

        public final a x(int i10, Z1.a aVar) {
            q();
            C4300a2.H((C4300a2) this.f34974b, i10, (Z1) ((D4) aVar.p()));
            return this;
        }

        public final a z() {
            q();
            C4300a2.G((C4300a2) this.f34974b);
            return this;
        }

        private a() {
            super(C4300a2.zzc);
        }
    }

    static {
        C4300a2 c4300a2 = new C4300a2();
        zzc = c4300a2;
        D4.r(C4300a2.class, c4300a2);
    }

    private C4300a2() {
    }

    static /* synthetic */ void G(C4300a2 c4300a2) {
        c4300a2.zzk = D4.z();
    }

    static /* synthetic */ void H(C4300a2 c4300a2, int i10, Z1 z12) {
        z12.getClass();
        L4 l42 = c4300a2.zzj;
        if (!l42.zzc()) {
            c4300a2.zzj = D4.n(l42);
        }
        c4300a2.zzj.set(i10, z12);
    }

    static /* synthetic */ void J(C4300a2 c4300a2) {
        c4300a2.zzn = D4.z();
    }

    public static a M() {
        return (a) zzc.u();
    }

    public static C4300a2 O() {
        return zzc;
    }

    public final Z1 F(int i10) {
        return (Z1) this.zzj.get(i10);
    }

    public final int I() {
        return this.zzj.size();
    }

    public final long K() {
        return this.zzf;
    }

    public final X1 L() {
        X1 x12 = this.zzr;
        return x12 == null ? X1.G() : x12;
    }

    public final C4345f2 P() {
        C4345f2 c4345f2 = this.zzt;
        return c4345f2 == null ? C4345f2.G() : c4345f2;
    }

    public final String Q() {
        return this.zzg;
    }

    public final String R() {
        return this.zzp;
    }

    public final List S() {
        return this.zzk;
    }

    public final List T() {
        return this.zzo;
    }

    public final List U() {
        return this.zzn;
    }

    public final List V() {
        return this.zzi;
    }

    public final boolean W() {
        return (this.zze & 128) != 0;
    }

    public final boolean X() {
        return (this.zze & 2) != 0;
    }

    public final boolean Y() {
        return (this.zze & 512) != 0;
    }

    public final boolean Z() {
        return (this.zze & 1) != 0;
    }

    public final int j() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (AbstractC4372i2.f35265a[i10 - 1]) {
            case 1:
                return new C4300a2();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C4336e2.class, "zzj", Z1.class, "zzk", P1.class, "zzl", "zzm", "zzn", M2.class, "zzo", Y1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (C4300a2.class) {
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
