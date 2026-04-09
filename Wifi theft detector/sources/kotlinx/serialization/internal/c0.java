package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class c0 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f22830a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22831b = new s1("kotlin.Double", e.d.f22772a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return Double.valueOf(decoder.v());
    }

    public void b(y9.f encoder, double d10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.g(d10);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22831b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
