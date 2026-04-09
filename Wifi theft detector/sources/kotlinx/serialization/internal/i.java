package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class i implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final i f22868a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22869b = new s1("kotlin.Boolean", e.a.f22769a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return Boolean.valueOf(decoder.w());
    }

    public void b(y9.f encoder, boolean z10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.r(z10);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22869b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
