package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class m2 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final m2 f22886a = new m2();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22887b = o0.a("kotlin.ULong", x9.a.z(kotlin.jvm.internal.r.f22040a));

    public long a(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return y8.n.b(decoder.q(getDescriptor()).l());
    }

    public void b(y9.f encoder, long j10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.l(getDescriptor()).m(j10);
    }

    @Override // kotlinx.serialization.a
    public /* bridge */ /* synthetic */ Object deserialize(y9.e eVar) {
        return y8.n.a(a(eVar));
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22887b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((y8.n) obj).g());
    }
}
