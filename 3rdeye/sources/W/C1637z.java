package W;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: QualityRatioToResolutionsTable.java */
/* renamed from: W.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1637z {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f13316b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f13317c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13318a = new HashMap();

    /* compiled from: QualityRatioToResolutionsTable.java */
    /* renamed from: W.z$a */
    public static abstract class a {
        public abstract int a();

        public abstract C1635x b();
    }

    static {
        HashMap map = new HashMap();
        f13316b = map;
        map.put(C1635x.f13310d, Range.create(2160, 4319));
        map.put(C1635x.f13309c, Range.create(1080, 1439));
        map.put(C1635x.f13308b, Range.create(720, 1079));
        map.put(C1635x.f13307a, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f13317c = map2;
        map2.put(0, G.a.f1791a);
        map2.put(1, G.a.f1793c);
    }

    public C1637z(List list, HashMap map) {
        HashMap map2;
        Integer num;
        C1635x c1635x;
        HashMap map3 = f13316b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = f13317c;
            if (!zHasNext) {
                break;
            }
            C1635x c1635x2 = (C1635x) it.next();
            this.f13318a.put(new C1621i(c1635x2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.f13318a.put(new C1621i(c1635x2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.f13318a.get(new C1621i((C1635x) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    c1635x = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    c1635x = (C1635x) entry2.getKey();
                    break;
                }
            }
            if (c1635x != null) {
                Iterator it5 = map2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (G.a.a(size, (Rational) entry3.getValue(), M.c.f4111b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f13318a.get(new C1621i(c1635x, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f13318a.entrySet()) {
            Size size2 = (Size) map.get(((a) entry4.getKey()).b());
            if (size2 != null) {
                Size size3 = M.c.f4110a;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: W.y
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iA = M.c.a((Size) obj);
                        int i = height;
                        return Math.abs(iA - i) - Math.abs(M.c.a((Size) obj2) - i);
                    }
                });
            }
        }
    }
}
