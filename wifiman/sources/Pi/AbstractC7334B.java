package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7334B extends AbstractC7333A {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7346d0 f58050b;

    public AbstractC7334B(AbstractC7346d0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f58050b = delegate;
    }

    @Override // pi.M0
    /* renamed from: U0 */
    public AbstractC7346d0 R0(boolean z10) {
        return z10 == O0() ? this : W0().R0(z10).T0(M0());
    }

    @Override // pi.M0
    /* renamed from: V0 */
    public AbstractC7346d0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return newAttributes != M0() ? new C7350f0(this, newAttributes) : this;
    }

    @Override // pi.AbstractC7333A
    protected AbstractC7346d0 W0() {
        return this.f58050b;
    }
}
