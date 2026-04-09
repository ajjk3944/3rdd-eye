package pb;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o implements ob.b {

    /* renamed from: c, reason: collision with root package name */
    public static final o f31652c = new o(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f31653b;

    public /* synthetic */ o(String str) {
        this.f31653b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return y.l(this.f31653b, ((o) obj).f31653b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31653b});
    }
}
