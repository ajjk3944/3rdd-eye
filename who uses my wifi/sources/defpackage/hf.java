package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hf implements m40, gf {
    public static final Map b;
    public final Class a;

    static {
        List listJ0 = zf.j0(rx.class, dy.class, hy.class, iy.class, jy.class, ky.class, ly.class, my.class, ny.class, oy.class, sx.class, tx.class, ux.class, vx.class, wx.class, xx.class, yx.class, zx.class, ay.class, cy.class, ey.class, fy.class, gy.class);
        ArrayList arrayList = new ArrayList(ag.k0(listJ0));
        int i = 0;
        for (Object obj : listJ0) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new gk0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = gb0.j0(arrayList);
    }

    public hf(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.gf
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hf) && m54.i(this).equals(m54.i((m40) obj));
    }

    public final int hashCode() {
        return m54.i(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
