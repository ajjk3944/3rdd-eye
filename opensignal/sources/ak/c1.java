package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f469c;

    /* renamed from: d, reason: collision with root package name */
    public final long f470d;

    /* renamed from: e, reason: collision with root package name */
    public final long f471e;

    public c1(List list, int i10, int i11, long j, long j7) {
        br.l.e(list, "endpoints");
        this.f467a = list;
        this.f468b = i10;
        this.f469c = i11;
        this.f470d = j;
        this.f471e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return br.l.a(this.f467a, c1Var.f467a) && this.f468b == c1Var.f468b && this.f469c == c1Var.f469c && this.f470d == c1Var.f470d && this.f471e == c1Var.f471e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f471e) + h0.b.b(c7.a.C(this.f469c, c7.a.C(this.f468b, this.f467a.hashCode() * 31, 31), 31), 31, this.f470d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TracerouteConfig(endpoints=");
        sb2.append(this.f467a);
        sb2.append(", maxHops=");
        sb2.append(this.f468b);
        sb2.append(", sendRequestNumberTimes=");
        sb2.append(this.f469c);
        sb2.append(", minWaitResponseMs=");
        sb2.append(this.f470d);
        sb2.append(", maxWaitResponseMs=");
        return w.g.h(sb2, this.f471e, ')');
    }
}
