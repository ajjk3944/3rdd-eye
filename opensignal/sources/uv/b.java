package uv;

import br.l;
import br.x;
import io.sentry.t;
import ir.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mq.o;
import p.l2;
import vc.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f23720a;

    /* renamed from: b, reason: collision with root package name */
    public final jv.a f23721b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23722c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final qm.c f23723d;

    /* renamed from: e, reason: collision with root package name */
    public rv.a f23724e;

    public b(c cVar, jv.a aVar) {
        this.f23720a = cVar;
        this.f23721b = aVar;
        this.f23723d = new qm.c(aVar, this);
        new ArrayList();
    }

    public final Object a(ar.a aVar, d dVar, sv.a aVar2) {
        l.e(dVar, "clazz");
        l2 l2Var = this.f23721b.f13864b;
        if (!l2Var.F(pv.a.DEBUG)) {
            return b(aVar, dVar, aVar2);
        }
        String str = "";
        if (aVar2 != null) {
            String str2 = " with qualifier '" + aVar2 + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        l2Var.z("+- '" + wv.a.a(dVar) + '\'' + str);
        lq.l lVarI = xu.l.I(new a(this, aVar2, dVar, aVar));
        Object obj = lVarI.f15571a;
        l2Var.z("|- '" + wv.a.a(dVar) + "' in " + ((Number) lVarI.f15572d).doubleValue() + " ms");
        return obj;
    }

    public final Object b(ar.a aVar, d dVar, sv.a aVar2) throws ba.l, nv.b {
        l2 l2Var = this.f23721b.f13864b;
        String strX = e.x(dVar, aVar2);
        qm.c cVar = this.f23723d;
        cVar.getClass();
        l.e(strX, "indexKey");
        ov.b bVar = (ov.b) ((HashMap) cVar.f20920r).get(strX);
        Object objB = bVar == null ? null : bVar.b(new t((jv.a) cVar.f20918d, (b) cVar.f20919g, aVar));
        if (objB == null) {
            l2Var.z("'" + wv.a.a(dVar) + "' - q:'" + aVar2 + "' not found in current scope");
            dVar.x(null);
            l2Var.z("'" + wv.a.a(dVar) + "' - q:'" + aVar2 + "' not found in current scope's source");
            rv.a aVar3 = this.f23724e;
            if (aVar3 == null) {
                objB = null;
            } else {
                aVar3.getClass();
                l.e(dVar, "clazz");
                ArrayList arrayListP0 = o.p0(aVar3.f21819a);
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListP0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (x.f2918a.b(next.getClass()).equals(dVar)) {
                        arrayList.add(next);
                    }
                }
                int size = arrayList.size();
                if (size == 0) {
                    objB = null;
                } else {
                    if (size != 1) {
                        String str = "Ambiguous parameter injection: more than one value of type '" + wv.a.a(dVar) + "' to get from " + aVar3 + ". Check your injection parameters";
                        l.e(str, "str");
                        throw new ba.l(str);
                    }
                    objB = o.r0(arrayList);
                }
            }
        }
        if (objB != null) {
            return objB;
        }
        l2Var.z("'" + wv.a.a(dVar) + "' - q:'" + aVar2 + "' not found in injected parameters");
        Iterator it2 = this.f23722c.iterator();
        Object objA = null;
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            l2 l2Var2 = bVar2.f23721b.f13864b;
            try {
                objA = bVar2.a(aVar, dVar, aVar2);
            } catch (nv.b unused) {
                l2Var2.z("Koin.getOrNull - no instance found for " + wv.a.a(dVar) + " on scope " + bVar2);
                objA = null;
            }
            if (objA != null) {
                break;
            }
        }
        if (objA != null) {
            return objA;
        }
        l2Var.z("'" + wv.a.a(dVar) + "' - q:'" + aVar2 + "' not found in linked scopes");
        String str2 = "";
        if (aVar2 != null) {
            String str3 = " & qualifier:'" + aVar2 + '\'';
            if (str3 != null) {
                str2 = str3;
            }
        }
        String str4 = "No definition found for class:'" + wv.a.a(dVar) + '\'' + str2 + ". Check your definitions!";
        l.e(str4, "msg");
        throw new nv.b(str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23720a.equals(bVar.f23720a) && this.f23721b.equals(bVar.f23721b);
    }

    public final int hashCode() {
        return this.f23721b.hashCode() + ((this.f23720a.hashCode() - 558486430) * 31);
    }

    public final String toString() {
        return "['-Root-']";
    }
}
