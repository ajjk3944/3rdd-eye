package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6478d;

/* renamed from: Zi.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3708h extends M0 implements Vi.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C3708h f25635c = new C3708h();

    private C3708h() {
        super(Wi.a.C(C6478d.f51713a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int k(boolean[] zArr) {
        AbstractC6492s.i(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean[] x() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3737w, Zi.AbstractC3694a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void n(Yi.c decoder, int i10, C3706g builder, boolean z10) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        builder.e(decoder.u(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3706g q(boolean[] zArr) {
        AbstractC6492s.i(zArr, "<this>");
        return new C3706g(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.M0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(Yi.d encoder, boolean[] content, int i10) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.i(a(), i11, content[i11]);
        }
    }
}
