package defpackage;

import java.util.ArrayList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kx1 extends p54 {
    private static final kx1 zzG;
    private static volatile n64 zzH = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final u54 zzx = new ts0();
    private int zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzu;
    private long zzv;
    private t54 zzw = q54.j;
    private hx1 zzy;
    private int zzz;

    static {
        kx1 kx1Var = new kx1();
        zzG = kx1Var;
        p54.u(kx1.class, kx1Var);
    }

    public static kx1 P(byte[] bArr) throws a64 {
        kx1 kx1Var = zzG;
        int length = bArr.length;
        h54 h54Var = h54.a;
        int i = u44.a;
        p54 p54VarY = p54.y(kx1Var, bArr, length, h54.b);
        p54.z(p54VarY);
        return (kx1) p54VarY;
    }

    public static jx1 Q() {
        return (jx1) zzG.r();
    }

    public final void A(long j) {
        this.zzn |= 1;
        this.zzo = j;
    }

    public final void B(int i) {
        this.zzp = ga1.e(i);
        this.zzn |= 2;
    }

    public final void C(long j) {
        this.zzn |= 4;
        this.zzu = j;
    }

    public final void D(long j) {
        this.zzn |= 8;
        this.zzv = j;
    }

    public final void E(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzw;
        if (!((t44) randomAccess).f) {
            q54 q54Var = (q54) randomAccess;
            int i = q54Var.h;
            this.zzw = q54Var.z(i + i);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((q54) this.zzw).d(((py1) obj).f);
        }
    }

    public final void F(hx1 hx1Var) {
        this.zzy = hx1Var;
        this.zzn |= 16;
    }

    public final void G(int i) {
        this.zzz = ga1.e(i);
        this.zzn |= 32;
    }

    public final void H(int i) {
        this.zzA = ga1.e(i);
        this.zzn |= 64;
    }

    public final void I(int i) {
        this.zzB = ga1.e(i);
        this.zzn |= 128;
    }

    public final void J(int i) {
        this.zzn |= 256;
        this.zzC = i;
    }

    public final void K(int i) {
        this.zzD = ga1.e(i);
        this.zzn |= 512;
    }

    public final void L(mx1 mx1Var) {
        this.zzE = mx1Var.f;
        this.zzn |= 1024;
    }

    public final void M(long j) {
        this.zzn |= 2048;
        this.zzF = j;
    }

    public final long N() {
        return this.zzo;
    }

    public final int O() {
        int i = this.zzp;
        int i2 = i != 0 ? i != 1 ? i != 1000 ? 0 : 3 : 2 : 1;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            tq1 tq1Var = tq1.w;
            return new r64(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", tq1Var, "zzu", "zzv", "zzw", tq1.u, "zzy", "zzz", tq1Var, "zzA", tq1Var, "zzB", tq1Var, "zzC", "zzD", tq1Var, "zzE", tq1.r, "zzF"});
        }
        if (iS == 3) {
            return new kx1();
        }
        if (iS == 4) {
            return new jx1(zzG);
        }
        if (iS == 5) {
            return zzG;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzH;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (kx1.class) {
            try {
                o54Var = zzH;
                if (o54Var == null) {
                    o54Var = new o54(zzG);
                    zzH = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
