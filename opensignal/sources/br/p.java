package br;

/* loaded from: classes.dex */
public final class p implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2913a;

    public p(Class cls, String str) {
        l.e(cls, "jClass");
        this.f2913a = cls;
    }

    @Override // br.e
    public final Class a() {
        return this.f2913a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return l.a(this.f2913a, ((p) obj).f2913a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2913a.hashCode();
    }

    public final String toString() {
        return this.f2913a.toString() + " (Kotlin reflection is not available)";
    }
}
