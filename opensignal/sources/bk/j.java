package bk;

/* loaded from: classes.dex */
public final class j extends dr.a {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2818a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2819b;

    public j(Exception exc, int i10) {
        exc = (i10 & 1) != 0 ? null : exc;
        String str = (i10 & 2) != 0 ? "" : "Not all results were uploaded.";
        this.f2818a = exc;
        this.f2819b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return br.l.a(this.f2818a, jVar.f2818a) && br.l.a(this.f2819b, jVar.f2819b);
    }

    public final int hashCode() {
        Throwable th2 = this.f2818a;
        return this.f2819b.hashCode() + ((th2 == null ? 0 : th2.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnknownError(throwable=");
        sb2.append(this.f2818a);
        sb2.append(", message=");
        return h0.b.r(sb2, this.f2819b, ')');
    }
}
