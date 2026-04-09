package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o42 {
    public static final o42 b;
    public final xm3 a;

    static {
        vm3 vm3Var = xm3.g;
        b = new o42(sn3.j);
        String str = v23.a;
        Integer.toString(0, 36);
    }

    public o42(sn3 sn3Var) {
        this.a = xm3.m(sn3Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            xm3 xm3Var = this.a;
            if (i2 >= xm3Var.size()) {
                return false;
            }
            c42 c42Var = (c42) xm3Var.get(i2);
            boolean[] zArr = c42Var.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (c42Var.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o42.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((o42) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
