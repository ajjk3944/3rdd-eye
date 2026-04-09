package eu;

import ar.o;
import lq.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8348a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8349d;

    public /* synthetic */ b(int i10, Object obj) {
        this.f8348a = i10;
        this.f8349d = obj;
    }

    @Override // ar.o
    public final Object h(Object obj, Object obj2, Object obj3) throws ba.l {
        switch (this.f8348a) {
            case 0:
                d dVar = (d) this.f8349d;
                d.f8352h.set(dVar, null);
                dVar.f(null);
                break;
            case 1:
                ((i) this.f8349d).b();
                break;
            default:
                ((cg.j) this.f8349d).a((Throwable) obj);
                break;
        }
        return b0.f15562a;
    }

    public /* synthetic */ b(d dVar, c cVar) {
        this.f8348a = 0;
        this.f8349d = dVar;
    }
}
