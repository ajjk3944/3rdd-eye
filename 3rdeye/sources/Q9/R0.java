package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class R0 extends AbstractC1554s0<b9.y, b9.z, Q0> {

    /* renamed from: c, reason: collision with root package name */
    public static final R0 f11452c = new R0(S0.f11454a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        short[] collectionSize = ((b9.z) obj).f18110b;
        kotlin.jvm.internal.l.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        Q0 builder = (Q0) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        short sE = bVar.r(this.f11531b, i).E();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f11450a;
        int i10 = builder.f11451b;
        builder.f11451b = i10 + 1;
        sArr[i10] = sE;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        short[] toBuilder = ((b9.z) obj).f18110b;
        kotlin.jvm.internal.l.f(toBuilder, "$this$toBuilder");
        Q0 q02 = new Q0();
        q02.f11450a = toBuilder;
        q02.f11451b = toBuilder.length;
        q02.b(10);
        return q02;
    }

    @Override // Q9.AbstractC1554s0
    public final b9.z j() {
        return new b9.z(new short[0]);
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, b9.z zVar, int i) {
        short[] sArr = zVar.f18110b;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.e(this.f11531b, i10).h(sArr[i10]);
        }
    }
}
