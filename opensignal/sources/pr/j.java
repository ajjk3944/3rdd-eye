package pr;

import ht.x;
import ht.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.o;
import mq.p;
import ot.r;
import rr.l;
import rr.o0;
import ur.k0;
import ur.q0;
import ur.t;
import ur.u;

/* loaded from: classes.dex */
public final class j extends k0 {
    public j(l lVar, j jVar, rr.c cVar, boolean z10) {
        super(lVar, jVar, sr.g.f22217a, r.f19829g, cVar, o0.f21696s);
        this.J = true;
        this.R = z10;
        this.S = false;
    }

    @Override // ur.u, rr.u
    public final boolean P() {
        return false;
    }

    @Override // ur.u, rr.u
    public final boolean g() {
        return false;
    }

    @Override // ur.u, rr.x
    public final boolean u() {
        return false;
    }

    @Override // ur.k0, ur.u
    public final u x1(qs.g gVar, rr.c cVar, l lVar, rr.u uVar, o0 o0Var, sr.h hVar) {
        br.l.e(lVar, "newOwner");
        br.l.e(cVar, "kind");
        br.l.e(hVar, "annotations");
        return new j(lVar, (j) uVar, cVar, this.R);
    }

    @Override // ur.u
    public final u y1(t tVar) {
        qs.g gVar;
        j jVar = (j) super.y1(tVar);
        if (jVar == null) {
            return null;
        }
        List listY = jVar.Y();
        br.l.d(listY, "substituted.valueParameters");
        if (listY.isEmpty()) {
            return jVar;
        }
        Iterator it = listY.iterator();
        while (it.hasNext()) {
            x type = ((q0) it.next()).getType();
            br.l.d(type, "it.type");
            if (xu.d.o(type) != null) {
                List listY2 = jVar.Y();
                br.l.d(listY2, "substituted.valueParameters");
                ArrayList arrayList = new ArrayList(p.a0(listY2, 10));
                Iterator it2 = listY2.iterator();
                while (it2.hasNext()) {
                    x type2 = ((q0) it2.next()).getType();
                    br.l.d(type2, "it.type");
                    arrayList.add(xu.d.o(type2));
                }
                int size = jVar.Y().size() - arrayList.size();
                boolean z10 = true;
                if (size == 0) {
                    List listY3 = jVar.Y();
                    br.l.d(listY3, "valueParameters");
                    ArrayList arrayListW0 = o.W0(arrayList, listY3);
                    if (arrayListW0.isEmpty()) {
                        return jVar;
                    }
                    Iterator it3 = arrayListW0.iterator();
                    while (it3.hasNext()) {
                        lq.l lVar = (lq.l) it3.next();
                        if (!br.l.a((qs.g) lVar.f15571a, ((q0) lVar.f15572d).getName())) {
                        }
                    }
                    return jVar;
                }
                List<q0> listY4 = jVar.Y();
                br.l.d(listY4, "valueParameters");
                ArrayList arrayList2 = new ArrayList(p.a0(listY4, 10));
                for (q0 q0Var : listY4) {
                    qs.g name = q0Var.getName();
                    br.l.d(name, "it.name");
                    int i10 = q0Var.B;
                    int i11 = i10 - size;
                    if (i11 >= 0 && (gVar = (qs.g) arrayList.get(i11)) != null) {
                        name = gVar;
                    }
                    arrayList2.add(q0Var.v1(jVar, name, i10));
                }
                t tVarB1 = jVar.B1(x0.f10954b);
                if (arrayList.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((qs.g) it4.next()) == null) {
                            break;
                        }
                    }
                    z10 = false;
                }
                tVarB1.R = Boolean.valueOf(z10);
                tVarB1.B = arrayList2;
                tVarB1.f23670x = jVar.u1();
                u uVarY1 = super.y1(tVarB1);
                br.l.b(uVarY1);
                return uVarY1;
            }
        }
        return jVar;
    }
}
