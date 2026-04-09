package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public final class u extends c {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.c f23045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z9.a json, kotlinx.serialization.json.c value) {
        super(json, value, null);
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(value, "value");
        this.f23045f = value;
        X("primitive");
    }

    @Override // kotlinx.serialization.json.internal.c
    public kotlinx.serialization.json.b e0(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        if (tag == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // y9.c
    public int o(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return 0;
    }

    @Override // kotlinx.serialization.json.internal.c
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.c s0() {
        return this.f23045f;
    }
}
