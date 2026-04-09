package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class o1 extends m {

    /* renamed from: a, reason: collision with root package name */
    public final l9.l f22581a;

    public o1(l9.l lVar) {
        this.f22581a = lVar;
    }

    @Override // kotlinx.coroutines.n
    public void i(Throwable th) {
        this.f22581a.invoke(th);
    }

    @Override // l9.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return y8.s.f25199a;
    }

    public String toString() {
        return "InvokeOnCancel[" + l0.a(this.f22581a) + '@' + l0.b(this) + ']';
    }
}
