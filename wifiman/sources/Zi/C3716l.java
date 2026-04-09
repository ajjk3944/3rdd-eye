package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3716l implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3716l f25658a = new C3716l();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25659b = new N0("kotlin.Byte", e.b.f24440a);

    private C3716l() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25659b;
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Number) obj).byteValue());
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Byte c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Byte.valueOf(decoder.D());
    }

    public void h(Yi.f encoder, byte b10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.l(b10);
    }
}
