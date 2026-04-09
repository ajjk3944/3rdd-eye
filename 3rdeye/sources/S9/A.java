package S9;

import R9.AbstractC1564a;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes3.dex */
public final class A extends AbstractC1570b {

    /* renamed from: f, reason: collision with root package name */
    public final R9.i f12009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AbstractC1564a json, R9.i value) {
        super(json, value);
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.f(value, "value");
        this.f12009f = value;
        this.f11406b.add("primitive");
    }

    @Override // S9.AbstractC1570b
    public final R9.i U(String tag) {
        kotlin.jvm.internal.l.f(tag, "tag");
        if (tag == "primitive") {
            return this.f12009f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // S9.AbstractC1570b
    public final R9.i X() {
        return this.f12009f;
    }

    @Override // P9.b
    public final int x(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return 0;
    }
}
