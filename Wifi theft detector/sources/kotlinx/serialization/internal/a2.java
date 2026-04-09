package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class a2 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a2 f22823a = new a2();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22824b = new s1("kotlin.Short", e.h.f22776a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return Short.valueOf(decoder.s());
    }

    public void b(y9.f encoder, short s10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.q(s10);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22824b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
