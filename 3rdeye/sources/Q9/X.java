package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class X extends AbstractC1554s0<Long, long[], W> {

    /* renamed from: c, reason: collision with root package name */
    public static final X f11464c = new X(Y.f11465a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.l.f(jArr, "<this>");
        return jArr.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        W builder = (W) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        long jC = bVar.C(this.f11531b, i);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f11462a;
        int i10 = builder.f11463b;
        builder.f11463b = i10 + 1;
        jArr[i10] = jC;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.l.f(jArr, "<this>");
        W w10 = new W();
        w10.f11462a = jArr;
        w10.f11463b = jArr.length;
        w10.b(10);
        return w10;
    }

    @Override // Q9.AbstractC1554s0
    public final long[] j() {
        return new long[0];
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, long[] jArr, int i) {
        long[] content = jArr;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        kotlin.jvm.internal.l.f(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.m(this.f11531b, i10, content[i10]);
        }
    }
}
