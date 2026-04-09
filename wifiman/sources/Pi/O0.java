package pi;

import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class O0 extends S {
    public O0() {
        super(null);
    }

    @Override // pi.S
    public List L0() {
        return R0().L0();
    }

    @Override // pi.S
    public r0 M0() {
        return R0().M0();
    }

    @Override // pi.S
    public v0 N0() {
        return R0().N0();
    }

    @Override // pi.S
    public boolean O0() {
        return R0().O0();
    }

    @Override // pi.S
    public final M0 Q0() {
        S sR0 = R0();
        while (sR0 instanceof O0) {
            sR0 = ((O0) sR0).R0();
        }
        AbstractC6492s.g(sR0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (M0) sR0;
    }

    protected abstract S R0();

    public abstract boolean S0();

    @Override // pi.S
    public InterfaceC6164k r() {
        return R0().r();
    }

    public String toString() {
        return S0() ? R0().toString() : "<Not computed yet>";
    }
}
