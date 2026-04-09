package r;

import T.InterfaceC3551q0;
import T.t1;

/* loaded from: classes.dex */
public final class W extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f59543d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f59544b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f59545c;

    public W(Object obj) {
        super(null);
        this.f59544b = t1.d(obj, null, 2, null);
        this.f59545c = t1.d(obj, null, 2, null);
    }

    @Override // r.q0
    public Object a() {
        return this.f59544b.getValue();
    }

    @Override // r.q0
    public Object b() {
        return this.f59545c.getValue();
    }

    @Override // r.q0
    public void d(Object obj) {
        this.f59544b.setValue(obj);
    }

    @Override // r.q0
    public void f(o0 o0Var) {
    }

    @Override // r.q0
    public void g() {
    }

    public void h(Object obj) {
        this.f59545c.setValue(obj);
    }
}
