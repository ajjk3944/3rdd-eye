package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t0 extends x1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29316b;

    /* renamed from: c, reason: collision with root package name */
    public final List f29317c;

    /* renamed from: d, reason: collision with root package name */
    public final x1 f29318d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29319e;

    public t0(String str, String str2, List list, x1 x1Var, int i4) {
        this.f29315a = str;
        this.f29316b = str2;
        this.f29317c = list;
        this.f29318d = x1Var;
        this.f29319e = i4;
    }

    public final boolean equals(Object obj) {
        String str;
        x1 x1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            t0 t0Var = (t0) ((x1) obj);
            x1 x1Var2 = t0Var.f29318d;
            String str2 = t0Var.f29316b;
            if (this.f29315a.equals(t0Var.f29315a) && ((str = this.f29316b) != null ? str.equals(str2) : str2 == null) && this.f29317c.equals(t0Var.f29317c) && ((x1Var = this.f29318d) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && this.f29319e == t0Var.f29319e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f29315a.hashCode() ^ 1000003) * 1000003;
        String str = this.f29316b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f29317c.hashCode()) * 1000003;
        x1 x1Var = this.f29318d;
        return ((iHashCode2 ^ (x1Var != null ? x1Var.hashCode() : 0)) * 1000003) ^ this.f29319e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f29315a);
        sb2.append(", reason=");
        sb2.append(this.f29316b);
        sb2.append(", frames=");
        sb2.append(this.f29317c);
        sb2.append(", causedBy=");
        sb2.append(this.f29318d);
        sb2.append(", overflowCount=");
        return r5.c.j(this.f29319e, "}", sb2);
    }
}
