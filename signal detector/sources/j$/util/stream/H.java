package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class H extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final D f20869c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f20870d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f20878a) {
            return Optional.of(this.f20879b);
        }
        return null;
    }

    static {
        EnumC2418d3 enumC2418d3 = EnumC2418d3.REFERENCE;
        f20869c = new D(true, enumC2418d3, Optional.empty(), new C2399a(26), new C2399a(27));
        f20870d = new D(false, enumC2418d3, Optional.empty(), new C2399a(26), new C2399a(27));
    }
}
