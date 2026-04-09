package J;

import C.S;
import G.a;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.I;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: SupportedOutputSizesSorter.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final I f2681a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2682b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2683c;

    /* renamed from: d, reason: collision with root package name */
    public final Rational f2684d;

    /* renamed from: e, reason: collision with root package name */
    public final k f2685e;

    public j(I i, Size size) {
        Rational rational;
        this.f2681a = i;
        this.f2682b = i.b();
        this.f2683c = i.g();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List<Size> listM = i.m(256);
            if (listM.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listM, new G.d(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f2684d = rational;
        this.f2685e = new k(i, rational);
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G.a.f1791a);
        arrayList.add(G.a.f1793c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (G.a.a(size, (Rational) it2.next(), M.c.f4112c)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static Rational c(int i, boolean z10) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            return z10 ? G.a.f1791a : G.a.f1792b;
        }
        if (i == 1) {
            return z10 ? G.a.f1793c : G.a.f1794d;
        }
        S.b("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static HashMap d(List list) {
        HashMap map = new HashMap();
        Iterator it = a(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (G.a.a(size, rational, M.c.f4112c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static ArrayList e(Q.b bVar, List list, Size size, int i, Rational rational, int i10, int i11) {
        Q.a aVar = bVar.f10850a;
        HashMap mapD = d(list);
        boolean z10 = rational == null || rational.getNumerator() >= rational.getDenominator();
        aVar.getClass();
        Rational rationalC = c(0, z10);
        ArrayList arrayList = new ArrayList(mapD.keySet());
        Collections.sort(arrayList, new a.C0030a(rationalC, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rational rational2 = (Rational) it.next();
            linkedHashMap.put(rational2, (List) mapD.get(rational2));
        }
        if (size != null) {
            Size size2 = M.c.f4110a;
            int height = size.getHeight() * size.getWidth();
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it2.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (M.c.a(size3) <= height) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        Q.c cVar = bVar.f10851b;
        if (cVar != null) {
            Iterator it3 = linkedHashMap.keySet().iterator();
            while (it3.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it3.next());
                if (!list3.isEmpty() && !cVar.equals(Q.c.f10852c)) {
                    int i12 = cVar.f10854b;
                    Size size4 = cVar.f10853a;
                    if (i12 == 0) {
                        boolean zContains = list3.contains(size4);
                        list3.clear();
                        if (zContains) {
                            list3.add(size4);
                        }
                    } else if (i12 == 1) {
                        f(list3, size4, true);
                    } else if (i12 == 2) {
                        f(list3, size4, false);
                    } else if (i12 == 3) {
                        g(list3, size4, true);
                    } else if (i12 == 4) {
                        g(list3, size4, false);
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = linkedHashMap.values().iterator();
        while (it4.hasNext()) {
            for (Size size5 : (List) it4.next()) {
                if (!arrayList3.contains(size5)) {
                    arrayList3.add(size5);
                }
            }
        }
        return arrayList3;
    }

    public static void f(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public static void g(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<android.util.Size> b(androidx.camera.core.impl.T0<?> r14) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J.j.b(androidx.camera.core.impl.T0):java.util.List");
    }
}
