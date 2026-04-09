package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class q2 implements kotlinx.serialization.b {

    /* renamed from: b, reason: collision with root package name */
    public static final q2 f22904b = new q2();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ObjectSerializer f22905a = new ObjectSerializer("kotlin.Unit", y8.s.f25199a);

    public void a(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        this.f22905a.deserialize(decoder);
    }

    @Override // kotlinx.serialization.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, y8.s value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        this.f22905a.serialize(encoder, value);
    }

    @Override // kotlinx.serialization.a
    public /* bridge */ /* synthetic */ Object deserialize(y9.e eVar) {
        a(eVar);
        return y8.s.f25199a;
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22905a.getDescriptor();
    }
}
