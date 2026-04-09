package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7360k0 extends C0 {

    /* renamed from: a, reason: collision with root package name */
    private final Bh.l0 f58137a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f58138b;

    public C7360k0(Bh.l0 typeParameter) {
        AbstractC6492s.i(typeParameter, "typeParameter");
        this.f58137a = typeParameter;
        this.f58138b = Yg.n.a(Yg.q.PUBLICATION, new C7358j0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S d(C7360k0 c7360k0) {
        return AbstractC7362l0.b(c7360k0.f58137a);
    }

    private final S f() {
        return (S) this.f58138b.getValue();
    }

    @Override // pi.B0
    public N0 a() {
        return N0.OUT_VARIANCE;
    }

    @Override // pi.B0
    public B0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // pi.B0
    public boolean c() {
        return true;
    }

    @Override // pi.B0
    public S getType() {
        return f();
    }
}
