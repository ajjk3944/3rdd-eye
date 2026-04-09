package b4;

/* renamed from: b4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351p implements InterfaceC0353r {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5760c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC0353r f5761a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f5762b = f5760c;

    public C0351p(InterfaceC0353r interfaceC0353r) {
        this.f5761a = interfaceC0353r;
    }

    public static C0351p b(InterfaceC0353r interfaceC0353r) {
        return interfaceC0353r instanceof C0351p ? (C0351p) interfaceC0353r : new C0351p(interfaceC0353r);
    }

    public static InterfaceC0353r c(InterfaceC0353r interfaceC0353r) {
        return interfaceC0353r instanceof C0351p ? interfaceC0353r : new C0351p(interfaceC0353r);
    }

    @Override // b4.InterfaceC0353r
    public final Object a() {
        Object objA;
        Object obj = this.f5762b;
        Object obj2 = f5760c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f5762b;
                if (objA == obj2) {
                    objA = this.f5761a.a();
                    Object obj3 = this.f5762b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f5762b = objA;
                    this.f5761a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
