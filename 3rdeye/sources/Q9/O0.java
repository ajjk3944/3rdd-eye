package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class O0 extends AbstractC1554s0<b9.v, b9.w, N0> {

    /* renamed from: c, reason: collision with root package name */
    public static final O0 f11444c = new O0(P0.f11446a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        long[] collectionSize = ((b9.w) obj).f18105b;
        kotlin.jvm.internal.l.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        N0 builder = (N0) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        long jM = bVar.r(this.f11531b, i).m();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f11440a;
        int i10 = builder.f11441b;
        builder.f11441b = i10 + 1;
        jArr[i10] = jM;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        long[] toBuilder = ((b9.w) obj).f18105b;
        kotlin.jvm.internal.l.f(toBuilder, "$this$toBuilder");
        N0 n02 = new N0();
        n02.f11440a = toBuilder;
        n02.f11441b = toBuilder.length;
        n02.b(10);
        return n02;
    }

    @Override // Q9.AbstractC1554s0
    public final b9.w j() {
        return new b9.w(new long[0]);
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, b9.w wVar, int i) {
        long[] jArr = wVar.f18105b;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.e(this.f11531b, i10).D(jArr[i10]);
        }
    }
}
