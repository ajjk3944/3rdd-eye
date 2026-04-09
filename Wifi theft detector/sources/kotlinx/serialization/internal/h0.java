package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class h0 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f22862a = new h0();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22863b = new s1("kotlin.Float", e.C0431e.f22773a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return Float.valueOf(decoder.t());
    }

    public void b(y9.f encoder, float f10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.t(f10);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22863b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
