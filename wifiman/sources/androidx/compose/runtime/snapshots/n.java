package androidx.compose.runtime.snapshots;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private int f28709a = j.H().f();

    /* renamed from: b, reason: collision with root package name */
    private n f28710b;

    public abstract void c(n nVar);

    public abstract n d();

    public final n e() {
        return this.f28710b;
    }

    public final int f() {
        return this.f28709a;
    }

    public final void g(n nVar) {
        this.f28710b = nVar;
    }

    public final void h(int i10) {
        this.f28709a = i10;
    }
}
