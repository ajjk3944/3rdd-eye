package Q9;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: Q9.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536j extends AbstractC1554s0<Byte, byte[], C1534i> {

    /* renamed from: c, reason: collision with root package name */
    public static final C1536j f11494c = new C1536j(C1538k.f11497a);

    @Override // Q9.AbstractC1518a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.l.f(bArr, "<this>");
        return bArr.length;
    }

    @Override // Q9.AbstractC1558v, Q9.AbstractC1518a
    public final void f(P9.b bVar, int i, Object obj) {
        C1534i builder = (C1534i) obj;
        kotlin.jvm.internal.l.f(builder, "builder");
        byte bO = bVar.o(this.f11531b, i);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f11491a;
        int i10 = builder.f11492b;
        builder.f11492b = i10 + 1;
        bArr[i10] = bO;
    }

    @Override // Q9.AbstractC1518a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.l.f(bArr, "<this>");
        C1534i c1534i = new C1534i();
        c1534i.f11491a = bArr;
        c1534i.f11492b = bArr.length;
        c1534i.b(10);
        return c1534i;
    }

    @Override // Q9.AbstractC1554s0
    public final byte[] j() {
        return new byte[0];
    }

    @Override // Q9.AbstractC1554s0
    public final void k(P9.c encoder, byte[] bArr, int i) {
        byte[] content = bArr;
        kotlin.jvm.internal.l.f(encoder, "encoder");
        kotlin.jvm.internal.l.f(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.u(this.f11531b, i10, content[i10]);
        }
    }
}
