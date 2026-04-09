package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class e1 extends M0 implements Vi.b {

    /* renamed from: c, reason: collision with root package name */
    public static final e1 f25624c = new e1();

    private e1() {
        super(Wi.a.x(Yg.A.f24976b));
    }

    @Override // Zi.M0
    public /* bridge */ /* synthetic */ void A(Yi.d dVar, Object obj, int i10) {
        F(dVar, ((Yg.B) obj).A(), i10);
    }

    protected int B(byte[] collectionSize) {
        AbstractC6492s.i(collectionSize, "$this$collectionSize");
        return Yg.B.u(collectionSize);
    }

    protected byte[] C() {
        return Yg.B.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w, Zi.AbstractC3694a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void n(Yi.c decoder, int i10, d1 builder, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        builder.e(Yg.A.b(decoder.E(a(), i10).D()));
    }

    protected d1 E(byte[] toBuilder) {
        AbstractC6492s.i(toBuilder, "$this$toBuilder");
        return new d1(toBuilder, null);
    }

    protected void F(Yi.d encoder, byte[] content, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.e(a(), i11).l(Yg.B.q(content, i11));
        }
    }

    @Override // Zi.AbstractC3694a
    public /* bridge */ /* synthetic */ int k(Object obj) {
        return B(((Yg.B) obj).A());
    }

    @Override // Zi.AbstractC3694a
    public /* bridge */ /* synthetic */ Object q(Object obj) {
        return E(((Yg.B) obj).A());
    }

    @Override // Zi.M0
    public /* bridge */ /* synthetic */ Object x() {
        return Yg.B.b(C());
    }
}
