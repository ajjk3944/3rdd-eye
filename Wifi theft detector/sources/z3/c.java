package z3;

/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final c f25325b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f25326a;

    public c(Object obj) {
        this.f25326a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f25326a;
    }
}
