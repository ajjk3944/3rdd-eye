package defpackage;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cu1 extends hu1 {
    public final zs1 h;
    public final long i;
    public final long j;

    public cu1(jt1 jt1Var, fr1 fr1Var, int i, zs1 zs1Var, long j, long j2) {
        super(jt1Var, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", fr1Var, i, 11);
        this.h = zs1Var;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.hu1
    public final void a() {
        zs1 zs1Var = this.h;
        if (zs1Var != null) {
            String str = (String) this.e.invoke(null, (NetworkCapabilities) zs1Var.g, Long.valueOf(this.i), Long.valueOf(this.j));
            ys1 ys1Var = new ys1();
            HashMap mapT = a30.t(str);
            if (mapT != null) {
                ys1Var.u = (Long) mapT.get(0);
                ys1Var.v = (Long) mapT.get(1);
                ys1Var.w = (Long) mapT.get(2);
            }
            fr1 fr1Var = this.d;
            synchronized (fr1Var) {
                try {
                    long jLongValue = ys1Var.u.longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).J0(jLongValue);
                    if (((Long) ys1Var.v).longValue() >= 0) {
                        long jLongValue2 = ((Long) ys1Var.v).longValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).h0(jLongValue2);
                    }
                    if (((Long) ys1Var.w).longValue() >= 0) {
                        long jLongValue3 = ((Long) ys1Var.w).longValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).i0(jLongValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
