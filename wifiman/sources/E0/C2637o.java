package E0;

/* renamed from: E0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2637o {

    /* renamed from: a, reason: collision with root package name */
    private final C2636n f3959a;

    /* renamed from: b, reason: collision with root package name */
    private final C2636n f3960b;

    public C2637o(boolean z10) {
        this.f3959a = new C2636n(z10);
        this.f3960b = new C2636n(z10);
    }

    public final void c(G g10, boolean z10) {
        if (z10) {
            this.f3959a.a(g10);
            this.f3960b.a(g10);
        } else {
            if (this.f3959a.b(g10)) {
                return;
            }
            this.f3960b.a(g10);
        }
    }

    public final boolean d(G g10) {
        return this.f3959a.b(g10) || this.f3960b.b(g10);
    }

    public final boolean e(G g10, boolean z10) {
        boolean zB = this.f3959a.b(g10);
        return z10 ? zB : zB || this.f3960b.b(g10);
    }

    public final boolean f() {
        return this.f3960b.d() && this.f3959a.d();
    }

    public final boolean g(boolean z10) {
        return (z10 ? this.f3959a : this.f3960b).d();
    }

    public final boolean h() {
        return !f();
    }

    public final boolean i(G g10) {
        return this.f3960b.f(g10) || this.f3959a.f(g10);
    }
}
