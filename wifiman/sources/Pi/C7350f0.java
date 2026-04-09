package pi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C7350f0 extends AbstractC7334B {

    /* renamed from: c, reason: collision with root package name */
    private final r0 f58124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7350f0(AbstractC7346d0 delegate, r0 attributes) {
        super(delegate);
        AbstractC6492s.i(delegate, "delegate");
        AbstractC6492s.i(attributes, "attributes");
        this.f58124c = attributes;
    }

    @Override // pi.AbstractC7333A, pi.S
    public r0 M0() {
        return this.f58124c;
    }

    @Override // pi.AbstractC7333A
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C7350f0 Y0(AbstractC7346d0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        return new C7350f0(delegate, M0());
    }
}
