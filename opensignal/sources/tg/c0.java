package tg;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f22748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22749b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22750c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22751d;

    public c0(String str, int i10, int i11, boolean z10) {
        this.f22748a = str;
        this.f22749b = i10;
        this.f22750c = i11;
        this.f22751d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return br.l.a(this.f22748a, c0Var.f22748a) && this.f22749b == c0Var.f22749b && this.f22750c == c0Var.f22750c && this.f22751d == c0Var.f22751d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22751d) + c7.a.C(this.f22750c, c7.a.C(this.f22749b, this.f22748a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f22748a);
        sb2.append(", pid=");
        sb2.append(this.f22749b);
        sb2.append(", importance=");
        sb2.append(this.f22750c);
        sb2.append(", isDefaultProcess=");
        return c7.a.r(sb2, this.f22751d, ')');
    }
}
