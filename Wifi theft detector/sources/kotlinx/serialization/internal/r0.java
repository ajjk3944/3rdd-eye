package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class r0 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f22908a = new r0();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22909b = new s1("kotlin.Int", e.f.f22774a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return Integer.valueOf(decoder.h());
    }

    public void b(y9.f encoder, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.B(i10);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22909b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}
