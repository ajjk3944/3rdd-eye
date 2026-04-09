package c0;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2479c;

    public /* synthetic */ p(int i4, Object obj, Object obj2) {
        this.f2477a = i4;
        this.f2478b = obj;
        this.f2479c = obj2;
    }

    private final Object c() {
        y6.b bVar = (y6.b) this.f2478b;
        y6.a aVar = (y6.a) this.f2479c;
        z6.f fVar = bVar.f37347a;
        fVar.getClass();
        synchronized (fVar.f37962c) {
            if (fVar.f37963d.remove(aVar) && fVar.f37963d.isEmpty()) {
                fVar.d();
            }
        }
        return yj.u.f37649a;
    }

    private final Object d() {
        long jA;
        int i4;
        yl.y[] yVarArr;
        yl.p pVar = (yl.p) this.f2478b;
        yl.c0 c0Var = (yl.c0) this.f2479c;
        nk.u uVar = new nk.u();
        yl.q qVar = pVar.f37721b;
        synchronized (qVar.f37743w) {
            synchronized (qVar) {
                try {
                    yl.c0 c0Var2 = qVar.f37738r;
                    yl.c0 c0Var3 = new yl.c0();
                    c0Var3.b(c0Var2);
                    c0Var3.b(c0Var);
                    uVar.f29986a = c0Var3;
                    jA = c0Var3.a() - c0Var2.a();
                    yVarArr = (jA == 0 || qVar.f37724b.isEmpty()) ? null : (yl.y[]) qVar.f37724b.values().toArray(new yl.y[0]);
                    yl.c0 c0Var4 = (yl.c0) uVar.f29986a;
                    nk.k.e(c0Var4, "<set-?>");
                    qVar.f37738r = c0Var4;
                    ul.c.c(qVar.j, qVar.f37725c + " onSettings", new p(16, qVar, uVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                qVar.f37743w.c((yl.c0) uVar.f29986a);
            } catch (IOException e2) {
                yl.b bVar = yl.b.PROTOCOL_ERROR;
                qVar.c(bVar, bVar, e2);
            }
        }
        if (yVarArr != null) {
            for (yl.y yVar : yVarArr) {
                synchronized (yVar) {
                    yVar.f37778e += jA;
                    if (jA > 0) {
                        yVar.notifyAll();
                    }
                }
            }
        }
        return yj.u.f37649a;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    @Override // mk.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.p.invoke():java.lang.Object");
    }
}
