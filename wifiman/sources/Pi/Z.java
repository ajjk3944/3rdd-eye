package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class Z extends AbstractC7334B {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AbstractC7346d0 delegate) {
        super(delegate);
        AbstractC6492s.i(delegate, "delegate");
    }

    @Override // pi.AbstractC7333A, pi.S
    public boolean O0() {
        return false;
    }

    @Override // pi.AbstractC7333A
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public Z Y0(AbstractC7346d0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        return new Z(delegate);
    }
}
