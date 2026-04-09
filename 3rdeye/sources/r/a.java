package R;

import C.S;
import G.o;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.T0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: ResolutionsMerger.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final double f11548h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a, reason: collision with root package name */
    public final Size f11549a;

    /* renamed from: b, reason: collision with root package name */
    public final Rational f11550b;

    /* renamed from: c, reason: collision with root package name */
    public final Rational f11551c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f11552d;

    /* renamed from: e, reason: collision with root package name */
    public final J.j f11553e;

    /* renamed from: f, reason: collision with root package name */
    public final I f11554f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f11555g;

    /* compiled from: ResolutionsMerger.java */
    /* renamed from: R.a$a, reason: collision with other inner class name */
    public static class C0149a implements Comparator<Rational> {

        /* renamed from: b, reason: collision with root package name */
        public final Rational f11556b;

        public C0149a(Rational rational) {
            this.f11556b = rational;
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational2;
            Rational rational4 = this.f11556b;
            float fFloatValue = rational.floatValue();
            float fFloatValue2 = rational4.floatValue();
            float f10 = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
            float fFloatValue3 = rational3.floatValue();
            float fFloatValue4 = rational4.floatValue();
            return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f10);
        }
    }

    public a(J j4, HashSet hashSet) {
        Size sizeE = o.e(j4.f().d());
        I iN = j4.n();
        J.j jVar = new J.j(iN, sizeE);
        this.f11555g = new HashMap();
        this.f11549a = sizeE;
        Rational rational = ((double) sizeE.getWidth()) / ((double) sizeE.getHeight()) > f11548h ? G.a.f1793c : G.a.f1791a;
        S.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + sizeE + ") is " + rational + ".");
        this.f11550b = rational;
        Rational rational2 = G.a.f1791a;
        if (rational.equals(rational2)) {
            rational2 = G.a.f1793c;
        } else if (!rational.equals(G.a.f1793c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f11551c = rational2;
        this.f11554f = iN;
        this.f11552d = hashSet;
        this.f11553e = jVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalG = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalG2 = g(size);
        if (rationalG.floatValue() == rationalG2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalG.floatValue() > rationalG2.floatValue()) {
                float f10 = width;
                float fFloatValue = f10 / rationalG.floatValue();
                float f11 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, fFloatValue + f11);
            } else {
                float f12 = height;
                float fFloatValue2 = rationalG.floatValue() * f12;
                float f13 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, fFloatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List<Size> b(T0<?> t02) {
        Rational rationalG;
        if (!this.f11552d.contains(t02)) {
            throw new IllegalArgumentException("Invalid child config: " + t02);
        }
        HashMap map = this.f11555g;
        if (map.containsKey(t02)) {
            List<Size> list = (List) map.get(t02);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listB = this.f11553e.b(t02);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) listB).iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = map2.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rationalG = null;
                    break;
                }
                rationalG = (Rational) it2.next();
                Rational rational = G.a.f1791a;
                if (G.a.a(size, rationalG, M.c.f4112c)) {
                    break;
                }
            }
            if (rationalG != null) {
                Size size2 = (Size) map2.get(rationalG);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalG = g(size);
            }
            arrayList.add(size);
            map2.put(rationalG, size);
        }
        map.put(t02, arrayList);
        return arrayList;
    }

    public final boolean d(Rational rational, Size size) {
        Rational rational2 = this.f11550b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = G.a.f1791a;
        Size size2 = M.c.f4112c;
        if (G.a.a(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalG = G.a.f1791a;
        if (!G.a.a(size, rationalG, size2)) {
            rationalG = G.a.f1793c;
            if (!G.a.a(size, rationalG, size2)) {
                rationalG = g(size);
            }
        }
        float fFloatValue3 = rationalG.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        return fFloatValue > fFloatValue2 ? fFloatValue2 < fFloatValue3 : fFloatValue2 > fFloatValue3;
    }

    public final ArrayList e(List list, boolean z10) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = G.a.f1791a;
        map.put(rational, new ArrayList());
        Rational rational2 = G.a.f1793c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (G.a.a(size, rational3, M.c.f4112c)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalG = g(size);
                    arrayList2.add(rationalG);
                    map.put(rationalG, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new C0149a(g(this.f11549a)));
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(G.a.f1793c) && !rational4.equals(G.a.f1791a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(f(rational4, list2, z10));
            }
        }
        return arrayList4;
    }

    public final ArrayList f(Rational rational, List list, boolean z10) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = G.a.f1791a;
            if (G.a.a(size, rational, M.c.f4112c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new G.d(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.f11552d.iterator();
        while (it2.hasNext()) {
            List<Size> listB = b((T0) it2.next());
            if (!z10) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listB) {
                    if (!d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listB = arrayList3;
            }
            if (listB.isEmpty()) {
                return new ArrayList();
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator<Size> it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!c(it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator<Size> it4 = listB.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (c(it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
