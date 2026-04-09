package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class k1 extends M0 implements Vi.b {

    /* renamed from: c, reason: collision with root package name */
    public static final k1 f25657c = new k1();

    private k1() {
        super(Wi.a.z(Yg.E.f24986b));
    }

    @Override // Zi.M0
    public /* bridge */ /* synthetic */ void A(Yi.d dVar, Object obj, int i10) {
        F(dVar, ((Yg.F) obj).A(), i10);
    }

    protected int B(long[] collectionSize) {
        AbstractC6492s.i(collectionSize, "$this$collectionSize");
        return Yg.F.u(collectionSize);
    }

    protected long[] C() {
        return Yg.F.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w, Zi.AbstractC3694a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void n(Yi.c decoder, int i10, j1 builder, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        builder.e(Yg.E.b(decoder.E(a(), i10).v()));
    }

    protected j1 E(long[] toBuilder) {
        AbstractC6492s.i(toBuilder, "$this$toBuilder");
        return new j1(toBuilder, null);
    }

    protected void F(Yi.d encoder, long[] content, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.e(a(), i11).E(Yg.F.q(content, i11));
        }
    }

    @Override // Zi.AbstractC3694a
    public /* bridge */ /* synthetic */ int k(Object obj) {
        return B(((Yg.F) obj).A());
    }

    @Override // Zi.AbstractC3694a
    public /* bridge */ /* synthetic */ Object q(Object obj) {
        return E(((Yg.F) obj).A());
    }

    @Override // Zi.M0
    public /* bridge */ /* synthetic */ Object x() {
        return Yg.F.b(C());
    }
}
