package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class F extends AbstractC1554s0<Float, float[], E> {

    /* renamed from: c, reason: collision with root package name */
    public static final F f11415c = new F(G.f11421a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.l.f(fArr, "<this>");
        return fArr.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        E builder = (E) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        float fV = bVar.v(this.f11531b, i);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f11412a;
        int i10 = builder.f11413b;
        builder.f11413b = i10 + 1;
        fArr[i10] = fV;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.l.f(fArr, "<this>");
        E e4 = new E();
        e4.f11412a = fArr;
        e4.f11413b = fArr.length;
        e4.b(10);
        return e4;
    }

    @Override // Q9.AbstractC1554s0
    public final float[] j() {
        return new float[0];
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, float[] fArr, int i) {
        float[] content = fArr;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        kotlin.jvm.internal.l.f(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.s(this.f11531b, i10, content[i10]);
        }
    }
}
