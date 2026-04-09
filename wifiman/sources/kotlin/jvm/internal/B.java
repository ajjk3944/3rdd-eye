package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public final class B implements InterfaceC6482h {

    /* renamed from: a, reason: collision with root package name */
    private final Class f51682a;

    /* renamed from: b, reason: collision with root package name */
    private final String f51683b;

    public B(Class jClass, String moduleName) {
        AbstractC6492s.i(jClass, "jClass");
        AbstractC6492s.i(moduleName, "moduleName");
        this.f51682a = jClass;
        this.f51683b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC6482h
    public Class b() {
        return this.f51682a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof B) && AbstractC6492s.d(b(), ((B) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
