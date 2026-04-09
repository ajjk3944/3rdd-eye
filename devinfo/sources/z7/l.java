package z7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38056a;

    /* renamed from: b, reason: collision with root package name */
    public final p8.g f38057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f38058c;

    public /* synthetic */ l(o oVar, p8.g gVar, int i4) {
        this.f38056a = i4;
        this.f38058c = oVar;
        this.f38057b = gVar;
    }

    private final void a() {
        p8.g gVar = this.f38057b;
        gVar.f31476b.a();
        synchronized (gVar.f31477c) {
            synchronized (this.f38058c) {
                try {
                    if (this.f38058c.f38063a.f38061a.contains(new m(this.f38057b, t8.f.f34510b))) {
                        o oVar = this.f38058c;
                        try {
                            this.f38057b.i(oVar.f38077q, 5);
                        } catch (Throwable th2) {
                            throw new b(th2);
                        }
                    }
                    this.f38058c.c();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38056a) {
            case 0:
                a();
                return;
            default:
                p8.g gVar = this.f38057b;
                gVar.f31476b.a();
                synchronized (gVar.f31477c) {
                    synchronized (this.f38058c) {
                        try {
                            if (this.f38058c.f38063a.f38061a.contains(new m(this.f38057b, t8.f.f34510b))) {
                                this.f38058c.f38079s.c();
                                o oVar = this.f38058c;
                                try {
                                    this.f38057b.j(oVar.f38079s, oVar.f38075o, oVar.f38082v);
                                    this.f38058c.j(this.f38057b);
                                } catch (Throwable th2) {
                                    throw new b(th2);
                                }
                            }
                            this.f38058c.c();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                return;
        }
    }
}
