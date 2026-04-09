package H0;

import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f1736a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f1737b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, Throwable th) {
        super(th);
        AbstractC2763b.g(i, "callbackName");
        this.f1736a = i;
        this.f1737b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1737b;
    }
}
