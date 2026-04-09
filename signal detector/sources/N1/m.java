package n1;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22251a;

    /* renamed from: b, reason: collision with root package name */
    public final D1.f f22252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f22253c;

    public /* synthetic */ m(p pVar, D1.f fVar, int i) {
        this.f22251a = i;
        this.f22253c = pVar;
        this.f22252b = fVar;
    }

    private final void a() {
        D1.f fVar = this.f22252b;
        fVar.f1228b.a();
        synchronized (fVar.f1229c) {
            synchronized (this.f22253c) {
                try {
                    if (this.f22253c.f22266a.f22256a.contains(new n(this.f22252b, H1.g.f1764b))) {
                        p pVar = this.f22253c;
                        try {
                            this.f22252b.h(pVar.f22260E, 5);
                        } catch (Throwable th) {
                            throw new C2685c(th);
                        }
                    }
                    this.f22253c.c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22251a) {
            case 0:
                a();
                return;
            default:
                D1.f fVar = this.f22252b;
                fVar.f1228b.a();
                synchronized (fVar.f1229c) {
                    synchronized (this.f22253c) {
                        try {
                            if (this.f22253c.f22266a.f22256a.contains(new n(this.f22252b, H1.g.f1764b))) {
                                this.f22253c.f22262G.a();
                                p pVar = this.f22253c;
                                try {
                                    this.f22252b.i(pVar.f22262G, pVar.f22258C, pVar.f22265J);
                                    this.f22253c.j(this.f22252b);
                                } catch (Throwable th) {
                                    throw new C2685c(th);
                                }
                            }
                            this.f22253c.c();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
