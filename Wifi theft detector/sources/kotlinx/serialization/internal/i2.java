package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class i2 extends r1 implements kotlinx.serialization.b {

    /* renamed from: c, reason: collision with root package name */
    public static final i2 f22871c = new i2();

    public i2() {
        super(x9.a.E(y8.l.f25183b));
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((y8.m) obj).A());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((y8.m) obj).A());
    }

    @Override // kotlinx.serialization.internal.r1
    public /* bridge */ /* synthetic */ Object r() {
        return y8.m.c(w());
    }

    @Override // kotlinx.serialization.internal.r1
    public /* bridge */ /* synthetic */ void u(y9.d dVar, Object obj, int i10) {
        z(dVar, ((y8.m) obj).A(), i10);
    }

    public int v(int[] collectionSize) {
        kotlin.jvm.internal.p.e(collectionSize, "$this$collectionSize");
        return y8.m.u(collectionSize);
    }

    public int[] w() {
        return y8.m.d(0);
    }

    @Override // kotlinx.serialization.internal.w, kotlinx.serialization.internal.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(y9.c decoder, int i10, h2 builder, boolean z10) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        builder.e(y8.l.b(decoder.r(getDescriptor(), i10).h()));
    }

    public h2 y(int[] toBuilder) {
        kotlin.jvm.internal.p.e(toBuilder, "$this$toBuilder");
        return new h2(toBuilder, null);
    }

    public void z(y9.d encoder, int[] content, int i10) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.f(getDescriptor(), i11).B(y8.m.j(content, i11));
        }
    }
}
