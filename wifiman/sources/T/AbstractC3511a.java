package T;

import java.util.ArrayList;
import java.util.List;

/* renamed from: T.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3511a implements InterfaceC3526f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20999a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21000b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Object f21001c;

    public AbstractC3511a(Object obj) {
        this.f20999a = obj;
        this.f21001c = obj;
    }

    @Override // T.InterfaceC3526f
    public Object b() {
        return this.f21001c;
    }

    @Override // T.InterfaceC3526f
    public final void clear() {
        this.f21000b.clear();
        l(this.f20999a);
        k();
    }

    @Override // T.InterfaceC3526f
    public void d(Object obj) {
        this.f21000b.add(b());
        l(obj);
    }

    @Override // T.InterfaceC3526f
    public void g() {
        if (this.f21000b.isEmpty()) {
            B0.b("empty stack");
        }
        l(this.f21000b.remove(r0.size() - 1));
    }

    public final Object j() {
        return this.f20999a;
    }

    protected abstract void k();

    protected void l(Object obj) {
        this.f21001c = obj;
    }
}
