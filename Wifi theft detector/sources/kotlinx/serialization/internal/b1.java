package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class b1 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f22826a = new b1();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22827b = new s1("kotlin.Long", e.g.f22775a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return Long.valueOf(decoder.l());
    }

    public void b(y9.f encoder, long j10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.m(j10);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22827b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
