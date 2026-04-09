package Zi;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class V extends M0 implements Vi.b {

    /* renamed from: c, reason: collision with root package name */
    public static final V f25594c = new V();

    private V() {
        super(Wi.a.H(kotlin.jvm.internal.r.f51727a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int k(int[] iArr) {
        AbstractC6492s.i(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int[] x() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w, Zi.AbstractC3694a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void n(Yi.c decoder, int i10, U builder, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        builder.e(decoder.i(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public U q(int[] iArr) {
        AbstractC6492s.i(iArr, "<this>");
        return new U(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(Yi.d encoder, int[] content, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.C(a(), i11, content[i11]);
        }
    }
}
