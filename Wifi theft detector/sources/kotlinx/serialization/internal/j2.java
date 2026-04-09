package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class j2 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final j2 f22874a = new j2();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22875b = o0.a("kotlin.UInt", x9.a.y(kotlin.jvm.internal.o.f22039a));

    public int a(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return y8.l.b(decoder.q(getDescriptor()).h());
    }

    public void b(y9.f encoder, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.l(getDescriptor()).B(i10);
    }

    @Override // kotlinx.serialization.a
    public /* bridge */ /* synthetic */ Object deserialize(y9.e eVar) {
        return y8.l.a(a(eVar));
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22875b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((y8.l) obj).g());
    }
}
