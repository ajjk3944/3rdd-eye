package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 {
    public static final a0 Companion = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final int f31766a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31767b;

    public /* synthetic */ b0(int i4, int i10, String str) {
        if (3 != (i4 & 3)) {
            ml.k.a(i4, 3, z.f31929a.d());
            throw null;
        }
        this.f31766a = i10;
        this.f31767b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f31766a == b0Var.f31766a && nk.k.a(this.f31767b, b0Var.f31767b);
    }

    public final int hashCode() {
        return this.f31767b.hashCode() + (this.f31766a * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.f31766a);
        sb2.append(", uuid=");
        return r5.c.l(sb2, this.f31767b, ')');
    }

    public b0(int i4, String str) {
        nk.k.e(str, "uuid");
        this.f31766a = i4;
        this.f31767b = str;
    }
}
