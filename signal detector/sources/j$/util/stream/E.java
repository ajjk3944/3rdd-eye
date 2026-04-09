package j$.util.stream;

import j$.util.C2393m;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class E extends I implements InterfaceC2457l2 {

    /* renamed from: c, reason: collision with root package name */
    public static final D f20846c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f20847d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        o(Double.valueOf(d6));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f20878a) {
            return new C2393m(((Double) this.f20879b).doubleValue());
        }
        return null;
    }

    static {
        EnumC2418d3 enumC2418d3 = EnumC2418d3.DOUBLE_VALUE;
        C2399a c2399a = new C2399a(20);
        C2399a c2399a2 = new C2399a(21);
        C2393m c2393m = C2393m.f20807c;
        f20846c = new D(true, enumC2418d3, c2393m, c2399a, c2399a2);
        f20847d = new D(false, enumC2418d3, c2393m, new C2399a(20), new C2399a(21));
    }
}
