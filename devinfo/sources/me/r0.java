package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r0 extends b2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f29294a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f29295b;

    /* renamed from: c, reason: collision with root package name */
    public final p1 f29296c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f29297d;

    /* renamed from: e, reason: collision with root package name */
    public final List f29298e;

    public r0(List list, t0 t0Var, p1 p1Var, u0 u0Var, List list2) {
        this.f29294a = list;
        this.f29295b = t0Var;
        this.f29296c = p1Var;
        this.f29297d = u0Var;
        this.f29298e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        List list = this.f29294a;
        if (list == null) {
            if (((r0) b2Var).f29294a != null) {
                return false;
            }
        } else if (!list.equals(((r0) b2Var).f29294a)) {
            return false;
        }
        x1 x1Var = this.f29295b;
        if (x1Var == null) {
            if (((r0) b2Var).f29295b != null) {
                return false;
            }
        } else if (!x1Var.equals(((r0) b2Var).f29295b)) {
            return false;
        }
        p1 p1Var = this.f29296c;
        if (p1Var == null) {
            if (((r0) b2Var).f29296c != null) {
                return false;
            }
        } else if (!p1Var.equals(((r0) b2Var).f29296c)) {
            return false;
        }
        r0 r0Var = (r0) b2Var;
        return this.f29297d.equals(r0Var.f29297d) && this.f29298e.equals(r0Var.f29298e);
    }

    public final int hashCode() {
        List list = this.f29294a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        x1 x1Var = this.f29295b;
        int iHashCode2 = (iHashCode ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        p1 p1Var = this.f29296c;
        return (((((p1Var != null ? p1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f29297d.hashCode()) * 1000003) ^ this.f29298e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f29294a + ", exception=" + this.f29295b + ", appExitInfo=" + this.f29296c + ", signal=" + this.f29297d + ", binaries=" + this.f29298e + "}";
    }
}
