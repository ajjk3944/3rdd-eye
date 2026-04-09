package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class I0 extends AbstractC1554s0<b9.r, b9.s, H0> {

    /* renamed from: c, reason: collision with root package name */
    public static final I0 f11426c = new I0(J0.f11428a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        byte[] collectionSize = ((b9.s) obj).f18097b;
        kotlin.jvm.internal.l.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        H0 builder = (H0) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        byte bZ = bVar.r(this.f11531b, i).z();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f11424a;
        int i10 = builder.f11425b;
        builder.f11425b = i10 + 1;
        bArr[i10] = bZ;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        byte[] toBuilder = ((b9.s) obj).f18097b;
        kotlin.jvm.internal.l.f(toBuilder, "$this$toBuilder");
        H0 h02 = new H0();
        h02.f11424a = toBuilder;
        h02.f11425b = toBuilder.length;
        h02.b(10);
        return h02;
    }

    @Override // Q9.AbstractC1554s0
    public final b9.s j() {
        return new b9.s(new byte[0]);
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, b9.s sVar, int i) {
        byte[] bArr = sVar.f18097b;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.e(this.f11531b, i10).j(bArr[i10]);
        }
    }
}
