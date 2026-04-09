package yt;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final i f26448b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final Object f26449a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return br.l.a(this.f26449a, ((j) obj).f26449a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f26449a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f26449a;
        if (obj instanceof h) {
            return ((h) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
