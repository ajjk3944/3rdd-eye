package B;

import B.InterfaceC2440d;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class J implements InterfaceC2440d {

    /* renamed from: a, reason: collision with root package name */
    private final V.b f902a = new V.b(new InterfaceC2440d.a[16], 0);

    /* renamed from: b, reason: collision with root package name */
    private int f903b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2440d.a f904c;

    private final void d(int i10) {
        if (i10 < 0 || i10 >= a()) {
            throw new IndexOutOfBoundsException("Index " + i10 + ", size " + a());
        }
    }

    private final boolean e(InterfaceC2440d.a aVar, int i10) {
        return i10 < aVar.b() + aVar.a() && aVar.b() <= i10;
    }

    private final InterfaceC2440d.a f(int i10) {
        InterfaceC2440d.a aVar = this.f904c;
        if (aVar != null && e(aVar, i10)) {
            return aVar;
        }
        V.b bVar = this.f902a;
        InterfaceC2440d.a aVar2 = (InterfaceC2440d.a) bVar.m()[AbstractC2441e.b(bVar, i10)];
        this.f904c = aVar2;
        return aVar2;
    }

    @Override // B.InterfaceC2440d
    public int a() {
        return this.f903b;
    }

    @Override // B.InterfaceC2440d
    public void b(int i10, int i11, InterfaceC6835l interfaceC6835l) {
        d(i10);
        d(i11);
        if (i11 < i10) {
            throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
        }
        int iB = AbstractC2441e.b(this.f902a, i10);
        int iB2 = ((InterfaceC2440d.a) this.f902a.m()[iB]).b();
        while (iB2 <= i11) {
            InterfaceC2440d.a aVar = (InterfaceC2440d.a) this.f902a.m()[iB];
            interfaceC6835l.invoke(aVar);
            iB2 += aVar.a();
            iB++;
        }
    }

    public final void c(int i10, Object obj) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i10).toString());
        }
        if (i10 == 0) {
            return;
        }
        InterfaceC2440d.a aVar = new InterfaceC2440d.a(a(), i10, obj);
        this.f903b = a() + i10;
        this.f902a.b(aVar);
    }

    @Override // B.InterfaceC2440d
    public InterfaceC2440d.a get(int i10) {
        d(i10);
        return f(i10);
    }
}
