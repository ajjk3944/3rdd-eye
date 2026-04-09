package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class L0 extends AbstractC1554s0<b9.t, b9.u, K0> {

    /* renamed from: c, reason: collision with root package name */
    public static final L0 f11435c = new L0(M0.f11437a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        int[] collectionSize = ((b9.u) obj).f18101b;
        kotlin.jvm.internal.l.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        K0 builder = (K0) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        int iK = bVar.r(this.f11531b, i).k();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f11431a;
        int i10 = builder.f11432b;
        builder.f11432b = i10 + 1;
        iArr[i10] = iK;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        int[] toBuilder = ((b9.u) obj).f18101b;
        kotlin.jvm.internal.l.f(toBuilder, "$this$toBuilder");
        K0 k02 = new K0();
        k02.f11431a = toBuilder;
        k02.f11432b = toBuilder.length;
        k02.b(10);
        return k02;
    }

    @Override // Q9.AbstractC1554s0
    public final b9.u j() {
        return new b9.u(new int[0]);
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, b9.u uVar, int i) {
        int[] iArr = uVar.f18101b;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.e(this.f11531b, i10).C(iArr[i10]);
        }
    }
}
