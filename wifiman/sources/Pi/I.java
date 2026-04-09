package pi;

import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import ri.InterfaceC7616g;

/* loaded from: classes4.dex */
public abstract class I extends M0 implements InterfaceC7616g {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7346d0 f58065b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC7346d0 f58066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC7346d0 lowerBound, AbstractC7346d0 upperBound) {
        super(null);
        AbstractC6492s.i(lowerBound, "lowerBound");
        AbstractC6492s.i(upperBound, "upperBound");
        this.f58065b = lowerBound;
        this.f58066c = upperBound;
    }

    @Override // pi.S
    public List L0() {
        return U0().L0();
    }

    @Override // pi.S
    public r0 M0() {
        return U0().M0();
    }

    @Override // pi.S
    public v0 N0() {
        return U0().N0();
    }

    @Override // pi.S
    public boolean O0() {
        return U0().O0();
    }

    public abstract AbstractC7346d0 U0();

    public final AbstractC7346d0 V0() {
        return this.f58065b;
    }

    public final AbstractC7346d0 W0() {
        return this.f58066c;
    }

    public abstract String X0(kotlin.reflect.jvm.internal.impl.renderer.n nVar, kotlin.reflect.jvm.internal.impl.renderer.w wVar);

    @Override // pi.S
    public InterfaceC6164k r() {
        return U0().r();
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.n.f52071k.U(this);
    }
}
