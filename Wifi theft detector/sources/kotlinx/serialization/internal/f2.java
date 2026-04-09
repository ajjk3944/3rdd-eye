package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class f2 extends r1 implements kotlinx.serialization.b {

    /* renamed from: c, reason: collision with root package name */
    public static final f2 f22853c = new f2();

    public f2() {
        super(x9.a.D(y8.j.f25178b));
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((y8.k) obj).A());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((y8.k) obj).A());
    }

    @Override // kotlinx.serialization.internal.r1
    public /* bridge */ /* synthetic */ Object r() {
        return y8.k.c(w());
    }

    @Override // kotlinx.serialization.internal.r1
    public /* bridge */ /* synthetic */ void u(y9.d dVar, Object obj, int i10) {
        z(dVar, ((y8.k) obj).A(), i10);
    }

    public int v(byte[] collectionSize) {
        kotlin.jvm.internal.p.e(collectionSize, "$this$collectionSize");
        return y8.k.u(collectionSize);
    }

    public byte[] w() {
        return y8.k.d(0);
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.internal.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(y9.c decoder, int i10, e2 builder, boolean z10) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        builder.e(y8.j.b(decoder.r(getDescriptor(), i10).H()));
    }

    public e2 y(byte[] toBuilder) {
        kotlin.jvm.internal.p.e(toBuilder, "$this$toBuilder");
        return new e2(toBuilder, null);
    }

    public void z(y9.d encoder, byte[] content, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.f(getDescriptor(), i11).h(y8.k.j(content, i11));
        }
    }
}
