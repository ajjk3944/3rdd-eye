package androidx.compose.ui.platform;

import J0.g;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l0.C6533i;
import mh.InterfaceC6835l;
import o.AbstractC7022m;
import o.AbstractC7023n;

/* renamed from: androidx.compose.ui.platform.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3936l1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C6533i f29457a = new C6533i(0.0f, 0.0f, 10.0f, 10.0f);

    public static final C3927i1 a(List list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C3927i1) list.get(i11)).d() == i10) {
                return (C3927i1) list.get(i11);
            }
        }
        return null;
    }

    public static final AbstractC7022m b(J0.p pVar) {
        J0.n nVarA = pVar.a();
        o.z zVarB = AbstractC7023n.b();
        if (nVarA.q().q() && nVarA.q().K0()) {
            C6533i c6533iI = nVarA.i();
            c(new Region(Math.round(c6533iI.k()), Math.round(c6533iI.n()), Math.round(c6533iI.l()), Math.round(c6533iI.e())), nVarA, zVarB, nVarA, new Region());
        }
        return zVarB;
    }

    private static final void c(Region region, J0.n nVar, o.z zVar, J0.n nVar2, Region region2) {
        C0.v vVarP;
        boolean z10 = (nVar2.q().q() && nVar2.q().K0()) ? false : true;
        if (!region.isEmpty() || nVar2.o() == nVar.o()) {
            if (!z10 || nVar2.x()) {
                C6533i c6533iV = nVar2.v();
                int iRound = Math.round(c6533iV.k());
                int iRound2 = Math.round(c6533iV.n());
                int iRound3 = Math.round(c6533iV.l());
                int iRound4 = Math.round(c6533iV.e());
                region2.set(iRound, iRound2, iRound3, iRound4);
                int iO = nVar2.o() == nVar.o() ? -1 : nVar2.o();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (nVar2.x()) {
                        J0.n nVarR = nVar2.r();
                        C6533i c6533iI = (nVarR == null || (vVarP = nVarR.p()) == null || !vVarP.q()) ? f29457a : nVarR.i();
                        zVar.t(iO, new C3933k1(nVar2, new Rect(Math.round(c6533iI.k()), Math.round(c6533iI.n()), Math.round(c6533iI.l()), Math.round(c6533iI.e()))));
                        return;
                    } else {
                        if (iO == -1) {
                            zVar.t(iO, new C3933k1(nVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                zVar.t(iO, new C3933k1(nVar2, region2.getBounds()));
                List listT = nVar2.t();
                for (int size = listT.size() - 1; -1 < size; size--) {
                    c(region, nVar, zVar, (J0.n) listT.get(size), region2);
                }
                if (f(nVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Float d(J0.j jVar) {
        InterfaceC6835l interfaceC6835l;
        ArrayList arrayList = new ArrayList();
        J0.a aVar = (J0.a) J0.k.a(jVar, J0.i.f9619a.h());
        if (aVar == null || (interfaceC6835l = (InterfaceC6835l) aVar.a()) == null || !((Boolean) interfaceC6835l.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final L0.M e(J0.j jVar) {
        InterfaceC6835l interfaceC6835l;
        ArrayList arrayList = new ArrayList();
        J0.a aVar = (J0.a) J0.k.a(jVar, J0.i.f9619a.i());
        if (aVar == null || (interfaceC6835l = (InterfaceC6835l) aVar.a()) == null || !((Boolean) interfaceC6835l.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (L0.M) arrayList.get(0);
    }

    public static final boolean f(J0.n nVar) {
        return g(nVar) && (nVar.w().u() || nVar.w().g());
    }

    public static final boolean g(J0.n nVar) {
        return (nVar.z() || nVar.w().f(J0.q.f9676a.n())) ? false : true;
    }

    public static final View h(Z z10, int i10) {
        Object next;
        Iterator<T> it = z10.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((E0.G) ((Map.Entry) next).getKey()).q0() == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.c) entry.getValue();
        }
        return null;
    }

    public static final String i(int i10) {
        g.a aVar = J0.g.f9602b;
        if (J0.g.k(i10, aVar.a())) {
            return "android.widget.Button";
        }
        if (J0.g.k(i10, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (J0.g.k(i10, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (J0.g.k(i10, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (J0.g.k(i10, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
