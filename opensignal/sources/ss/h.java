package ss;

import ht.d1;
import ht.p0;
import ht.x;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22236d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f22237g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i10) {
        super(1);
        this.f22236d = i10;
        this.f22237g = jVar;
    }

    @Override // ar.k
    public final Object a(Object obj) throws IOException {
        switch (this.f22236d) {
            case 0:
                p0 p0Var = (p0) obj;
                br.l.e(p0Var, "it");
                if (p0Var.c()) {
                    return "*";
                }
                x xVarB = p0Var.b();
                br.l.d(xVarB, "it.type");
                String strY = this.f22237g.Y(xVarB);
                if (p0Var.a() == d1.INVARIANT) {
                    return strY;
                }
                return p0Var.a() + ' ' + strY;
            case 1:
                vs.g gVar = (vs.g) obj;
                br.l.e(gVar, "it");
                return this.f22237g.B(gVar);
            default:
                x xVar = (x) obj;
                br.l.d(xVar, "it");
                return this.f22237g.Y(xVar);
        }
    }
}
