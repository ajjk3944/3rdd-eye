package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7352g0 extends AbstractC7333A implements K0 {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7346d0 f58129b;

    /* renamed from: c, reason: collision with root package name */
    private final S f58130c;

    public C7352g0(AbstractC7346d0 delegate, S enhancement) {
        AbstractC6492s.i(delegate, "delegate");
        AbstractC6492s.i(enhancement, "enhancement");
        this.f58129b = delegate;
        this.f58130c = enhancement;
    }

    @Override // pi.K0
    public S I() {
        return this.f58130c;
    }

    @Override // pi.M0
    /* renamed from: U0 */
    public AbstractC7346d0 R0(boolean z10) {
        M0 m0D = L0.d(G0().R0(z10), I().Q0().R0(z10));
        AbstractC6492s.g(m0D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC7346d0) m0D;
    }

    @Override // pi.M0
    /* renamed from: V0 */
    public AbstractC7346d0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        M0 m0D = L0.d(G0().T0(newAttributes), I());
        AbstractC6492s.g(m0D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC7346d0) m0D;
    }

    @Override // pi.AbstractC7333A
    protected AbstractC7346d0 W0() {
        return this.f58129b;
    }

    @Override // pi.K0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 G0() {
        return W0();
    }

    @Override // pi.AbstractC7333A
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C7352g0 X0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(W0());
        AbstractC6492s.g(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7352g0((AbstractC7346d0) sA, kotlinTypeRefiner.a(I()));
    }

    @Override // pi.AbstractC7333A
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C7352g0 Y0(AbstractC7346d0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        return new C7352g0(delegate, I());
    }

    @Override // pi.AbstractC7346d0
    public String toString() {
        return "[@EnhancedForWarnings(" + I() + ")] " + G0();
    }
}
