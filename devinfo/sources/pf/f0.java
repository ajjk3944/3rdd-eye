package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31814a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31815b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31816c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31817d;

    public f0(String str, int i4, int i10, boolean z3) {
        this.f31814a = str;
        this.f31815b = i4;
        this.f31816c = i10;
        this.f31817d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return nk.k.a(this.f31814a, f0Var.f31814a) && this.f31815b == f0Var.f31815b && this.f31816c == f0Var.f31816c && this.f31817d == f0Var.f31817d;
    }

    public final int hashCode() {
        return (((((this.f31814a.hashCode() * 31) + this.f31815b) * 31) + this.f31816c) * 31) + (this.f31817d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f31814a);
        sb2.append(", pid=");
        sb2.append(this.f31815b);
        sb2.append(", importance=");
        sb2.append(this.f31816c);
        sb2.append(", isDefaultProcess=");
        return d.h.x(sb2, this.f31817d, ')');
    }
}
