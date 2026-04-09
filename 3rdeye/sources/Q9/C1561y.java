package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: Q9.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1561y extends AbstractC1554s0<Double, double[], C1560x> {

    /* renamed from: c, reason: collision with root package name */
    public static final C1561y f11543c = new C1561y(C1562z.f11544a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.l.f(dArr, "<this>");
        return dArr.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        C1560x builder = (C1560x) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        double dY = bVar.y(this.f11531b, i);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f11541a;
        int i10 = builder.f11542b;
        builder.f11542b = i10 + 1;
        dArr[i10] = dY;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.l.f(dArr, "<this>");
        C1560x c1560x = new C1560x();
        c1560x.f11541a = dArr;
        c1560x.f11542b = dArr.length;
        c1560x.b(10);
        return c1560x;
    }

    @Override // Q9.AbstractC1554s0
    public final double[] j() {
        return new double[0];
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, double[] dArr, int i) {
        double[] content = dArr;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        kotlin.jvm.internal.l.f(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.i(this.f11531b, i10, content[i10]);
        }
    }
}
