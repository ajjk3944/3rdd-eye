package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class K extends I implements K0 {

    /* renamed from: d, reason: collision with root package name */
    private final I f58075d;

    /* renamed from: e, reason: collision with root package name */
    private final S f58076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(I origin, S enhancement) {
        super(origin.V0(), origin.W0());
        AbstractC6492s.i(origin, "origin");
        AbstractC6492s.i(enhancement, "enhancement");
        this.f58075d = origin;
        this.f58076e = enhancement;
    }

    @Override // pi.K0
    public S I() {
        return this.f58076e;
    }

    @Override // pi.M0
    public M0 R0(boolean z10) {
        return L0.d(G0().R0(z10), I().Q0().R0(z10));
    }

    @Override // pi.M0
    public M0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return L0.d(G0().T0(newAttributes), I());
    }

    @Override // pi.I
    public AbstractC7346d0 U0() {
        return G0().U0();
    }

    @Override // pi.I
    public String X0(kotlin.reflect.jvm.internal.impl.renderer.n renderer, kotlin.reflect.jvm.internal.impl.renderer.w options) {
        AbstractC6492s.i(renderer, "renderer");
        AbstractC6492s.i(options, "options");
        return options.g() ? renderer.U(I()) : G0().X0(renderer, options);
    }

    @Override // pi.K0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public I G0() {
        return this.f58075d;
    }

    @Override // pi.M0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public K X0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(G0());
        AbstractC6492s.g(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new K((I) sA, kotlinTypeRefiner.a(I()));
    }

    @Override // pi.I
    public String toString() {
        return "[@EnhancedForWarnings(" + I() + ")] " + G0();
    }
}
