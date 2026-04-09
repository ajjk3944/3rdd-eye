package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class z0 extends m {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f22718a;

    public z0(y0 y0Var) {
        this.f22718a = y0Var;
    }

    @Override // kotlinx.coroutines.n
    public void i(Throwable th) {
        this.f22718a.d();
    }

    @Override // l9.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return y8.s.f25199a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f22718a + ']';
    }
}
