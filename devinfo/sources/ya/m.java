package ya;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f37471a;

    /* renamed from: b, reason: collision with root package name */
    public final double f37472b;

    /* renamed from: c, reason: collision with root package name */
    public final double f37473c;

    /* renamed from: d, reason: collision with root package name */
    public final double f37474d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37475e;

    public m(String str, double d10, double d11, double d12, int i4) {
        this.f37471a = str;
        this.f37473c = d10;
        this.f37472b = d11;
        this.f37474d = d12;
        this.f37475e = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return pb.y.l(this.f37471a, mVar.f37471a) && this.f37472b == mVar.f37472b && this.f37473c == mVar.f37473c && this.f37475e == mVar.f37475e && Double.compare(this.f37474d, mVar.f37474d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37471a, Double.valueOf(this.f37472b), Double.valueOf(this.f37473c), Double.valueOf(this.f37474d), Integer.valueOf(this.f37475e)});
    }

    public final String toString() {
        km.n nVar = new km.n(this);
        nVar.f(this.f37471a, "name");
        nVar.f(Double.valueOf(this.f37473c), "minBound");
        nVar.f(Double.valueOf(this.f37472b), "maxBound");
        nVar.f(Double.valueOf(this.f37474d), "percent");
        nVar.f(Integer.valueOf(this.f37475e), "count");
        return nVar.toString();
    }
}
