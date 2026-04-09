package y2;

import x2.InterfaceC8419a;
import z2.InterfaceC8708a;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8608b implements InterfaceC8708a, InterfaceC8419a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f66353c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC8708a f66354a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f66355b = f66353c;

    private C8608b(InterfaceC8708a interfaceC8708a) {
        this.f66354a = interfaceC8708a;
    }

    public static InterfaceC8419a a(InterfaceC8708a interfaceC8708a) {
        return interfaceC8708a instanceof InterfaceC8419a ? (InterfaceC8419a) interfaceC8708a : new C8608b((InterfaceC8708a) e.b(interfaceC8708a));
    }

    public static InterfaceC8708a b(InterfaceC8708a interfaceC8708a) {
        e.b(interfaceC8708a);
        return interfaceC8708a instanceof C8608b ? interfaceC8708a : new C8608b(interfaceC8708a);
    }

    private static Object c(Object obj, Object obj2) {
        if (obj == f66353c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // z2.InterfaceC8708a
    public Object get() {
        Object obj = this.f66355b;
        Object obj2 = f66353c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f66355b;
                    if (obj == obj2) {
                        obj = this.f66354a.get();
                        this.f66355b = c(this.f66355b, obj);
                        this.f66354a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
