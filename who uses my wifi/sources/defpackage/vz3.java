package defpackage;

import java.io.ByteArrayInputStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vz3 extends p54 {
    private static final vz3 zzc;
    private static volatile n64 zzd;
    private int zza;
    private x54 zzb = q64.j;

    static {
        vz3 vz3Var = new vz3();
        zzc = vz3Var;
        p54.u(vz3.class, vz3Var);
    }

    public static vz3 E(byte[] bArr, h54 h54Var) {
        p54 p54VarY = p54.y(zzc, bArr, bArr.length, h54Var);
        p54.z(p54VarY);
        return (vz3) p54VarY;
    }

    public static vz3 F(ByteArrayInputStream byteArrayInputStream, h54 h54Var) throws a64 {
        p54 p54VarL = p54.l(zzc, new d54(byteArrayInputStream), h54Var);
        p54.z(p54VarL);
        return (vz3) p54VarL;
    }

    public static sz3 G() {
        return (sz3) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final x54 B() {
        return this.zzb;
    }

    public final int C() {
        return this.zzb.size();
    }

    public final uz3 D(int i) {
        return (uz3) this.zzb.get(i);
    }

    public final /* synthetic */ void H(int i) {
        this.zza = i;
    }

    public final void I(uz3 uz3Var) {
        x54 x54Var = this.zzb;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzb = x54Var.z(size + size);
        }
        this.zzb.add(uz3Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", uz3.class});
        }
        if (iS == 3) {
            return new vz3();
        }
        if (iS == 4) {
            return new sz3(zzc);
        }
        if (iS == 5) {
            return zzc;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzd;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (vz3.class) {
            try {
                o54Var = zzd;
                if (o54Var == null) {
                    o54Var = new o54(zzc);
                    zzd = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
