package ne;

import com.google.android.gms.internal.measurement.o4;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    public volatile o4 f17539a;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f17540d;

    /* renamed from: g, reason: collision with root package name */
    public Object f17541g;

    @Override // ne.n
    public final Object get() {
        if (!this.f17540d) {
            synchronized (this) {
                try {
                    if (!this.f17540d) {
                        o4 o4Var = this.f17539a;
                        Objects.requireNonNull(o4Var);
                        Object obj = o4Var.get();
                        this.f17541g = obj;
                        this.f17540d = true;
                        this.f17539a = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f17541g;
    }

    public final String toString() {
        Object objK = this.f17539a;
        if (objK == null) {
            String strValueOf = String.valueOf(this.f17541g);
            objK = c7.a.k(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objK);
        return c7.a.k(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
    }
}
