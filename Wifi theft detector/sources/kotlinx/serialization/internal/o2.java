package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class o2 extends r1 implements kotlinx.serialization.b {

    /* renamed from: c, reason: collision with root package name */
    public static final o2 f22894c = new o2();

    public o2() {
        super(x9.a.G(y8.q.f25194b));
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((y8.r) obj).A());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((y8.r) obj).A());
    }

    @Override // kotlinx.serialization.internal.r1
    public /* bridge */ /* synthetic */ Object r() {
        return y8.r.c(w());
    }

    @Override // kotlinx.serialization.internal.r1
    public /* bridge */ /* synthetic */ void u(y9.d dVar, Object obj, int i10) {
        z(dVar, ((y8.r) obj).A(), i10);
    }

    public int v(short[] collectionSize) {
        kotlin.jvm.internal.p.e(collectionSize, "$this$collectionSize");
        return y8.r.u(collectionSize);
    }

    public short[] w() {
        return y8.r.d(0);
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.internal.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(y9.c decoder, int i10, n2 builder, boolean z10) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        builder.e(y8.q.b(decoder.r(getDescriptor(), i10).s()));
    }

    public n2 y(short[] toBuilder) {
        kotlin.jvm.internal.p.e(toBuilder, "$this$toBuilder");
        return new n2(toBuilder, null);
    }

    public void z(y9.d encoder, short[] content, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.f(getDescriptor(), i11).q(y8.r.j(content, i11));
        }
    }
}
