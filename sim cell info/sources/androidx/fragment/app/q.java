package androidx.fragment.app;

import a0.u;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class q {

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f1775c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f1776d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1777e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1778f;

        a(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1774b = i2;
            this.f1775c = arrayList;
            this.f1776d = arrayList2;
            this.f1777e = arrayList3;
            this.f1778f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i2 = 0; i2 < this.f1774b; i2++) {
                a0.s.Z((View) this.f1775c.get(i2), (String) this.f1776d.get(i2));
                a0.s.Z((View) this.f1777e.get(i2), (String) this.f1778f.get(i2));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f1780b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f1781c;

        b(ArrayList arrayList, Map map) {
            this.f1780b = arrayList;
            this.f1781c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1780b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1780b.get(i2);
                String strW = a0.s.w(view);
                if (strW != null) {
                    a0.s.Z(view, q.i(this.f1781c, strW));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f1783b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f1784c;

        c(ArrayList arrayList, Map map) {
            this.f1783b = arrayList;
            this.f1784c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1783b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1783b.get(i2);
                a0.s.Z(view, (String) this.f1784c.get(a0.s.w(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z2 = view instanceof ViewGroup;
            View view2 = view;
            if (z2) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean zA = u.a(viewGroup);
                view2 = viewGroup;
                if (!zA) {
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        f(arrayList, viewGroup.getChildAt(i2));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strW = a0.s.w(view);
            if (strW != null) {
                map.put(strW, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    j(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(a0.s.w(view));
            a0.s.Z(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        a0.q.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        a0.q.a(view, new b(arrayList, map));
    }

    void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String strW = a0.s.w(view2);
            arrayList4.add(strW);
            if (strW != null) {
                a0.s.Z(view2, null);
                String str = map.get(strW);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i3))) {
                        a0.s.Z(arrayList2.get(i3), strW);
                        break;
                    }
                    i3++;
                }
            }
        }
        a0.q.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
