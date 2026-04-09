package j$.util.stream;

import j$.util.C2395o;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class G extends I implements InterfaceC2467n2 {

    /* renamed from: c, reason: collision with root package name */
    public static final D f20863c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f20864d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        o(Long.valueOf(j6));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f20878a) {
            return new C2395o(((Long) this.f20879b).longValue());
        }
        return null;
    }

    static {
        EnumC2418d3 enumC2418d3 = EnumC2418d3.LONG_VALUE;
        C2399a c2399a = new C2399a(24);
        C2399a c2399a2 = new C2399a(25);
        C2395o c2395o = C2395o.f20813c;
        f20863c = new D(true, enumC2418d3, c2395o, c2399a, c2399a2);
        f20864d = new D(false, enumC2418d3, c2395o, new C2399a(24), new C2399a(25));
    }
}
