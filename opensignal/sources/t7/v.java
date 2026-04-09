package t7;

/* loaded from: classes.dex */
public final class v extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22525a;

    /* renamed from: b, reason: collision with root package name */
    public q f22526b;

    public /* synthetic */ v() {
        this.f22525a = 1;
    }

    @Override // t7.r, t7.o
    public void b(q qVar) {
        switch (this.f22525a) {
            case 0:
                a aVar = (a) this.f22526b;
                aVar.Z.remove(qVar);
                if (!aVar.t()) {
                    aVar.x(aVar, p.f22509v, false);
                    aVar.O = true;
                    aVar.x(aVar, p.f22508u, false);
                    break;
                }
                break;
        }
    }

    @Override // t7.r, t7.o
    public void c(q qVar) {
        switch (this.f22525a) {
            case 1:
                a aVar = (a) this.f22526b;
                int i10 = aVar.f22454b0 - 1;
                aVar.f22454b0 = i10;
                if (i10 == 0) {
                    aVar.f22455c0 = false;
                    aVar.m();
                }
                qVar.A(this);
                break;
            case 2:
                this.f22526b.C();
                qVar.A(this);
                break;
        }
    }

    @Override // t7.r, t7.o
    public void e(q qVar) {
        switch (this.f22525a) {
            case 1:
                a aVar = (a) this.f22526b;
                if (!aVar.f22455c0) {
                    aVar.K();
                    aVar.f22455c0 = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v(q qVar, int i10) {
        this.f22525a = i10;
        this.f22526b = qVar;
    }
}
