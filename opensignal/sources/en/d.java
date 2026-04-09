package en;

import ar.n;
import lq.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8236a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn.a f8237d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f8238g;

    public /* synthetic */ d(n nVar, fn.a aVar) {
        this.f8238g = nVar;
        this.f8237d = aVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f8236a) {
            case 0:
                fn.a aVar = this.f8237d;
                this.f8238g.w(aVar.f9023i, aVar.j);
                break;
            default:
                fn.a aVar2 = this.f8237d;
                fn.c cVar = aVar2.f9022h;
                if (cVar != null) {
                    this.f8238g.w(cVar, aVar2.j);
                }
                break;
        }
        return b0.f15562a;
    }

    public /* synthetic */ d(fn.a aVar, n nVar) {
        this.f8237d = aVar;
        this.f8238g = nVar;
    }
}
