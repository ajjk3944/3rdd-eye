package at;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import mq.w;
import ur.k0;

/* loaded from: classes.dex */
public abstract class o implements n {
    @Override // at.p
    public Collection a(f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        return w.f16945a;
    }

    @Override // at.n
    public Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return w.f16945a;
    }

    @Override // at.p
    public rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return null;
    }

    @Override // at.n
    public Set d() {
        Collection collectionA = a(f.f2283p, rt.b.f21784d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof k0) {
                qs.g name = ((k0) obj).getName();
                br.l.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // at.n
    public Set e() {
        return null;
    }

    @Override // at.n
    public Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return w.f16945a;
    }

    @Override // at.n
    public Set g() {
        Collection collectionA = a(f.f2284q, rt.b.f21784d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof k0) {
                qs.g name = ((k0) obj).getName();
                br.l.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
