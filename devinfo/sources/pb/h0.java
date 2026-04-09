package pb;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31614a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31615b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31616c;

    public h0(String str, boolean z3) {
        y.e(str);
        this.f31614a = str;
        y.e("com.google.android.gms");
        this.f31615b = "com.google.android.gms";
        this.f31616c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return y.l(this.f31614a, h0Var.f31614a) && y.l(this.f31615b, h0Var.f31615b) && y.l(null, null) && this.f31616c == h0Var.f31616c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31614a, this.f31615b, null, 4225, Boolean.valueOf(this.f31616c)});
    }

    public final String toString() {
        String str = this.f31614a;
        if (str != null) {
            return str;
        }
        y.h(null);
        throw null;
    }
}
