package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class g2 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final g2 f22859a = new g2();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22860b = o0.a("kotlin.UByte", x9.a.u(kotlin.jvm.internal.d.f22027a));

    public byte a(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return y8.j.b(decoder.q(getDescriptor()).H());
    }

    public void b(y9.f encoder, byte b10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.l(getDescriptor()).h(b10);
    }

    @Override // kotlinx.serialization.a
    public /* bridge */ /* synthetic */ Object deserialize(y9.e eVar) {
        return y8.j.a(a(eVar));
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22860b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((y8.j) obj).g());
    }
}
