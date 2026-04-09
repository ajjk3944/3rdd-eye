package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class P extends AbstractC1554s0<Integer, int[], O> {

    /* renamed from: c, reason: collision with root package name */
    public static final P f11445c = new P(Q.f11448a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.l.f(iArr, "<this>");
        return iArr.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        O builder = (O) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        int i10 = bVar.i(this.f11531b, i);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f11442a;
        int i11 = builder.f11443b;
        builder.f11443b = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.l.f(iArr, "<this>");
        O o10 = new O();
        o10.f11442a = iArr;
        o10.f11443b = iArr.length;
        o10.b(10);
        return o10;
    }

    @Override // Q9.AbstractC1554s0
    public final int[] j() {
        return new int[0];
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, int[] iArr, int i) {
        int[] content = iArr;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        kotlin.jvm.internal.l.f(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.n(i10, content[i10], this.f11531b);
        }
    }
}
