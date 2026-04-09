package androidx.media3.common;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1691c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1692d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1693e;

    public h0(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean a() {
        return this.f1690b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f1689a.equals(h0Var.f1689a) && this.f1690b == h0Var.f1690b && this.f1691c == h0Var.f1691c && this.f1692d == h0Var.f1692d && this.f1693e == h0Var.f1693e;
    }

    public final int hashCode() {
        return ((((((((this.f1689a.hashCode() + 527) * 31) + this.f1690b) * 31) + this.f1691c) * 31) + ((int) this.f1692d)) * 31) + this.f1693e;
    }

    public h0(h0 h0Var) {
        this.f1689a = h0Var.f1689a;
        this.f1690b = h0Var.f1690b;
        this.f1691c = h0Var.f1691c;
        this.f1692d = h0Var.f1692d;
        this.f1693e = h0Var.f1693e;
    }

    public h0(Object obj, int i10, int i11, long j, int i12) {
        this.f1689a = obj;
        this.f1690b = i10;
        this.f1691c = i11;
        this.f1692d = j;
        this.f1693e = i12;
    }
}
