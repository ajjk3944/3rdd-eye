package j$.util.stream;

import j$.util.C2394n;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class F extends I implements InterfaceC2462m2 {

    /* renamed from: c, reason: collision with root package name */
    public static final D f20857c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f20858d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        o(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f20878a) {
            return new C2394n(((Integer) this.f20879b).intValue());
        }
        return null;
    }

    static {
        EnumC2418d3 enumC2418d3 = EnumC2418d3.INT_VALUE;
        C2399a c2399a = new C2399a(22);
        C2399a c2399a2 = new C2399a(23);
        C2394n c2394n = C2394n.f20810c;
        f20857c = new D(true, enumC2418d3, c2394n, c2399a, c2399a2);
        f20858d = new D(false, enumC2418d3, c2394n, new C2399a(22), new C2399a(23));
    }
}
