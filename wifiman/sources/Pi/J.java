package pi;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public final class J extends I implements InterfaceC7375w {

    /* renamed from: e, reason: collision with root package name */
    public static final a f58067e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static boolean f58068f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f58069d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC7346d0 lowerBound, AbstractC7346d0 upperBound) {
        super(lowerBound, upperBound);
        AbstractC6492s.i(lowerBound, "lowerBound");
        AbstractC6492s.i(upperBound, "upperBound");
    }

    private final void Z0() {
        if (!f58068f || this.f58069d) {
            return;
        }
        this.f58069d = true;
        L.b(V0());
        L.b(W0());
        AbstractC6492s.d(V0(), W0());
        kotlin.reflect.jvm.internal.impl.types.checker.e.f52144a.c(V0(), W0());
    }

    @Override // pi.InterfaceC7375w
    public boolean B0() {
        return (V0().N0().c() instanceof Bh.l0) && AbstractC6492s.d(V0().N0(), W0().N0());
    }

    @Override // pi.M0
    public M0 R0(boolean z10) {
        return V.e(V0().R0(z10), W0().R0(z10));
    }

    @Override // pi.M0
    public M0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return V.e(V0().T0(newAttributes), W0().T0(newAttributes));
    }

    @Override // pi.I
    public AbstractC7346d0 U0() {
        Z0();
        return V0();
    }

    @Override // pi.I
    public String X0(kotlin.reflect.jvm.internal.impl.renderer.n renderer, kotlin.reflect.jvm.internal.impl.renderer.w options) {
        AbstractC6492s.i(renderer, "renderer");
        AbstractC6492s.i(options, "options");
        if (!options.p()) {
            return renderer.R(renderer.U(V0()), renderer.U(W0()), AbstractC7984d.n(this));
        }
        return '(' + renderer.U(V0()) + ".." + renderer.U(W0()) + ')';
    }

    @Override // pi.M0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public I X0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(V0());
        AbstractC6492s.g(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(W0());
        AbstractC6492s.g(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new J((AbstractC7346d0) sA, (AbstractC7346d0) sA2);
    }

    @Override // pi.InterfaceC7375w
    public S i0(S replacement) {
        M0 m0E;
        AbstractC6492s.i(replacement, "replacement");
        M0 m0Q0 = replacement.Q0();
        if (m0Q0 instanceof I) {
            m0E = m0Q0;
        } else {
            if (!(m0Q0 instanceof AbstractC7346d0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) m0Q0;
            m0E = V.e(abstractC7346d0, abstractC7346d0.R0(true));
        }
        return L0.b(m0E, m0Q0);
    }

    @Override // pi.I
    public String toString() {
        return '(' + V0() + ".." + W0() + ')';
    }
}
