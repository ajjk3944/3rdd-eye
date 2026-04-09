package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;

/* loaded from: classes.dex */
public final class T1 extends D4 implements InterfaceC4384j5 {
    private static final T1 zzc;
    private static volatile InterfaceC4432p5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private R1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends D4.b implements InterfaceC4384j5 {
        public final a u(String str) {
            q();
            T1.F((T1) this.f34974b, str);
            return this;
        }

        private a() {
            super(T1.zzc);
        }
    }

    static {
        T1 t12 = new T1();
        zzc = t12;
        D4.r(T1.class, t12);
    }

    private T1() {
    }

    static /* synthetic */ void F(T1 t12, String str) {
        str.getClass();
        t12.zze |= 2;
        t12.zzg = str;
    }

    public static a H() {
        return (a) zzc.u();
    }

    public final R1 G() {
        R1 r12 = this.zzh;
        return r12 == null ? R1.H() : r12;
    }

    public final String J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzj;
    }

    public final boolean M() {
        return this.zzk;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final boolean O() {
        return (this.zze & 32) != 0;
    }

    public final int j() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    protected final Object o(int i10, Object obj, Object obj2) {
        switch (O1.f35089a[i10 - 1]) {
            case 1:
                return new T1();
            case 2:
                return new a();
            case 3:
                return D4.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC4432p5 aVar = zzd;
                if (aVar == null) {
                    synchronized (T1.class) {
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
