package td;

import com.google.android.gms.internal.measurement.v5;
import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final v5 f34542a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient boolean f34543b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object f34544c;

    public e(v5 v5Var) {
        this.f34542a = v5Var;
    }

    @Override // td.d
    public final Object get() {
        if (!this.f34543b) {
            synchronized (this) {
                try {
                    if (!this.f34543b) {
                        Object obj = this.f34542a.get();
                        this.f34544c = obj;
                        this.f34543b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f34544c;
    }

    public final String toString() {
        Object string;
        if (this.f34543b) {
            String strValueOf = String.valueOf(this.f34544c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        } else {
            string = this.f34542a;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(strValueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
