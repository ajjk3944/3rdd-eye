package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.e;

/* loaded from: classes4.dex */
public final class r implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f22906a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f22907b = new s1("kotlin.Char", e.c.f22771a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return Character.valueOf(decoder.x());
    }

    public void b(y9.f encoder, char c10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        encoder.u(c10);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f22907b;
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ void serialize(y9.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
