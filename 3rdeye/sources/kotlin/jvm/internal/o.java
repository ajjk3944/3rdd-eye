package kotlin.jvm.internal;

/* compiled from: PackageReference.kt */
/* loaded from: classes3.dex */
public final class o implements d {

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f43655b;

    public o(Class jClass) {
        l.f(jClass, "jClass");
        this.f43655b = jClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return l.b(this.f43655b, ((o) obj).f43655b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43655b.hashCode();
    }

    @Override // kotlin.jvm.internal.d
    public final Class<?> i() {
        return this.f43655b;
    }

    public final String toString() {
        return this.f43655b + " (Kotlin reflection is not available)";
    }
}
