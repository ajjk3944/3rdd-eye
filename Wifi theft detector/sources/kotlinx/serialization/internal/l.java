package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class l implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final l f22880a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22881b = new s1("kotlin.Byte", e.b.f22770a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return Byte.valueOf(decoder.H());
    }

    public void b(y9.f encoder, byte b10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.h(b10);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22881b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}
