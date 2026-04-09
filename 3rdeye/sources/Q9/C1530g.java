package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: Q9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1530g extends AbstractC1554s0<Boolean, boolean[], C1528f> {

    /* renamed from: c, reason: collision with root package name */
    public static final C1530g f11484c = new C1530g(C1532h.f11487a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.l.f(zArr, "<this>");
        return zArr.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        C1528f builder = (C1528f) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        boolean zI = bVar.I(this.f11531b, i);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f11479a;
        int i10 = builder.f11480b;
        builder.f11480b = i10 + 1;
        zArr[i10] = zI;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.l.f(zArr, "<this>");
        C1528f c1528f = new C1528f();
        c1528f.f11479a = zArr;
        c1528f.f11480b = zArr.length;
        c1528f.b(10);
        return c1528f;
    }

    @Override // Q9.AbstractC1554s0
    public final boolean[] j() {
        return new boolean[0];
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, boolean[] zArr, int i) {
        boolean[] content = zArr;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        kotlin.jvm.internal.l.f(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.B(this.f11531b, i10, content[i10]);
        }
    }
}
