package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7339a extends AbstractC7333A {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7346d0 f58107b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC7346d0 f58108c;

    public C7339a(AbstractC7346d0 delegate, AbstractC7346d0 abbreviation) {
        AbstractC6492s.i(delegate, "delegate");
        AbstractC6492s.i(abbreviation, "abbreviation");
        this.f58107b = delegate;
        this.f58108c = abbreviation;
    }

    public final AbstractC7346d0 U() {
        return W0();
    }

    @Override // pi.M0
    /* renamed from: V0 */
    public AbstractC7346d0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return new C7339a(W0().T0(newAttributes), this.f58108c);
    }

    @Override // pi.AbstractC7333A
    protected AbstractC7346d0 W0() {
        return this.f58107b;
    }

    public final AbstractC7346d0 Z0() {
        return this.f58108c;
    }

    @Override // pi.AbstractC7346d0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C7339a R0(boolean z10) {
        return new C7339a(W0().R0(z10), this.f58108c.R0(z10));
    }

    @Override // pi.AbstractC7333A
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C7339a X0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(W0());
        AbstractC6492s.g(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(this.f58108c);
        AbstractC6492s.g(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7339a((AbstractC7346d0) sA, (AbstractC7346d0) sA2);
    }

    @Override // pi.AbstractC7333A
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C7339a Y0(AbstractC7346d0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        return new C7339a(delegate, this.f58108c);
    }
}
