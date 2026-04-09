package A9;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes3.dex */
public final class X implements InterfaceC0579h {

    /* renamed from: b, reason: collision with root package name */
    public final W f216b;

    public X(W w10) {
        this.f216b = w10;
    }

    @Override // A9.InterfaceC0579h
    public final void a(Throwable th) {
        this.f216b.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f216b + ']';
    }
}
