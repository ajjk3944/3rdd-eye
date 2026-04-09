package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6495v;

/* renamed from: Zi.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3707g0 extends M0 implements Vi.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C3707g0 f25632c = new C3707g0();

    private C3707g0() {
        super(Wi.a.I(C6495v.f51728a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int k(long[] jArr) {
        AbstractC6492s.i(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public long[] x() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w, Zi.AbstractC3694a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void n(Yi.c decoder, int i10, C3705f0 builder, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        builder.e(decoder.q(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3705f0 q(long[] jArr) {
        AbstractC6492s.i(jArr, "<this>");
        return new C3705f0(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(Yi.d encoder, long[] content, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.p(a(), i11, content[i11]);
        }
    }
}
