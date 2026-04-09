package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class h1 extends M0 implements Vi.b {

    /* renamed from: c, reason: collision with root package name */
    public static final h1 f25638c = new h1();

    private h1() {
        super(Wi.a.y(Yg.C.f24981b));
    }

    @Override // Zi.M0
    public /* bridge */ /* synthetic */ void A(Yi.d dVar, Object obj, int i10) {
        F(dVar, ((Yg.D) obj).A(), i10);
    }

    protected int B(int[] collectionSize) {
        AbstractC6492s.i(collectionSize, "$this$collectionSize");
        return Yg.D.u(collectionSize);
    }

    protected int[] C() {
        return Yg.D.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w, Zi.AbstractC3694a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void n(Yi.c decoder, int i10, g1 builder, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        builder.e(Yg.C.b(decoder.E(a(), i10).n()));
    }

    protected g1 E(int[] toBuilder) {
        AbstractC6492s.i(toBuilder, "$this$toBuilder");
        return new g1(toBuilder, null);
    }

    protected void F(Yi.d encoder, int[] content, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.e(a(), i11).A(Yg.D.q(content, i11));
        }
    }

    @Override // Zi.AbstractC3694a
    public /* bridge */ /* synthetic */ int k(Object obj) {
        return B(((Yg.D) obj).A());
    }

    @Override // Zi.AbstractC3694a
    public /* bridge */ /* synthetic */ Object q(Object obj) {
        return E(((Yg.D) obj).A());
    }

    @Override // Zi.M0
    public /* bridge */ /* synthetic */ Object x() {
        return Yg.D.b(C());
    }
}
