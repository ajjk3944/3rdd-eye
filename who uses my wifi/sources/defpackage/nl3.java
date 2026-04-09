package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nl3 implements ll3 {
    public final wc f = new wc();
    public volatile ll3 g;
    public Object h;

    public nl3(ll3 ll3Var) {
        this.g = ll3Var;
    }

    @Override // defpackage.ll3
    public final Object a() {
        ll3 ll3Var = this.g;
        su2 su2Var = su2.m;
        if (ll3Var != su2Var) {
            synchronized (this.f) {
                try {
                    if (this.g != su2Var) {
                        Object objA = this.g.a();
                        this.h = objA;
                        this.g = su2Var;
                        return objA;
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public final String toString() {
        Object objL = this.g;
        if (objL == su2.m) {
            String strValueOf = String.valueOf(this.h);
            objL = ex0.l(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objL);
        return ex0.l(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }
}
