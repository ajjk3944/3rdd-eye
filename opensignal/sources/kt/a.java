package kt;

import at.n;
import ht.s0;
import ht.x0;
import java.util.List;
import mq.w;
import rr.m;
import rr.o0;
import rr.p;
import rr.z;

/* loaded from: classes.dex */
public final class a extends ur.l {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(qs.g gVar) {
        k kVar = k.f14520a;
        d dVar = k.f14521b;
        z zVar = z.OPEN;
        rr.g gVar2 = rr.g.CLASS;
        gt.b bVar = gt.l.f9657e;
        List list = w.f16945a;
        super(dVar, gVar, zVar, gVar2, list, bVar);
        ur.j jVar = new ur.j(this, null, sr.g.f22217a, true, rr.c.DECLARATION, o0.f21696s);
        jVar.J1(list, p.f21700d);
        g gVar3 = g.SCOPE_FOR_ERROR_CLASS;
        String str = jVar.getName().f21035a;
        br.l.d(str, "errorConstructor.name.toString()");
        f fVarB = k.b(gVar3, str, "");
        j jVar2 = j.ERROR_CLASS;
        jVar.D = new h(k.d(jVar2, new String[0]), fVarB, jVar2, list, false, new String[0]);
        L(fVarB, i3.g.H(jVar), jVar);
    }

    @Override // ur.b
    /* renamed from: K */
    public final rr.f e(x0 x0Var) {
        br.l.e(x0Var, "substitutor");
        return this;
    }

    @Override // ur.b, rr.q0
    public final m e(x0 x0Var) {
        br.l.e(x0Var, "substitutor");
        return this;
    }

    @Override // ur.l
    public final String toString() {
        String strB = getName().b();
        br.l.d(strB, "name.asString()");
        return strB;
    }

    @Override // ur.b, ur.z
    public final n x(s0 s0Var, jt.f fVar) {
        g gVar = g.SCOPE_FOR_ERROR_CLASS;
        String str = getName().f21035a;
        br.l.d(str, "name.toString()");
        return k.b(gVar, str, s0Var.toString());
    }
}
