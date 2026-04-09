package df;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f22230b;

    public /* synthetic */ b(c cVar, int i4) {
        this.f22229a = i4;
        this.f22230b = cVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ef.b bVarT;
        ef.b bVarJ;
        switch (this.f22229a) {
            case 0:
                this.f22230b.b();
                return;
            case 1:
                this.f22230b.b();
                return;
            default:
                c cVar = this.f22230b;
                synchronized (c.f22231m) {
                    try {
                        wd.f fVar = cVar.f22232a;
                        fVar.a();
                        y4.a aVarA = y4.a.a(fVar.f36614a);
                        try {
                            bVarT = cVar.f22234c.t();
                            if (aVarA != null) {
                                aVarA.v();
                            }
                        } catch (Throwable th2) {
                            if (aVarA != null) {
                                aVarA.v();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i4 = bVarT.f23442b;
                    if (i4 == 5) {
                        bVarJ = cVar.j(bVarT);
                    } else {
                        if (i4 == 3) {
                            bVarJ = cVar.j(bVarT);
                        } else if (!cVar.f22235d.a(bVarT)) {
                            return;
                        } else {
                            bVarJ = cVar.c(bVarT);
                        }
                    }
                    cVar.g(bVarJ);
                    cVar.n(bVarT, bVarJ);
                    if (bVarJ.f23442b == 4) {
                        cVar.m(bVarJ.f23441a);
                    }
                    int i10 = bVarJ.f23442b;
                    if (i10 == 5) {
                        cVar.k(new e());
                        return;
                    } else if (i10 == 2 || i10 == 1) {
                        cVar.k(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.l(bVarJ);
                        return;
                    }
                } catch (e e2) {
                    cVar.k(e2);
                    return;
                }
        }
    }
}
