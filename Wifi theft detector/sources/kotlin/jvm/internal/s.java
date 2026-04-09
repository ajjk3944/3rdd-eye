package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public final class s implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f22041a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22042b;

    public s(Class jClass, String moduleName) {
        p.e(jClass, "jClass");
        p.e(moduleName, "moduleName");
        this.f22041a = jClass;
        this.f22042b = moduleName;
    }

    @Override // kotlin.jvm.internal.f
    public Class b() {
        return this.f22041a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && p.a(b(), ((s) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
