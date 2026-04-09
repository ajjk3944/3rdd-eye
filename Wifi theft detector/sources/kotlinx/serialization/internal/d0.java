package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class d0 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f22837a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22838b = new s1("kotlin.time.Duration", e.i.f22777a);

    public long a(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return t9.b.f24466b.d(decoder.z());
    }

    public void b(y9.f encoder, long j10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.G(t9.b.H(j10));
    }

    @Override // kotlinx.serialization.a
    public /* bridge */ /* synthetic */ Object deserialize(y9.e eVar) {
        return t9.b.g(a(eVar));
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22838b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((t9.b) obj).L());
    }
}
