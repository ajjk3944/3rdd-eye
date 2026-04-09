package y1;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class g1 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final u.a0 f25685a;

    /* renamed from: d, reason: collision with root package name */
    public final u.b0 f25686d;

    /* renamed from: g, reason: collision with root package name */
    public final u.a0 f25687g;

    /* renamed from: r, reason: collision with root package name */
    public final u.y f25688r;

    public g1(f1 f1Var) {
        long[] jArr = u.g0.f23071a;
        this.f25685a = new u.a0();
        int i10 = u.h0.f23073a;
        this.f25686d = new u.b0();
        this.f25687g = new u.a0();
        u.y yVar = u.e0.f23063a;
        this.f25688r = new u.y();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        u.y yVar;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            yVar = this.f25688r;
            if (i10 >= size) {
                break;
            }
            yVar.h(i10, (View) arrayList.get(i10));
            i10++;
        }
        int size2 = arrayList.size() - 1;
        u.b0 b0Var = this.f25686d;
        u.a0 a0Var = this.f25685a;
        if (size2 >= 0) {
            while (true) {
                int i11 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View viewB = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : e0.b(view, viewGroup, 2);
                if (viewB != null && yVar.d(viewB) >= 0) {
                    a0Var.l(view, viewB);
                    b0Var.a(viewB);
                }
                if (i11 < 0) {
                    break;
                } else {
                    size2 = i11;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i12 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) a0Var.g(view2)) != null && !b0Var.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    u.a0 a0Var2 = this.f25687g;
                    View view4 = (View) a0Var2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    a0Var2.l(view2, view3);
                    view2 = (View) a0Var.g(view2);
                }
            }
            if (i12 < 0) {
                return;
            } else {
                size3 = i12;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        u.a0 a0Var = this.f25687g;
        View view3 = (View) a0Var.g(view);
        View view4 = (View) a0Var.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.f25685a.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        u.y yVar = this.f25688r;
        return yVar.e(view) < yVar.e(view2) ? -1 : 1;
    }
}
