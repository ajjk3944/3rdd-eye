package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class b2 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b2 f22828a = new b2();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22829b = new s1("kotlin.String", e.i.f22777a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return decoder.z();
    }

    @Override // kotlinx.serialization.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, String value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        encoder.G(value);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22829b;
    }
}
