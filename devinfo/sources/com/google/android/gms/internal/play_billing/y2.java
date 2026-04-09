package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.vm1;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y2 extends p1 {
    private static final y2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private c3 zzh;
    private int zzi;

    static {
        y2 y2Var = new y2();
        zzb = y2Var;
        p1.k(y2.class, y2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.l2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.play_billing.p1, java.lang.Object] */
    public static y2 n(byte[] bArr, i1 i1Var) throws w1 {
        y2 y2Var = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r22 = (p1) y2Var.d(4);
            try {
                ?? A = i2.f20149c.a(r22.getClass());
                vm1 vm1Var = new vm1();
                i1Var.getClass();
                A.g(r22, bArr, 0, length, vm1Var);
                A.b(r22);
                y2Var = r22;
            } catch (o2 e2) {
                throw new w1(e2.getMessage());
            } catch (w1 e10) {
                throw e10;
            } catch (IOException e11) {
                if (e11.getCause() instanceof w1) {
                    throw ((w1) e11.getCause());
                }
                throw new w1(e11.getMessage(), e11);
            } catch (IndexOutOfBoundsException unused) {
                throw new w1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (y2Var == null || p1.c(y2Var, true)) {
            return y2Var;
        }
        throw new w1(new o2().getMessage());
    }

    public static void p(y2 y2Var, e3 e3Var) {
        y2Var.zzi = e3Var.f20115a;
        y2Var.zzd |= 4;
    }

    public static /* synthetic */ void q(y2 y2Var, c3 c3Var) {
        y2Var.zzh = c3Var;
        y2Var.zzd |= 2;
    }

    public static /* synthetic */ void r(y2 y2Var, n3 n3Var) {
        y2Var.zzf = n3Var;
        y2Var.zze = 7;
    }

    public static /* synthetic */ void s(y2 y2Var, v3 v3Var) {
        y2Var.zzf = v3Var;
        y2Var.zze = 6;
    }

    public static /* synthetic */ void t(y2 y2Var, int i4) {
        y2Var.zzg = i4 - 1;
        y2Var.zzd |= 1;
    }

    public static x2 u() {
        return (x2) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", a1.f20074c, "zzh", j3.class, "zzi", a1.f20076e, v3.class, n3.class});
        }
        if (i10 == 3) {
            return new y2();
        }
        if (i10 == 4) {
            return new x2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }

    public final n3 o() {
        return this.zze == 7 ? (n3) this.zzf : n3.o();
    }
}
