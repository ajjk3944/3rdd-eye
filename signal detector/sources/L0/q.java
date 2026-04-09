package L0;

/* loaded from: classes.dex */
public final class q extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2485a = 1;

    /* renamed from: b, reason: collision with root package name */
    public l f2486b;

    public /* synthetic */ q() {
    }

    @Override // L0.j
    public final void c(l lVar) {
        switch (this.f2485a) {
            case 0:
                this.f2486b.A();
                lVar.y(this);
                break;
            default:
                C0156a c0156a = (C0156a) this.f2486b;
                int i = c0156a.f2420R - 1;
                c0156a.f2420R = i;
                if (i == 0) {
                    c0156a.f2421S = false;
                    c0156a.m();
                }
                lVar.y(this);
                break;
        }
    }

    @Override // L0.m, L0.j
    public void g(l lVar) {
        switch (this.f2485a) {
            case 1:
                C0156a c0156a = (C0156a) this.f2486b;
                if (!c0156a.f2421S) {
                    c0156a.H();
                    c0156a.f2421S = true;
                    break;
                }
                break;
        }
    }

    public q(l lVar) {
        this.f2486b = lVar;
    }
}
