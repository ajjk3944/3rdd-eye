package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bg1 {
    public final dg1 a;
    public final dg1 b;

    public bg1(dg1 dg1Var, dg1 dg1Var2) {
        this.a = dg1Var;
        this.b = dg1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bg1.class == obj.getClass()) {
            bg1 bg1Var = (bg1) obj;
            if (this.a.equals(bg1Var.a) && this.b.equals(bg1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        dg1 dg1Var = this.a;
        String string = dg1Var.toString();
        dg1 dg1Var2 = this.b;
        String strConcat = dg1Var.equals(dg1Var2) ? "" : ", ".concat(dg1Var2.toString());
        return ex0.m(new StringBuilder(ga1.i(strConcat, string.length() + 1, 1)), "[", string, strConcat, "]");
    }
}
