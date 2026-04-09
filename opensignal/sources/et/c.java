package et;

import as.x;
import at.n;
import dt.k;
import gt.l;
import java.util.LinkedHashMap;
import java.util.List;
import kg.r;
import ls.e0;
import ls.j;
import ls.k0;
import ls.l0;
import mq.b0;
import mq.p;
import rr.a0;
import rr.f0;
import ur.c0;

/* loaded from: classes.dex */
public final class c extends c0 implements f0 {
    public final ms.a D;
    public final i4.b E;
    public final r F;
    public e0 G;
    public ft.r H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qs.c cVar, l lVar, a0 a0Var, e0 e0Var, ms.a aVar) {
        super(a0Var, cVar);
        br.l.e(cVar, "fqName");
        br.l.e(a0Var, "module");
        this.D = aVar;
        l0 l0Var = e0Var.f15765r;
        br.l.d(l0Var, "proto.strings");
        k0 k0Var = e0Var.f15766x;
        br.l.d(k0Var, "proto.qualifiedNames");
        br.l.e(l0Var, "strings");
        br.l.e(k0Var, "qualifiedNames");
        i4.b bVar = new i4.b();
        bVar.f11196a = l0Var;
        bVar.f11197d = k0Var;
        this.E = bVar;
        dt.c0 c0Var = new dt.c0(this);
        r rVar = new r();
        rVar.f14395a = bVar;
        rVar.f14396d = aVar;
        rVar.f14397g = c0Var;
        List list = e0Var.B;
        br.l.d(list, "proto.class_List");
        int iP = b0.P(p.a0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP < 16 ? 16 : iP);
        for (Object obj : list) {
            linkedHashMap.put(io.sentry.config.a.T((i4.b) rVar.f14395a, ((j) obj).f15803x), obj);
        }
        rVar.f14398r = linkedHashMap;
        this.F = rVar;
        this.G = e0Var;
    }

    @Override // rr.f0
    public final n W() {
        ft.r rVar = this.H;
        if (rVar != null) {
            return rVar;
        }
        br.l.l("_memberScope");
        throw null;
    }

    @Override // ur.c0, ur.n, androidx.lifecycle.o
    public final String toString() {
        return "builtins package fragment for " + this.f23629y + " from " + xs.d.j(this);
    }

    public final void w1(k kVar) {
        br.l.e(kVar, "components");
        e0 e0Var = this.G;
        if (e0Var == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.G = null;
        ls.c0 c0Var = e0Var.f15767y;
        br.l.d(c0Var, "proto.`package`");
        this.H = new ft.r(this, c0Var, this.E, this.D, null, kVar, "scope of " + this, new x(12, this));
    }
}
