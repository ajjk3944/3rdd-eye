package pi;

import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7333A extends AbstractC7346d0 {
    @Override // pi.S
    public List L0() {
        return W0().L0();
    }

    @Override // pi.S
    public r0 M0() {
        return W0().M0();
    }

    @Override // pi.S
    public v0 N0() {
        return W0().N0();
    }

    @Override // pi.S
    public boolean O0() {
        return W0().O0();
    }

    protected abstract AbstractC7346d0 W0();

    @Override // pi.M0
    public AbstractC7346d0 X0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(W0());
        AbstractC6492s.g(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Y0((AbstractC7346d0) sA);
    }

    public abstract AbstractC7333A Y0(AbstractC7346d0 abstractC7346d0);

    @Override // pi.S
    public InterfaceC6164k r() {
        return W0().r();
    }
}
