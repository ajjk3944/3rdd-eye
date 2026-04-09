package d8;

import br.x;
import cv.d0;
import cv.f0;
import cv.l;
import cv.r;
import cv.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mq.k;
import mq.s;

/* loaded from: classes.dex */
public final class d extends l {

    /* renamed from: b, reason: collision with root package name */
    public final l f7163b;

    public d(l lVar) {
        br.l.e(lVar, "delegate");
        this.f7163b = lVar;
    }

    @Override // cv.l
    public final d0 a(w wVar) {
        br.l.e(wVar, "file");
        return this.f7163b.a(wVar);
    }

    @Override // cv.l
    public final void b(w wVar, w wVar2) {
        br.l.e(wVar, "source");
        br.l.e(wVar2, "target");
        this.f7163b.b(wVar, wVar2);
    }

    @Override // cv.l
    public final void c(w wVar) {
        this.f7163b.c(wVar);
    }

    @Override // cv.l
    public final void d(w wVar) {
        br.l.e(wVar, "path");
        this.f7163b.d(wVar);
    }

    @Override // cv.l
    public final List g(w wVar) {
        List<w> listG = this.f7163b.g(wVar);
        ArrayList arrayList = new ArrayList();
        for (w wVar2 : listG) {
            br.l.e(wVar2, "path");
            arrayList.add(wVar2);
        }
        s.b0(arrayList);
        return arrayList;
    }

    @Override // cv.l
    public final a3.e i(w wVar) {
        br.l.e(wVar, "path");
        a3.e eVarI = this.f7163b.i(wVar);
        if (eVarI == null) {
            return null;
        }
        w wVar2 = (w) eVarI.f45d;
        if (wVar2 == null) {
            return eVarI;
        }
        boolean z10 = eVarI.f43b;
        boolean z11 = eVarI.f44c;
        Long l10 = (Long) eVarI.f46e;
        Long l11 = (Long) eVarI.f47f;
        Long l12 = (Long) eVarI.f48g;
        Long l13 = (Long) eVarI.f49h;
        Map map = (Map) eVarI.f50i;
        br.l.e(map, "extras");
        return new a3.e(z10, z11, wVar2, l10, l11, l12, l13, map);
    }

    @Override // cv.l
    public final r j(w wVar) {
        return this.f7163b.j(wVar);
    }

    @Override // cv.l
    public final d0 k(w wVar) {
        w wVarB = wVar.b();
        l lVar = this.f7163b;
        if (wVarB != null) {
            k kVar = new k();
            while (wVarB != null && !f(wVarB)) {
                kVar.addFirst(wVarB);
                wVarB = wVarB.b();
            }
            Iterator<E> it = kVar.iterator();
            while (it.hasNext()) {
                w wVar2 = (w) it.next();
                br.l.e(wVar2, "dir");
                lVar.c(wVar2);
            }
        }
        return lVar.k(wVar);
    }

    @Override // cv.l
    public final f0 l(w wVar) {
        br.l.e(wVar, "file");
        return this.f7163b.l(wVar);
    }

    public final String toString() {
        return x.f2918a.b(d.class).p() + '(' + this.f7163b + ')';
    }
}
