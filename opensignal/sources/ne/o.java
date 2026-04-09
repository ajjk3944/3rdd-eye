package ne;

import com.google.android.gms.internal.measurement.o4;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class o implements n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final o4 f17536a;

    /* renamed from: d, reason: collision with root package name */
    public volatile transient boolean f17537d;

    /* renamed from: g, reason: collision with root package name */
    public transient Object f17538g;

    public o(o4 o4Var) {
        this.f17536a = o4Var;
    }

    @Override // ne.n
    public final Object get() {
        if (!this.f17537d) {
            synchronized (this) {
                try {
                    if (!this.f17537d) {
                        Object obj = this.f17536a.get();
                        this.f17538g = obj;
                        this.f17537d = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f17538g;
    }

    public final String toString() {
        Object objK;
        if (this.f17537d) {
            String strValueOf = String.valueOf(this.f17538g);
            objK = c7.a.k(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
        } else {
            objK = this.f17536a;
        }
        String strValueOf2 = String.valueOf(objK);
        return c7.a.k(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
    }
}
