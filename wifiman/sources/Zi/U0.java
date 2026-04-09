package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class U0 extends M0 implements Vi.b {

    /* renamed from: c, reason: collision with root package name */
    public static final U0 f25593c = new U0();

    private U0() {
        super(Wi.a.J(kotlin.jvm.internal.S.f51692a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int k(short[] sArr) {
        AbstractC6492s.i(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public short[] x() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w, Zi.AbstractC3694a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void n(Yi.c decoder, int i10, T0 builder, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        builder.e(decoder.C(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public T0 q(short[] sArr) {
        AbstractC6492s.i(sArr, "<this>");
        return new T0(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(Yi.d encoder, short[] content, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.n(a(), i11, content[i11]);
        }
    }
}
