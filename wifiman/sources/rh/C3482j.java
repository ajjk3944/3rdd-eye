package Rh;

import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7333A;
import pi.AbstractC7346d0;
import pi.InterfaceC7340a0;
import pi.J0;
import pi.L0;
import pi.M0;
import pi.r0;
import si.AbstractC7984d;

/* renamed from: Rh.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3482j extends AbstractC7333A implements InterfaceC7340a0 {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7346d0 f19931b;

    public C3482j(AbstractC7346d0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f19931b = delegate;
    }

    private final AbstractC7346d0 Z0(AbstractC7346d0 abstractC7346d0) {
        AbstractC7346d0 abstractC7346d0R0 = abstractC7346d0.R0(false);
        return !AbstractC7984d.y(abstractC7346d0) ? abstractC7346d0R0 : new C3482j(abstractC7346d0R0);
    }

    @Override // pi.InterfaceC7375w
    public boolean B0() {
        return true;
    }

    @Override // pi.AbstractC7333A, pi.S
    public boolean O0() {
        return false;
    }

    @Override // pi.M0
    /* renamed from: U0 */
    public AbstractC7346d0 R0(boolean z10) {
        return z10 ? W0().R0(true) : this;
    }

    @Override // pi.AbstractC7333A
    protected AbstractC7346d0 W0() {
        return this.f19931b;
    }

    @Override // pi.AbstractC7346d0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C3482j T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return new C3482j(W0().T0(newAttributes));
    }

    @Override // pi.AbstractC7333A
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C3482j Y0(AbstractC7346d0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        return new C3482j(delegate);
    }

    @Override // pi.InterfaceC7375w
    public pi.S i0(pi.S replacement) {
        AbstractC6492s.i(replacement, "replacement");
        M0 m0Q0 = replacement.Q0();
        if (!AbstractC7984d.y(m0Q0) && !J0.l(m0Q0)) {
            return m0Q0;
        }
        if (m0Q0 instanceof AbstractC7346d0) {
            return Z0((AbstractC7346d0) m0Q0);
        }
        if (m0Q0 instanceof pi.I) {
            pi.I i10 = (pi.I) m0Q0;
            return L0.d(pi.V.e(Z0(i10.V0()), Z0(i10.W0())), L0.a(m0Q0));
        }
        throw new IllegalStateException(("Incorrect type: " + m0Q0).toString());
    }
}
