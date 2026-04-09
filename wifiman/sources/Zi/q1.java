package Zi;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class q1 implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f25682a = new q1();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f25683b = new N0("kotlin.uuid.Uuid", e.i.f24447a);

    private q1() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f25683b;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Bi.b c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return Bi.b.f1826c.c(decoder.s());
    }

    @Override // Vi.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, Bi.b value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        encoder.G(value.toString());
    }
}
