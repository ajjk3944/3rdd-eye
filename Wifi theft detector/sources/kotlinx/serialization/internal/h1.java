package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class h1 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.b f22864a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22865b;

    public h1(kotlinx.serialization.b serializer) {
        kotlin.jvm.internal.p.e(serializer, "serializer");
        this.f22864a = serializer;
        this.f22865b = new v1(serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.a
    public Object deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return decoder.D() ? decoder.G(this.f22864a) : decoder.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kotlin.jvm.internal.p.a(kotlin.jvm.internal.t.b(h1.class), kotlin.jvm.internal.t.b(obj.getClass())) && kotlin.jvm.internal.p.a(this.f22864a, ((h1) obj).f22864a);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22865b;
    }

    public int hashCode() {
        return this.f22864a.hashCode();
    }

    @Override // kotlinx.serialization.e
    public void serialize(y9.f encoder, Object obj) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        if (obj == null) {
            encoder.o();
        } else {
            encoder.v();
            encoder.e(this.f22864a, obj);
        }
    }
}
