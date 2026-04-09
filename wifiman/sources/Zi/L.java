package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class L implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final L f25573a = new L();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25574b = new N0("kotlin.Float", e.C0934e.f24443a);

    private L() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25574b;
    }

    @Override // Vi.o
    public /* bridge */ /* synthetic */ void e(Yi.f fVar, Object obj) {
        h(fVar, ((Number) obj).floatValue());
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Float.valueOf(decoder.G());
    }

    public void h(Yi.f encoder, float f10) {
        AbstractC6492s.i(encoder, "encoder");
        encoder.r(f10);
    }
}
