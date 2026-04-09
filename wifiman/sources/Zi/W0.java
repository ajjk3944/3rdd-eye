package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class W0 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final W0 f25599a = new W0();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25600b = new N0("kotlin.String", e.i.f24447a);

    private W0() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25600b;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return decoder.s();
    }

    @Override // Vi.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, String value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        encoder.G(value);
    }
}
