package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class V0 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final V0 f25595a = new V0();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25596b = new N0("kotlin.Short", e.h.f24446a);

    private V0() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25596b;
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Number) obj).shortValue());
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Short c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Short.valueOf(decoder.F());
    }

    public void h(Yi.f encoder, short s10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.k(s10);
    }
}
