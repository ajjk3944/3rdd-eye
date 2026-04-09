package aj;

import Xi.m;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* renamed from: aj.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3862C implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3862C f26318a = new C3862C();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f26319b = Xi.l.e("kotlinx.serialization.json.JsonNull", m.b.f24469a, new Xi.f[0], null, 8, null);

    private C3862C() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f26319b;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3861B c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        s.g(decoder);
        if (decoder.y()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.r();
        return C3861B.INSTANCE;
    }

    @Override // Vi.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, C3861B value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        s.h(encoder);
        encoder.f();
    }
}
