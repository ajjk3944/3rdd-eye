package defpackage;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class te3 extends p54 {
    private static final te3 zzb;
    private static volatile n64 zzc;
    private g64 zza = g64.g;

    static {
        te3 te3Var = new te3();
        zzb = te3Var;
        p54.u(te3.class, te3Var);
    }

    public static te3 C(FileInputStream fileInputStream) throws a64 {
        te3 te3Var = zzb;
        d54 d54Var = new d54(fileInputStream);
        h54 h54Var = h54.a;
        int i = u44.a;
        p54 p54VarL = p54.l(te3Var, d54Var, h54.b);
        p54.z(p54VarL);
        return (te3) p54VarL;
    }

    public static te3 D() {
        return zzb;
    }

    public final int A() {
        return this.zza.size();
    }

    public final Map B() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final g64 E() {
        g64 g64Var = this.zza;
        if (!g64Var.f) {
            this.zza = g64Var.a();
        }
        return this.zza;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", se3.a});
        }
        if (iS == 3) {
            return new te3();
        }
        if (iS == 4) {
            return new re3(zzb);
        }
        if (iS == 5) {
            return zzb;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzc;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (te3.class) {
            try {
                o54Var = zzc;
                if (o54Var == null) {
                    o54Var = new o54(zzb);
                    zzc = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
