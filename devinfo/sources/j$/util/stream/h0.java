package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class h0 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f26592c;

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f26593d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f26604a) {
            return Optional.of(this.f26605b);
        }
        return null;
    }

    static {
        b7 b7Var = b7.REFERENCE;
        f26592c = new c0(true, b7Var, Optional.empty(), new e0(4), new e0(5));
        f26593d = new c0(false, b7Var, Optional.empty(), new e0(4), new e0(5));
    }
}
