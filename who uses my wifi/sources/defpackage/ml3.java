package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ml3 implements Serializable, ll3 {
    public final transient wc f = new wc();
    public final ll3 g;
    public volatile transient boolean h;
    public transient Object i;

    public ml3(ll3 ll3Var) {
        this.g = ll3Var;
    }

    @Override // defpackage.ll3
    public final Object a() {
        if (!this.h) {
            synchronized (this.f) {
                try {
                    if (!this.h) {
                        Object objA = this.g.a();
                        this.i = objA;
                        this.h = true;
                        return objA;
                    }
                } finally {
                }
            }
        }
        return this.i;
    }

    public final String toString() {
        Object objL;
        if (this.h) {
            String strValueOf = String.valueOf(this.i);
            objL = ex0.l(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objL = this.g;
        }
        String string = objL.toString();
        return ex0.l(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }
}
