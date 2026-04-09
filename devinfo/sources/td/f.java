package td;

import com.google.android.gms.internal.measurement.v5;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public volatile v5 f34545a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f34546b;

    /* renamed from: c, reason: collision with root package name */
    public Object f34547c;

    @Override // td.d
    public final Object get() {
        if (!this.f34546b) {
            synchronized (this) {
                try {
                    if (!this.f34546b) {
                        v5 v5Var = this.f34545a;
                        Objects.requireNonNull(v5Var);
                        Object obj = v5Var.get();
                        this.f34547c = obj;
                        this.f34546b = true;
                        this.f34545a = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f34547c;
    }

    public final String toString() {
        Object string = this.f34545a;
        if (string == null) {
            String strValueOf = String.valueOf(this.f34547c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(strValueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
