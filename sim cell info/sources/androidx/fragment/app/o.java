package androidx.fragment.app;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1723a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final q f1724b;

    /* renamed from: c, reason: collision with root package name */
    private static final q f1725c;

    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f1726b;

        a(ArrayList arrayList) {
            this.f1726b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.A(this.f1726b, 4);
        }
    }

    static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1727b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f1728c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f1729d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f1730e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1731f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f1732g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ArrayList f1733h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f1734i;

        b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1727b = obj;
            this.f1728c = qVar;
            this.f1729d = view;
            this.f1730e = fragment;
            this.f1731f = arrayList;
            this.f1732g = arrayList2;
            this.f1733h = arrayList3;
            this.f1734i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f1727b;
            if (obj != null) {
                this.f1728c.p(obj, this.f1729d);
                this.f1732g.addAll(o.k(this.f1728c, this.f1727b, this.f1730e, this.f1731f, this.f1729d));
            }
            if (this.f1733h != null) {
                if (this.f1734i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f1729d);
                    this.f1728c.q(this.f1734i, this.f1733h, arrayList);
                }
                this.f1733h.clear();
                this.f1733h.add(this.f1729d);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f1735b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1736c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1737d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k.a f1738e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f1739f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q f1740g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Rect f1741h;

        c(Fragment fragment, Fragment fragment2, boolean z2, k.a aVar, View view, q qVar, Rect rect) {
            this.f1735b = fragment;
            this.f1736c = fragment2;
            this.f1737d = z2;
            this.f1738e = aVar;
            this.f1739f = view;
            this.f1740g = qVar;
            this.f1741h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.f(this.f1735b, this.f1736c, this.f1737d, this.f1738e, false);
            View view = this.f1739f;
            if (view != null) {
                this.f1740g.k(view, this.f1741h);
            }
        }
    }

    static class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f1742b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k.a f1743c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f1744d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f1745e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1746f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f1747g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Fragment f1748h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Fragment f1749i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f1750j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ArrayList f1751k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f1752l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Rect f1753m;

        d(q qVar, k.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z2, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1742b = qVar;
            this.f1743c = aVar;
            this.f1744d = obj;
            this.f1745e = eVar;
            this.f1746f = arrayList;
            this.f1747g = view;
            this.f1748h = fragment;
            this.f1749i = fragment2;
            this.f1750j = z2;
            this.f1751k = arrayList2;
            this.f1752l = obj2;
            this.f1753m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.a<String, View> aVarH = o.h(this.f1742b, this.f1743c, this.f1744d, this.f1745e);
            if (aVarH != null) {
                this.f1746f.addAll(aVarH.values());
                this.f1746f.add(this.f1747g);
            }
            o.f(this.f1748h, this.f1749i, this.f1750j, aVarH, false);
            Object obj = this.f1744d;
            if (obj != null) {
                this.f1742b.z(obj, this.f1751k, this.f1746f);
                View viewS = o.s(aVarH, this.f1745e, this.f1752l, this.f1750j);
                if (viewS != null) {
                    this.f1742b.k(viewS, this.f1753m);
                }
            }
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f1754a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1755b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f1756c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f1757d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1758e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f1759f;

        e() {
        }
    }

    static {
        f1724b = Build.VERSION.SDK_INT >= 21 ? new p() : null;
        f1725c = w();
    }

    static void A(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    static void B(i iVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z2) {
        if (iVar.f1629q < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e(aVar, sparseArray, z2);
            } else {
                c(aVar, sparseArray, z2);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(iVar.f1630r.i());
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = sparseArray.keyAt(i5);
                k.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i2, i3);
                e eVar = (e) sparseArray.valueAt(i5);
                if (z2) {
                    o(iVar, iKeyAt, eVar, view, aVarD);
                } else {
                    n(iVar, iKeyAt, eVar, view, aVarD);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, k.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewL = aVar.l(size);
            if (collection.contains(a0.s.w(viewL))) {
                arrayList.add(viewL);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.n.a r17, android.util.SparseArray<androidx.fragment.app.o.e> r18, boolean r19, boolean r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.b(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z2) throws Resources.NotFoundException {
        int size = aVar.f1697a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(aVar, aVar.f1697a.get(i2), sparseArray, false, z2);
        }
    }

    private static k.a<String, String> d(int i2, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        k.a<String, String> aVar = new k.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (aVar2.q(i2)) {
                boolean zBooleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f1711o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.f1711o;
                        arrayList4 = aVar2.f1712p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f1711o;
                        arrayList3 = aVar2.f1712p;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z2) throws Resources.NotFoundException {
        if (aVar.f1578s.f1631s.g()) {
            for (int size = aVar.f1697a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f1697a.get(size), sparseArray, true, z2);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z2, k.a<String, View> aVar, boolean z3) {
        if (z2) {
            fragment2.r();
        } else {
            fragment.r();
        }
    }

    private static boolean g(q qVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!qVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static k.a<String, View> h(q qVar, k.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f1754a;
        View viewJ = fragment.J();
        if (aVar.isEmpty() || obj == null || viewJ == null) {
            aVar.clear();
            return null;
        }
        k.a<String, View> aVar2 = new k.a<>();
        qVar.j(aVar2, viewJ);
        androidx.fragment.app.a aVar3 = eVar.f1756c;
        if (eVar.f1755b) {
            fragment.t();
            arrayList = aVar3.f1711o;
        } else {
            fragment.r();
            arrayList = aVar3.f1712p;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static k.a<String, View> i(q qVar, k.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f1757d;
        k.a<String, View> aVar2 = new k.a<>();
        qVar.j(aVar2, fragment.a1());
        androidx.fragment.app.a aVar3 = eVar.f1759f;
        if (eVar.f1758e) {
            fragment.r();
            arrayList = aVar3.f1712p;
        } else {
            fragment.t();
            arrayList = aVar3.f1711o;
        }
        aVar2.n(arrayList);
        aVar.n(aVar2.keySet());
        return aVar2;
    }

    private static q j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objS = fragment.s();
            if (objS != null) {
                arrayList.add(objS);
            }
            Object objE = fragment.E();
            if (objE != null) {
                arrayList.add(objE);
            }
            Object objG = fragment.G();
            if (objG != null) {
                arrayList.add(objG);
            }
        }
        if (fragment2 != null) {
            Object objQ = fragment2.q();
            if (objQ != null) {
                arrayList.add(objQ);
            }
            Object objB = fragment2.B();
            if (objB != null) {
                arrayList.add(objB);
            }
            Object objF = fragment2.F();
            if (objF != null) {
                arrayList.add(objF);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f1724b;
        if (qVar != null && g(qVar, arrayList)) {
            return qVar;
        }
        q qVar2 = f1725c;
        if (qVar2 != null && g(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewJ = fragment.J();
        if (viewJ != null) {
            qVar.f(arrayList2, viewJ);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(q qVar, ViewGroup viewGroup, View view, k.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objT;
        k.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f1754a;
        Fragment fragment2 = eVar.f1757d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z2 = eVar.f1755b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objT = null;
        } else {
            objT = t(qVar, fragment, fragment2, z2);
            aVar2 = aVar;
        }
        k.a<String, View> aVarI = i(qVar, aVar2, objT, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z2, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, aVarI, eVar.f1758e, eVar.f1759f);
            if (obj != null) {
                qVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        a0.q.a(viewGroup, new d(qVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z2, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(q qVar, ViewGroup viewGroup, View view, k.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f1754a;
        Fragment fragment2 = eVar.f1757d;
        if (fragment != null) {
            fragment.a1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z2 = eVar.f1755b;
        Object objT = aVar.isEmpty() ? null : t(qVar, fragment, fragment2, z2);
        k.a<String, View> aVarI = i(qVar, aVar, objT, eVar);
        k.a<String, View> aVarH = h(qVar, aVar, objT, eVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z2, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, aVarI, eVar.f1758e, eVar.f1759f);
            Rect rect2 = new Rect();
            View viewS = s(aVarH, eVar, obj, z2);
            if (viewS != null) {
                qVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        a0.q.a(viewGroup, new c(fragment, fragment2, z2, aVarH, view2, qVar, rect));
        return obj3;
    }

    private static void n(i iVar, int i2, e eVar, View view, k.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q qVarJ;
        Object obj;
        ViewGroup viewGroup = iVar.f1631s.g() ? (ViewGroup) iVar.f1631s.f(i2) : null;
        if (viewGroup == null || (qVarJ = j((fragment2 = eVar.f1757d), (fragment = eVar.f1754a))) == null) {
            return;
        }
        boolean z2 = eVar.f1755b;
        boolean z3 = eVar.f1758e;
        Object objQ = q(qVarJ, fragment, z2);
        Object objR = r(qVarJ, fragment2, z3);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(qVarJ, viewGroup, view, aVar, eVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(qVarJ, obj, fragment2, arrayList, view);
        Object obj2 = (arrayListK == null || arrayListK.isEmpty()) ? null : obj;
        qVarJ.a(objQ, view);
        Object objU = u(qVarJ, objQ, obj2, objL, fragment, eVar.f1755b);
        if (objU != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            qVarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(qVarJ, viewGroup, fragment, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            qVarJ.w(viewGroup, arrayList2, aVar);
            qVarJ.c(viewGroup, objU);
            qVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(i iVar, int i2, e eVar, View view, k.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q qVarJ;
        Object obj;
        ViewGroup viewGroup = iVar.f1631s.g() ? (ViewGroup) iVar.f1631s.f(i2) : null;
        if (viewGroup == null || (qVarJ = j((fragment2 = eVar.f1757d), (fragment = eVar.f1754a))) == null) {
            return;
        }
        boolean z2 = eVar.f1755b;
        boolean z3 = eVar.f1758e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objQ = q(qVarJ, fragment, z2);
        Object objR = r(qVarJ, fragment2, z3);
        Object objM = m(qVarJ, viewGroup, view, aVar, eVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(qVarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(qVarJ, objQ, fragment, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(qVarJ, objQ, obj, objM, fragment, z2);
        if (objU != null) {
            v(qVarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = qVarJ.o(arrayList);
            qVarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            qVarJ.c(viewGroup, objU);
            qVarJ.x(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            A(arrayListK2, 0);
            qVarJ.z(objM, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i2) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i2, eVar2);
        return eVar2;
    }

    private static Object q(q qVar, Fragment fragment, boolean z2) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z2 ? fragment.B() : fragment.q());
    }

    private static Object r(q qVar, Fragment fragment, boolean z2) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z2 ? fragment.E() : fragment.s());
    }

    static View s(k.a<String, View> aVar, e eVar, Object obj, boolean z2) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f1756c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1711o) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z2 ? aVar2.f1711o : aVar2.f1712p).get(0));
    }

    private static Object t(q qVar, Fragment fragment, Fragment fragment2, boolean z2) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.A(qVar.g(z2 ? fragment2.G() : fragment.F()));
    }

    private static Object u(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z2) {
        return (obj == null || obj2 == null || fragment == null) ? true : z2 ? fragment.k() : fragment.j() ? qVar.n(obj2, obj, obj3) : qVar.m(obj2, obj, obj3);
    }

    private static void v(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f1540l && fragment.f1554z && fragment.O) {
            fragment.g1(true);
            qVar.r(obj, fragment.J(), arrayList);
            a0.q.a(fragment.G, new a(arrayList));
        }
    }

    private static q w() {
        try {
            return (q) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(k.a<String, String> aVar, k.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void y(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        a0.q.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(q qVar, Object obj, Object obj2, k.a<String, View> aVar, boolean z2, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f1711o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z2 ? aVar2.f1712p : aVar2.f1711o).get(0));
        qVar.v(obj, view);
        if (obj2 != null) {
            qVar.v(obj2, view);
        }
    }
}
