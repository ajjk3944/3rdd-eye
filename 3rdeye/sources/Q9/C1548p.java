package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: Q9.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1548p extends AbstractC1554s0<Character, char[], C1546o> {

    /* renamed from: c, reason: collision with root package name */
    public static final C1548p f11522c = new C1548p(C1550q.f11524a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.l.f(cArr, "<this>");
        return cArr.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        C1546o builder = (C1546o) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        char cW = bVar.w(this.f11531b, i);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f11506a;
        int i10 = builder.f11507b;
        builder.f11507b = i10 + 1;
        cArr[i10] = cW;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.l.f(cArr, "<this>");
        C1546o c1546o = new C1546o();
        c1546o.f11506a = cArr;
        c1546o.f11507b = cArr.length;
        c1546o.b(10);
        return c1546o;
    }

    @Override // Q9.AbstractC1554s0
    public final char[] j() {
        return new char[0];
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, char[] cArr, int i) {
        char[] content = cArr;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        kotlin.jvm.internal.l.f(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.E(this.f11531b, i10, content[i10]);
        }
    }
}
