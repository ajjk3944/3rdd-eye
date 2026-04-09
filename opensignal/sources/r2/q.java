package r2;

import lf.t1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f21216c = new q(t1.v(0), t1.v(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f21217a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21218b;

    public q(long j, long j7) {
        this.f21217a = j;
        this.f21218b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return t2.k.a(this.f21217a, qVar.f21217a) && t2.k.a(this.f21218b, qVar.f21218b);
    }

    public final int hashCode() {
        t2.l[] lVarArr = t2.k.f22393b;
        return Long.hashCode(this.f21218b) + (Long.hashCode(this.f21217a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) t2.k.d(this.f21217a)) + ", restLine=" + ((Object) t2.k.d(this.f21218b)) + ')';
    }
}
