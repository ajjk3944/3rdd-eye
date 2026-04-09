package es;

import java.util.ArrayList;
import java.util.Iterator;
import rr.r0;

/* loaded from: classes.dex */
public final class g extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8301d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f8302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i10) {
        super(0);
        this.f8301d = i10;
        this.f8302g = jVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f8301d) {
            case 0:
                return rr.w.c(this.f8302g);
            case 1:
                j jVar = this.f8302g;
                xr.o oVar = jVar.D;
                ArrayList typeParameters = oVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(mq.p.a0(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    xr.c0 c0Var = (xr.c0) it.next();
                    r0 r0VarA = ((ds.e) jVar.F.f3975g).a(c0Var);
                    if (r0VarA == null) {
                        throw new AssertionError("Parameter " + c0Var + " surely belongs to class " + oVar + ", so it must be resolved");
                    }
                    arrayList.add(r0VarA);
                }
                return arrayList;
            default:
                j jVar2 = this.f8302g;
                if (xs.d.f(jVar2) == null) {
                    return null;
                }
                ((ds.a) jVar2.B.f3974d).f7466w.getClass();
                return null;
        }
    }
}
