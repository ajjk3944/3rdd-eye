package y2;

import x2.InterfaceC8419a;

/* loaded from: classes.dex */
public final class d implements c, InterfaceC8419a {

    /* renamed from: b, reason: collision with root package name */
    private static final d f66356b = new d(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f66357a;

    private d(Object obj) {
        this.f66357a = obj;
    }

    public static c a(Object obj) {
        return new d(e.c(obj, "instance cannot be null"));
    }

    @Override // z2.InterfaceC8708a
    public Object get() {
        return this.f66357a;
    }
}
