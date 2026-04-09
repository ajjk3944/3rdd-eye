package n0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q0 implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17288a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17289d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f17290g;

    public /* synthetic */ q0(Object obj, int i10, Object obj2) {
        this.f17288a = i10;
        this.f17290g = obj;
        this.f17289d = obj2;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        long j;
        switch (this.f17288a) {
            case 0:
                d8.a aVar = (d8.a) this.f17290g;
                Object obj2 = aVar.f7149c;
                wt.g gVar = (wt.g) this.f17289d;
                synchronized (obj2) {
                    ((ArrayList) aVar.f7147a).remove(gVar);
                }
                return lq.b0.f15562a;
            case 1:
                try {
                    ((su.i) this.f17290g).d();
                } catch (Throwable unused) {
                }
                return lq.b0.f15562a;
            case 2:
                rr.d dVar = (rr.d) obj;
                ts.o oVar = (ts.o) this.f17290g;
                rr.d dVar2 = (rr.d) this.f17289d;
                br.l.e(dVar, "second");
                oVar.d(dVar2, dVar);
                return lq.b0.f15562a;
            default:
                x0.j jVar = (x0.j) obj;
                synchronized (x0.l.f24717c) {
                    j = x0.l.f24719e;
                    x0.l.f24719e = 1 + j;
                }
                return new x0.b(j, jVar, (ar.k) this.f17290g, (ar.k) this.f17289d);
        }
    }
}
