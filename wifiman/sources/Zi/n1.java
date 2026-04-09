package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class n1 extends M0 implements Vi.b {

    /* renamed from: c, reason: collision with root package name */
    public static final n1 f25668c = new n1();

    private n1() {
        super(Wi.a.A(Yg.H.f24992b));
    }

    @Override // Zi.M0
    public /* bridge */ /* synthetic */ void A(Yi.d dVar, Object obj, int i10) {
        F(dVar, ((Yg.I) obj).A(), i10);
    }

    protected int B(short[] collectionSize) {
        AbstractC6492s.i(collectionSize, "$this$collectionSize");
        return Yg.I.u(collectionSize);
    }

    protected short[] C() {
        return Yg.I.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w, Zi.AbstractC3694a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void n(Yi.c decoder, int i10, m1 builder, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        builder.e(Yg.H.b(decoder.E(a(), i10).F()));
    }

    protected m1 E(short[] toBuilder) {
        AbstractC6492s.i(toBuilder, "$this$toBuilder");
        return new m1(toBuilder, null);
    }

    protected void F(Yi.d encoder, short[] content, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.e(a(), i11).k(Yg.I.q(content, i11));
        }
    }

    @Override // Zi.AbstractC3694a
    public /* bridge */ /* synthetic */ int k(Object obj) {
        return B(((Yg.I) obj).A());
    }

    @Override // Zi.AbstractC3694a
    public /* bridge */ /* synthetic */ Object q(Object obj) {
        return E(((Yg.I) obj).A());
    }

    @Override // Zi.M0
    public /* bridge */ /* synthetic */ Object x() {
        return Yg.I.b(C());
    }
}
