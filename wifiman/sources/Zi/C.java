package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class C implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C f25533a = new C();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25534b = new N0("kotlin.Double", e.d.f24442a);

    private C() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25534b;
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Number) obj).doubleValue());
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Double c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Double.valueOf(decoder.I());
    }

    public void h(Yi.f encoder, double d10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.j(d10);
    }
}
