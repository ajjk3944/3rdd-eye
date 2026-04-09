package c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import lq.b0;
import o4.i0;
import o4.r0;
import o4.s0;

/* loaded from: classes.dex */
public final class o extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3036d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f3037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w wVar, int i10) {
        super(1);
        this.f3036d = i10;
        this.f3037g = wVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f3036d) {
            case 0:
                b bVar = (b) obj;
                br.l.e(bVar, "backEvent");
                w wVar = this.f3037g;
                mq.k kVar = wVar.f3055b;
                ListIterator listIterator = kVar.listIterator(kVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((am.d) objPrevious).f858a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                am.d dVar = (am.d) objPrevious;
                wVar.f3056c = dVar;
                if (dVar != null) {
                    switch (dVar.f861d) {
                        case 1:
                            androidx.fragment.app.d dVar2 = (androidx.fragment.app.d) dVar.f862e;
                            if (androidx.fragment.app.d.K(3)) {
                                Objects.toString(dVar2);
                            }
                            dVar2.x();
                            dVar2.y(new i0(dVar2), false);
                            break;
                        default:
                            br.l.e(bVar, "backEvent");
                            break;
                    }
                }
                return b0.f15562a;
            default:
                b bVar2 = (b) obj;
                br.l.e(bVar2, "backEvent");
                w wVar2 = this.f3037g;
                am.d dVar3 = wVar2.f3056c;
                if (dVar3 == null) {
                    mq.k kVar2 = wVar2.f3055b;
                    ListIterator listIterator2 = kVar2.listIterator(kVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((am.d) objPrevious2).f858a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    dVar3 = (am.d) objPrevious2;
                }
                if (dVar3 != null) {
                    switch (dVar3.f861d) {
                        case 1:
                            androidx.fragment.app.d dVar4 = (androidx.fragment.app.d) dVar3.f862e;
                            if (androidx.fragment.app.d.K(2)) {
                                Objects.toString(dVar4);
                            }
                            if (dVar4.f1443h != null) {
                                Iterator it = dVar4.f(new ArrayList(Collections.singletonList(dVar4.f1443h)), 0, 1).iterator();
                                while (it.hasNext()) {
                                    o4.k kVar3 = (o4.k) it.next();
                                    kVar3.getClass();
                                    br.l.e(bVar2, "backEvent");
                                    androidx.fragment.app.d.K(2);
                                    ArrayList arrayList = kVar3.f18808c;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        mq.t.d0(arrayList2, ((s0) it2.next()).k);
                                    }
                                    List listQ0 = mq.o.Q0(mq.o.U0(arrayList2));
                                    int size = listQ0.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((r0) listQ0.get(i10)).c(bVar2, kVar3.f18806a);
                                    }
                                }
                                Iterator it3 = dVar4.f1447n.iterator();
                                if (it3.hasNext()) {
                                    throw w.g.d(it3);
                                }
                            }
                            break;
                        default:
                            br.l.e(bVar2, "backEvent");
                            break;
                    }
                }
                return b0.f15562a;
        }
    }
}
