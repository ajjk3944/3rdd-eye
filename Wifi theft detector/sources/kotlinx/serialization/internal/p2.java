package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class p2 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final p2 f22899a = new p2();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22900b = o0.a("kotlin.UShort", x9.a.A(kotlin.jvm.internal.v.f22045a));

    public short a(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return y8.q.b(decoder.q(getDescriptor()).s());
    }

    public void b(y9.f encoder, short s10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.l(getDescriptor()).q(s10);
    }

    @Override // kotlinx.serialization.a
    public /* bridge */ /* synthetic */ Object deserialize(y9.e eVar) {
        return y8.q.a(a(eVar));
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22900b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((y8.q) obj).g());
    }
}
