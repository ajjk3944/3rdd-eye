package x0;

/* loaded from: classes.dex */
public abstract class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final v0.a f24750a = new v0.a(0);

    public final boolean f(int i10) {
        return (i10 & this.f24750a.get()) != 0;
    }

    public final void h(int i10) {
        v0.a aVar;
        int i11;
        do {
            aVar = this.f24750a;
            i11 = aVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i11, i11 | i10));
    }
}
