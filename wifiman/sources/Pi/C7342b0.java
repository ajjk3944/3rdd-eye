package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C7342b0 extends AbstractC7334B {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7342b0(AbstractC7346d0 delegate) {
        super(delegate);
        AbstractC6492s.i(delegate, "delegate");
    }

    @Override // pi.AbstractC7333A, pi.S
    public boolean O0() {
        return true;
    }

    @Override // pi.AbstractC7333A
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C7342b0 Y0(AbstractC7346d0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        return new C7342b0(delegate);
    }
}
