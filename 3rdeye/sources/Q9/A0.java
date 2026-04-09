package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class A0 extends AbstractC1554s0<Short, short[], z0> {

    /* renamed from: c, reason: collision with root package name */
    public static final A0 f11387c = new A0(B0.f11393a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.l.f(sArr, "<this>");
        return sArr.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        z0 builder = (z0) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        short s10 = bVar.s(this.f11531b, i);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f11546a;
        int i10 = builder.f11547b;
        builder.f11547b = i10 + 1;
        sArr[i10] = s10;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.l.f(sArr, "<this>");
        z0 z0Var = new z0();
        z0Var.f11546a = sArr;
        z0Var.f11547b = sArr.length;
        z0Var.b(10);
        return z0Var;
    }

    @Override // Q9.AbstractC1554s0
    public final short[] j() {
        return new short[0];
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, short[] sArr, int i) {
        short[] content = sArr;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        kotlin.jvm.internal.l.f(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.A(this.f11531b, i10, content[i10]);
        }
    }
}
