package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class l2 extends r1 implements kotlinx.serialization.b {

    /* renamed from: c, reason: collision with root package name */
    public static final l2 f22883c = new l2();

    public l2() {
        super(x9.a.F(y8.n.f25188b));
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((y8.o) obj).A());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((y8.o) obj).A());
    }

    @Override // kotlinx.serialization.internal.r1
    public /* bridge */ /* synthetic */ Object r() {
        return y8.o.c(w());
    }

    @Override // kotlinx.serialization.internal.r1
    public /* bridge */ /* synthetic */ void u(y9.d dVar, Object obj, int i10) {
        z(dVar, ((y8.o) obj).A(), i10);
    }

    public int v(long[] collectionSize) {
        kotlin.jvm.internal.p.e(collectionSize, "$this$collectionSize");
        return y8.o.u(collectionSize);
    }

    public long[] w() {
        return y8.o.d(0);
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.internal.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(y9.c decoder, int i10, k2 builder, boolean z10) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        builder.e(y8.n.b(decoder.r(getDescriptor(), i10).l()));
    }

    public k2 y(long[] toBuilder) {
        kotlin.jvm.internal.p.e(toBuilder, "$this$toBuilder");
        return new k2(toBuilder, null);
    }

    public void z(y9.d encoder, long[] content, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.f(getDescriptor(), i11).m(y8.o.j(content, i11));
        }
    }
}
