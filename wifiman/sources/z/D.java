package z;

import T.InterfaceC3551q0;
import T.t1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
abstract class D implements D0.d, D0.j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f66786a;

    public /* synthetic */ D(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final f0 c() {
        return (f0) this.f66786a.getValue();
    }

    private final void e(f0 f0Var) {
        this.f66786a.setValue(f0Var);
    }

    @Override // D0.d
    public void Z0(D0.k kVar) {
        e(a((f0) kVar.z(i0.b())));
    }

    public abstract f0 a(f0 f0Var);

    @Override // D0.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f0 getValue() {
        return c();
    }

    @Override // D0.j
    public D0.l getKey() {
        return i0.b();
    }

    private D() {
        this.f66786a = t1.d(h0.a(0, 0, 0, 0), null, 2, null);
    }
}
