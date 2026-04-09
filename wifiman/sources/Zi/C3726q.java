package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6481g;

/* renamed from: Zi.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3726q extends M0 implements Vi.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C3726q f25678c = new C3726q();

    private C3726q() {
        super(Wi.a.E(C6481g.f51716a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int k(char[] cArr) {
        AbstractC6492s.i(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public char[] x() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w, Zi.AbstractC3694a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void n(Yi.c decoder, int i10, C3724p builder, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        builder.e(decoder.z(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3724p q(char[] cArr) {
        AbstractC6492s.i(cArr, "<this>");
        return new C3724p(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(Yi.d encoder, char[] content, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.s(a(), i11, content[i11]);
        }
    }
}
